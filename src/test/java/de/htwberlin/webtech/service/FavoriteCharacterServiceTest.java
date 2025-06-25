package de.htwberlin.webtech.service;

import de.htwberlin.webtech.model.FavoriteCharacter;
import de.htwberlin.webtech.repository.FavoriteCharacterRepository;
import de.htwberlin.webtech.web.service.FavoriteCharacterService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import de.htwberlin.webtech.web.service.FavoriteCharacterService;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

class FavoriteCharacterServiceTest {

	private final FavoriteCharacterRepository repository = Mockito.mock(FavoriteCharacterRepository.class);
	private final FavoriteCharacterService service = new FavoriteCharacterService(repository);

	@Test
	void testFindAllReturnsCharacters() {
		FavoriteCharacter character = new FavoriteCharacter();
		character.setName("Harry Potter");

		Mockito.when(repository.findAll()).thenReturn(Collections.singletonList(character));

		List<FavoriteCharacter> result = service.findAll();

		assertThat(result).hasSize(1);
		assertThat(result.get(0).getName()).isEqualTo("Harry Potter");
	}

	@Test
	void testFindByIdReturnsCharacter() {
		FavoriteCharacter character = new FavoriteCharacter();
		character.setId(1L);
		character.setName("Hermione Granger");

		Mockito.when(repository.findById(1L)).thenReturn(Optional.of(character));

		Optional<FavoriteCharacter> result = service.findById(1L);

		assertThat(result).isPresent();
		assertThat(result.get().getName()).isEqualTo("Hermione Granger");
	}

	@Test
	void testSaveCharacter() {
		FavoriteCharacter character = new FavoriteCharacter();
		character.setName("Ron Weasley");

		Mockito.when(repository.save(character)).thenReturn(character);

		FavoriteCharacter saved = service.save(character);

		assertThat(saved.getName()).isEqualTo("Ron Weasley");
	}

	@Test
	void testDeleteCharacterById() {
		Long idToDelete = 1L;
		service.delete(idToDelete);
		Mockito.verify(repository, Mockito.times(1)).deleteById(idToDelete);
	}
}
