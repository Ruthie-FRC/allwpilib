// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.wpilib.hardware.discrete;

/**
 * PWM class - deprecated, use PWMOutput instead.
 *
 * @deprecated Use {@link PWMOutput} instead. This class will be removed in a future release.
 */
@Deprecated(since = "2026", forRemoval = true)
public class PWM extends PWMOutput {
  /**
   * Allocate a PWM given a channel.
   *
   * <p>Checks channel value range and allocates the appropriate channel. The allocation is only
   * done to help users ensure that they don't double assign channels.
   *
   * <p>By default, adds itself to SendableRegistry.
   *
   * @param channel The PWM channel number. 0-9 are on-board, 10-19 are on the MXP port
   */
  public PWM(final int channel) {
    super(channel);
  }

  /**
   * Allocate a PWM given a channel.
   *
   * @param channel The PWM channel number. 0-9 are on-board, 10-19 are on the MXP port
   * @param registerSendable If true, adds this instance to SendableRegistry
   */
  public PWM(final int channel, final boolean registerSendable) {
    super(channel, registerSendable);
  }
}
