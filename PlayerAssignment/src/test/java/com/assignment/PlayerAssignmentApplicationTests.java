package com.assignment;

import com.assignment.controller.PlayerController;
import com.assignment.model.PlayerDTO;
import com.assignment.service.PlayerService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.constraints.AssertTrue;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.modelmapper.internal.util.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@ExtendWith(OutputCaptureExtension.class)
class PlayerAssignmentApplicationTests {

	@Autowired
	private PlayerController playerService;

	@Test
	void testPlayerExists(CapturedOutput output) {
		PlayerDTO p = playerService.getPlayer("abadijo01");
		Assert.isTrue(p != null);
	}

	@Test
	void testPlayerDoesNotExist(CapturedOutput output) {

		assertThatThrownBy(() -> {
			playerService.getPlayer("123");
		}).isInstanceOf(EntityNotFoundException.class)
				.hasMessageContaining("Could not find a player with id 123");
	}


	@Test
	void testCache(CapturedOutput output) {
		playerService.getPlayer("abadijo01");
		Assertions.assertThat(output.getOut()).containsPattern("(Fetching player.*?){1}");

		//does not fetch from the db, since already in cache
		playerService.getPlayer("abadijo01");
		Assertions.assertThat(output.getOut()).containsPattern("(Fetching player.*?){1}");
	}

}
