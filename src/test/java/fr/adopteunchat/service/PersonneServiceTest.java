package fr.adopteunchat.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import fr.adopteunchat.model.Personne;

public class PersonneServiceTest {

	private PersonneService personneService = null;

	@Before
	public void beforeEach() {

		this.personneService = new PersonneService();
	}

	@Test
	public void shouldReturnNull() {
		Personne personneNull = new Personne();
		assertEquals(null, this.personneService.add(personneNull));

		Personne personneShortPassword = new Personne("Jill", "Jeannine", "jeannine.dujardin@gmail.com", "0600000000",
				"12, rue du port 59000 Lille", "12345", "1967-01-01", "Adoptant");
		assertEquals(null, this.personneService.add(personneShortPassword));

		Personne personneNotAdoptantNorRefuge = new Personne("Jill", "Jeannine", "jeannine.dujardin@gmail.com",
				"0600000000", "12, rue du port 59000 Lille", "123456", "1967-01-01", "Ado");
		assertEquals(null, this.personneService.add(personneNotAdoptantNorRefuge));

		Personne personneWrongFormatDate = new Personne("Jill", "Jeannine", "jeannine.dujardin@gmail.com", "0600000000",
				"12, rue du port 59000 Lille", "123456", "1967-1-01", "Adoptant");
		assertEquals(null, this.personneService.add(personneWrongFormatDate));

		Personne personneWrongFormatDate2 = new Personne("Jill", "Jeannine", "jeannine.dujardin@gmail.com",
				"0600000000", "12, rue du port 59000 Lille", "123456", "196-01-01", "Adoptant");
		assertEquals(null, this.personneService.add(personneWrongFormatDate2));

	}
}
