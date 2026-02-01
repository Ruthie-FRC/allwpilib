// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.wpilib.hardware.discrete;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.wpilib.hardware.hal.HAL;

/** Test backward compatibility of deprecated PWM class. */
@SuppressWarnings("removal")
class PWMBackwardCompatibilityTest {
  @Test
  void testDeprecatedPWMClassWorks() {
    HAL.initialize(500, 0);

    // This uses the deprecated PWM class which should still work
    try (PWM pwm = new PWM(0)) {
      assertNotNull(pwm);
      assertEquals(0, pwm.getChannel());
      
      // Test that it can set and get values
      pwm.setPulseTimeMicroseconds(1500);
      assertEquals(1500, pwm.getPulseTimeMicroseconds());
    }
  }

  @Test
  void testDeprecatedPWMClassWithRegisterSendable() {
    HAL.initialize(500, 0);

    try (PWM pwm = new PWM(1, false)) {
      assertNotNull(pwm);
      assertEquals(1, pwm.getChannel());
    }
  }
}
