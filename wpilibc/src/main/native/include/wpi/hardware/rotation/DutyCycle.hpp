// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

#pragma once

#include "wpi/hardware/rotation/DutyCycleInput.hpp"

namespace wpi {

/**
 * DutyCycle class - deprecated, use DutyCycleInput instead.
 *
 * @deprecated Use DutyCycleInput instead. This alias will be removed in a future release.
 */
[[deprecated("Use DutyCycleInput instead. This alias will be removed in a future release.")]]
using DutyCycle = DutyCycleInput;

}  // namespace wpi
