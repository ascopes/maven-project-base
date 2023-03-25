/*
 * 2023 - 2023 <author>
 *
 * TODO: change this license header to the appropriate
 * header for your project.
 */

package io.github.ascopes.your.module.tests;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.ascopes.your.module.App;
import org.junit.jupiter.api.Test;

class AppTest {
  @Test
  void getMessageReturnsHelloWorld() {
    assertThat(App.getMessage())
        .isEqualTo("Hello, World!");
  }
}
