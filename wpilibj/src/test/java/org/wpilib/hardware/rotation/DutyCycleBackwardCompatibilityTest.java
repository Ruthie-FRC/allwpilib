// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.wpilib.hardware.rotation;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.wpilib.hardware.hal.HAL;

/** Test backward compatibility of deprecated DutyCycle class. */
@SuppressWarnings("removal")
class DutyCycleBackwardCompatibilityTest {
  @Test
  void testDeprecatedDutyCycleClassWorks() {
    HAL.initialize(500, 0);

    // This uses the deprecated DutyCycle class which should still work
    try (DutyCycle dutyCycle = new DutyCycle(0)) {
      assertNotNull(dutyCycle);
      
      // Test that it can read values (will be 0 in simulation)
      double frequency = dutyCycle.getFrequency();
      assertTrue(frequency >= 0);
      
      double output = dutyCycle.getOutput();
      assertTrue(output >= 0 && output <= 1);
    }
  }
}
