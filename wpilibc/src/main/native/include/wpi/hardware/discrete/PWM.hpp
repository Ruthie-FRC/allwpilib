// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

#pragma once

#include "wpi/hardware/discrete/PWMOutput.hpp"

namespace wpi {

/**
 * PWM class - deprecated, use PWMOutput instead.
 *
 * @deprecated Use PWMOutput instead. This alias will be removed in a future release.
 */
[[deprecated("Use PWMOutput instead. This alias will be removed in a future release.")]]
using PWM = PWMOutput;

}  // namespace wpi
