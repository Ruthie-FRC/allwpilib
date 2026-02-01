// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.wpilib.hardware.rotation;

/**
 * DutyCycle class - deprecated, use DutyCycleInput instead.
 *
 * @deprecated Use {@link DutyCycleInput} instead. This class will be removed in a future release.
 */
@Deprecated(since = "2026", forRemoval = true)
public class DutyCycle extends DutyCycleInput {
  /**
   * Constructs a DutyCycle input from a smartio channel.
   *
   * @param channel The channel to use.
   */
  public DutyCycle(int channel) {
    super(channel);
  }
}
