/*******************************************************************************
  Turnstone Biologics Confidential
  
  2018 Turnstone Biologics
  All Rights Reserved.
  
  This file is subject to the terms and conditions defined in
  file 'license.txt', which is part of this source code package.
   
  Contributors :
        Turnstone Biologics - General Release
 ******************************************************************************/
package com.occulue.api

import org.axonframework.modelling.command.TargetAggregateIdentifier


import java.util.*
import javax.persistence.*

import com.occulue.entity.*;

//-----------------------------------------------------------
// Command definitions
//-----------------------------------------------------------

// ACDCConverter Commands
data class CreateACDCConverterCommand(
    @TargetAggregateIdentifier  var aCDCConverterId: UUID? = null
)

data class UpdateACDCConverterCommand(
    @TargetAggregateIdentifier var aCDCConverterId: UUID? = null,
    var baseS: ApparentPower,
    var idleLoss: ActivePower,
    var maxUdc: Voltage,
    var minUdc: Voltage,
    var numberOfValves: IntegerProxy,
    var ratedUdc: Voltage,
    var resistiveLoss: Resistance,
    var switchingLoss: ActivePowerPerCurrentFlow,
    var valveU0: Voltage
)

data class DeleteACDCConverterCommand(@TargetAggregateIdentifier  var aCDCConverterId: UUID? = null)

// single association commands
data class AssignBaseSToACDCConverterCommand(@TargetAggregateIdentifier  val aCDCConverterId: UUID, val assignment: ApparentPower )
data class UnAssignBaseSFromACDCConverterCommand(@TargetAggregateIdentifier  val aCDCConverterId: UUID )
data class AssignIdleLossToACDCConverterCommand(@TargetAggregateIdentifier  val aCDCConverterId: UUID, val assignment: ActivePower )
data class UnAssignIdleLossFromACDCConverterCommand(@TargetAggregateIdentifier  val aCDCConverterId: UUID )
data class AssignMaxUdcToACDCConverterCommand(@TargetAggregateIdentifier  val aCDCConverterId: UUID, val assignment: Voltage )
data class UnAssignMaxUdcFromACDCConverterCommand(@TargetAggregateIdentifier  val aCDCConverterId: UUID )
data class AssignMinUdcToACDCConverterCommand(@TargetAggregateIdentifier  val aCDCConverterId: UUID, val assignment: Voltage )
data class UnAssignMinUdcFromACDCConverterCommand(@TargetAggregateIdentifier  val aCDCConverterId: UUID )
data class AssignNumberOfValvesToACDCConverterCommand(@TargetAggregateIdentifier  val aCDCConverterId: UUID, val assignment: IntegerProxy )
data class UnAssignNumberOfValvesFromACDCConverterCommand(@TargetAggregateIdentifier  val aCDCConverterId: UUID )
data class AssignRatedUdcToACDCConverterCommand(@TargetAggregateIdentifier  val aCDCConverterId: UUID, val assignment: Voltage )
data class UnAssignRatedUdcFromACDCConverterCommand(@TargetAggregateIdentifier  val aCDCConverterId: UUID )
data class AssignResistiveLossToACDCConverterCommand(@TargetAggregateIdentifier  val aCDCConverterId: UUID, val assignment: Resistance )
data class UnAssignResistiveLossFromACDCConverterCommand(@TargetAggregateIdentifier  val aCDCConverterId: UUID )
data class AssignSwitchingLossToACDCConverterCommand(@TargetAggregateIdentifier  val aCDCConverterId: UUID, val assignment: ActivePowerPerCurrentFlow )
data class UnAssignSwitchingLossFromACDCConverterCommand(@TargetAggregateIdentifier  val aCDCConverterId: UUID )
data class AssignValveU0ToACDCConverterCommand(@TargetAggregateIdentifier  val aCDCConverterId: UUID, val assignment: Voltage )
data class UnAssignValveU0FromACDCConverterCommand(@TargetAggregateIdentifier  val aCDCConverterId: UUID )

// multiple association commands


// ACDCConverterDCTerminal Commands
data class CreateACDCConverterDCTerminalCommand(
    @TargetAggregateIdentifier var aCDCConverterDCTerminalId: UUID? = null,
    @Enumerated(EnumType.STRING) var polarity: DCPolarityKind
)

data class UpdateACDCConverterDCTerminalCommand(
    @TargetAggregateIdentifier var aCDCConverterDCTerminalId: UUID? = null,
    @Enumerated(EnumType.STRING) var polarity: DCPolarityKind
)

data class DeleteACDCConverterDCTerminalCommand(@TargetAggregateIdentifier  var aCDCConverterDCTerminalId: UUID? = null)

// single association commands

// multiple association commands


// ACDCTerminal Commands
data class CreateACDCTerminalCommand(
    @TargetAggregateIdentifier  var aCDCTerminalId: UUID? = null
)

data class UpdateACDCTerminalCommand(
    @TargetAggregateIdentifier var aCDCTerminalId: UUID? = null,
    var sequenceNumber: IntegerProxy
)

data class DeleteACDCTerminalCommand(@TargetAggregateIdentifier  var aCDCTerminalId: UUID? = null)

// single association commands
data class AssignSequenceNumberToACDCTerminalCommand(@TargetAggregateIdentifier  val aCDCTerminalId: UUID, val assignment: IntegerProxy )
data class UnAssignSequenceNumberFromACDCTerminalCommand(@TargetAggregateIdentifier  val aCDCTerminalId: UUID )

// multiple association commands


// ACLineSegment Commands
data class CreateACLineSegmentCommand(
    @TargetAggregateIdentifier  var aCLineSegmentId: UUID? = null
)

data class UpdateACLineSegmentCommand(
    @TargetAggregateIdentifier var aCLineSegmentId: UUID? = null,
    var b0ch: Susceptance,
    var bch: Susceptance,
    var g0ch: Conductance,
    var gch: Conductance,
    var r: Resistance,
    var r0: Resistance,
    var shortCircuitEndTemperature: Temperature,
    var x: Reactance,
    var x0: Reactance
)

data class DeleteACLineSegmentCommand(@TargetAggregateIdentifier  var aCLineSegmentId: UUID? = null)

// single association commands
data class AssignB0chToACLineSegmentCommand(@TargetAggregateIdentifier  val aCLineSegmentId: UUID, val assignment: Susceptance )
data class UnAssignB0chFromACLineSegmentCommand(@TargetAggregateIdentifier  val aCLineSegmentId: UUID )
data class AssignBchToACLineSegmentCommand(@TargetAggregateIdentifier  val aCLineSegmentId: UUID, val assignment: Susceptance )
data class UnAssignBchFromACLineSegmentCommand(@TargetAggregateIdentifier  val aCLineSegmentId: UUID )
data class AssignG0chToACLineSegmentCommand(@TargetAggregateIdentifier  val aCLineSegmentId: UUID, val assignment: Conductance )
data class UnAssignG0chFromACLineSegmentCommand(@TargetAggregateIdentifier  val aCLineSegmentId: UUID )
data class AssignGchToACLineSegmentCommand(@TargetAggregateIdentifier  val aCLineSegmentId: UUID, val assignment: Conductance )
data class UnAssignGchFromACLineSegmentCommand(@TargetAggregateIdentifier  val aCLineSegmentId: UUID )
data class AssignRToACLineSegmentCommand(@TargetAggregateIdentifier  val aCLineSegmentId: UUID, val assignment: Resistance )
data class UnAssignRFromACLineSegmentCommand(@TargetAggregateIdentifier  val aCLineSegmentId: UUID )
data class AssignR0ToACLineSegmentCommand(@TargetAggregateIdentifier  val aCLineSegmentId: UUID, val assignment: Resistance )
data class UnAssignR0FromACLineSegmentCommand(@TargetAggregateIdentifier  val aCLineSegmentId: UUID )
data class AssignShortCircuitEndTemperatureToACLineSegmentCommand(@TargetAggregateIdentifier  val aCLineSegmentId: UUID, val assignment: Temperature )
data class UnAssignShortCircuitEndTemperatureFromACLineSegmentCommand(@TargetAggregateIdentifier  val aCLineSegmentId: UUID )
data class AssignXToACLineSegmentCommand(@TargetAggregateIdentifier  val aCLineSegmentId: UUID, val assignment: Reactance )
data class UnAssignXFromACLineSegmentCommand(@TargetAggregateIdentifier  val aCLineSegmentId: UUID )
data class AssignX0ToACLineSegmentCommand(@TargetAggregateIdentifier  val aCLineSegmentId: UUID, val assignment: Reactance )
data class UnAssignX0FromACLineSegmentCommand(@TargetAggregateIdentifier  val aCLineSegmentId: UUID )

// multiple association commands


// Accumulator Commands
data class CreateAccumulatorCommand(
    @TargetAggregateIdentifier  var accumulatorId: UUID? = null
)

data class UpdateAccumulatorCommand(
    @TargetAggregateIdentifier  var accumulatorId: UUID? = null
)

data class DeleteAccumulatorCommand(@TargetAggregateIdentifier  var accumulatorId: UUID? = null)

// single association commands

// multiple association commands


// AccumulatorLimit Commands
data class CreateAccumulatorLimitCommand(
    @TargetAggregateIdentifier  var accumulatorLimitId: UUID? = null
)

data class UpdateAccumulatorLimitCommand(
    @TargetAggregateIdentifier var accumulatorLimitId: UUID? = null,
    var value: IntegerProxy
)

data class DeleteAccumulatorLimitCommand(@TargetAggregateIdentifier  var accumulatorLimitId: UUID? = null)

// single association commands
data class AssignValueToAccumulatorLimitCommand(@TargetAggregateIdentifier  val accumulatorLimitId: UUID, val assignment: IntegerProxy )
data class UnAssignValueFromAccumulatorLimitCommand(@TargetAggregateIdentifier  val accumulatorLimitId: UUID )

// multiple association commands


// AccumulatorLimitSet Commands
data class CreateAccumulatorLimitSetCommand(
    @TargetAggregateIdentifier  var accumulatorLimitSetId: UUID? = null
)

data class UpdateAccumulatorLimitSetCommand(
    @TargetAggregateIdentifier  var accumulatorLimitSetId: UUID? = null
)

data class DeleteAccumulatorLimitSetCommand(@TargetAggregateIdentifier  var accumulatorLimitSetId: UUID? = null)

// single association commands

// multiple association commands


// AccumulatorReset Commands
data class CreateAccumulatorResetCommand(
    @TargetAggregateIdentifier  var accumulatorResetId: UUID? = null
)

data class UpdateAccumulatorResetCommand(
    @TargetAggregateIdentifier  var accumulatorResetId: UUID? = null
)

data class DeleteAccumulatorResetCommand(@TargetAggregateIdentifier  var accumulatorResetId: UUID? = null)

// single association commands

// multiple association commands


// AccumulatorValue Commands
data class CreateAccumulatorValueCommand(
    @TargetAggregateIdentifier  var accumulatorValueId: UUID? = null
)

data class UpdateAccumulatorValueCommand(
    @TargetAggregateIdentifier var accumulatorValueId: UUID? = null,
    var value: IntegerProxy
)

data class DeleteAccumulatorValueCommand(@TargetAggregateIdentifier  var accumulatorValueId: UUID? = null)

// single association commands
data class AssignValueToAccumulatorValueCommand(@TargetAggregateIdentifier  val accumulatorValueId: UUID, val assignment: IntegerProxy )
data class UnAssignValueFromAccumulatorValueCommand(@TargetAggregateIdentifier  val accumulatorValueId: UUID )

// multiple association commands


// ActivePower Commands
data class CreateActivePowerCommand(
    @TargetAggregateIdentifier var activePowerId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol
)

data class UpdateActivePowerCommand(
    @TargetAggregateIdentifier var activePowerId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol,
    var value: FloatProxy
)

data class DeleteActivePowerCommand(@TargetAggregateIdentifier  var activePowerId: UUID? = null)

// single association commands
data class AssignValueToActivePowerCommand(@TargetAggregateIdentifier  val activePowerId: UUID, val assignment: FloatProxy )
data class UnAssignValueFromActivePowerCommand(@TargetAggregateIdentifier  val activePowerId: UUID )

// multiple association commands


// ActivePowerLimit Commands
data class CreateActivePowerLimitCommand(
    @TargetAggregateIdentifier  var activePowerLimitId: UUID? = null
)

data class UpdateActivePowerLimitCommand(
    @TargetAggregateIdentifier var activePowerLimitId: UUID? = null,
    var value: ActivePower
)

data class DeleteActivePowerLimitCommand(@TargetAggregateIdentifier  var activePowerLimitId: UUID? = null)

// single association commands
data class AssignValueToActivePowerLimitCommand(@TargetAggregateIdentifier  val activePowerLimitId: UUID, val assignment: ActivePower )
data class UnAssignValueFromActivePowerLimitCommand(@TargetAggregateIdentifier  val activePowerLimitId: UUID )

// multiple association commands


// ActivePowerPerCurrentFlow Commands
data class CreateActivePowerPerCurrentFlowCommand(
    @TargetAggregateIdentifier  var activePowerPerCurrentFlowId: UUID? = null
)

data class UpdateActivePowerPerCurrentFlowCommand(
    @TargetAggregateIdentifier  var activePowerPerCurrentFlowId: UUID? = null
)

data class DeleteActivePowerPerCurrentFlowCommand(@TargetAggregateIdentifier  var activePowerPerCurrentFlowId: UUID? = null)

// single association commands

// multiple association commands


// ActivePowerPerFrequency Commands
data class CreateActivePowerPerFrequencyCommand(
    @TargetAggregateIdentifier var activePowerPerFrequencyId: UUID? = null,
    @Enumerated(EnumType.STRING) var denominatorMultiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var denominatorUnit: UnitSymbol,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol
)

data class UpdateActivePowerPerFrequencyCommand(
    @TargetAggregateIdentifier var activePowerPerFrequencyId: UUID? = null,
    @Enumerated(EnumType.STRING) var denominatorMultiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var denominatorUnit: UnitSymbol,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol,
    var value: FloatProxy
)

data class DeleteActivePowerPerFrequencyCommand(@TargetAggregateIdentifier  var activePowerPerFrequencyId: UUID? = null)

// single association commands
data class AssignValueToActivePowerPerFrequencyCommand(@TargetAggregateIdentifier  val activePowerPerFrequencyId: UUID, val assignment: FloatProxy )
data class UnAssignValueFromActivePowerPerFrequencyCommand(@TargetAggregateIdentifier  val activePowerPerFrequencyId: UUID )

// multiple association commands


// Analog Commands
data class CreateAnalogCommand(
    @TargetAggregateIdentifier  var analogId: UUID? = null
)

data class UpdateAnalogCommand(
    @TargetAggregateIdentifier var analogId: UUID? = null,
    var positiveFlowIn: BooleanProxy
)

data class DeleteAnalogCommand(@TargetAggregateIdentifier  var analogId: UUID? = null)

// single association commands
data class AssignPositiveFlowInToAnalogCommand(@TargetAggregateIdentifier  val analogId: UUID, val assignment: BooleanProxy )
data class UnAssignPositiveFlowInFromAnalogCommand(@TargetAggregateIdentifier  val analogId: UUID )

// multiple association commands


// AnalogControl Commands
data class CreateAnalogControlCommand(
    @TargetAggregateIdentifier  var analogControlId: UUID? = null
)

data class UpdateAnalogControlCommand(
    @TargetAggregateIdentifier var analogControlId: UUID? = null,
    var maxValue: Simple_Float,
    var minValue: Simple_Float
)

data class DeleteAnalogControlCommand(@TargetAggregateIdentifier  var analogControlId: UUID? = null)

// single association commands
data class AssignMaxValueToAnalogControlCommand(@TargetAggregateIdentifier  val analogControlId: UUID, val assignment: Simple_Float )
data class UnAssignMaxValueFromAnalogControlCommand(@TargetAggregateIdentifier  val analogControlId: UUID )
data class AssignMinValueToAnalogControlCommand(@TargetAggregateIdentifier  val analogControlId: UUID, val assignment: Simple_Float )
data class UnAssignMinValueFromAnalogControlCommand(@TargetAggregateIdentifier  val analogControlId: UUID )

// multiple association commands


// AnalogLimit Commands
data class CreateAnalogLimitCommand(
    @TargetAggregateIdentifier  var analogLimitId: UUID? = null
)

data class UpdateAnalogLimitCommand(
    @TargetAggregateIdentifier var analogLimitId: UUID? = null,
    var value: Simple_Float
)

data class DeleteAnalogLimitCommand(@TargetAggregateIdentifier  var analogLimitId: UUID? = null)

// single association commands
data class AssignValueToAnalogLimitCommand(@TargetAggregateIdentifier  val analogLimitId: UUID, val assignment: Simple_Float )
data class UnAssignValueFromAnalogLimitCommand(@TargetAggregateIdentifier  val analogLimitId: UUID )

// multiple association commands


// AnalogLimitSet Commands
data class CreateAnalogLimitSetCommand(
    @TargetAggregateIdentifier  var analogLimitSetId: UUID? = null
)

data class UpdateAnalogLimitSetCommand(
    @TargetAggregateIdentifier  var analogLimitSetId: UUID? = null
)

data class DeleteAnalogLimitSetCommand(@TargetAggregateIdentifier  var analogLimitSetId: UUID? = null)

// single association commands

// multiple association commands


// AnalogValue Commands
data class CreateAnalogValueCommand(
    @TargetAggregateIdentifier  var analogValueId: UUID? = null
)

data class UpdateAnalogValueCommand(
    @TargetAggregateIdentifier var analogValueId: UUID? = null,
    var value: Simple_Float
)

data class DeleteAnalogValueCommand(@TargetAggregateIdentifier  var analogValueId: UUID? = null)

// single association commands
data class AssignValueToAnalogValueCommand(@TargetAggregateIdentifier  val analogValueId: UUID, val assignment: Simple_Float )
data class UnAssignValueFromAnalogValueCommand(@TargetAggregateIdentifier  val analogValueId: UUID )

// multiple association commands


// AngleDegrees Commands
data class CreateAngleDegreesCommand(
    @TargetAggregateIdentifier var angleDegreesId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol
)

data class UpdateAngleDegreesCommand(
    @TargetAggregateIdentifier var angleDegreesId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol,
    var value: FloatProxy
)

data class DeleteAngleDegreesCommand(@TargetAggregateIdentifier  var angleDegreesId: UUID? = null)

// single association commands
data class AssignValueToAngleDegreesCommand(@TargetAggregateIdentifier  val angleDegreesId: UUID, val assignment: FloatProxy )
data class UnAssignValueFromAngleDegreesCommand(@TargetAggregateIdentifier  val angleDegreesId: UUID )

// multiple association commands


// AngleRadians Commands
data class CreateAngleRadiansCommand(
    @TargetAggregateIdentifier var angleRadiansId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol
)

data class UpdateAngleRadiansCommand(
    @TargetAggregateIdentifier var angleRadiansId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol,
    var value: FloatProxy
)

data class DeleteAngleRadiansCommand(@TargetAggregateIdentifier  var angleRadiansId: UUID? = null)

// single association commands
data class AssignValueToAngleRadiansCommand(@TargetAggregateIdentifier  val angleRadiansId: UUID, val assignment: FloatProxy )
data class UnAssignValueFromAngleRadiansCommand(@TargetAggregateIdentifier  val angleRadiansId: UUID )

// multiple association commands


// ApparentPower Commands
data class CreateApparentPowerCommand(
    @TargetAggregateIdentifier var apparentPowerId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol
)

data class UpdateApparentPowerCommand(
    @TargetAggregateIdentifier var apparentPowerId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol,
    var value: FloatProxy
)

data class DeleteApparentPowerCommand(@TargetAggregateIdentifier  var apparentPowerId: UUID? = null)

// single association commands
data class AssignValueToApparentPowerCommand(@TargetAggregateIdentifier  val apparentPowerId: UUID, val assignment: FloatProxy )
data class UnAssignValueFromApparentPowerCommand(@TargetAggregateIdentifier  val apparentPowerId: UUID )

// multiple association commands


// ApparentPowerLimit Commands
data class CreateApparentPowerLimitCommand(
    @TargetAggregateIdentifier  var apparentPowerLimitId: UUID? = null
)

data class UpdateApparentPowerLimitCommand(
    @TargetAggregateIdentifier var apparentPowerLimitId: UUID? = null,
    var value: ApparentPower
)

data class DeleteApparentPowerLimitCommand(@TargetAggregateIdentifier  var apparentPowerLimitId: UUID? = null)

// single association commands
data class AssignValueToApparentPowerLimitCommand(@TargetAggregateIdentifier  val apparentPowerLimitId: UUID, val assignment: ApparentPower )
data class UnAssignValueFromApparentPowerLimitCommand(@TargetAggregateIdentifier  val apparentPowerLimitId: UUID )

// multiple association commands


// Area Commands
data class CreateAreaCommand(
    @TargetAggregateIdentifier var areaId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol
)

data class UpdateAreaCommand(
    @TargetAggregateIdentifier var areaId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol,
    var value: FloatProxy
)

data class DeleteAreaCommand(@TargetAggregateIdentifier  var areaId: UUID? = null)

// single association commands
data class AssignValueToAreaCommand(@TargetAggregateIdentifier  val areaId: UUID, val assignment: FloatProxy )
data class UnAssignValueFromAreaCommand(@TargetAggregateIdentifier  val areaId: UUID )

// multiple association commands


// AsynchronousMachine Commands
data class CreateAsynchronousMachineCommand(
    @TargetAggregateIdentifier  var asynchronousMachineId: UUID? = null
)

data class UpdateAsynchronousMachineCommand(
    @TargetAggregateIdentifier var asynchronousMachineId: UUID? = null,
    var converterFedDrive: BooleanProxy,
    var efficiency: PerCent,
    var iaIrRatio: Simple_Float,
    var nominalFrequency: Frequency,
    var nominalSpeed: RotationSpeed,
    var polePairNumber: IntegerProxy,
    var ratedMechanicalPower: ActivePower,
    var reversible: BooleanProxy,
    var rxLockedRotorRatio: Simple_Float
)

data class DeleteAsynchronousMachineCommand(@TargetAggregateIdentifier  var asynchronousMachineId: UUID? = null)

// single association commands
data class AssignConverterFedDriveToAsynchronousMachineCommand(@TargetAggregateIdentifier  val asynchronousMachineId: UUID, val assignment: BooleanProxy )
data class UnAssignConverterFedDriveFromAsynchronousMachineCommand(@TargetAggregateIdentifier  val asynchronousMachineId: UUID )
data class AssignEfficiencyToAsynchronousMachineCommand(@TargetAggregateIdentifier  val asynchronousMachineId: UUID, val assignment: PerCent )
data class UnAssignEfficiencyFromAsynchronousMachineCommand(@TargetAggregateIdentifier  val asynchronousMachineId: UUID )
data class AssignIaIrRatioToAsynchronousMachineCommand(@TargetAggregateIdentifier  val asynchronousMachineId: UUID, val assignment: Simple_Float )
data class UnAssignIaIrRatioFromAsynchronousMachineCommand(@TargetAggregateIdentifier  val asynchronousMachineId: UUID )
data class AssignNominalFrequencyToAsynchronousMachineCommand(@TargetAggregateIdentifier  val asynchronousMachineId: UUID, val assignment: Frequency )
data class UnAssignNominalFrequencyFromAsynchronousMachineCommand(@TargetAggregateIdentifier  val asynchronousMachineId: UUID )
data class AssignNominalSpeedToAsynchronousMachineCommand(@TargetAggregateIdentifier  val asynchronousMachineId: UUID, val assignment: RotationSpeed )
data class UnAssignNominalSpeedFromAsynchronousMachineCommand(@TargetAggregateIdentifier  val asynchronousMachineId: UUID )
data class AssignPolePairNumberToAsynchronousMachineCommand(@TargetAggregateIdentifier  val asynchronousMachineId: UUID, val assignment: IntegerProxy )
data class UnAssignPolePairNumberFromAsynchronousMachineCommand(@TargetAggregateIdentifier  val asynchronousMachineId: UUID )
data class AssignRatedMechanicalPowerToAsynchronousMachineCommand(@TargetAggregateIdentifier  val asynchronousMachineId: UUID, val assignment: ActivePower )
data class UnAssignRatedMechanicalPowerFromAsynchronousMachineCommand(@TargetAggregateIdentifier  val asynchronousMachineId: UUID )
data class AssignReversibleToAsynchronousMachineCommand(@TargetAggregateIdentifier  val asynchronousMachineId: UUID, val assignment: BooleanProxy )
data class UnAssignReversibleFromAsynchronousMachineCommand(@TargetAggregateIdentifier  val asynchronousMachineId: UUID )
data class AssignRxLockedRotorRatioToAsynchronousMachineCommand(@TargetAggregateIdentifier  val asynchronousMachineId: UUID, val assignment: Simple_Float )
data class UnAssignRxLockedRotorRatioFromAsynchronousMachineCommand(@TargetAggregateIdentifier  val asynchronousMachineId: UUID )

// multiple association commands


// AsynchronousMachineDynamics Commands
data class CreateAsynchronousMachineDynamicsCommand(
    @TargetAggregateIdentifier  var asynchronousMachineDynamicsId: UUID? = null
)

data class UpdateAsynchronousMachineDynamicsCommand(
    @TargetAggregateIdentifier  var asynchronousMachineDynamicsId: UUID? = null
)

data class DeleteAsynchronousMachineDynamicsCommand(@TargetAggregateIdentifier  var asynchronousMachineDynamicsId: UUID? = null)

// single association commands

// multiple association commands


// AsynchronousMachineEquivalentCircuit Commands
data class CreateAsynchronousMachineEquivalentCircuitCommand(
    @TargetAggregateIdentifier  var asynchronousMachineEquivalentCircuitId: UUID? = null
)

data class UpdateAsynchronousMachineEquivalentCircuitCommand(
    @TargetAggregateIdentifier var asynchronousMachineEquivalentCircuitId: UUID? = null,
    var rr1: PU,
    var rr2: PU,
    var xlr1: PU,
    var xlr2: PU,
    var xm: PU
)

data class DeleteAsynchronousMachineEquivalentCircuitCommand(@TargetAggregateIdentifier  var asynchronousMachineEquivalentCircuitId: UUID? = null)

// single association commands
data class AssignRr1ToAsynchronousMachineEquivalentCircuitCommand(@TargetAggregateIdentifier  val asynchronousMachineEquivalentCircuitId: UUID, val assignment: PU )
data class UnAssignRr1FromAsynchronousMachineEquivalentCircuitCommand(@TargetAggregateIdentifier  val asynchronousMachineEquivalentCircuitId: UUID )
data class AssignRr2ToAsynchronousMachineEquivalentCircuitCommand(@TargetAggregateIdentifier  val asynchronousMachineEquivalentCircuitId: UUID, val assignment: PU )
data class UnAssignRr2FromAsynchronousMachineEquivalentCircuitCommand(@TargetAggregateIdentifier  val asynchronousMachineEquivalentCircuitId: UUID )
data class AssignXlr1ToAsynchronousMachineEquivalentCircuitCommand(@TargetAggregateIdentifier  val asynchronousMachineEquivalentCircuitId: UUID, val assignment: PU )
data class UnAssignXlr1FromAsynchronousMachineEquivalentCircuitCommand(@TargetAggregateIdentifier  val asynchronousMachineEquivalentCircuitId: UUID )
data class AssignXlr2ToAsynchronousMachineEquivalentCircuitCommand(@TargetAggregateIdentifier  val asynchronousMachineEquivalentCircuitId: UUID, val assignment: PU )
data class UnAssignXlr2FromAsynchronousMachineEquivalentCircuitCommand(@TargetAggregateIdentifier  val asynchronousMachineEquivalentCircuitId: UUID )
data class AssignXmToAsynchronousMachineEquivalentCircuitCommand(@TargetAggregateIdentifier  val asynchronousMachineEquivalentCircuitId: UUID, val assignment: PU )
data class UnAssignXmFromAsynchronousMachineEquivalentCircuitCommand(@TargetAggregateIdentifier  val asynchronousMachineEquivalentCircuitId: UUID )

// multiple association commands


// AsynchronousMachineTimeConstantReactance Commands
data class CreateAsynchronousMachineTimeConstantReactanceCommand(
    @TargetAggregateIdentifier  var asynchronousMachineTimeConstantReactanceId: UUID? = null
)

data class UpdateAsynchronousMachineTimeConstantReactanceCommand(
    @TargetAggregateIdentifier var asynchronousMachineTimeConstantReactanceId: UUID? = null,
    var tpo: Seconds,
    var tppo: Seconds,
    var xp: PU,
    var xpp: PU,
    var xs: PU
)

data class DeleteAsynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  var asynchronousMachineTimeConstantReactanceId: UUID? = null)

// single association commands
data class AssignTpoToAsynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  val asynchronousMachineTimeConstantReactanceId: UUID, val assignment: Seconds )
data class UnAssignTpoFromAsynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  val asynchronousMachineTimeConstantReactanceId: UUID )
data class AssignTppoToAsynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  val asynchronousMachineTimeConstantReactanceId: UUID, val assignment: Seconds )
data class UnAssignTppoFromAsynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  val asynchronousMachineTimeConstantReactanceId: UUID )
data class AssignXpToAsynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  val asynchronousMachineTimeConstantReactanceId: UUID, val assignment: PU )
data class UnAssignXpFromAsynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  val asynchronousMachineTimeConstantReactanceId: UUID )
data class AssignXppToAsynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  val asynchronousMachineTimeConstantReactanceId: UUID, val assignment: PU )
data class UnAssignXppFromAsynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  val asynchronousMachineTimeConstantReactanceId: UUID )
data class AssignXsToAsynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  val asynchronousMachineTimeConstantReactanceId: UUID, val assignment: PU )
data class UnAssignXsFromAsynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  val asynchronousMachineTimeConstantReactanceId: UUID )

// multiple association commands


// AsynchronousMachineUserDefined Commands
data class CreateAsynchronousMachineUserDefinedCommand(
    @TargetAggregateIdentifier  var asynchronousMachineUserDefinedId: UUID? = null
)

data class UpdateAsynchronousMachineUserDefinedCommand(
    @TargetAggregateIdentifier var asynchronousMachineUserDefinedId: UUID? = null,
    var proprietary: BooleanProxy
)

data class DeleteAsynchronousMachineUserDefinedCommand(@TargetAggregateIdentifier  var asynchronousMachineUserDefinedId: UUID? = null)

// single association commands
data class AssignProprietaryToAsynchronousMachineUserDefinedCommand(@TargetAggregateIdentifier  val asynchronousMachineUserDefinedId: UUID, val assignment: BooleanProxy )
data class UnAssignProprietaryFromAsynchronousMachineUserDefinedCommand(@TargetAggregateIdentifier  val asynchronousMachineUserDefinedId: UUID )

// multiple association commands


// BaseVoltage Commands
data class CreateBaseVoltageCommand(
    @TargetAggregateIdentifier  var baseVoltageId: UUID? = null
)

data class UpdateBaseVoltageCommand(
    @TargetAggregateIdentifier var baseVoltageId: UUID? = null,
    var nominalVoltage: Voltage
)

data class DeleteBaseVoltageCommand(@TargetAggregateIdentifier  var baseVoltageId: UUID? = null)

// single association commands
data class AssignNominalVoltageToBaseVoltageCommand(@TargetAggregateIdentifier  val baseVoltageId: UUID, val assignment: Voltage )
data class UnAssignNominalVoltageFromBaseVoltageCommand(@TargetAggregateIdentifier  val baseVoltageId: UUID )

// multiple association commands


// BasicIntervalSchedule Commands
data class CreateBasicIntervalScheduleCommand(
    @TargetAggregateIdentifier var basicIntervalScheduleId: UUID? = null,
    @Enumerated(EnumType.STRING) var value1Unit: UnitSymbol,
    @Enumerated(EnumType.STRING) var value2Unit: UnitSymbol
)

data class UpdateBasicIntervalScheduleCommand(
    @TargetAggregateIdentifier var basicIntervalScheduleId: UUID? = null,
    var startTime: DateTime,
    @Enumerated(EnumType.STRING) var value1Unit: UnitSymbol,
    @Enumerated(EnumType.STRING) var value2Unit: UnitSymbol
)

data class DeleteBasicIntervalScheduleCommand(@TargetAggregateIdentifier  var basicIntervalScheduleId: UUID? = null)

// single association commands
data class AssignStartTimeToBasicIntervalScheduleCommand(@TargetAggregateIdentifier  val basicIntervalScheduleId: UUID, val assignment: DateTime )
data class UnAssignStartTimeFromBasicIntervalScheduleCommand(@TargetAggregateIdentifier  val basicIntervalScheduleId: UUID )

// multiple association commands


// Bay Commands
data class CreateBayCommand(
    @TargetAggregateIdentifier  var bayId: UUID? = null
)

data class UpdateBayCommand(
    @TargetAggregateIdentifier  var bayId: UUID? = null
)

data class DeleteBayCommand(@TargetAggregateIdentifier  var bayId: UUID? = null)

// single association commands

// multiple association commands


// BooleanProxy Commands
data class CreateBooleanProxyCommand(
    @TargetAggregateIdentifier  var booleanProxyId: UUID? = null
)

data class UpdateBooleanProxyCommand(
    @TargetAggregateIdentifier  var booleanProxyId: UUID? = null
)

data class DeleteBooleanProxyCommand(@TargetAggregateIdentifier  var booleanProxyId: UUID? = null)

// single association commands

// multiple association commands


// BoundaryExtensions Commands
data class CreateBoundaryExtensionsCommand(
    @TargetAggregateIdentifier  var boundaryExtensionsId: UUID? = null
)

data class UpdateBoundaryExtensionsCommand(
    @TargetAggregateIdentifier var boundaryExtensionsId: UUID? = null,
    var boundaryPoint: BooleanProxy,
    var fromEndIsoCode: StringProxy,
    var fromEndName: StringProxy,
    var fromEndNameTso: StringProxy,
    var toEndIsoCode: StringProxy,
    var toEndName: StringProxy,
    var toEndNameTso: StringProxy
)

data class DeleteBoundaryExtensionsCommand(@TargetAggregateIdentifier  var boundaryExtensionsId: UUID? = null)

// single association commands
data class AssignBoundaryPointToBoundaryExtensionsCommand(@TargetAggregateIdentifier  val boundaryExtensionsId: UUID, val assignment: BooleanProxy )
data class UnAssignBoundaryPointFromBoundaryExtensionsCommand(@TargetAggregateIdentifier  val boundaryExtensionsId: UUID )
data class AssignFromEndIsoCodeToBoundaryExtensionsCommand(@TargetAggregateIdentifier  val boundaryExtensionsId: UUID, val assignment: StringProxy )
data class UnAssignFromEndIsoCodeFromBoundaryExtensionsCommand(@TargetAggregateIdentifier  val boundaryExtensionsId: UUID )
data class AssignFromEndNameToBoundaryExtensionsCommand(@TargetAggregateIdentifier  val boundaryExtensionsId: UUID, val assignment: StringProxy )
data class UnAssignFromEndNameFromBoundaryExtensionsCommand(@TargetAggregateIdentifier  val boundaryExtensionsId: UUID )
data class AssignFromEndNameTsoToBoundaryExtensionsCommand(@TargetAggregateIdentifier  val boundaryExtensionsId: UUID, val assignment: StringProxy )
data class UnAssignFromEndNameTsoFromBoundaryExtensionsCommand(@TargetAggregateIdentifier  val boundaryExtensionsId: UUID )
data class AssignToEndIsoCodeToBoundaryExtensionsCommand(@TargetAggregateIdentifier  val boundaryExtensionsId: UUID, val assignment: StringProxy )
data class UnAssignToEndIsoCodeFromBoundaryExtensionsCommand(@TargetAggregateIdentifier  val boundaryExtensionsId: UUID )
data class AssignToEndNameToBoundaryExtensionsCommand(@TargetAggregateIdentifier  val boundaryExtensionsId: UUID, val assignment: StringProxy )
data class UnAssignToEndNameFromBoundaryExtensionsCommand(@TargetAggregateIdentifier  val boundaryExtensionsId: UUID )
data class AssignToEndNameTsoToBoundaryExtensionsCommand(@TargetAggregateIdentifier  val boundaryExtensionsId: UUID, val assignment: StringProxy )
data class UnAssignToEndNameTsoFromBoundaryExtensionsCommand(@TargetAggregateIdentifier  val boundaryExtensionsId: UUID )

// multiple association commands


// Breaker Commands
data class CreateBreakerCommand(
    @TargetAggregateIdentifier  var breakerId: UUID? = null
)

data class UpdateBreakerCommand(
    @TargetAggregateIdentifier  var breakerId: UUID? = null
)

data class DeleteBreakerCommand(@TargetAggregateIdentifier  var breakerId: UUID? = null)

// single association commands

// multiple association commands


// BusNameMarker Commands
data class CreateBusNameMarkerCommand(
    @TargetAggregateIdentifier  var busNameMarkerId: UUID? = null
)

data class UpdateBusNameMarkerCommand(
    @TargetAggregateIdentifier var busNameMarkerId: UUID? = null,
    var priority: IntegerProxy
)

data class DeleteBusNameMarkerCommand(@TargetAggregateIdentifier  var busNameMarkerId: UUID? = null)

// single association commands
data class AssignPriorityToBusNameMarkerCommand(@TargetAggregateIdentifier  val busNameMarkerId: UUID, val assignment: IntegerProxy )
data class UnAssignPriorityFromBusNameMarkerCommand(@TargetAggregateIdentifier  val busNameMarkerId: UUID )

// multiple association commands


// BusbarSection Commands
data class CreateBusbarSectionCommand(
    @TargetAggregateIdentifier  var busbarSectionId: UUID? = null
)

data class UpdateBusbarSectionCommand(
    @TargetAggregateIdentifier var busbarSectionId: UUID? = null,
    var ipMax: CurrentFlow
)

data class DeleteBusbarSectionCommand(@TargetAggregateIdentifier  var busbarSectionId: UUID? = null)

// single association commands
data class AssignIpMaxToBusbarSectionCommand(@TargetAggregateIdentifier  val busbarSectionId: UUID, val assignment: CurrentFlow )
data class UnAssignIpMaxFromBusbarSectionCommand(@TargetAggregateIdentifier  val busbarSectionId: UUID )

// multiple association commands


// Capacitance Commands
data class CreateCapacitanceCommand(
    @TargetAggregateIdentifier var capacitanceId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol
)

data class UpdateCapacitanceCommand(
    @TargetAggregateIdentifier var capacitanceId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol,
    var value: FloatProxy
)

data class DeleteCapacitanceCommand(@TargetAggregateIdentifier  var capacitanceId: UUID? = null)

// single association commands
data class AssignValueToCapacitanceCommand(@TargetAggregateIdentifier  val capacitanceId: UUID, val assignment: FloatProxy )
data class UnAssignValueFromCapacitanceCommand(@TargetAggregateIdentifier  val capacitanceId: UUID )

// multiple association commands


// CapacitancePerLength Commands
data class CreateCapacitancePerLengthCommand(
    @TargetAggregateIdentifier var capacitancePerLengthId: UUID? = null,
    @Enumerated(EnumType.STRING) var denominatorMultiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var denominatorUnit: UnitSymbol,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol
)

data class UpdateCapacitancePerLengthCommand(
    @TargetAggregateIdentifier var capacitancePerLengthId: UUID? = null,
    @Enumerated(EnumType.STRING) var denominatorMultiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var denominatorUnit: UnitSymbol,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol,
    var value: FloatProxy
)

data class DeleteCapacitancePerLengthCommand(@TargetAggregateIdentifier  var capacitancePerLengthId: UUID? = null)

// single association commands
data class AssignValueToCapacitancePerLengthCommand(@TargetAggregateIdentifier  val capacitancePerLengthId: UUID, val assignment: FloatProxy )
data class UnAssignValueFromCapacitancePerLengthCommand(@TargetAggregateIdentifier  val capacitancePerLengthId: UUID )

// multiple association commands


// Command Commands
data class CreateCommandCommand(
    @TargetAggregateIdentifier  var commandId: UUID? = null
)

data class UpdateCommandCommand(
    @TargetAggregateIdentifier var commandId: UUID? = null,
    var normalValue: IntegerProxy,
    var value: IntegerProxy
)

data class DeleteCommandCommand(@TargetAggregateIdentifier  var commandId: UUID? = null)

// single association commands
data class AssignNormalValueToCommandCommand(@TargetAggregateIdentifier  val commandId: UUID, val assignment: IntegerProxy )
data class UnAssignNormalValueFromCommandCommand(@TargetAggregateIdentifier  val commandId: UUID )
data class AssignValueToCommandCommand(@TargetAggregateIdentifier  val commandId: UUID, val assignment: IntegerProxy )
data class UnAssignValueFromCommandCommand(@TargetAggregateIdentifier  val commandId: UUID )

// multiple association commands


// Conductance Commands
data class CreateConductanceCommand(
    @TargetAggregateIdentifier var conductanceId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol
)

data class UpdateConductanceCommand(
    @TargetAggregateIdentifier var conductanceId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol,
    var value: FloatProxy
)

data class DeleteConductanceCommand(@TargetAggregateIdentifier  var conductanceId: UUID? = null)

// single association commands
data class AssignValueToConductanceCommand(@TargetAggregateIdentifier  val conductanceId: UUID, val assignment: FloatProxy )
data class UnAssignValueFromConductanceCommand(@TargetAggregateIdentifier  val conductanceId: UUID )

// multiple association commands


// ConductingEquipment Commands
data class CreateConductingEquipmentCommand(
    @TargetAggregateIdentifier  var conductingEquipmentId: UUID? = null
)

data class UpdateConductingEquipmentCommand(
    @TargetAggregateIdentifier  var conductingEquipmentId: UUID? = null
)

data class DeleteConductingEquipmentCommand(@TargetAggregateIdentifier  var conductingEquipmentId: UUID? = null)

// single association commands

// multiple association commands


// Conductor Commands
data class CreateConductorCommand(
    @TargetAggregateIdentifier  var conductorId: UUID? = null
)

data class UpdateConductorCommand(
    @TargetAggregateIdentifier var conductorId: UUID? = null,
    var length: Length
)

data class DeleteConductorCommand(@TargetAggregateIdentifier  var conductorId: UUID? = null)

// single association commands
data class AssignLengthToConductorCommand(@TargetAggregateIdentifier  val conductorId: UUID, val assignment: Length )
data class UnAssignLengthFromConductorCommand(@TargetAggregateIdentifier  val conductorId: UUID )

// multiple association commands


// ConformLoad Commands
data class CreateConformLoadCommand(
    @TargetAggregateIdentifier  var conformLoadId: UUID? = null
)

data class UpdateConformLoadCommand(
    @TargetAggregateIdentifier  var conformLoadId: UUID? = null
)

data class DeleteConformLoadCommand(@TargetAggregateIdentifier  var conformLoadId: UUID? = null)

// single association commands

// multiple association commands


// ConformLoadGroup Commands
data class CreateConformLoadGroupCommand(
    @TargetAggregateIdentifier  var conformLoadGroupId: UUID? = null
)

data class UpdateConformLoadGroupCommand(
    @TargetAggregateIdentifier  var conformLoadGroupId: UUID? = null
)

data class DeleteConformLoadGroupCommand(@TargetAggregateIdentifier  var conformLoadGroupId: UUID? = null)

// single association commands

// multiple association commands


// ConformLoadSchedule Commands
data class CreateConformLoadScheduleCommand(
    @TargetAggregateIdentifier  var conformLoadScheduleId: UUID? = null
)

data class UpdateConformLoadScheduleCommand(
    @TargetAggregateIdentifier  var conformLoadScheduleId: UUID? = null
)

data class DeleteConformLoadScheduleCommand(@TargetAggregateIdentifier  var conformLoadScheduleId: UUID? = null)

// single association commands

// multiple association commands


// ConnectivityNode Commands
data class CreateConnectivityNodeCommand(
    @TargetAggregateIdentifier  var connectivityNodeId: UUID? = null
)

data class UpdateConnectivityNodeCommand(
    @TargetAggregateIdentifier var connectivityNodeId: UUID? = null,
    var boundaryPoint: BooleanProxy,
    var fromEndIsoCode: StringProxy,
    var fromEndName: StringProxy,
    var fromEndNameTso: StringProxy,
    var toEndIsoCode: StringProxy,
    var toEndName: StringProxy,
    var toEndNameTso: StringProxy
)

data class DeleteConnectivityNodeCommand(@TargetAggregateIdentifier  var connectivityNodeId: UUID? = null)

// single association commands
data class AssignBoundaryPointToConnectivityNodeCommand(@TargetAggregateIdentifier  val connectivityNodeId: UUID, val assignment: BooleanProxy )
data class UnAssignBoundaryPointFromConnectivityNodeCommand(@TargetAggregateIdentifier  val connectivityNodeId: UUID )
data class AssignFromEndIsoCodeToConnectivityNodeCommand(@TargetAggregateIdentifier  val connectivityNodeId: UUID, val assignment: StringProxy )
data class UnAssignFromEndIsoCodeFromConnectivityNodeCommand(@TargetAggregateIdentifier  val connectivityNodeId: UUID )
data class AssignFromEndNameToConnectivityNodeCommand(@TargetAggregateIdentifier  val connectivityNodeId: UUID, val assignment: StringProxy )
data class UnAssignFromEndNameFromConnectivityNodeCommand(@TargetAggregateIdentifier  val connectivityNodeId: UUID )
data class AssignFromEndNameTsoToConnectivityNodeCommand(@TargetAggregateIdentifier  val connectivityNodeId: UUID, val assignment: StringProxy )
data class UnAssignFromEndNameTsoFromConnectivityNodeCommand(@TargetAggregateIdentifier  val connectivityNodeId: UUID )
data class AssignToEndIsoCodeToConnectivityNodeCommand(@TargetAggregateIdentifier  val connectivityNodeId: UUID, val assignment: StringProxy )
data class UnAssignToEndIsoCodeFromConnectivityNodeCommand(@TargetAggregateIdentifier  val connectivityNodeId: UUID )
data class AssignToEndNameToConnectivityNodeCommand(@TargetAggregateIdentifier  val connectivityNodeId: UUID, val assignment: StringProxy )
data class UnAssignToEndNameFromConnectivityNodeCommand(@TargetAggregateIdentifier  val connectivityNodeId: UUID )
data class AssignToEndNameTsoToConnectivityNodeCommand(@TargetAggregateIdentifier  val connectivityNodeId: UUID, val assignment: StringProxy )
data class UnAssignToEndNameTsoFromConnectivityNodeCommand(@TargetAggregateIdentifier  val connectivityNodeId: UUID )

// multiple association commands


// ConnectivityNodeContainer Commands
data class CreateConnectivityNodeContainerCommand(
    @TargetAggregateIdentifier  var connectivityNodeContainerId: UUID? = null
)

data class UpdateConnectivityNodeContainerCommand(
    @TargetAggregateIdentifier  var connectivityNodeContainerId: UUID? = null
)

data class DeleteConnectivityNodeContainerCommand(@TargetAggregateIdentifier  var connectivityNodeContainerId: UUID? = null)

// single association commands

// multiple association commands


// Connector Commands
data class CreateConnectorCommand(
    @TargetAggregateIdentifier  var connectorId: UUID? = null
)

data class UpdateConnectorCommand(
    @TargetAggregateIdentifier  var connectorId: UUID? = null
)

data class DeleteConnectorCommand(@TargetAggregateIdentifier  var connectorId: UUID? = null)

// single association commands

// multiple association commands


// Control Commands
data class CreateControlCommand(
    @TargetAggregateIdentifier var controlId: UUID? = null,
    @Enumerated(EnumType.STRING) var unitMultiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unitSymbol: UnitSymbol
)

data class UpdateControlCommand(
    @TargetAggregateIdentifier var controlId: UUID? = null,
    var controlType: StringProxy,
    var operationInProgress: BooleanProxy,
    var timeStamp: DateTime,
    @Enumerated(EnumType.STRING) var unitMultiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unitSymbol: UnitSymbol
)

data class DeleteControlCommand(@TargetAggregateIdentifier  var controlId: UUID? = null)

// single association commands
data class AssignControlTypeToControlCommand(@TargetAggregateIdentifier  val controlId: UUID, val assignment: StringProxy )
data class UnAssignControlTypeFromControlCommand(@TargetAggregateIdentifier  val controlId: UUID )
data class AssignOperationInProgressToControlCommand(@TargetAggregateIdentifier  val controlId: UUID, val assignment: BooleanProxy )
data class UnAssignOperationInProgressFromControlCommand(@TargetAggregateIdentifier  val controlId: UUID )
data class AssignTimeStampToControlCommand(@TargetAggregateIdentifier  val controlId: UUID, val assignment: DateTime )
data class UnAssignTimeStampFromControlCommand(@TargetAggregateIdentifier  val controlId: UUID )

// multiple association commands


// ControlArea Commands
data class CreateControlAreaCommand(
    @TargetAggregateIdentifier var controlAreaId: UUID? = null,
    @Enumerated(EnumType.STRING) var type: ControlAreaTypeKind
)

data class UpdateControlAreaCommand(
    @TargetAggregateIdentifier var controlAreaId: UUID? = null,
    @Enumerated(EnumType.STRING) var type: ControlAreaTypeKind
)

data class DeleteControlAreaCommand(@TargetAggregateIdentifier  var controlAreaId: UUID? = null)

// single association commands

// multiple association commands


// ControlAreaGeneratingUnit Commands
data class CreateControlAreaGeneratingUnitCommand(
    @TargetAggregateIdentifier  var controlAreaGeneratingUnitId: UUID? = null
)

data class UpdateControlAreaGeneratingUnitCommand(
    @TargetAggregateIdentifier  var controlAreaGeneratingUnitId: UUID? = null
)

data class DeleteControlAreaGeneratingUnitCommand(@TargetAggregateIdentifier  var controlAreaGeneratingUnitId: UUID? = null)

// single association commands

// multiple association commands


// CoordinateSystem Commands
data class CreateCoordinateSystemCommand(
    @TargetAggregateIdentifier  var coordinateSystemId: UUID? = null
)

data class UpdateCoordinateSystemCommand(
    @TargetAggregateIdentifier var coordinateSystemId: UUID? = null,
    var crsUrn: StringProxy
)

data class DeleteCoordinateSystemCommand(@TargetAggregateIdentifier  var coordinateSystemId: UUID? = null)

// single association commands
data class AssignCrsUrnToCoordinateSystemCommand(@TargetAggregateIdentifier  val coordinateSystemId: UUID, val assignment: StringProxy )
data class UnAssignCrsUrnFromCoordinateSystemCommand(@TargetAggregateIdentifier  val coordinateSystemId: UUID )

// multiple association commands


// CsConverter Commands
data class CreateCsConverterCommand(
    @TargetAggregateIdentifier  var csConverterId: UUID? = null
)

data class UpdateCsConverterCommand(
    @TargetAggregateIdentifier var csConverterId: UUID? = null,
    var maxAlpha: AngleDegrees,
    var maxGamma: AngleDegrees,
    var maxIdc: CurrentFlow,
    var minAlpha: AngleDegrees,
    var minGamma: AngleDegrees,
    var minIdc: CurrentFlow,
    var ratedIdc: CurrentFlow
)

data class DeleteCsConverterCommand(@TargetAggregateIdentifier  var csConverterId: UUID? = null)

// single association commands
data class AssignMaxAlphaToCsConverterCommand(@TargetAggregateIdentifier  val csConverterId: UUID, val assignment: AngleDegrees )
data class UnAssignMaxAlphaFromCsConverterCommand(@TargetAggregateIdentifier  val csConverterId: UUID )
data class AssignMaxGammaToCsConverterCommand(@TargetAggregateIdentifier  val csConverterId: UUID, val assignment: AngleDegrees )
data class UnAssignMaxGammaFromCsConverterCommand(@TargetAggregateIdentifier  val csConverterId: UUID )
data class AssignMaxIdcToCsConverterCommand(@TargetAggregateIdentifier  val csConverterId: UUID, val assignment: CurrentFlow )
data class UnAssignMaxIdcFromCsConverterCommand(@TargetAggregateIdentifier  val csConverterId: UUID )
data class AssignMinAlphaToCsConverterCommand(@TargetAggregateIdentifier  val csConverterId: UUID, val assignment: AngleDegrees )
data class UnAssignMinAlphaFromCsConverterCommand(@TargetAggregateIdentifier  val csConverterId: UUID )
data class AssignMinGammaToCsConverterCommand(@TargetAggregateIdentifier  val csConverterId: UUID, val assignment: AngleDegrees )
data class UnAssignMinGammaFromCsConverterCommand(@TargetAggregateIdentifier  val csConverterId: UUID )
data class AssignMinIdcToCsConverterCommand(@TargetAggregateIdentifier  val csConverterId: UUID, val assignment: CurrentFlow )
data class UnAssignMinIdcFromCsConverterCommand(@TargetAggregateIdentifier  val csConverterId: UUID )
data class AssignRatedIdcToCsConverterCommand(@TargetAggregateIdentifier  val csConverterId: UUID, val assignment: CurrentFlow )
data class UnAssignRatedIdcFromCsConverterCommand(@TargetAggregateIdentifier  val csConverterId: UUID )

// multiple association commands


// CurrentFlow Commands
data class CreateCurrentFlowCommand(
    @TargetAggregateIdentifier var currentFlowId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol
)

data class UpdateCurrentFlowCommand(
    @TargetAggregateIdentifier var currentFlowId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol,
    var value: FloatProxy
)

data class DeleteCurrentFlowCommand(@TargetAggregateIdentifier  var currentFlowId: UUID? = null)

// single association commands
data class AssignValueToCurrentFlowCommand(@TargetAggregateIdentifier  val currentFlowId: UUID, val assignment: FloatProxy )
data class UnAssignValueFromCurrentFlowCommand(@TargetAggregateIdentifier  val currentFlowId: UUID )

// multiple association commands


// CurrentLimit Commands
data class CreateCurrentLimitCommand(
    @TargetAggregateIdentifier  var currentLimitId: UUID? = null
)

data class UpdateCurrentLimitCommand(
    @TargetAggregateIdentifier var currentLimitId: UUID? = null,
    var value: CurrentFlow
)

data class DeleteCurrentLimitCommand(@TargetAggregateIdentifier  var currentLimitId: UUID? = null)

// single association commands
data class AssignValueToCurrentLimitCommand(@TargetAggregateIdentifier  val currentLimitId: UUID, val assignment: CurrentFlow )
data class UnAssignValueFromCurrentLimitCommand(@TargetAggregateIdentifier  val currentLimitId: UUID )

// multiple association commands


// Curve Commands
data class CreateCurveCommand(
    @TargetAggregateIdentifier var curveId: UUID? = null,
    @Enumerated(EnumType.STRING) var curveStyle: CurveStyle,
    @Enumerated(EnumType.STRING) var xUnit: UnitSymbol,
    @Enumerated(EnumType.STRING) var y1Unit: UnitSymbol,
    @Enumerated(EnumType.STRING) var y2Unit: UnitSymbol
)

data class UpdateCurveCommand(
    @TargetAggregateIdentifier var curveId: UUID? = null,
    @Enumerated(EnumType.STRING) var curveStyle: CurveStyle,
    @Enumerated(EnumType.STRING) var xUnit: UnitSymbol,
    @Enumerated(EnumType.STRING) var y1Unit: UnitSymbol,
    @Enumerated(EnumType.STRING) var y2Unit: UnitSymbol
)

data class DeleteCurveCommand(@TargetAggregateIdentifier  var curveId: UUID? = null)

// single association commands

// multiple association commands


// CurveData Commands
data class CreateCurveDataCommand(
    @TargetAggregateIdentifier  var curveDataId: UUID? = null
)

data class UpdateCurveDataCommand(
    @TargetAggregateIdentifier var curveDataId: UUID? = null,
    var xvalue: Simple_Float,
    var y1value: Simple_Float,
    var y2value: Simple_Float
)

data class DeleteCurveDataCommand(@TargetAggregateIdentifier  var curveDataId: UUID? = null)

// single association commands
data class AssignXvalueToCurveDataCommand(@TargetAggregateIdentifier  val curveDataId: UUID, val assignment: Simple_Float )
data class UnAssignXvalueFromCurveDataCommand(@TargetAggregateIdentifier  val curveDataId: UUID )
data class AssignY1valueToCurveDataCommand(@TargetAggregateIdentifier  val curveDataId: UUID, val assignment: Simple_Float )
data class UnAssignY1valueFromCurveDataCommand(@TargetAggregateIdentifier  val curveDataId: UUID )
data class AssignY2valueToCurveDataCommand(@TargetAggregateIdentifier  val curveDataId: UUID, val assignment: Simple_Float )
data class UnAssignY2valueFromCurveDataCommand(@TargetAggregateIdentifier  val curveDataId: UUID )

// multiple association commands


// DCBaseTerminal Commands
data class CreateDCBaseTerminalCommand(
    @TargetAggregateIdentifier  var dCBaseTerminalId: UUID? = null
)

data class UpdateDCBaseTerminalCommand(
    @TargetAggregateIdentifier  var dCBaseTerminalId: UUID? = null
)

data class DeleteDCBaseTerminalCommand(@TargetAggregateIdentifier  var dCBaseTerminalId: UUID? = null)

// single association commands

// multiple association commands


// DCBreaker Commands
data class CreateDCBreakerCommand(
    @TargetAggregateIdentifier  var dCBreakerId: UUID? = null
)

data class UpdateDCBreakerCommand(
    @TargetAggregateIdentifier  var dCBreakerId: UUID? = null
)

data class DeleteDCBreakerCommand(@TargetAggregateIdentifier  var dCBreakerId: UUID? = null)

// single association commands

// multiple association commands


// DCBusbar Commands
data class CreateDCBusbarCommand(
    @TargetAggregateIdentifier  var dCBusbarId: UUID? = null
)

data class UpdateDCBusbarCommand(
    @TargetAggregateIdentifier  var dCBusbarId: UUID? = null
)

data class DeleteDCBusbarCommand(@TargetAggregateIdentifier  var dCBusbarId: UUID? = null)

// single association commands

// multiple association commands


// DCChopper Commands
data class CreateDCChopperCommand(
    @TargetAggregateIdentifier  var dCChopperId: UUID? = null
)

data class UpdateDCChopperCommand(
    @TargetAggregateIdentifier  var dCChopperId: UUID? = null
)

data class DeleteDCChopperCommand(@TargetAggregateIdentifier  var dCChopperId: UUID? = null)

// single association commands

// multiple association commands


// DCConductingEquipment Commands
data class CreateDCConductingEquipmentCommand(
    @TargetAggregateIdentifier  var dCConductingEquipmentId: UUID? = null
)

data class UpdateDCConductingEquipmentCommand(
    @TargetAggregateIdentifier  var dCConductingEquipmentId: UUID? = null
)

data class DeleteDCConductingEquipmentCommand(@TargetAggregateIdentifier  var dCConductingEquipmentId: UUID? = null)

// single association commands

// multiple association commands


// DCConverterUnit Commands
data class CreateDCConverterUnitCommand(
    @TargetAggregateIdentifier var dCConverterUnitId: UUID? = null,
    @Enumerated(EnumType.STRING) var operationMode: DCConverterOperatingModeKind
)

data class UpdateDCConverterUnitCommand(
    @TargetAggregateIdentifier var dCConverterUnitId: UUID? = null,
    @Enumerated(EnumType.STRING) var operationMode: DCConverterOperatingModeKind
)

data class DeleteDCConverterUnitCommand(@TargetAggregateIdentifier  var dCConverterUnitId: UUID? = null)

// single association commands

// multiple association commands


// DCDisconnector Commands
data class CreateDCDisconnectorCommand(
    @TargetAggregateIdentifier  var dCDisconnectorId: UUID? = null
)

data class UpdateDCDisconnectorCommand(
    @TargetAggregateIdentifier  var dCDisconnectorId: UUID? = null
)

data class DeleteDCDisconnectorCommand(@TargetAggregateIdentifier  var dCDisconnectorId: UUID? = null)

// single association commands

// multiple association commands


// DCEquipmentContainer Commands
data class CreateDCEquipmentContainerCommand(
    @TargetAggregateIdentifier  var dCEquipmentContainerId: UUID? = null
)

data class UpdateDCEquipmentContainerCommand(
    @TargetAggregateIdentifier  var dCEquipmentContainerId: UUID? = null
)

data class DeleteDCEquipmentContainerCommand(@TargetAggregateIdentifier  var dCEquipmentContainerId: UUID? = null)

// single association commands

// multiple association commands


// DCGround Commands
data class CreateDCGroundCommand(
    @TargetAggregateIdentifier  var dCGroundId: UUID? = null
)

data class UpdateDCGroundCommand(
    @TargetAggregateIdentifier var dCGroundId: UUID? = null,
    var inductance: Inductance,
    var r: Resistance
)

data class DeleteDCGroundCommand(@TargetAggregateIdentifier  var dCGroundId: UUID? = null)

// single association commands
data class AssignInductanceToDCGroundCommand(@TargetAggregateIdentifier  val dCGroundId: UUID, val assignment: Inductance )
data class UnAssignInductanceFromDCGroundCommand(@TargetAggregateIdentifier  val dCGroundId: UUID )
data class AssignRToDCGroundCommand(@TargetAggregateIdentifier  val dCGroundId: UUID, val assignment: Resistance )
data class UnAssignRFromDCGroundCommand(@TargetAggregateIdentifier  val dCGroundId: UUID )

// multiple association commands


// DCLine Commands
data class CreateDCLineCommand(
    @TargetAggregateIdentifier  var dCLineId: UUID? = null
)

data class UpdateDCLineCommand(
    @TargetAggregateIdentifier  var dCLineId: UUID? = null
)

data class DeleteDCLineCommand(@TargetAggregateIdentifier  var dCLineId: UUID? = null)

// single association commands

// multiple association commands


// DCLineSegment Commands
data class CreateDCLineSegmentCommand(
    @TargetAggregateIdentifier  var dCLineSegmentId: UUID? = null
)

data class UpdateDCLineSegmentCommand(
    @TargetAggregateIdentifier var dCLineSegmentId: UUID? = null,
    var capacitance: Capacitance,
    var inductance: Inductance,
    var length: Length,
    var resistance: Resistance
)

data class DeleteDCLineSegmentCommand(@TargetAggregateIdentifier  var dCLineSegmentId: UUID? = null)

// single association commands
data class AssignCapacitanceToDCLineSegmentCommand(@TargetAggregateIdentifier  val dCLineSegmentId: UUID, val assignment: Capacitance )
data class UnAssignCapacitanceFromDCLineSegmentCommand(@TargetAggregateIdentifier  val dCLineSegmentId: UUID )
data class AssignInductanceToDCLineSegmentCommand(@TargetAggregateIdentifier  val dCLineSegmentId: UUID, val assignment: Inductance )
data class UnAssignInductanceFromDCLineSegmentCommand(@TargetAggregateIdentifier  val dCLineSegmentId: UUID )
data class AssignLengthToDCLineSegmentCommand(@TargetAggregateIdentifier  val dCLineSegmentId: UUID, val assignment: Length )
data class UnAssignLengthFromDCLineSegmentCommand(@TargetAggregateIdentifier  val dCLineSegmentId: UUID )
data class AssignResistanceToDCLineSegmentCommand(@TargetAggregateIdentifier  val dCLineSegmentId: UUID, val assignment: Resistance )
data class UnAssignResistanceFromDCLineSegmentCommand(@TargetAggregateIdentifier  val dCLineSegmentId: UUID )

// multiple association commands


// DCNode Commands
data class CreateDCNodeCommand(
    @TargetAggregateIdentifier  var dCNodeId: UUID? = null
)

data class UpdateDCNodeCommand(
    @TargetAggregateIdentifier  var dCNodeId: UUID? = null
)

data class DeleteDCNodeCommand(@TargetAggregateIdentifier  var dCNodeId: UUID? = null)

// single association commands

// multiple association commands


// DCSeriesDevice Commands
data class CreateDCSeriesDeviceCommand(
    @TargetAggregateIdentifier  var dCSeriesDeviceId: UUID? = null
)

data class UpdateDCSeriesDeviceCommand(
    @TargetAggregateIdentifier var dCSeriesDeviceId: UUID? = null,
    var inductance: Inductance,
    var ratedUdc: Voltage,
    var resistance: Resistance
)

data class DeleteDCSeriesDeviceCommand(@TargetAggregateIdentifier  var dCSeriesDeviceId: UUID? = null)

// single association commands
data class AssignInductanceToDCSeriesDeviceCommand(@TargetAggregateIdentifier  val dCSeriesDeviceId: UUID, val assignment: Inductance )
data class UnAssignInductanceFromDCSeriesDeviceCommand(@TargetAggregateIdentifier  val dCSeriesDeviceId: UUID )
data class AssignRatedUdcToDCSeriesDeviceCommand(@TargetAggregateIdentifier  val dCSeriesDeviceId: UUID, val assignment: Voltage )
data class UnAssignRatedUdcFromDCSeriesDeviceCommand(@TargetAggregateIdentifier  val dCSeriesDeviceId: UUID )
data class AssignResistanceToDCSeriesDeviceCommand(@TargetAggregateIdentifier  val dCSeriesDeviceId: UUID, val assignment: Resistance )
data class UnAssignResistanceFromDCSeriesDeviceCommand(@TargetAggregateIdentifier  val dCSeriesDeviceId: UUID )

// multiple association commands


// DCShunt Commands
data class CreateDCShuntCommand(
    @TargetAggregateIdentifier  var dCShuntId: UUID? = null
)

data class UpdateDCShuntCommand(
    @TargetAggregateIdentifier var dCShuntId: UUID? = null,
    var capacitance: Capacitance,
    var ratedUdc: Voltage,
    var resistance: Resistance
)

data class DeleteDCShuntCommand(@TargetAggregateIdentifier  var dCShuntId: UUID? = null)

// single association commands
data class AssignCapacitanceToDCShuntCommand(@TargetAggregateIdentifier  val dCShuntId: UUID, val assignment: Capacitance )
data class UnAssignCapacitanceFromDCShuntCommand(@TargetAggregateIdentifier  val dCShuntId: UUID )
data class AssignRatedUdcToDCShuntCommand(@TargetAggregateIdentifier  val dCShuntId: UUID, val assignment: Voltage )
data class UnAssignRatedUdcFromDCShuntCommand(@TargetAggregateIdentifier  val dCShuntId: UUID )
data class AssignResistanceToDCShuntCommand(@TargetAggregateIdentifier  val dCShuntId: UUID, val assignment: Resistance )
data class UnAssignResistanceFromDCShuntCommand(@TargetAggregateIdentifier  val dCShuntId: UUID )

// multiple association commands


// DCSwitch Commands
data class CreateDCSwitchCommand(
    @TargetAggregateIdentifier  var dCSwitchId: UUID? = null
)

data class UpdateDCSwitchCommand(
    @TargetAggregateIdentifier  var dCSwitchId: UUID? = null
)

data class DeleteDCSwitchCommand(@TargetAggregateIdentifier  var dCSwitchId: UUID? = null)

// single association commands

// multiple association commands


// DCTerminal Commands
data class CreateDCTerminalCommand(
    @TargetAggregateIdentifier  var dCTerminalId: UUID? = null
)

data class UpdateDCTerminalCommand(
    @TargetAggregateIdentifier  var dCTerminalId: UUID? = null
)

data class DeleteDCTerminalCommand(@TargetAggregateIdentifier  var dCTerminalId: UUID? = null)

// single association commands

// multiple association commands


// DCTopologicalIsland Commands
data class CreateDCTopologicalIslandCommand(
    @TargetAggregateIdentifier  var dCTopologicalIslandId: UUID? = null
)

data class UpdateDCTopologicalIslandCommand(
    @TargetAggregateIdentifier  var dCTopologicalIslandId: UUID? = null
)

data class DeleteDCTopologicalIslandCommand(@TargetAggregateIdentifier  var dCTopologicalIslandId: UUID? = null)

// single association commands

// multiple association commands


// DCTopologicalNode Commands
data class CreateDCTopologicalNodeCommand(
    @TargetAggregateIdentifier  var dCTopologicalNodeId: UUID? = null
)

data class UpdateDCTopologicalNodeCommand(
    @TargetAggregateIdentifier  var dCTopologicalNodeId: UUID? = null
)

data class DeleteDCTopologicalNodeCommand(@TargetAggregateIdentifier  var dCTopologicalNodeId: UUID? = null)

// single association commands

// multiple association commands


// DateProxy Commands
data class CreateDateProxyCommand(
    @TargetAggregateIdentifier  var dateProxyId: UUID? = null
)

data class UpdateDateProxyCommand(
    @TargetAggregateIdentifier  var dateProxyId: UUID? = null
)

data class DeleteDateProxyCommand(@TargetAggregateIdentifier  var dateProxyId: UUID? = null)

// single association commands

// multiple association commands


// DateTime Commands
data class CreateDateTimeCommand(
    @TargetAggregateIdentifier  var dateTimeId: UUID? = null
)

data class UpdateDateTimeCommand(
    @TargetAggregateIdentifier  var dateTimeId: UUID? = null
)

data class DeleteDateTimeCommand(@TargetAggregateIdentifier  var dateTimeId: UUID? = null)

// single association commands

// multiple association commands


// DayType Commands
data class CreateDayTypeCommand(
    @TargetAggregateIdentifier  var dayTypeId: UUID? = null
)

data class UpdateDayTypeCommand(
    @TargetAggregateIdentifier  var dayTypeId: UUID? = null
)

data class DeleteDayTypeCommand(@TargetAggregateIdentifier  var dayTypeId: UUID? = null)

// single association commands

// multiple association commands


// DecimalProxy Commands
data class CreateDecimalProxyCommand(
    @TargetAggregateIdentifier  var decimalProxyId: UUID? = null
)

data class UpdateDecimalProxyCommand(
    @TargetAggregateIdentifier  var decimalProxyId: UUID? = null
)

data class DeleteDecimalProxyCommand(@TargetAggregateIdentifier  var decimalProxyId: UUID? = null)

// single association commands

// multiple association commands


// Diagram Commands
data class CreateDiagramCommand(
    @TargetAggregateIdentifier var diagramId: UUID? = null,
    @Enumerated(EnumType.STRING) var orientation: OrientationKind
)

data class UpdateDiagramCommand(
    @TargetAggregateIdentifier var diagramId: UUID? = null,
    @Enumerated(EnumType.STRING) var orientation: OrientationKind,
    var x1InitialView: Simple_Float,
    var x2InitialView: Simple_Float,
    var y1InitialView: Simple_Float,
    var y2InitialView: Simple_Float
)

data class DeleteDiagramCommand(@TargetAggregateIdentifier  var diagramId: UUID? = null)

// single association commands
data class AssignX1InitialViewToDiagramCommand(@TargetAggregateIdentifier  val diagramId: UUID, val assignment: Simple_Float )
data class UnAssignX1InitialViewFromDiagramCommand(@TargetAggregateIdentifier  val diagramId: UUID )
data class AssignX2InitialViewToDiagramCommand(@TargetAggregateIdentifier  val diagramId: UUID, val assignment: Simple_Float )
data class UnAssignX2InitialViewFromDiagramCommand(@TargetAggregateIdentifier  val diagramId: UUID )
data class AssignY1InitialViewToDiagramCommand(@TargetAggregateIdentifier  val diagramId: UUID, val assignment: Simple_Float )
data class UnAssignY1InitialViewFromDiagramCommand(@TargetAggregateIdentifier  val diagramId: UUID )
data class AssignY2InitialViewToDiagramCommand(@TargetAggregateIdentifier  val diagramId: UUID, val assignment: Simple_Float )
data class UnAssignY2InitialViewFromDiagramCommand(@TargetAggregateIdentifier  val diagramId: UUID )

// multiple association commands


// DiagramLayoutVersion Commands
data class CreateDiagramLayoutVersionCommand(
    @TargetAggregateIdentifier  var diagramLayoutVersionId: UUID? = null
)

data class UpdateDiagramLayoutVersionCommand(
    @TargetAggregateIdentifier var diagramLayoutVersionId: UUID? = null,
    var baseUML: StringProxy,
    var baseURI: StringProxy,
    var date: DateProxy,
    var differenceModelURI: StringProxy,
    var entsoeUML: StringProxy,
    var entsoeURI: StringProxy,
    var modelDescriptionURI: StringProxy,
    var namespaceRDF: StringProxy,
    var namespaceUML: StringProxy,
    var shortName: StringProxy
)

data class DeleteDiagramLayoutVersionCommand(@TargetAggregateIdentifier  var diagramLayoutVersionId: UUID? = null)

// single association commands
data class AssignBaseUMLToDiagramLayoutVersionCommand(@TargetAggregateIdentifier  val diagramLayoutVersionId: UUID, val assignment: StringProxy )
data class UnAssignBaseUMLFromDiagramLayoutVersionCommand(@TargetAggregateIdentifier  val diagramLayoutVersionId: UUID )
data class AssignBaseURIToDiagramLayoutVersionCommand(@TargetAggregateIdentifier  val diagramLayoutVersionId: UUID, val assignment: StringProxy )
data class UnAssignBaseURIFromDiagramLayoutVersionCommand(@TargetAggregateIdentifier  val diagramLayoutVersionId: UUID )
data class AssignDateToDiagramLayoutVersionCommand(@TargetAggregateIdentifier  val diagramLayoutVersionId: UUID, val assignment: DateProxy )
data class UnAssignDateFromDiagramLayoutVersionCommand(@TargetAggregateIdentifier  val diagramLayoutVersionId: UUID )
data class AssignDifferenceModelURIToDiagramLayoutVersionCommand(@TargetAggregateIdentifier  val diagramLayoutVersionId: UUID, val assignment: StringProxy )
data class UnAssignDifferenceModelURIFromDiagramLayoutVersionCommand(@TargetAggregateIdentifier  val diagramLayoutVersionId: UUID )
data class AssignEntsoeUMLToDiagramLayoutVersionCommand(@TargetAggregateIdentifier  val diagramLayoutVersionId: UUID, val assignment: StringProxy )
data class UnAssignEntsoeUMLFromDiagramLayoutVersionCommand(@TargetAggregateIdentifier  val diagramLayoutVersionId: UUID )
data class AssignEntsoeURIToDiagramLayoutVersionCommand(@TargetAggregateIdentifier  val diagramLayoutVersionId: UUID, val assignment: StringProxy )
data class UnAssignEntsoeURIFromDiagramLayoutVersionCommand(@TargetAggregateIdentifier  val diagramLayoutVersionId: UUID )
data class AssignModelDescriptionURIToDiagramLayoutVersionCommand(@TargetAggregateIdentifier  val diagramLayoutVersionId: UUID, val assignment: StringProxy )
data class UnAssignModelDescriptionURIFromDiagramLayoutVersionCommand(@TargetAggregateIdentifier  val diagramLayoutVersionId: UUID )
data class AssignNamespaceRDFToDiagramLayoutVersionCommand(@TargetAggregateIdentifier  val diagramLayoutVersionId: UUID, val assignment: StringProxy )
data class UnAssignNamespaceRDFFromDiagramLayoutVersionCommand(@TargetAggregateIdentifier  val diagramLayoutVersionId: UUID )
data class AssignNamespaceUMLToDiagramLayoutVersionCommand(@TargetAggregateIdentifier  val diagramLayoutVersionId: UUID, val assignment: StringProxy )
data class UnAssignNamespaceUMLFromDiagramLayoutVersionCommand(@TargetAggregateIdentifier  val diagramLayoutVersionId: UUID )
data class AssignShortNameToDiagramLayoutVersionCommand(@TargetAggregateIdentifier  val diagramLayoutVersionId: UUID, val assignment: StringProxy )
data class UnAssignShortNameFromDiagramLayoutVersionCommand(@TargetAggregateIdentifier  val diagramLayoutVersionId: UUID )

// multiple association commands


// DiagramObject Commands
data class CreateDiagramObjectCommand(
    @TargetAggregateIdentifier  var diagramObjectId: UUID? = null
)

data class UpdateDiagramObjectCommand(
    @TargetAggregateIdentifier var diagramObjectId: UUID? = null,
    var drawingOrder: IntegerProxy,
    var polygonFlag: BooleanProxy,
    var offsetX: Simple_Float,
    var offsetY: Simple_Float,
    var rotation: AngleDegrees
)

data class DeleteDiagramObjectCommand(@TargetAggregateIdentifier  var diagramObjectId: UUID? = null)

// single association commands
data class AssignDrawingOrderToDiagramObjectCommand(@TargetAggregateIdentifier  val diagramObjectId: UUID, val assignment: IntegerProxy )
data class UnAssignDrawingOrderFromDiagramObjectCommand(@TargetAggregateIdentifier  val diagramObjectId: UUID )
data class AssignPolygonFlagToDiagramObjectCommand(@TargetAggregateIdentifier  val diagramObjectId: UUID, val assignment: BooleanProxy )
data class UnAssignPolygonFlagFromDiagramObjectCommand(@TargetAggregateIdentifier  val diagramObjectId: UUID )
data class AssignOffsetXToDiagramObjectCommand(@TargetAggregateIdentifier  val diagramObjectId: UUID, val assignment: Simple_Float )
data class UnAssignOffsetXFromDiagramObjectCommand(@TargetAggregateIdentifier  val diagramObjectId: UUID )
data class AssignOffsetYToDiagramObjectCommand(@TargetAggregateIdentifier  val diagramObjectId: UUID, val assignment: Simple_Float )
data class UnAssignOffsetYFromDiagramObjectCommand(@TargetAggregateIdentifier  val diagramObjectId: UUID )
data class AssignRotationToDiagramObjectCommand(@TargetAggregateIdentifier  val diagramObjectId: UUID, val assignment: AngleDegrees )
data class UnAssignRotationFromDiagramObjectCommand(@TargetAggregateIdentifier  val diagramObjectId: UUID )

// multiple association commands


// DiagramObjectGluePoint Commands
data class CreateDiagramObjectGluePointCommand(
    @TargetAggregateIdentifier  var diagramObjectGluePointId: UUID? = null
)

data class UpdateDiagramObjectGluePointCommand(
    @TargetAggregateIdentifier  var diagramObjectGluePointId: UUID? = null
)

data class DeleteDiagramObjectGluePointCommand(@TargetAggregateIdentifier  var diagramObjectGluePointId: UUID? = null)

// single association commands

// multiple association commands


// DiagramObjectPoint Commands
data class CreateDiagramObjectPointCommand(
    @TargetAggregateIdentifier  var diagramObjectPointId: UUID? = null
)

data class UpdateDiagramObjectPointCommand(
    @TargetAggregateIdentifier var diagramObjectPointId: UUID? = null,
    var sequenceNumber: IntegerProxy,
    var xPosition: Simple_Float,
    var yPosition: Simple_Float,
    var zPosition: Simple_Float
)

data class DeleteDiagramObjectPointCommand(@TargetAggregateIdentifier  var diagramObjectPointId: UUID? = null)

// single association commands
data class AssignSequenceNumberToDiagramObjectPointCommand(@TargetAggregateIdentifier  val diagramObjectPointId: UUID, val assignment: IntegerProxy )
data class UnAssignSequenceNumberFromDiagramObjectPointCommand(@TargetAggregateIdentifier  val diagramObjectPointId: UUID )
data class AssignXPositionToDiagramObjectPointCommand(@TargetAggregateIdentifier  val diagramObjectPointId: UUID, val assignment: Simple_Float )
data class UnAssignXPositionFromDiagramObjectPointCommand(@TargetAggregateIdentifier  val diagramObjectPointId: UUID )
data class AssignYPositionToDiagramObjectPointCommand(@TargetAggregateIdentifier  val diagramObjectPointId: UUID, val assignment: Simple_Float )
data class UnAssignYPositionFromDiagramObjectPointCommand(@TargetAggregateIdentifier  val diagramObjectPointId: UUID )
data class AssignZPositionToDiagramObjectPointCommand(@TargetAggregateIdentifier  val diagramObjectPointId: UUID, val assignment: Simple_Float )
data class UnAssignZPositionFromDiagramObjectPointCommand(@TargetAggregateIdentifier  val diagramObjectPointId: UUID )

// multiple association commands


// DiagramObjectStyle Commands
data class CreateDiagramObjectStyleCommand(
    @TargetAggregateIdentifier  var diagramObjectStyleId: UUID? = null
)

data class UpdateDiagramObjectStyleCommand(
    @TargetAggregateIdentifier  var diagramObjectStyleId: UUID? = null
)

data class DeleteDiagramObjectStyleCommand(@TargetAggregateIdentifier  var diagramObjectStyleId: UUID? = null)

// single association commands

// multiple association commands


// DiagramStyle Commands
data class CreateDiagramStyleCommand(
    @TargetAggregateIdentifier  var diagramStyleId: UUID? = null
)

data class UpdateDiagramStyleCommand(
    @TargetAggregateIdentifier  var diagramStyleId: UUID? = null
)

data class DeleteDiagramStyleCommand(@TargetAggregateIdentifier  var diagramStyleId: UUID? = null)

// single association commands

// multiple association commands


// DiscExcContIEEEDEC1A Commands
data class CreateDiscExcContIEEEDEC1ACommand(
    @TargetAggregateIdentifier  var discExcContIEEEDEC1AId: UUID? = null
)

data class UpdateDiscExcContIEEEDEC1ACommand(
    @TargetAggregateIdentifier var discExcContIEEEDEC1AId: UUID? = null,
    var esc: PU,
    var kan: PU,
    var ketl: PU,
    var tan: Seconds,
    var td: Seconds,
    var tl1: Seconds,
    var tl2: Seconds,
    var tw5: Seconds,
    var value: PU,
    var vanmax: PU,
    var vomax: PU,
    var vomin: PU,
    var vsmax: PU,
    var vsmin: PU,
    var vtc: PU,
    var vtlmt: PU,
    var vtm: PU,
    var vtn: PU
)

data class DeleteDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  var discExcContIEEEDEC1AId: UUID? = null)

// single association commands
data class AssignEscToDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID, val assignment: PU )
data class UnAssignEscFromDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID )
data class AssignKanToDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID, val assignment: PU )
data class UnAssignKanFromDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID )
data class AssignKetlToDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID, val assignment: PU )
data class UnAssignKetlFromDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID )
data class AssignTanToDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID, val assignment: Seconds )
data class UnAssignTanFromDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID )
data class AssignTdToDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID, val assignment: Seconds )
data class UnAssignTdFromDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID )
data class AssignTl1ToDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID, val assignment: Seconds )
data class UnAssignTl1FromDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID )
data class AssignTl2ToDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID, val assignment: Seconds )
data class UnAssignTl2FromDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID )
data class AssignTw5ToDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID, val assignment: Seconds )
data class UnAssignTw5FromDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID )
data class AssignValueToDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID, val assignment: PU )
data class UnAssignValueFromDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID )
data class AssignVanmaxToDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID, val assignment: PU )
data class UnAssignVanmaxFromDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID )
data class AssignVomaxToDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID, val assignment: PU )
data class UnAssignVomaxFromDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID )
data class AssignVominToDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID, val assignment: PU )
data class UnAssignVominFromDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID )
data class AssignVsmaxToDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID, val assignment: PU )
data class UnAssignVsmaxFromDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID )
data class AssignVsminToDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID, val assignment: PU )
data class UnAssignVsminFromDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID )
data class AssignVtcToDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID, val assignment: PU )
data class UnAssignVtcFromDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID )
data class AssignVtlmtToDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID, val assignment: PU )
data class UnAssignVtlmtFromDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID )
data class AssignVtmToDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID, val assignment: PU )
data class UnAssignVtmFromDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID )
data class AssignVtnToDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID, val assignment: PU )
data class UnAssignVtnFromDiscExcContIEEEDEC1ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC1AId: UUID )

// multiple association commands


// DiscExcContIEEEDEC2A Commands
data class CreateDiscExcContIEEEDEC2ACommand(
    @TargetAggregateIdentifier  var discExcContIEEEDEC2AId: UUID? = null
)

data class UpdateDiscExcContIEEEDEC2ACommand(
    @TargetAggregateIdentifier var discExcContIEEEDEC2AId: UUID? = null,
    var td1: Seconds,
    var td2: Seconds,
    var vdmax: PU,
    var vdmin: PU,
    var vk: PU
)

data class DeleteDiscExcContIEEEDEC2ACommand(@TargetAggregateIdentifier  var discExcContIEEEDEC2AId: UUID? = null)

// single association commands
data class AssignTd1ToDiscExcContIEEEDEC2ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC2AId: UUID, val assignment: Seconds )
data class UnAssignTd1FromDiscExcContIEEEDEC2ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC2AId: UUID )
data class AssignTd2ToDiscExcContIEEEDEC2ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC2AId: UUID, val assignment: Seconds )
data class UnAssignTd2FromDiscExcContIEEEDEC2ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC2AId: UUID )
data class AssignVdmaxToDiscExcContIEEEDEC2ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC2AId: UUID, val assignment: PU )
data class UnAssignVdmaxFromDiscExcContIEEEDEC2ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC2AId: UUID )
data class AssignVdminToDiscExcContIEEEDEC2ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC2AId: UUID, val assignment: PU )
data class UnAssignVdminFromDiscExcContIEEEDEC2ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC2AId: UUID )
data class AssignVkToDiscExcContIEEEDEC2ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC2AId: UUID, val assignment: PU )
data class UnAssignVkFromDiscExcContIEEEDEC2ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC2AId: UUID )

// multiple association commands


// DiscExcContIEEEDEC3A Commands
data class CreateDiscExcContIEEEDEC3ACommand(
    @TargetAggregateIdentifier  var discExcContIEEEDEC3AId: UUID? = null
)

data class UpdateDiscExcContIEEEDEC3ACommand(
    @TargetAggregateIdentifier var discExcContIEEEDEC3AId: UUID? = null,
    var tdr: Seconds,
    var vtmin: PU
)

data class DeleteDiscExcContIEEEDEC3ACommand(@TargetAggregateIdentifier  var discExcContIEEEDEC3AId: UUID? = null)

// single association commands
data class AssignTdrToDiscExcContIEEEDEC3ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC3AId: UUID, val assignment: Seconds )
data class UnAssignTdrFromDiscExcContIEEEDEC3ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC3AId: UUID )
data class AssignVtminToDiscExcContIEEEDEC3ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC3AId: UUID, val assignment: PU )
data class UnAssignVtminFromDiscExcContIEEEDEC3ACommand(@TargetAggregateIdentifier  val discExcContIEEEDEC3AId: UUID )

// multiple association commands


// Disconnector Commands
data class CreateDisconnectorCommand(
    @TargetAggregateIdentifier  var disconnectorId: UUID? = null
)

data class UpdateDisconnectorCommand(
    @TargetAggregateIdentifier  var disconnectorId: UUID? = null
)

data class DeleteDisconnectorCommand(@TargetAggregateIdentifier  var disconnectorId: UUID? = null)

// single association commands

// multiple association commands


// DiscontinuousExcitationControlDynamics Commands
data class CreateDiscontinuousExcitationControlDynamicsCommand(
    @TargetAggregateIdentifier  var discontinuousExcitationControlDynamicsId: UUID? = null
)

data class UpdateDiscontinuousExcitationControlDynamicsCommand(
    @TargetAggregateIdentifier  var discontinuousExcitationControlDynamicsId: UUID? = null
)

data class DeleteDiscontinuousExcitationControlDynamicsCommand(@TargetAggregateIdentifier  var discontinuousExcitationControlDynamicsId: UUID? = null)

// single association commands

// multiple association commands


// DiscontinuousExcitationControlUserDefined Commands
data class CreateDiscontinuousExcitationControlUserDefinedCommand(
    @TargetAggregateIdentifier  var discontinuousExcitationControlUserDefinedId: UUID? = null
)

data class UpdateDiscontinuousExcitationControlUserDefinedCommand(
    @TargetAggregateIdentifier var discontinuousExcitationControlUserDefinedId: UUID? = null,
    var proprietary: BooleanProxy
)

data class DeleteDiscontinuousExcitationControlUserDefinedCommand(@TargetAggregateIdentifier  var discontinuousExcitationControlUserDefinedId: UUID? = null)

// single association commands
data class AssignProprietaryToDiscontinuousExcitationControlUserDefinedCommand(@TargetAggregateIdentifier  val discontinuousExcitationControlUserDefinedId: UUID, val assignment: BooleanProxy )
data class UnAssignProprietaryFromDiscontinuousExcitationControlUserDefinedCommand(@TargetAggregateIdentifier  val discontinuousExcitationControlUserDefinedId: UUID )

// multiple association commands


// Discrete Commands
data class CreateDiscreteCommand(
    @TargetAggregateIdentifier  var discreteId: UUID? = null
)

data class UpdateDiscreteCommand(
    @TargetAggregateIdentifier  var discreteId: UUID? = null
)

data class DeleteDiscreteCommand(@TargetAggregateIdentifier  var discreteId: UUID? = null)

// single association commands

// multiple association commands


// DiscreteValue Commands
data class CreateDiscreteValueCommand(
    @TargetAggregateIdentifier  var discreteValueId: UUID? = null
)

data class UpdateDiscreteValueCommand(
    @TargetAggregateIdentifier var discreteValueId: UUID? = null,
    var value: IntegerProxy
)

data class DeleteDiscreteValueCommand(@TargetAggregateIdentifier  var discreteValueId: UUID? = null)

// single association commands
data class AssignValueToDiscreteValueCommand(@TargetAggregateIdentifier  val discreteValueId: UUID, val assignment: IntegerProxy )
data class UnAssignValueFromDiscreteValueCommand(@TargetAggregateIdentifier  val discreteValueId: UUID )

// multiple association commands


// DomainVersion Commands
data class CreateDomainVersionCommand(
    @TargetAggregateIdentifier  var domainVersionId: UUID? = null
)

data class UpdateDomainVersionCommand(
    @TargetAggregateIdentifier var domainVersionId: UUID? = null,
    var baseUML: StringProxy,
    var date: DateProxy,
    var entsoeUML: StringProxy,
    var version: StringProxy
)

data class DeleteDomainVersionCommand(@TargetAggregateIdentifier  var domainVersionId: UUID? = null)

// single association commands
data class AssignBaseUMLToDomainVersionCommand(@TargetAggregateIdentifier  val domainVersionId: UUID, val assignment: StringProxy )
data class UnAssignBaseUMLFromDomainVersionCommand(@TargetAggregateIdentifier  val domainVersionId: UUID )
data class AssignDateToDomainVersionCommand(@TargetAggregateIdentifier  val domainVersionId: UUID, val assignment: DateProxy )
data class UnAssignDateFromDomainVersionCommand(@TargetAggregateIdentifier  val domainVersionId: UUID )
data class AssignEntsoeUMLToDomainVersionCommand(@TargetAggregateIdentifier  val domainVersionId: UUID, val assignment: StringProxy )
data class UnAssignEntsoeUMLFromDomainVersionCommand(@TargetAggregateIdentifier  val domainVersionId: UUID )
data class AssignVersionToDomainVersionCommand(@TargetAggregateIdentifier  val domainVersionId: UUID, val assignment: StringProxy )
data class UnAssignVersionFromDomainVersionCommand(@TargetAggregateIdentifier  val domainVersionId: UUID )

// multiple association commands


// DynamicsFunctionBlock Commands
data class CreateDynamicsFunctionBlockCommand(
    @TargetAggregateIdentifier  var dynamicsFunctionBlockId: UUID? = null
)

data class UpdateDynamicsFunctionBlockCommand(
    @TargetAggregateIdentifier var dynamicsFunctionBlockId: UUID? = null,
    var enabled: BooleanProxy
)

data class DeleteDynamicsFunctionBlockCommand(@TargetAggregateIdentifier  var dynamicsFunctionBlockId: UUID? = null)

// single association commands
data class AssignEnabledToDynamicsFunctionBlockCommand(@TargetAggregateIdentifier  val dynamicsFunctionBlockId: UUID, val assignment: BooleanProxy )
data class UnAssignEnabledFromDynamicsFunctionBlockCommand(@TargetAggregateIdentifier  val dynamicsFunctionBlockId: UUID )

// multiple association commands


// DynamicsVersion Commands
data class CreateDynamicsVersionCommand(
    @TargetAggregateIdentifier  var dynamicsVersionId: UUID? = null
)

data class UpdateDynamicsVersionCommand(
    @TargetAggregateIdentifier var dynamicsVersionId: UUID? = null,
    var baseUML: StringProxy,
    var baseURI: StringProxy,
    var date: DateProxy,
    var differenceModelURI: StringProxy,
    var entsoeUML: StringProxy,
    var entsoeURI: StringProxy,
    var modelDescriptionURI: StringProxy,
    var namespaceRDF: StringProxy,
    var namespaceUML: StringProxy,
    var shortName: StringProxy
)

data class DeleteDynamicsVersionCommand(@TargetAggregateIdentifier  var dynamicsVersionId: UUID? = null)

// single association commands
data class AssignBaseUMLToDynamicsVersionCommand(@TargetAggregateIdentifier  val dynamicsVersionId: UUID, val assignment: StringProxy )
data class UnAssignBaseUMLFromDynamicsVersionCommand(@TargetAggregateIdentifier  val dynamicsVersionId: UUID )
data class AssignBaseURIToDynamicsVersionCommand(@TargetAggregateIdentifier  val dynamicsVersionId: UUID, val assignment: StringProxy )
data class UnAssignBaseURIFromDynamicsVersionCommand(@TargetAggregateIdentifier  val dynamicsVersionId: UUID )
data class AssignDateToDynamicsVersionCommand(@TargetAggregateIdentifier  val dynamicsVersionId: UUID, val assignment: DateProxy )
data class UnAssignDateFromDynamicsVersionCommand(@TargetAggregateIdentifier  val dynamicsVersionId: UUID )
data class AssignDifferenceModelURIToDynamicsVersionCommand(@TargetAggregateIdentifier  val dynamicsVersionId: UUID, val assignment: StringProxy )
data class UnAssignDifferenceModelURIFromDynamicsVersionCommand(@TargetAggregateIdentifier  val dynamicsVersionId: UUID )
data class AssignEntsoeUMLToDynamicsVersionCommand(@TargetAggregateIdentifier  val dynamicsVersionId: UUID, val assignment: StringProxy )
data class UnAssignEntsoeUMLFromDynamicsVersionCommand(@TargetAggregateIdentifier  val dynamicsVersionId: UUID )
data class AssignEntsoeURIToDynamicsVersionCommand(@TargetAggregateIdentifier  val dynamicsVersionId: UUID, val assignment: StringProxy )
data class UnAssignEntsoeURIFromDynamicsVersionCommand(@TargetAggregateIdentifier  val dynamicsVersionId: UUID )
data class AssignModelDescriptionURIToDynamicsVersionCommand(@TargetAggregateIdentifier  val dynamicsVersionId: UUID, val assignment: StringProxy )
data class UnAssignModelDescriptionURIFromDynamicsVersionCommand(@TargetAggregateIdentifier  val dynamicsVersionId: UUID )
data class AssignNamespaceRDFToDynamicsVersionCommand(@TargetAggregateIdentifier  val dynamicsVersionId: UUID, val assignment: StringProxy )
data class UnAssignNamespaceRDFFromDynamicsVersionCommand(@TargetAggregateIdentifier  val dynamicsVersionId: UUID )
data class AssignNamespaceUMLToDynamicsVersionCommand(@TargetAggregateIdentifier  val dynamicsVersionId: UUID, val assignment: StringProxy )
data class UnAssignNamespaceUMLFromDynamicsVersionCommand(@TargetAggregateIdentifier  val dynamicsVersionId: UUID )
data class AssignShortNameToDynamicsVersionCommand(@TargetAggregateIdentifier  val dynamicsVersionId: UUID, val assignment: StringProxy )
data class UnAssignShortNameFromDynamicsVersionCommand(@TargetAggregateIdentifier  val dynamicsVersionId: UUID )

// multiple association commands


// Dynamicsmodel Commands
data class CreateDynamicsmodelCommand(
    @TargetAggregateIdentifier  var dynamicsmodelId: UUID? = null
)

data class UpdateDynamicsmodelCommand(
    @TargetAggregateIdentifier  var dynamicsmodelId: UUID? = null
)

data class DeleteDynamicsmodelCommand(@TargetAggregateIdentifier  var dynamicsmodelId: UUID? = null)

// single association commands

// multiple association commands


// ENTSOEConnectivityNode Commands
data class CreateENTSOEConnectivityNodeCommand(
    @TargetAggregateIdentifier  var eNTSOEConnectivityNodeId: UUID? = null
)

data class UpdateENTSOEConnectivityNodeCommand(
    @TargetAggregateIdentifier  var eNTSOEConnectivityNodeId: UUID? = null
)

data class DeleteENTSOEConnectivityNodeCommand(@TargetAggregateIdentifier  var eNTSOEConnectivityNodeId: UUID? = null)

// single association commands

// multiple association commands


// ENTSOEIdentifiedObject Commands
data class CreateENTSOEIdentifiedObjectCommand(
    @TargetAggregateIdentifier  var eNTSOEIdentifiedObjectId: UUID? = null
)

data class UpdateENTSOEIdentifiedObjectCommand(
    @TargetAggregateIdentifier var eNTSOEIdentifiedObjectId: UUID? = null,
    var energyIdentCodeEic: StringProxy,
    var shortName: StringProxy
)

data class DeleteENTSOEIdentifiedObjectCommand(@TargetAggregateIdentifier  var eNTSOEIdentifiedObjectId: UUID? = null)

// single association commands
data class AssignEnergyIdentCodeEicToENTSOEIdentifiedObjectCommand(@TargetAggregateIdentifier  val eNTSOEIdentifiedObjectId: UUID, val assignment: StringProxy )
data class UnAssignEnergyIdentCodeEicFromENTSOEIdentifiedObjectCommand(@TargetAggregateIdentifier  val eNTSOEIdentifiedObjectId: UUID )
data class AssignShortNameToENTSOEIdentifiedObjectCommand(@TargetAggregateIdentifier  val eNTSOEIdentifiedObjectId: UUID, val assignment: StringProxy )
data class UnAssignShortNameFromENTSOEIdentifiedObjectCommand(@TargetAggregateIdentifier  val eNTSOEIdentifiedObjectId: UUID )

// multiple association commands


// ENTSOEJunction Commands
data class CreateENTSOEJunctionCommand(
    @TargetAggregateIdentifier  var eNTSOEJunctionId: UUID? = null
)

data class UpdateENTSOEJunctionCommand(
    @TargetAggregateIdentifier  var eNTSOEJunctionId: UUID? = null
)

data class DeleteENTSOEJunctionCommand(@TargetAggregateIdentifier  var eNTSOEJunctionId: UUID? = null)

// single association commands

// multiple association commands


// ENTSOEOperationalLimitType Commands
data class CreateENTSOEOperationalLimitTypeCommand(
    @TargetAggregateIdentifier var eNTSOEOperationalLimitTypeId: UUID? = null,
    @Enumerated(EnumType.STRING) var limitType: LimitTypeKind
)

data class UpdateENTSOEOperationalLimitTypeCommand(
    @TargetAggregateIdentifier var eNTSOEOperationalLimitTypeId: UUID? = null,
    @Enumerated(EnumType.STRING) var limitType: LimitTypeKind
)

data class DeleteENTSOEOperationalLimitTypeCommand(@TargetAggregateIdentifier  var eNTSOEOperationalLimitTypeId: UUID? = null)

// single association commands

// multiple association commands


// ENTSOETopologicalNode Commands
data class CreateENTSOETopologicalNodeCommand(
    @TargetAggregateIdentifier  var eNTSOETopologicalNodeId: UUID? = null
)

data class UpdateENTSOETopologicalNodeCommand(
    @TargetAggregateIdentifier  var eNTSOETopologicalNodeId: UUID? = null
)

data class DeleteENTSOETopologicalNodeCommand(@TargetAggregateIdentifier  var eNTSOETopologicalNodeId: UUID? = null)

// single association commands

// multiple association commands


// EarthFaultCompensator Commands
data class CreateEarthFaultCompensatorCommand(
    @TargetAggregateIdentifier  var earthFaultCompensatorId: UUID? = null
)

data class UpdateEarthFaultCompensatorCommand(
    @TargetAggregateIdentifier var earthFaultCompensatorId: UUID? = null,
    var r: Resistance
)

data class DeleteEarthFaultCompensatorCommand(@TargetAggregateIdentifier  var earthFaultCompensatorId: UUID? = null)

// single association commands
data class AssignRToEarthFaultCompensatorCommand(@TargetAggregateIdentifier  val earthFaultCompensatorId: UUID, val assignment: Resistance )
data class UnAssignRFromEarthFaultCompensatorCommand(@TargetAggregateIdentifier  val earthFaultCompensatorId: UUID )

// multiple association commands


// EnergyArea Commands
data class CreateEnergyAreaCommand(
    @TargetAggregateIdentifier  var energyAreaId: UUID? = null
)

data class UpdateEnergyAreaCommand(
    @TargetAggregateIdentifier  var energyAreaId: UUID? = null
)

data class DeleteEnergyAreaCommand(@TargetAggregateIdentifier  var energyAreaId: UUID? = null)

// single association commands

// multiple association commands


// EnergyConsumer Commands
data class CreateEnergyConsumerCommand(
    @TargetAggregateIdentifier  var energyConsumerId: UUID? = null
)

data class UpdateEnergyConsumerCommand(
    @TargetAggregateIdentifier var energyConsumerId: UUID? = null,
    var pfixed: ActivePower,
    var pfixedPct: PerCent,
    var qfixed: ReactivePower,
    var qfixedPct: PerCent
)

data class DeleteEnergyConsumerCommand(@TargetAggregateIdentifier  var energyConsumerId: UUID? = null)

// single association commands
data class AssignPfixedToEnergyConsumerCommand(@TargetAggregateIdentifier  val energyConsumerId: UUID, val assignment: ActivePower )
data class UnAssignPfixedFromEnergyConsumerCommand(@TargetAggregateIdentifier  val energyConsumerId: UUID )
data class AssignPfixedPctToEnergyConsumerCommand(@TargetAggregateIdentifier  val energyConsumerId: UUID, val assignment: PerCent )
data class UnAssignPfixedPctFromEnergyConsumerCommand(@TargetAggregateIdentifier  val energyConsumerId: UUID )
data class AssignQfixedToEnergyConsumerCommand(@TargetAggregateIdentifier  val energyConsumerId: UUID, val assignment: ReactivePower )
data class UnAssignQfixedFromEnergyConsumerCommand(@TargetAggregateIdentifier  val energyConsumerId: UUID )
data class AssignQfixedPctToEnergyConsumerCommand(@TargetAggregateIdentifier  val energyConsumerId: UUID, val assignment: PerCent )
data class UnAssignQfixedPctFromEnergyConsumerCommand(@TargetAggregateIdentifier  val energyConsumerId: UUID )

// multiple association commands


// EnergySchedulingType Commands
data class CreateEnergySchedulingTypeCommand(
    @TargetAggregateIdentifier  var energySchedulingTypeId: UUID? = null
)

data class UpdateEnergySchedulingTypeCommand(
    @TargetAggregateIdentifier  var energySchedulingTypeId: UUID? = null
)

data class DeleteEnergySchedulingTypeCommand(@TargetAggregateIdentifier  var energySchedulingTypeId: UUID? = null)

// single association commands

// multiple association commands


// EnergySource Commands
data class CreateEnergySourceCommand(
    @TargetAggregateIdentifier  var energySourceId: UUID? = null
)

data class UpdateEnergySourceCommand(
    @TargetAggregateIdentifier  var energySourceId: UUID? = null
)

data class DeleteEnergySourceCommand(@TargetAggregateIdentifier  var energySourceId: UUID? = null)

// single association commands

// multiple association commands


// Equipment Commands
data class CreateEquipmentCommand(
    @TargetAggregateIdentifier  var equipmentId: UUID? = null
)

data class UpdateEquipmentCommand(
    @TargetAggregateIdentifier  var equipmentId: UUID? = null
)

data class DeleteEquipmentCommand(@TargetAggregateIdentifier  var equipmentId: UUID? = null)

// single association commands

// multiple association commands


// EquipmentBoundaryVersion Commands
data class CreateEquipmentBoundaryVersionCommand(
    @TargetAggregateIdentifier  var equipmentBoundaryVersionId: UUID? = null
)

data class UpdateEquipmentBoundaryVersionCommand(
    @TargetAggregateIdentifier var equipmentBoundaryVersionId: UUID? = null,
    var baseUML: StringProxy,
    var baseURI: StringProxy,
    var date: DateProxy,
    var differenceModelURI: StringProxy,
    var entsoeUML: StringProxy,
    var entsoeURIcore: StringProxy,
    var entsoeURIoperation: StringProxy,
    var modelDescriptionURI: StringProxy,
    var namespaceRDF: StringProxy,
    var namespaceUML: StringProxy,
    var shortName: StringProxy
)

data class DeleteEquipmentBoundaryVersionCommand(@TargetAggregateIdentifier  var equipmentBoundaryVersionId: UUID? = null)

// single association commands
data class AssignBaseUMLToEquipmentBoundaryVersionCommand(@TargetAggregateIdentifier  val equipmentBoundaryVersionId: UUID, val assignment: StringProxy )
data class UnAssignBaseUMLFromEquipmentBoundaryVersionCommand(@TargetAggregateIdentifier  val equipmentBoundaryVersionId: UUID )
data class AssignBaseURIToEquipmentBoundaryVersionCommand(@TargetAggregateIdentifier  val equipmentBoundaryVersionId: UUID, val assignment: StringProxy )
data class UnAssignBaseURIFromEquipmentBoundaryVersionCommand(@TargetAggregateIdentifier  val equipmentBoundaryVersionId: UUID )
data class AssignDateToEquipmentBoundaryVersionCommand(@TargetAggregateIdentifier  val equipmentBoundaryVersionId: UUID, val assignment: DateProxy )
data class UnAssignDateFromEquipmentBoundaryVersionCommand(@TargetAggregateIdentifier  val equipmentBoundaryVersionId: UUID )
data class AssignDifferenceModelURIToEquipmentBoundaryVersionCommand(@TargetAggregateIdentifier  val equipmentBoundaryVersionId: UUID, val assignment: StringProxy )
data class UnAssignDifferenceModelURIFromEquipmentBoundaryVersionCommand(@TargetAggregateIdentifier  val equipmentBoundaryVersionId: UUID )
data class AssignEntsoeUMLToEquipmentBoundaryVersionCommand(@TargetAggregateIdentifier  val equipmentBoundaryVersionId: UUID, val assignment: StringProxy )
data class UnAssignEntsoeUMLFromEquipmentBoundaryVersionCommand(@TargetAggregateIdentifier  val equipmentBoundaryVersionId: UUID )
data class AssignEntsoeURIcoreToEquipmentBoundaryVersionCommand(@TargetAggregateIdentifier  val equipmentBoundaryVersionId: UUID, val assignment: StringProxy )
data class UnAssignEntsoeURIcoreFromEquipmentBoundaryVersionCommand(@TargetAggregateIdentifier  val equipmentBoundaryVersionId: UUID )
data class AssignEntsoeURIoperationToEquipmentBoundaryVersionCommand(@TargetAggregateIdentifier  val equipmentBoundaryVersionId: UUID, val assignment: StringProxy )
data class UnAssignEntsoeURIoperationFromEquipmentBoundaryVersionCommand(@TargetAggregateIdentifier  val equipmentBoundaryVersionId: UUID )
data class AssignModelDescriptionURIToEquipmentBoundaryVersionCommand(@TargetAggregateIdentifier  val equipmentBoundaryVersionId: UUID, val assignment: StringProxy )
data class UnAssignModelDescriptionURIFromEquipmentBoundaryVersionCommand(@TargetAggregateIdentifier  val equipmentBoundaryVersionId: UUID )
data class AssignNamespaceRDFToEquipmentBoundaryVersionCommand(@TargetAggregateIdentifier  val equipmentBoundaryVersionId: UUID, val assignment: StringProxy )
data class UnAssignNamespaceRDFFromEquipmentBoundaryVersionCommand(@TargetAggregateIdentifier  val equipmentBoundaryVersionId: UUID )
data class AssignNamespaceUMLToEquipmentBoundaryVersionCommand(@TargetAggregateIdentifier  val equipmentBoundaryVersionId: UUID, val assignment: StringProxy )
data class UnAssignNamespaceUMLFromEquipmentBoundaryVersionCommand(@TargetAggregateIdentifier  val equipmentBoundaryVersionId: UUID )
data class AssignShortNameToEquipmentBoundaryVersionCommand(@TargetAggregateIdentifier  val equipmentBoundaryVersionId: UUID, val assignment: StringProxy )
data class UnAssignShortNameFromEquipmentBoundaryVersionCommand(@TargetAggregateIdentifier  val equipmentBoundaryVersionId: UUID )

// multiple association commands


// EquipmentContainer Commands
data class CreateEquipmentContainerCommand(
    @TargetAggregateIdentifier  var equipmentContainerId: UUID? = null
)

data class UpdateEquipmentContainerCommand(
    @TargetAggregateIdentifier  var equipmentContainerId: UUID? = null
)

data class DeleteEquipmentContainerCommand(@TargetAggregateIdentifier  var equipmentContainerId: UUID? = null)

// single association commands

// multiple association commands


// EquipmentVersion Commands
data class CreateEquipmentVersionCommand(
    @TargetAggregateIdentifier  var equipmentVersionId: UUID? = null
)

data class UpdateEquipmentVersionCommand(
    @TargetAggregateIdentifier var equipmentVersionId: UUID? = null,
    var baseUML: StringProxy,
    var baseURIcore: StringProxy,
    var baseURIoperation: StringProxy,
    var baseURIshortCircuit: StringProxy,
    var date: DateProxy,
    var differenceModelURI: StringProxy,
    var entsoeUML: StringProxy,
    var entsoeURIcore: StringProxy,
    var entsoeURIoperation: StringProxy,
    var entsoeURIshortCircuit: StringProxy,
    var modelDescriptionURI: StringProxy,
    var namespaceRDF: StringProxy,
    var namespaceUML: StringProxy,
    var shortName: StringProxy
)

data class DeleteEquipmentVersionCommand(@TargetAggregateIdentifier  var equipmentVersionId: UUID? = null)

// single association commands
data class AssignBaseUMLToEquipmentVersionCommand(@TargetAggregateIdentifier  val equipmentVersionId: UUID, val assignment: StringProxy )
data class UnAssignBaseUMLFromEquipmentVersionCommand(@TargetAggregateIdentifier  val equipmentVersionId: UUID )
data class AssignBaseURIcoreToEquipmentVersionCommand(@TargetAggregateIdentifier  val equipmentVersionId: UUID, val assignment: StringProxy )
data class UnAssignBaseURIcoreFromEquipmentVersionCommand(@TargetAggregateIdentifier  val equipmentVersionId: UUID )
data class AssignBaseURIoperationToEquipmentVersionCommand(@TargetAggregateIdentifier  val equipmentVersionId: UUID, val assignment: StringProxy )
data class UnAssignBaseURIoperationFromEquipmentVersionCommand(@TargetAggregateIdentifier  val equipmentVersionId: UUID )
data class AssignBaseURIshortCircuitToEquipmentVersionCommand(@TargetAggregateIdentifier  val equipmentVersionId: UUID, val assignment: StringProxy )
data class UnAssignBaseURIshortCircuitFromEquipmentVersionCommand(@TargetAggregateIdentifier  val equipmentVersionId: UUID )
data class AssignDateToEquipmentVersionCommand(@TargetAggregateIdentifier  val equipmentVersionId: UUID, val assignment: DateProxy )
data class UnAssignDateFromEquipmentVersionCommand(@TargetAggregateIdentifier  val equipmentVersionId: UUID )
data class AssignDifferenceModelURIToEquipmentVersionCommand(@TargetAggregateIdentifier  val equipmentVersionId: UUID, val assignment: StringProxy )
data class UnAssignDifferenceModelURIFromEquipmentVersionCommand(@TargetAggregateIdentifier  val equipmentVersionId: UUID )
data class AssignEntsoeUMLToEquipmentVersionCommand(@TargetAggregateIdentifier  val equipmentVersionId: UUID, val assignment: StringProxy )
data class UnAssignEntsoeUMLFromEquipmentVersionCommand(@TargetAggregateIdentifier  val equipmentVersionId: UUID )
data class AssignEntsoeURIcoreToEquipmentVersionCommand(@TargetAggregateIdentifier  val equipmentVersionId: UUID, val assignment: StringProxy )
data class UnAssignEntsoeURIcoreFromEquipmentVersionCommand(@TargetAggregateIdentifier  val equipmentVersionId: UUID )
data class AssignEntsoeURIoperationToEquipmentVersionCommand(@TargetAggregateIdentifier  val equipmentVersionId: UUID, val assignment: StringProxy )
data class UnAssignEntsoeURIoperationFromEquipmentVersionCommand(@TargetAggregateIdentifier  val equipmentVersionId: UUID )
data class AssignEntsoeURIshortCircuitToEquipmentVersionCommand(@TargetAggregateIdentifier  val equipmentVersionId: UUID, val assignment: StringProxy )
data class UnAssignEntsoeURIshortCircuitFromEquipmentVersionCommand(@TargetAggregateIdentifier  val equipmentVersionId: UUID )
data class AssignModelDescriptionURIToEquipmentVersionCommand(@TargetAggregateIdentifier  val equipmentVersionId: UUID, val assignment: StringProxy )
data class UnAssignModelDescriptionURIFromEquipmentVersionCommand(@TargetAggregateIdentifier  val equipmentVersionId: UUID )
data class AssignNamespaceRDFToEquipmentVersionCommand(@TargetAggregateIdentifier  val equipmentVersionId: UUID, val assignment: StringProxy )
data class UnAssignNamespaceRDFFromEquipmentVersionCommand(@TargetAggregateIdentifier  val equipmentVersionId: UUID )
data class AssignNamespaceUMLToEquipmentVersionCommand(@TargetAggregateIdentifier  val equipmentVersionId: UUID, val assignment: StringProxy )
data class UnAssignNamespaceUMLFromEquipmentVersionCommand(@TargetAggregateIdentifier  val equipmentVersionId: UUID )
data class AssignShortNameToEquipmentVersionCommand(@TargetAggregateIdentifier  val equipmentVersionId: UUID, val assignment: StringProxy )
data class UnAssignShortNameFromEquipmentVersionCommand(@TargetAggregateIdentifier  val equipmentVersionId: UUID )

// multiple association commands


// EquivalentBranch Commands
data class CreateEquivalentBranchCommand(
    @TargetAggregateIdentifier  var equivalentBranchId: UUID? = null
)

data class UpdateEquivalentBranchCommand(
    @TargetAggregateIdentifier var equivalentBranchId: UUID? = null,
    var negativeR12: Resistance,
    var negativeR21: Resistance,
    var negativeX12: Reactance,
    var negativeX21: Reactance,
    var positiveR12: Resistance,
    var positiveR21: Resistance,
    var positiveX12: Reactance,
    var positiveX21: Reactance,
    var r: Resistance,
    var r21: Resistance,
    var x: Reactance,
    var x21: Reactance,
    var zeroR12: Resistance,
    var zeroR21: Resistance,
    var zeroX12: Reactance,
    var zeroX21: Reactance
)

data class DeleteEquivalentBranchCommand(@TargetAggregateIdentifier  var equivalentBranchId: UUID? = null)

// single association commands
data class AssignNegativeR12ToEquivalentBranchCommand(@TargetAggregateIdentifier  val equivalentBranchId: UUID, val assignment: Resistance )
data class UnAssignNegativeR12FromEquivalentBranchCommand(@TargetAggregateIdentifier  val equivalentBranchId: UUID )
data class AssignNegativeR21ToEquivalentBranchCommand(@TargetAggregateIdentifier  val equivalentBranchId: UUID, val assignment: Resistance )
data class UnAssignNegativeR21FromEquivalentBranchCommand(@TargetAggregateIdentifier  val equivalentBranchId: UUID )
data class AssignNegativeX12ToEquivalentBranchCommand(@TargetAggregateIdentifier  val equivalentBranchId: UUID, val assignment: Reactance )
data class UnAssignNegativeX12FromEquivalentBranchCommand(@TargetAggregateIdentifier  val equivalentBranchId: UUID )
data class AssignNegativeX21ToEquivalentBranchCommand(@TargetAggregateIdentifier  val equivalentBranchId: UUID, val assignment: Reactance )
data class UnAssignNegativeX21FromEquivalentBranchCommand(@TargetAggregateIdentifier  val equivalentBranchId: UUID )
data class AssignPositiveR12ToEquivalentBranchCommand(@TargetAggregateIdentifier  val equivalentBranchId: UUID, val assignment: Resistance )
data class UnAssignPositiveR12FromEquivalentBranchCommand(@TargetAggregateIdentifier  val equivalentBranchId: UUID )
data class AssignPositiveR21ToEquivalentBranchCommand(@TargetAggregateIdentifier  val equivalentBranchId: UUID, val assignment: Resistance )
data class UnAssignPositiveR21FromEquivalentBranchCommand(@TargetAggregateIdentifier  val equivalentBranchId: UUID )
data class AssignPositiveX12ToEquivalentBranchCommand(@TargetAggregateIdentifier  val equivalentBranchId: UUID, val assignment: Reactance )
data class UnAssignPositiveX12FromEquivalentBranchCommand(@TargetAggregateIdentifier  val equivalentBranchId: UUID )
data class AssignPositiveX21ToEquivalentBranchCommand(@TargetAggregateIdentifier  val equivalentBranchId: UUID, val assignment: Reactance )
data class UnAssignPositiveX21FromEquivalentBranchCommand(@TargetAggregateIdentifier  val equivalentBranchId: UUID )
data class AssignRToEquivalentBranchCommand(@TargetAggregateIdentifier  val equivalentBranchId: UUID, val assignment: Resistance )
data class UnAssignRFromEquivalentBranchCommand(@TargetAggregateIdentifier  val equivalentBranchId: UUID )
data class AssignR21ToEquivalentBranchCommand(@TargetAggregateIdentifier  val equivalentBranchId: UUID, val assignment: Resistance )
data class UnAssignR21FromEquivalentBranchCommand(@TargetAggregateIdentifier  val equivalentBranchId: UUID )
data class AssignXToEquivalentBranchCommand(@TargetAggregateIdentifier  val equivalentBranchId: UUID, val assignment: Reactance )
data class UnAssignXFromEquivalentBranchCommand(@TargetAggregateIdentifier  val equivalentBranchId: UUID )
data class AssignX21ToEquivalentBranchCommand(@TargetAggregateIdentifier  val equivalentBranchId: UUID, val assignment: Reactance )
data class UnAssignX21FromEquivalentBranchCommand(@TargetAggregateIdentifier  val equivalentBranchId: UUID )
data class AssignZeroR12ToEquivalentBranchCommand(@TargetAggregateIdentifier  val equivalentBranchId: UUID, val assignment: Resistance )
data class UnAssignZeroR12FromEquivalentBranchCommand(@TargetAggregateIdentifier  val equivalentBranchId: UUID )
data class AssignZeroR21ToEquivalentBranchCommand(@TargetAggregateIdentifier  val equivalentBranchId: UUID, val assignment: Resistance )
data class UnAssignZeroR21FromEquivalentBranchCommand(@TargetAggregateIdentifier  val equivalentBranchId: UUID )
data class AssignZeroX12ToEquivalentBranchCommand(@TargetAggregateIdentifier  val equivalentBranchId: UUID, val assignment: Reactance )
data class UnAssignZeroX12FromEquivalentBranchCommand(@TargetAggregateIdentifier  val equivalentBranchId: UUID )
data class AssignZeroX21ToEquivalentBranchCommand(@TargetAggregateIdentifier  val equivalentBranchId: UUID, val assignment: Reactance )
data class UnAssignZeroX21FromEquivalentBranchCommand(@TargetAggregateIdentifier  val equivalentBranchId: UUID )

// multiple association commands


// EquivalentEquipment Commands
data class CreateEquivalentEquipmentCommand(
    @TargetAggregateIdentifier  var equivalentEquipmentId: UUID? = null
)

data class UpdateEquivalentEquipmentCommand(
    @TargetAggregateIdentifier  var equivalentEquipmentId: UUID? = null
)

data class DeleteEquivalentEquipmentCommand(@TargetAggregateIdentifier  var equivalentEquipmentId: UUID? = null)

// single association commands

// multiple association commands


// EquivalentInjection Commands
data class CreateEquivalentInjectionCommand(
    @TargetAggregateIdentifier  var equivalentInjectionId: UUID? = null
)

data class UpdateEquivalentInjectionCommand(
    @TargetAggregateIdentifier var equivalentInjectionId: UUID? = null,
    var maxP: ActivePower,
    var maxQ: ReactivePower,
    var minP: ActivePower,
    var minQ: ReactivePower,
    var r: Resistance,
    var r0: Resistance,
    var r2: Resistance,
    var regulationCapability: BooleanProxy,
    var x: Reactance,
    var x0: Reactance,
    var x2: Reactance
)

data class DeleteEquivalentInjectionCommand(@TargetAggregateIdentifier  var equivalentInjectionId: UUID? = null)

// single association commands
data class AssignMaxPToEquivalentInjectionCommand(@TargetAggregateIdentifier  val equivalentInjectionId: UUID, val assignment: ActivePower )
data class UnAssignMaxPFromEquivalentInjectionCommand(@TargetAggregateIdentifier  val equivalentInjectionId: UUID )
data class AssignMaxQToEquivalentInjectionCommand(@TargetAggregateIdentifier  val equivalentInjectionId: UUID, val assignment: ReactivePower )
data class UnAssignMaxQFromEquivalentInjectionCommand(@TargetAggregateIdentifier  val equivalentInjectionId: UUID )
data class AssignMinPToEquivalentInjectionCommand(@TargetAggregateIdentifier  val equivalentInjectionId: UUID, val assignment: ActivePower )
data class UnAssignMinPFromEquivalentInjectionCommand(@TargetAggregateIdentifier  val equivalentInjectionId: UUID )
data class AssignMinQToEquivalentInjectionCommand(@TargetAggregateIdentifier  val equivalentInjectionId: UUID, val assignment: ReactivePower )
data class UnAssignMinQFromEquivalentInjectionCommand(@TargetAggregateIdentifier  val equivalentInjectionId: UUID )
data class AssignRToEquivalentInjectionCommand(@TargetAggregateIdentifier  val equivalentInjectionId: UUID, val assignment: Resistance )
data class UnAssignRFromEquivalentInjectionCommand(@TargetAggregateIdentifier  val equivalentInjectionId: UUID )
data class AssignR0ToEquivalentInjectionCommand(@TargetAggregateIdentifier  val equivalentInjectionId: UUID, val assignment: Resistance )
data class UnAssignR0FromEquivalentInjectionCommand(@TargetAggregateIdentifier  val equivalentInjectionId: UUID )
data class AssignR2ToEquivalentInjectionCommand(@TargetAggregateIdentifier  val equivalentInjectionId: UUID, val assignment: Resistance )
data class UnAssignR2FromEquivalentInjectionCommand(@TargetAggregateIdentifier  val equivalentInjectionId: UUID )
data class AssignRegulationCapabilityToEquivalentInjectionCommand(@TargetAggregateIdentifier  val equivalentInjectionId: UUID, val assignment: BooleanProxy )
data class UnAssignRegulationCapabilityFromEquivalentInjectionCommand(@TargetAggregateIdentifier  val equivalentInjectionId: UUID )
data class AssignXToEquivalentInjectionCommand(@TargetAggregateIdentifier  val equivalentInjectionId: UUID, val assignment: Reactance )
data class UnAssignXFromEquivalentInjectionCommand(@TargetAggregateIdentifier  val equivalentInjectionId: UUID )
data class AssignX0ToEquivalentInjectionCommand(@TargetAggregateIdentifier  val equivalentInjectionId: UUID, val assignment: Reactance )
data class UnAssignX0FromEquivalentInjectionCommand(@TargetAggregateIdentifier  val equivalentInjectionId: UUID )
data class AssignX2ToEquivalentInjectionCommand(@TargetAggregateIdentifier  val equivalentInjectionId: UUID, val assignment: Reactance )
data class UnAssignX2FromEquivalentInjectionCommand(@TargetAggregateIdentifier  val equivalentInjectionId: UUID )

// multiple association commands


// EquivalentNetwork Commands
data class CreateEquivalentNetworkCommand(
    @TargetAggregateIdentifier  var equivalentNetworkId: UUID? = null
)

data class UpdateEquivalentNetworkCommand(
    @TargetAggregateIdentifier  var equivalentNetworkId: UUID? = null
)

data class DeleteEquivalentNetworkCommand(@TargetAggregateIdentifier  var equivalentNetworkId: UUID? = null)

// single association commands

// multiple association commands


// EquivalentShunt Commands
data class CreateEquivalentShuntCommand(
    @TargetAggregateIdentifier  var equivalentShuntId: UUID? = null
)

data class UpdateEquivalentShuntCommand(
    @TargetAggregateIdentifier var equivalentShuntId: UUID? = null,
    var b: Susceptance,
    var g: Conductance
)

data class DeleteEquivalentShuntCommand(@TargetAggregateIdentifier  var equivalentShuntId: UUID? = null)

// single association commands
data class AssignBToEquivalentShuntCommand(@TargetAggregateIdentifier  val equivalentShuntId: UUID, val assignment: Susceptance )
data class UnAssignBFromEquivalentShuntCommand(@TargetAggregateIdentifier  val equivalentShuntId: UUID )
data class AssignGToEquivalentShuntCommand(@TargetAggregateIdentifier  val equivalentShuntId: UUID, val assignment: Conductance )
data class UnAssignGFromEquivalentShuntCommand(@TargetAggregateIdentifier  val equivalentShuntId: UUID )

// multiple association commands


// ExcAC1A Commands
data class CreateExcAC1ACommand(
    @TargetAggregateIdentifier  var excAC1AId: UUID? = null
)

data class UpdateExcAC1ACommand(
    @TargetAggregateIdentifier var excAC1AId: UUID? = null,
    var hvlvgates: BooleanProxy,
    var ka: PU,
    var kc: PU,
    var kd: PU,
    var ke: PU,
    var kf: PU,
    var kf1: PU,
    var kf2: PU,
    var ks: PU,
    var seve1: Simple_Float,
    var seve2: Simple_Float,
    var ta: Seconds,
    var tb: Seconds,
    var tc: Seconds,
    var te: Seconds,
    var tf: Seconds,
    var vamax: PU,
    var vamin: PU,
    var ve1: PU,
    var ve2: PU,
    var vrmax: PU,
    var vrmin: PU
)

data class DeleteExcAC1ACommand(@TargetAggregateIdentifier  var excAC1AId: UUID? = null)

// single association commands
data class AssignHvlvgatesToExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID, val assignment: BooleanProxy )
data class UnAssignHvlvgatesFromExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID )
data class AssignKaToExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID, val assignment: PU )
data class UnAssignKaFromExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID )
data class AssignKcToExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID, val assignment: PU )
data class UnAssignKcFromExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID )
data class AssignKdToExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID, val assignment: PU )
data class UnAssignKdFromExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID )
data class AssignKeToExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID, val assignment: PU )
data class UnAssignKeFromExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID )
data class AssignKfToExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID, val assignment: PU )
data class UnAssignKfFromExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID )
data class AssignKf1ToExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID, val assignment: PU )
data class UnAssignKf1FromExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID )
data class AssignKf2ToExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID, val assignment: PU )
data class UnAssignKf2FromExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID )
data class AssignKsToExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID, val assignment: PU )
data class UnAssignKsFromExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID )
data class AssignSeve1ToExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID, val assignment: Simple_Float )
data class UnAssignSeve1FromExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID )
data class AssignSeve2ToExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID, val assignment: Simple_Float )
data class UnAssignSeve2FromExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID )
data class AssignTaToExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID, val assignment: Seconds )
data class UnAssignTaFromExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID )
data class AssignTbToExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID, val assignment: Seconds )
data class UnAssignTbFromExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID )
data class AssignTcToExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID, val assignment: Seconds )
data class UnAssignTcFromExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID )
data class AssignTeToExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID, val assignment: Seconds )
data class UnAssignTeFromExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID )
data class AssignTfToExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID, val assignment: Seconds )
data class UnAssignTfFromExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID )
data class AssignVamaxToExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID, val assignment: PU )
data class UnAssignVamaxFromExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID )
data class AssignVaminToExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID, val assignment: PU )
data class UnAssignVaminFromExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID )
data class AssignVe1ToExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID, val assignment: PU )
data class UnAssignVe1FromExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID )
data class AssignVe2ToExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID, val assignment: PU )
data class UnAssignVe2FromExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID )
data class AssignVrmaxToExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID )
data class AssignVrminToExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID, val assignment: PU )
data class UnAssignVrminFromExcAC1ACommand(@TargetAggregateIdentifier  val excAC1AId: UUID )

// multiple association commands


// ExcAC2A Commands
data class CreateExcAC2ACommand(
    @TargetAggregateIdentifier  var excAC2AId: UUID? = null
)

data class UpdateExcAC2ACommand(
    @TargetAggregateIdentifier var excAC2AId: UUID? = null,
    var hvgate: BooleanProxy,
    var ka: PU,
    var kb: PU,
    var kb1: PU,
    var kc: PU,
    var kd: PU,
    var ke: PU,
    var kf: PU,
    var kh: PU,
    var kl: PU,
    var kl1: PU,
    var ks: PU,
    var lvgate: BooleanProxy,
    var seve1: Simple_Float,
    var seve2: Simple_Float,
    var ta: Seconds,
    var tb: Seconds,
    var tc: Seconds,
    var te: Seconds,
    var tf: Seconds,
    var vamax: PU,
    var vamin: PU,
    var ve1: PU,
    var ve2: PU,
    var vfemax: PU,
    var vlr: PU,
    var vrmax: PU,
    var vrmin: PU
)

data class DeleteExcAC2ACommand(@TargetAggregateIdentifier  var excAC2AId: UUID? = null)

// single association commands
data class AssignHvgateToExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID, val assignment: BooleanProxy )
data class UnAssignHvgateFromExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID )
data class AssignKaToExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID, val assignment: PU )
data class UnAssignKaFromExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID )
data class AssignKbToExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID, val assignment: PU )
data class UnAssignKbFromExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID )
data class AssignKb1ToExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID, val assignment: PU )
data class UnAssignKb1FromExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID )
data class AssignKcToExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID, val assignment: PU )
data class UnAssignKcFromExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID )
data class AssignKdToExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID, val assignment: PU )
data class UnAssignKdFromExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID )
data class AssignKeToExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID, val assignment: PU )
data class UnAssignKeFromExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID )
data class AssignKfToExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID, val assignment: PU )
data class UnAssignKfFromExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID )
data class AssignKhToExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID, val assignment: PU )
data class UnAssignKhFromExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID )
data class AssignKlToExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID, val assignment: PU )
data class UnAssignKlFromExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID )
data class AssignKl1ToExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID, val assignment: PU )
data class UnAssignKl1FromExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID )
data class AssignKsToExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID, val assignment: PU )
data class UnAssignKsFromExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID )
data class AssignLvgateToExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID, val assignment: BooleanProxy )
data class UnAssignLvgateFromExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID )
data class AssignSeve1ToExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID, val assignment: Simple_Float )
data class UnAssignSeve1FromExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID )
data class AssignSeve2ToExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID, val assignment: Simple_Float )
data class UnAssignSeve2FromExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID )
data class AssignTaToExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID, val assignment: Seconds )
data class UnAssignTaFromExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID )
data class AssignTbToExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID, val assignment: Seconds )
data class UnAssignTbFromExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID )
data class AssignTcToExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID, val assignment: Seconds )
data class UnAssignTcFromExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID )
data class AssignTeToExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID, val assignment: Seconds )
data class UnAssignTeFromExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID )
data class AssignTfToExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID, val assignment: Seconds )
data class UnAssignTfFromExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID )
data class AssignVamaxToExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID, val assignment: PU )
data class UnAssignVamaxFromExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID )
data class AssignVaminToExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID, val assignment: PU )
data class UnAssignVaminFromExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID )
data class AssignVe1ToExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID, val assignment: PU )
data class UnAssignVe1FromExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID )
data class AssignVe2ToExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID, val assignment: PU )
data class UnAssignVe2FromExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID )
data class AssignVfemaxToExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID, val assignment: PU )
data class UnAssignVfemaxFromExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID )
data class AssignVlrToExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID, val assignment: PU )
data class UnAssignVlrFromExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID )
data class AssignVrmaxToExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID )
data class AssignVrminToExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID, val assignment: PU )
data class UnAssignVrminFromExcAC2ACommand(@TargetAggregateIdentifier  val excAC2AId: UUID )

// multiple association commands


// ExcAC3A Commands
data class CreateExcAC3ACommand(
    @TargetAggregateIdentifier  var excAC3AId: UUID? = null
)

data class UpdateExcAC3ACommand(
    @TargetAggregateIdentifier var excAC3AId: UUID? = null,
    var efdn: PU,
    var ka: Seconds,
    var kc: PU,
    var kd: PU,
    var ke: PU,
    var kf: PU,
    var kf1: PU,
    var kf2: PU,
    var klv: PU,
    var kn: PU,
    var kr: PU,
    var ks: PU,
    var seve1: Simple_Float,
    var seve2: Simple_Float,
    var ta: PU,
    var tb: Seconds,
    var tc: Seconds,
    var te: Seconds,
    var tf: Seconds,
    var vamax: PU,
    var vamin: PU,
    var ve1: PU,
    var ve2: PU,
    var vemin: PU,
    var vfemax: PU,
    var vlv: PU
)

data class DeleteExcAC3ACommand(@TargetAggregateIdentifier  var excAC3AId: UUID? = null)

// single association commands
data class AssignEfdnToExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID, val assignment: PU )
data class UnAssignEfdnFromExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID )
data class AssignKaToExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID, val assignment: Seconds )
data class UnAssignKaFromExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID )
data class AssignKcToExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID, val assignment: PU )
data class UnAssignKcFromExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID )
data class AssignKdToExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID, val assignment: PU )
data class UnAssignKdFromExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID )
data class AssignKeToExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID, val assignment: PU )
data class UnAssignKeFromExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID )
data class AssignKfToExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID, val assignment: PU )
data class UnAssignKfFromExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID )
data class AssignKf1ToExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID, val assignment: PU )
data class UnAssignKf1FromExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID )
data class AssignKf2ToExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID, val assignment: PU )
data class UnAssignKf2FromExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID )
data class AssignKlvToExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID, val assignment: PU )
data class UnAssignKlvFromExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID )
data class AssignKnToExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID, val assignment: PU )
data class UnAssignKnFromExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID )
data class AssignKrToExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID, val assignment: PU )
data class UnAssignKrFromExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID )
data class AssignKsToExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID, val assignment: PU )
data class UnAssignKsFromExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID )
data class AssignSeve1ToExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID, val assignment: Simple_Float )
data class UnAssignSeve1FromExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID )
data class AssignSeve2ToExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID, val assignment: Simple_Float )
data class UnAssignSeve2FromExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID )
data class AssignTaToExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID, val assignment: PU )
data class UnAssignTaFromExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID )
data class AssignTbToExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID, val assignment: Seconds )
data class UnAssignTbFromExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID )
data class AssignTcToExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID, val assignment: Seconds )
data class UnAssignTcFromExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID )
data class AssignTeToExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID, val assignment: Seconds )
data class UnAssignTeFromExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID )
data class AssignTfToExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID, val assignment: Seconds )
data class UnAssignTfFromExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID )
data class AssignVamaxToExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID, val assignment: PU )
data class UnAssignVamaxFromExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID )
data class AssignVaminToExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID, val assignment: PU )
data class UnAssignVaminFromExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID )
data class AssignVe1ToExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID, val assignment: PU )
data class UnAssignVe1FromExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID )
data class AssignVe2ToExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID, val assignment: PU )
data class UnAssignVe2FromExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID )
data class AssignVeminToExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID, val assignment: PU )
data class UnAssignVeminFromExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID )
data class AssignVfemaxToExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID, val assignment: PU )
data class UnAssignVfemaxFromExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID )
data class AssignVlvToExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID, val assignment: PU )
data class UnAssignVlvFromExcAC3ACommand(@TargetAggregateIdentifier  val excAC3AId: UUID )

// multiple association commands


// ExcAC4A Commands
data class CreateExcAC4ACommand(
    @TargetAggregateIdentifier  var excAC4AId: UUID? = null
)

data class UpdateExcAC4ACommand(
    @TargetAggregateIdentifier var excAC4AId: UUID? = null,
    var ka: PU,
    var kc: PU,
    var ta: Seconds,
    var tb: Seconds,
    var tc: Seconds,
    var vimax: PU,
    var vimin: PU,
    var vrmax: PU,
    var vrmin: PU
)

data class DeleteExcAC4ACommand(@TargetAggregateIdentifier  var excAC4AId: UUID? = null)

// single association commands
data class AssignKaToExcAC4ACommand(@TargetAggregateIdentifier  val excAC4AId: UUID, val assignment: PU )
data class UnAssignKaFromExcAC4ACommand(@TargetAggregateIdentifier  val excAC4AId: UUID )
data class AssignKcToExcAC4ACommand(@TargetAggregateIdentifier  val excAC4AId: UUID, val assignment: PU )
data class UnAssignKcFromExcAC4ACommand(@TargetAggregateIdentifier  val excAC4AId: UUID )
data class AssignTaToExcAC4ACommand(@TargetAggregateIdentifier  val excAC4AId: UUID, val assignment: Seconds )
data class UnAssignTaFromExcAC4ACommand(@TargetAggregateIdentifier  val excAC4AId: UUID )
data class AssignTbToExcAC4ACommand(@TargetAggregateIdentifier  val excAC4AId: UUID, val assignment: Seconds )
data class UnAssignTbFromExcAC4ACommand(@TargetAggregateIdentifier  val excAC4AId: UUID )
data class AssignTcToExcAC4ACommand(@TargetAggregateIdentifier  val excAC4AId: UUID, val assignment: Seconds )
data class UnAssignTcFromExcAC4ACommand(@TargetAggregateIdentifier  val excAC4AId: UUID )
data class AssignVimaxToExcAC4ACommand(@TargetAggregateIdentifier  val excAC4AId: UUID, val assignment: PU )
data class UnAssignVimaxFromExcAC4ACommand(@TargetAggregateIdentifier  val excAC4AId: UUID )
data class AssignViminToExcAC4ACommand(@TargetAggregateIdentifier  val excAC4AId: UUID, val assignment: PU )
data class UnAssignViminFromExcAC4ACommand(@TargetAggregateIdentifier  val excAC4AId: UUID )
data class AssignVrmaxToExcAC4ACommand(@TargetAggregateIdentifier  val excAC4AId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcAC4ACommand(@TargetAggregateIdentifier  val excAC4AId: UUID )
data class AssignVrminToExcAC4ACommand(@TargetAggregateIdentifier  val excAC4AId: UUID, val assignment: PU )
data class UnAssignVrminFromExcAC4ACommand(@TargetAggregateIdentifier  val excAC4AId: UUID )

// multiple association commands


// ExcAC5A Commands
data class CreateExcAC5ACommand(
    @TargetAggregateIdentifier  var excAC5AId: UUID? = null
)

data class UpdateExcAC5ACommand(
    @TargetAggregateIdentifier var excAC5AId: UUID? = null,
    var a: Simple_Float,
    var efd1: PU,
    var efd2: PU,
    var ka: PU,
    var ke: PU,
    var kf: PU,
    var ks: PU,
    var seefd1: Simple_Float,
    var seefd2: Simple_Float,
    var ta: Seconds,
    var tb: Seconds,
    var tc: Seconds,
    var te: Seconds,
    var tf1: Seconds,
    var tf2: Seconds,
    var tf3: Seconds,
    var vrmax: PU,
    var vrmin: PU
)

data class DeleteExcAC5ACommand(@TargetAggregateIdentifier  var excAC5AId: UUID? = null)

// single association commands
data class AssignAToExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID, val assignment: Simple_Float )
data class UnAssignAFromExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID )
data class AssignEfd1ToExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID, val assignment: PU )
data class UnAssignEfd1FromExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID )
data class AssignEfd2ToExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID, val assignment: PU )
data class UnAssignEfd2FromExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID )
data class AssignKaToExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID, val assignment: PU )
data class UnAssignKaFromExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID )
data class AssignKeToExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID, val assignment: PU )
data class UnAssignKeFromExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID )
data class AssignKfToExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID, val assignment: PU )
data class UnAssignKfFromExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID )
data class AssignKsToExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID, val assignment: PU )
data class UnAssignKsFromExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID )
data class AssignSeefd1ToExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID, val assignment: Simple_Float )
data class UnAssignSeefd1FromExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID )
data class AssignSeefd2ToExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID, val assignment: Simple_Float )
data class UnAssignSeefd2FromExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID )
data class AssignTaToExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID, val assignment: Seconds )
data class UnAssignTaFromExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID )
data class AssignTbToExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID, val assignment: Seconds )
data class UnAssignTbFromExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID )
data class AssignTcToExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID, val assignment: Seconds )
data class UnAssignTcFromExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID )
data class AssignTeToExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID, val assignment: Seconds )
data class UnAssignTeFromExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID )
data class AssignTf1ToExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID, val assignment: Seconds )
data class UnAssignTf1FromExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID )
data class AssignTf2ToExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID, val assignment: Seconds )
data class UnAssignTf2FromExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID )
data class AssignTf3ToExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID, val assignment: Seconds )
data class UnAssignTf3FromExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID )
data class AssignVrmaxToExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID )
data class AssignVrminToExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID, val assignment: PU )
data class UnAssignVrminFromExcAC5ACommand(@TargetAggregateIdentifier  val excAC5AId: UUID )

// multiple association commands


// ExcAC6A Commands
data class CreateExcAC6ACommand(
    @TargetAggregateIdentifier  var excAC6AId: UUID? = null
)

data class UpdateExcAC6ACommand(
    @TargetAggregateIdentifier var excAC6AId: UUID? = null,
    var ka: PU,
    var kc: PU,
    var kd: PU,
    var ke: PU,
    var kh: PU,
    var ks: PU,
    var seve1: Simple_Float,
    var seve2: Simple_Float,
    var ta: Seconds,
    var tb: Seconds,
    var tc: Seconds,
    var te: Seconds,
    var th: Seconds,
    var tj: Seconds,
    var tk: Seconds,
    var vamax: PU,
    var vamin: PU,
    var ve1: PU,
    var ve2: PU,
    var vfelim: PU,
    var vhmax: PU,
    var vrmax: PU,
    var vrmin: PU
)

data class DeleteExcAC6ACommand(@TargetAggregateIdentifier  var excAC6AId: UUID? = null)

// single association commands
data class AssignKaToExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID, val assignment: PU )
data class UnAssignKaFromExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID )
data class AssignKcToExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID, val assignment: PU )
data class UnAssignKcFromExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID )
data class AssignKdToExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID, val assignment: PU )
data class UnAssignKdFromExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID )
data class AssignKeToExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID, val assignment: PU )
data class UnAssignKeFromExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID )
data class AssignKhToExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID, val assignment: PU )
data class UnAssignKhFromExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID )
data class AssignKsToExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID, val assignment: PU )
data class UnAssignKsFromExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID )
data class AssignSeve1ToExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID, val assignment: Simple_Float )
data class UnAssignSeve1FromExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID )
data class AssignSeve2ToExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID, val assignment: Simple_Float )
data class UnAssignSeve2FromExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID )
data class AssignTaToExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID, val assignment: Seconds )
data class UnAssignTaFromExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID )
data class AssignTbToExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID, val assignment: Seconds )
data class UnAssignTbFromExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID )
data class AssignTcToExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID, val assignment: Seconds )
data class UnAssignTcFromExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID )
data class AssignTeToExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID, val assignment: Seconds )
data class UnAssignTeFromExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID )
data class AssignThToExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID, val assignment: Seconds )
data class UnAssignThFromExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID )
data class AssignTjToExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID, val assignment: Seconds )
data class UnAssignTjFromExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID )
data class AssignTkToExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID, val assignment: Seconds )
data class UnAssignTkFromExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID )
data class AssignVamaxToExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID, val assignment: PU )
data class UnAssignVamaxFromExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID )
data class AssignVaminToExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID, val assignment: PU )
data class UnAssignVaminFromExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID )
data class AssignVe1ToExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID, val assignment: PU )
data class UnAssignVe1FromExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID )
data class AssignVe2ToExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID, val assignment: PU )
data class UnAssignVe2FromExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID )
data class AssignVfelimToExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID, val assignment: PU )
data class UnAssignVfelimFromExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID )
data class AssignVhmaxToExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID, val assignment: PU )
data class UnAssignVhmaxFromExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID )
data class AssignVrmaxToExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID )
data class AssignVrminToExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID, val assignment: PU )
data class UnAssignVrminFromExcAC6ACommand(@TargetAggregateIdentifier  val excAC6AId: UUID )

// multiple association commands


// ExcAC8B Commands
data class CreateExcAC8BCommand(
    @TargetAggregateIdentifier  var excAC8BId: UUID? = null
)

data class UpdateExcAC8BCommand(
    @TargetAggregateIdentifier var excAC8BId: UUID? = null,
    var inlim: BooleanProxy,
    var ka: PU,
    var kc: PU,
    var kd: PU,
    var kdr: PU,
    var ke: PU,
    var kir: PU,
    var kpr: PU,
    var ks: PU,
    var pidlim: BooleanProxy,
    var seve1: Simple_Float,
    var seve2: Simple_Float,
    var ta: Seconds,
    var tdr: Seconds,
    var te: Seconds,
    var telim: BooleanProxy,
    var ve1: PU,
    var ve2: PU,
    var vemin: PU,
    var vfemax: PU,
    var vimax: PU,
    var vimin: PU,
    var vpidmax: PU,
    var vpidmin: PU,
    var vrmax: PU,
    var vrmin: PU,
    var vtmult: BooleanProxy
)

data class DeleteExcAC8BCommand(@TargetAggregateIdentifier  var excAC8BId: UUID? = null)

// single association commands
data class AssignInlimToExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID, val assignment: BooleanProxy )
data class UnAssignInlimFromExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID )
data class AssignKaToExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID, val assignment: PU )
data class UnAssignKaFromExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID )
data class AssignKcToExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID, val assignment: PU )
data class UnAssignKcFromExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID )
data class AssignKdToExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID, val assignment: PU )
data class UnAssignKdFromExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID )
data class AssignKdrToExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID, val assignment: PU )
data class UnAssignKdrFromExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID )
data class AssignKeToExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID, val assignment: PU )
data class UnAssignKeFromExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID )
data class AssignKirToExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID, val assignment: PU )
data class UnAssignKirFromExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID )
data class AssignKprToExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID, val assignment: PU )
data class UnAssignKprFromExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID )
data class AssignKsToExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID, val assignment: PU )
data class UnAssignKsFromExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID )
data class AssignPidlimToExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID, val assignment: BooleanProxy )
data class UnAssignPidlimFromExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID )
data class AssignSeve1ToExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID, val assignment: Simple_Float )
data class UnAssignSeve1FromExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID )
data class AssignSeve2ToExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID, val assignment: Simple_Float )
data class UnAssignSeve2FromExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID )
data class AssignTaToExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID, val assignment: Seconds )
data class UnAssignTaFromExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID )
data class AssignTdrToExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID, val assignment: Seconds )
data class UnAssignTdrFromExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID )
data class AssignTeToExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID, val assignment: Seconds )
data class UnAssignTeFromExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID )
data class AssignTelimToExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID, val assignment: BooleanProxy )
data class UnAssignTelimFromExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID )
data class AssignVe1ToExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID, val assignment: PU )
data class UnAssignVe1FromExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID )
data class AssignVe2ToExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID, val assignment: PU )
data class UnAssignVe2FromExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID )
data class AssignVeminToExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID, val assignment: PU )
data class UnAssignVeminFromExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID )
data class AssignVfemaxToExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID, val assignment: PU )
data class UnAssignVfemaxFromExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID )
data class AssignVimaxToExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID, val assignment: PU )
data class UnAssignVimaxFromExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID )
data class AssignViminToExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID, val assignment: PU )
data class UnAssignViminFromExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID )
data class AssignVpidmaxToExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID, val assignment: PU )
data class UnAssignVpidmaxFromExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID )
data class AssignVpidminToExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID, val assignment: PU )
data class UnAssignVpidminFromExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID )
data class AssignVrmaxToExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID )
data class AssignVrminToExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID, val assignment: PU )
data class UnAssignVrminFromExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID )
data class AssignVtmultToExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID, val assignment: BooleanProxy )
data class UnAssignVtmultFromExcAC8BCommand(@TargetAggregateIdentifier  val excAC8BId: UUID )

// multiple association commands


// ExcANS Commands
data class CreateExcANSCommand(
    @TargetAggregateIdentifier  var excANSId: UUID? = null
)

data class UpdateExcANSCommand(
    @TargetAggregateIdentifier var excANSId: UUID? = null,
    var blint: IntegerProxy,
    var ifmn: PU,
    var ifmx: PU,
    var k2: Simple_Float,
    var k3: Simple_Float,
    var kce: Simple_Float,
    var krvecc: IntegerProxy,
    var kvfif: IntegerProxy,
    var t1: Seconds,
    var t2: Seconds,
    var t3: Seconds,
    var tb: Seconds,
    var vrmn: PU,
    var vrmx: PU
)

data class DeleteExcANSCommand(@TargetAggregateIdentifier  var excANSId: UUID? = null)

// single association commands
data class AssignBlintToExcANSCommand(@TargetAggregateIdentifier  val excANSId: UUID, val assignment: IntegerProxy )
data class UnAssignBlintFromExcANSCommand(@TargetAggregateIdentifier  val excANSId: UUID )
data class AssignIfmnToExcANSCommand(@TargetAggregateIdentifier  val excANSId: UUID, val assignment: PU )
data class UnAssignIfmnFromExcANSCommand(@TargetAggregateIdentifier  val excANSId: UUID )
data class AssignIfmxToExcANSCommand(@TargetAggregateIdentifier  val excANSId: UUID, val assignment: PU )
data class UnAssignIfmxFromExcANSCommand(@TargetAggregateIdentifier  val excANSId: UUID )
data class AssignK2ToExcANSCommand(@TargetAggregateIdentifier  val excANSId: UUID, val assignment: Simple_Float )
data class UnAssignK2FromExcANSCommand(@TargetAggregateIdentifier  val excANSId: UUID )
data class AssignK3ToExcANSCommand(@TargetAggregateIdentifier  val excANSId: UUID, val assignment: Simple_Float )
data class UnAssignK3FromExcANSCommand(@TargetAggregateIdentifier  val excANSId: UUID )
data class AssignKceToExcANSCommand(@TargetAggregateIdentifier  val excANSId: UUID, val assignment: Simple_Float )
data class UnAssignKceFromExcANSCommand(@TargetAggregateIdentifier  val excANSId: UUID )
data class AssignKrveccToExcANSCommand(@TargetAggregateIdentifier  val excANSId: UUID, val assignment: IntegerProxy )
data class UnAssignKrveccFromExcANSCommand(@TargetAggregateIdentifier  val excANSId: UUID )
data class AssignKvfifToExcANSCommand(@TargetAggregateIdentifier  val excANSId: UUID, val assignment: IntegerProxy )
data class UnAssignKvfifFromExcANSCommand(@TargetAggregateIdentifier  val excANSId: UUID )
data class AssignT1ToExcANSCommand(@TargetAggregateIdentifier  val excANSId: UUID, val assignment: Seconds )
data class UnAssignT1FromExcANSCommand(@TargetAggregateIdentifier  val excANSId: UUID )
data class AssignT2ToExcANSCommand(@TargetAggregateIdentifier  val excANSId: UUID, val assignment: Seconds )
data class UnAssignT2FromExcANSCommand(@TargetAggregateIdentifier  val excANSId: UUID )
data class AssignT3ToExcANSCommand(@TargetAggregateIdentifier  val excANSId: UUID, val assignment: Seconds )
data class UnAssignT3FromExcANSCommand(@TargetAggregateIdentifier  val excANSId: UUID )
data class AssignTbToExcANSCommand(@TargetAggregateIdentifier  val excANSId: UUID, val assignment: Seconds )
data class UnAssignTbFromExcANSCommand(@TargetAggregateIdentifier  val excANSId: UUID )
data class AssignVrmnToExcANSCommand(@TargetAggregateIdentifier  val excANSId: UUID, val assignment: PU )
data class UnAssignVrmnFromExcANSCommand(@TargetAggregateIdentifier  val excANSId: UUID )
data class AssignVrmxToExcANSCommand(@TargetAggregateIdentifier  val excANSId: UUID, val assignment: PU )
data class UnAssignVrmxFromExcANSCommand(@TargetAggregateIdentifier  val excANSId: UUID )

// multiple association commands


// ExcAVR1 Commands
data class CreateExcAVR1Command(
    @TargetAggregateIdentifier  var excAVR1Id: UUID? = null
)

data class UpdateExcAVR1Command(
    @TargetAggregateIdentifier var excAVR1Id: UUID? = null,
    var e1: PU,
    var e2: PU,
    var ka: Simple_Float,
    var kf: Simple_Float,
    var se1: Simple_Float,
    var se2: Simple_Float,
    var ta: Seconds,
    var tb: Seconds,
    var te: Seconds,
    var tf: Seconds,
    var vrmn: PU,
    var vrmx: PU
)

data class DeleteExcAVR1Command(@TargetAggregateIdentifier  var excAVR1Id: UUID? = null)

// single association commands
data class AssignE1ToExcAVR1Command(@TargetAggregateIdentifier  val excAVR1Id: UUID, val assignment: PU )
data class UnAssignE1FromExcAVR1Command(@TargetAggregateIdentifier  val excAVR1Id: UUID )
data class AssignE2ToExcAVR1Command(@TargetAggregateIdentifier  val excAVR1Id: UUID, val assignment: PU )
data class UnAssignE2FromExcAVR1Command(@TargetAggregateIdentifier  val excAVR1Id: UUID )
data class AssignKaToExcAVR1Command(@TargetAggregateIdentifier  val excAVR1Id: UUID, val assignment: Simple_Float )
data class UnAssignKaFromExcAVR1Command(@TargetAggregateIdentifier  val excAVR1Id: UUID )
data class AssignKfToExcAVR1Command(@TargetAggregateIdentifier  val excAVR1Id: UUID, val assignment: Simple_Float )
data class UnAssignKfFromExcAVR1Command(@TargetAggregateIdentifier  val excAVR1Id: UUID )
data class AssignSe1ToExcAVR1Command(@TargetAggregateIdentifier  val excAVR1Id: UUID, val assignment: Simple_Float )
data class UnAssignSe1FromExcAVR1Command(@TargetAggregateIdentifier  val excAVR1Id: UUID )
data class AssignSe2ToExcAVR1Command(@TargetAggregateIdentifier  val excAVR1Id: UUID, val assignment: Simple_Float )
data class UnAssignSe2FromExcAVR1Command(@TargetAggregateIdentifier  val excAVR1Id: UUID )
data class AssignTaToExcAVR1Command(@TargetAggregateIdentifier  val excAVR1Id: UUID, val assignment: Seconds )
data class UnAssignTaFromExcAVR1Command(@TargetAggregateIdentifier  val excAVR1Id: UUID )
data class AssignTbToExcAVR1Command(@TargetAggregateIdentifier  val excAVR1Id: UUID, val assignment: Seconds )
data class UnAssignTbFromExcAVR1Command(@TargetAggregateIdentifier  val excAVR1Id: UUID )
data class AssignTeToExcAVR1Command(@TargetAggregateIdentifier  val excAVR1Id: UUID, val assignment: Seconds )
data class UnAssignTeFromExcAVR1Command(@TargetAggregateIdentifier  val excAVR1Id: UUID )
data class AssignTfToExcAVR1Command(@TargetAggregateIdentifier  val excAVR1Id: UUID, val assignment: Seconds )
data class UnAssignTfFromExcAVR1Command(@TargetAggregateIdentifier  val excAVR1Id: UUID )
data class AssignVrmnToExcAVR1Command(@TargetAggregateIdentifier  val excAVR1Id: UUID, val assignment: PU )
data class UnAssignVrmnFromExcAVR1Command(@TargetAggregateIdentifier  val excAVR1Id: UUID )
data class AssignVrmxToExcAVR1Command(@TargetAggregateIdentifier  val excAVR1Id: UUID, val assignment: PU )
data class UnAssignVrmxFromExcAVR1Command(@TargetAggregateIdentifier  val excAVR1Id: UUID )

// multiple association commands


// ExcAVR2 Commands
data class CreateExcAVR2Command(
    @TargetAggregateIdentifier  var excAVR2Id: UUID? = null
)

data class UpdateExcAVR2Command(
    @TargetAggregateIdentifier var excAVR2Id: UUID? = null,
    var e1: PU,
    var e2: PU,
    var ka: Simple_Float,
    var kf: Simple_Float,
    var se1: Simple_Float,
    var se2: Simple_Float,
    var ta: Seconds,
    var tb: Seconds,
    var te: Seconds,
    var tf1: Seconds,
    var tf2: Seconds,
    var vrmn: PU,
    var vrmx: PU
)

data class DeleteExcAVR2Command(@TargetAggregateIdentifier  var excAVR2Id: UUID? = null)

// single association commands
data class AssignE1ToExcAVR2Command(@TargetAggregateIdentifier  val excAVR2Id: UUID, val assignment: PU )
data class UnAssignE1FromExcAVR2Command(@TargetAggregateIdentifier  val excAVR2Id: UUID )
data class AssignE2ToExcAVR2Command(@TargetAggregateIdentifier  val excAVR2Id: UUID, val assignment: PU )
data class UnAssignE2FromExcAVR2Command(@TargetAggregateIdentifier  val excAVR2Id: UUID )
data class AssignKaToExcAVR2Command(@TargetAggregateIdentifier  val excAVR2Id: UUID, val assignment: Simple_Float )
data class UnAssignKaFromExcAVR2Command(@TargetAggregateIdentifier  val excAVR2Id: UUID )
data class AssignKfToExcAVR2Command(@TargetAggregateIdentifier  val excAVR2Id: UUID, val assignment: Simple_Float )
data class UnAssignKfFromExcAVR2Command(@TargetAggregateIdentifier  val excAVR2Id: UUID )
data class AssignSe1ToExcAVR2Command(@TargetAggregateIdentifier  val excAVR2Id: UUID, val assignment: Simple_Float )
data class UnAssignSe1FromExcAVR2Command(@TargetAggregateIdentifier  val excAVR2Id: UUID )
data class AssignSe2ToExcAVR2Command(@TargetAggregateIdentifier  val excAVR2Id: UUID, val assignment: Simple_Float )
data class UnAssignSe2FromExcAVR2Command(@TargetAggregateIdentifier  val excAVR2Id: UUID )
data class AssignTaToExcAVR2Command(@TargetAggregateIdentifier  val excAVR2Id: UUID, val assignment: Seconds )
data class UnAssignTaFromExcAVR2Command(@TargetAggregateIdentifier  val excAVR2Id: UUID )
data class AssignTbToExcAVR2Command(@TargetAggregateIdentifier  val excAVR2Id: UUID, val assignment: Seconds )
data class UnAssignTbFromExcAVR2Command(@TargetAggregateIdentifier  val excAVR2Id: UUID )
data class AssignTeToExcAVR2Command(@TargetAggregateIdentifier  val excAVR2Id: UUID, val assignment: Seconds )
data class UnAssignTeFromExcAVR2Command(@TargetAggregateIdentifier  val excAVR2Id: UUID )
data class AssignTf1ToExcAVR2Command(@TargetAggregateIdentifier  val excAVR2Id: UUID, val assignment: Seconds )
data class UnAssignTf1FromExcAVR2Command(@TargetAggregateIdentifier  val excAVR2Id: UUID )
data class AssignTf2ToExcAVR2Command(@TargetAggregateIdentifier  val excAVR2Id: UUID, val assignment: Seconds )
data class UnAssignTf2FromExcAVR2Command(@TargetAggregateIdentifier  val excAVR2Id: UUID )
data class AssignVrmnToExcAVR2Command(@TargetAggregateIdentifier  val excAVR2Id: UUID, val assignment: PU )
data class UnAssignVrmnFromExcAVR2Command(@TargetAggregateIdentifier  val excAVR2Id: UUID )
data class AssignVrmxToExcAVR2Command(@TargetAggregateIdentifier  val excAVR2Id: UUID, val assignment: PU )
data class UnAssignVrmxFromExcAVR2Command(@TargetAggregateIdentifier  val excAVR2Id: UUID )

// multiple association commands


// ExcAVR3 Commands
data class CreateExcAVR3Command(
    @TargetAggregateIdentifier  var excAVR3Id: UUID? = null
)

data class UpdateExcAVR3Command(
    @TargetAggregateIdentifier var excAVR3Id: UUID? = null,
    var e1: PU,
    var e2: PU,
    var ka: Simple_Float,
    var se1: Simple_Float,
    var se2: Simple_Float,
    var t1: Seconds,
    var t2: Seconds,
    var t3: Seconds,
    var t4: Seconds,
    var te: Seconds,
    var vrmn: PU,
    var vrmx: PU
)

data class DeleteExcAVR3Command(@TargetAggregateIdentifier  var excAVR3Id: UUID? = null)

// single association commands
data class AssignE1ToExcAVR3Command(@TargetAggregateIdentifier  val excAVR3Id: UUID, val assignment: PU )
data class UnAssignE1FromExcAVR3Command(@TargetAggregateIdentifier  val excAVR3Id: UUID )
data class AssignE2ToExcAVR3Command(@TargetAggregateIdentifier  val excAVR3Id: UUID, val assignment: PU )
data class UnAssignE2FromExcAVR3Command(@TargetAggregateIdentifier  val excAVR3Id: UUID )
data class AssignKaToExcAVR3Command(@TargetAggregateIdentifier  val excAVR3Id: UUID, val assignment: Simple_Float )
data class UnAssignKaFromExcAVR3Command(@TargetAggregateIdentifier  val excAVR3Id: UUID )
data class AssignSe1ToExcAVR3Command(@TargetAggregateIdentifier  val excAVR3Id: UUID, val assignment: Simple_Float )
data class UnAssignSe1FromExcAVR3Command(@TargetAggregateIdentifier  val excAVR3Id: UUID )
data class AssignSe2ToExcAVR3Command(@TargetAggregateIdentifier  val excAVR3Id: UUID, val assignment: Simple_Float )
data class UnAssignSe2FromExcAVR3Command(@TargetAggregateIdentifier  val excAVR3Id: UUID )
data class AssignT1ToExcAVR3Command(@TargetAggregateIdentifier  val excAVR3Id: UUID, val assignment: Seconds )
data class UnAssignT1FromExcAVR3Command(@TargetAggregateIdentifier  val excAVR3Id: UUID )
data class AssignT2ToExcAVR3Command(@TargetAggregateIdentifier  val excAVR3Id: UUID, val assignment: Seconds )
data class UnAssignT2FromExcAVR3Command(@TargetAggregateIdentifier  val excAVR3Id: UUID )
data class AssignT3ToExcAVR3Command(@TargetAggregateIdentifier  val excAVR3Id: UUID, val assignment: Seconds )
data class UnAssignT3FromExcAVR3Command(@TargetAggregateIdentifier  val excAVR3Id: UUID )
data class AssignT4ToExcAVR3Command(@TargetAggregateIdentifier  val excAVR3Id: UUID, val assignment: Seconds )
data class UnAssignT4FromExcAVR3Command(@TargetAggregateIdentifier  val excAVR3Id: UUID )
data class AssignTeToExcAVR3Command(@TargetAggregateIdentifier  val excAVR3Id: UUID, val assignment: Seconds )
data class UnAssignTeFromExcAVR3Command(@TargetAggregateIdentifier  val excAVR3Id: UUID )
data class AssignVrmnToExcAVR3Command(@TargetAggregateIdentifier  val excAVR3Id: UUID, val assignment: PU )
data class UnAssignVrmnFromExcAVR3Command(@TargetAggregateIdentifier  val excAVR3Id: UUID )
data class AssignVrmxToExcAVR3Command(@TargetAggregateIdentifier  val excAVR3Id: UUID, val assignment: PU )
data class UnAssignVrmxFromExcAVR3Command(@TargetAggregateIdentifier  val excAVR3Id: UUID )

// multiple association commands


// ExcAVR4 Commands
data class CreateExcAVR4Command(
    @TargetAggregateIdentifier  var excAVR4Id: UUID? = null
)

data class UpdateExcAVR4Command(
    @TargetAggregateIdentifier var excAVR4Id: UUID? = null,
    var imul: BooleanProxy,
    var ka: Simple_Float,
    var ke: Simple_Float,
    var kif: Simple_Float,
    var t1: Seconds,
    var t1if: Seconds,
    var t2: Seconds,
    var t3: Seconds,
    var t4: Seconds,
    var tif: Seconds,
    var vfmn: PU,
    var vfmx: PU,
    var vrmn: PU,
    var vrmx: PU
)

data class DeleteExcAVR4Command(@TargetAggregateIdentifier  var excAVR4Id: UUID? = null)

// single association commands
data class AssignImulToExcAVR4Command(@TargetAggregateIdentifier  val excAVR4Id: UUID, val assignment: BooleanProxy )
data class UnAssignImulFromExcAVR4Command(@TargetAggregateIdentifier  val excAVR4Id: UUID )
data class AssignKaToExcAVR4Command(@TargetAggregateIdentifier  val excAVR4Id: UUID, val assignment: Simple_Float )
data class UnAssignKaFromExcAVR4Command(@TargetAggregateIdentifier  val excAVR4Id: UUID )
data class AssignKeToExcAVR4Command(@TargetAggregateIdentifier  val excAVR4Id: UUID, val assignment: Simple_Float )
data class UnAssignKeFromExcAVR4Command(@TargetAggregateIdentifier  val excAVR4Id: UUID )
data class AssignKifToExcAVR4Command(@TargetAggregateIdentifier  val excAVR4Id: UUID, val assignment: Simple_Float )
data class UnAssignKifFromExcAVR4Command(@TargetAggregateIdentifier  val excAVR4Id: UUID )
data class AssignT1ToExcAVR4Command(@TargetAggregateIdentifier  val excAVR4Id: UUID, val assignment: Seconds )
data class UnAssignT1FromExcAVR4Command(@TargetAggregateIdentifier  val excAVR4Id: UUID )
data class AssignT1ifToExcAVR4Command(@TargetAggregateIdentifier  val excAVR4Id: UUID, val assignment: Seconds )
data class UnAssignT1ifFromExcAVR4Command(@TargetAggregateIdentifier  val excAVR4Id: UUID )
data class AssignT2ToExcAVR4Command(@TargetAggregateIdentifier  val excAVR4Id: UUID, val assignment: Seconds )
data class UnAssignT2FromExcAVR4Command(@TargetAggregateIdentifier  val excAVR4Id: UUID )
data class AssignT3ToExcAVR4Command(@TargetAggregateIdentifier  val excAVR4Id: UUID, val assignment: Seconds )
data class UnAssignT3FromExcAVR4Command(@TargetAggregateIdentifier  val excAVR4Id: UUID )
data class AssignT4ToExcAVR4Command(@TargetAggregateIdentifier  val excAVR4Id: UUID, val assignment: Seconds )
data class UnAssignT4FromExcAVR4Command(@TargetAggregateIdentifier  val excAVR4Id: UUID )
data class AssignTifToExcAVR4Command(@TargetAggregateIdentifier  val excAVR4Id: UUID, val assignment: Seconds )
data class UnAssignTifFromExcAVR4Command(@TargetAggregateIdentifier  val excAVR4Id: UUID )
data class AssignVfmnToExcAVR4Command(@TargetAggregateIdentifier  val excAVR4Id: UUID, val assignment: PU )
data class UnAssignVfmnFromExcAVR4Command(@TargetAggregateIdentifier  val excAVR4Id: UUID )
data class AssignVfmxToExcAVR4Command(@TargetAggregateIdentifier  val excAVR4Id: UUID, val assignment: PU )
data class UnAssignVfmxFromExcAVR4Command(@TargetAggregateIdentifier  val excAVR4Id: UUID )
data class AssignVrmnToExcAVR4Command(@TargetAggregateIdentifier  val excAVR4Id: UUID, val assignment: PU )
data class UnAssignVrmnFromExcAVR4Command(@TargetAggregateIdentifier  val excAVR4Id: UUID )
data class AssignVrmxToExcAVR4Command(@TargetAggregateIdentifier  val excAVR4Id: UUID, val assignment: PU )
data class UnAssignVrmxFromExcAVR4Command(@TargetAggregateIdentifier  val excAVR4Id: UUID )

// multiple association commands


// ExcAVR5 Commands
data class CreateExcAVR5Command(
    @TargetAggregateIdentifier  var excAVR5Id: UUID? = null
)

data class UpdateExcAVR5Command(
    @TargetAggregateIdentifier var excAVR5Id: UUID? = null,
    var ka: PU,
    var rex: PU,
    var ta: Seconds
)

data class DeleteExcAVR5Command(@TargetAggregateIdentifier  var excAVR5Id: UUID? = null)

// single association commands
data class AssignKaToExcAVR5Command(@TargetAggregateIdentifier  val excAVR5Id: UUID, val assignment: PU )
data class UnAssignKaFromExcAVR5Command(@TargetAggregateIdentifier  val excAVR5Id: UUID )
data class AssignRexToExcAVR5Command(@TargetAggregateIdentifier  val excAVR5Id: UUID, val assignment: PU )
data class UnAssignRexFromExcAVR5Command(@TargetAggregateIdentifier  val excAVR5Id: UUID )
data class AssignTaToExcAVR5Command(@TargetAggregateIdentifier  val excAVR5Id: UUID, val assignment: Seconds )
data class UnAssignTaFromExcAVR5Command(@TargetAggregateIdentifier  val excAVR5Id: UUID )

// multiple association commands


// ExcAVR7 Commands
data class CreateExcAVR7Command(
    @TargetAggregateIdentifier  var excAVR7Id: UUID? = null
)

data class UpdateExcAVR7Command(
    @TargetAggregateIdentifier var excAVR7Id: UUID? = null,
    var a1: PU,
    var a2: PU,
    var a3: PU,
    var a4: PU,
    var a5: PU,
    var a6: PU,
    var k1: PU,
    var k3: PU,
    var k5: PU,
    var t1: Seconds,
    var t2: Seconds,
    var t3: Seconds,
    var t4: Seconds,
    var t5: Seconds,
    var t6: Seconds,
    var vmax1: PU,
    var vmax3: PU,
    var vmax5: PU,
    var vmin1: PU,
    var vmin3: PU,
    var vmin5: PU
)

data class DeleteExcAVR7Command(@TargetAggregateIdentifier  var excAVR7Id: UUID? = null)

// single association commands
data class AssignA1ToExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID, val assignment: PU )
data class UnAssignA1FromExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID )
data class AssignA2ToExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID, val assignment: PU )
data class UnAssignA2FromExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID )
data class AssignA3ToExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID, val assignment: PU )
data class UnAssignA3FromExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID )
data class AssignA4ToExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID, val assignment: PU )
data class UnAssignA4FromExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID )
data class AssignA5ToExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID, val assignment: PU )
data class UnAssignA5FromExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID )
data class AssignA6ToExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID, val assignment: PU )
data class UnAssignA6FromExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID )
data class AssignK1ToExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID, val assignment: PU )
data class UnAssignK1FromExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID )
data class AssignK3ToExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID, val assignment: PU )
data class UnAssignK3FromExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID )
data class AssignK5ToExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID, val assignment: PU )
data class UnAssignK5FromExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID )
data class AssignT1ToExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID, val assignment: Seconds )
data class UnAssignT1FromExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID )
data class AssignT2ToExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID, val assignment: Seconds )
data class UnAssignT2FromExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID )
data class AssignT3ToExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID, val assignment: Seconds )
data class UnAssignT3FromExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID )
data class AssignT4ToExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID, val assignment: Seconds )
data class UnAssignT4FromExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID )
data class AssignT5ToExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID, val assignment: Seconds )
data class UnAssignT5FromExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID )
data class AssignT6ToExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID, val assignment: Seconds )
data class UnAssignT6FromExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID )
data class AssignVmax1ToExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID, val assignment: PU )
data class UnAssignVmax1FromExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID )
data class AssignVmax3ToExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID, val assignment: PU )
data class UnAssignVmax3FromExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID )
data class AssignVmax5ToExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID, val assignment: PU )
data class UnAssignVmax5FromExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID )
data class AssignVmin1ToExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID, val assignment: PU )
data class UnAssignVmin1FromExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID )
data class AssignVmin3ToExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID, val assignment: PU )
data class UnAssignVmin3FromExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID )
data class AssignVmin5ToExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID, val assignment: PU )
data class UnAssignVmin5FromExcAVR7Command(@TargetAggregateIdentifier  val excAVR7Id: UUID )

// multiple association commands


// ExcBBC Commands
data class CreateExcBBCCommand(
    @TargetAggregateIdentifier  var excBBCId: UUID? = null
)

data class UpdateExcBBCCommand(
    @TargetAggregateIdentifier var excBBCId: UUID? = null,
    var efdmax: PU,
    var efdmin: PU,
    var k: PU,
    var switchIt: BooleanProxy,
    var t1: Seconds,
    var t2: Seconds,
    var t3: Seconds,
    var t4: Seconds,
    var vrmax: PU,
    var vrmin: PU,
    var xe: PU
)

data class DeleteExcBBCCommand(@TargetAggregateIdentifier  var excBBCId: UUID? = null)

// single association commands
data class AssignEfdmaxToExcBBCCommand(@TargetAggregateIdentifier  val excBBCId: UUID, val assignment: PU )
data class UnAssignEfdmaxFromExcBBCCommand(@TargetAggregateIdentifier  val excBBCId: UUID )
data class AssignEfdminToExcBBCCommand(@TargetAggregateIdentifier  val excBBCId: UUID, val assignment: PU )
data class UnAssignEfdminFromExcBBCCommand(@TargetAggregateIdentifier  val excBBCId: UUID )
data class AssignKToExcBBCCommand(@TargetAggregateIdentifier  val excBBCId: UUID, val assignment: PU )
data class UnAssignKFromExcBBCCommand(@TargetAggregateIdentifier  val excBBCId: UUID )
data class AssignSwitchItToExcBBCCommand(@TargetAggregateIdentifier  val excBBCId: UUID, val assignment: BooleanProxy )
data class UnAssignSwitchItFromExcBBCCommand(@TargetAggregateIdentifier  val excBBCId: UUID )
data class AssignT1ToExcBBCCommand(@TargetAggregateIdentifier  val excBBCId: UUID, val assignment: Seconds )
data class UnAssignT1FromExcBBCCommand(@TargetAggregateIdentifier  val excBBCId: UUID )
data class AssignT2ToExcBBCCommand(@TargetAggregateIdentifier  val excBBCId: UUID, val assignment: Seconds )
data class UnAssignT2FromExcBBCCommand(@TargetAggregateIdentifier  val excBBCId: UUID )
data class AssignT3ToExcBBCCommand(@TargetAggregateIdentifier  val excBBCId: UUID, val assignment: Seconds )
data class UnAssignT3FromExcBBCCommand(@TargetAggregateIdentifier  val excBBCId: UUID )
data class AssignT4ToExcBBCCommand(@TargetAggregateIdentifier  val excBBCId: UUID, val assignment: Seconds )
data class UnAssignT4FromExcBBCCommand(@TargetAggregateIdentifier  val excBBCId: UUID )
data class AssignVrmaxToExcBBCCommand(@TargetAggregateIdentifier  val excBBCId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcBBCCommand(@TargetAggregateIdentifier  val excBBCId: UUID )
data class AssignVrminToExcBBCCommand(@TargetAggregateIdentifier  val excBBCId: UUID, val assignment: PU )
data class UnAssignVrminFromExcBBCCommand(@TargetAggregateIdentifier  val excBBCId: UUID )
data class AssignXeToExcBBCCommand(@TargetAggregateIdentifier  val excBBCId: UUID, val assignment: PU )
data class UnAssignXeFromExcBBCCommand(@TargetAggregateIdentifier  val excBBCId: UUID )

// multiple association commands


// ExcCZ Commands
data class CreateExcCZCommand(
    @TargetAggregateIdentifier  var excCZId: UUID? = null
)

data class UpdateExcCZCommand(
    @TargetAggregateIdentifier var excCZId: UUID? = null,
    var efdmax: PU,
    var efdmin: PU,
    var ka: PU,
    var ke: PU,
    var kp: PU,
    var ta: Seconds,
    var tc: Seconds,
    var te: Seconds,
    var vrmax: PU,
    var vrmin: PU
)

data class DeleteExcCZCommand(@TargetAggregateIdentifier  var excCZId: UUID? = null)

// single association commands
data class AssignEfdmaxToExcCZCommand(@TargetAggregateIdentifier  val excCZId: UUID, val assignment: PU )
data class UnAssignEfdmaxFromExcCZCommand(@TargetAggregateIdentifier  val excCZId: UUID )
data class AssignEfdminToExcCZCommand(@TargetAggregateIdentifier  val excCZId: UUID, val assignment: PU )
data class UnAssignEfdminFromExcCZCommand(@TargetAggregateIdentifier  val excCZId: UUID )
data class AssignKaToExcCZCommand(@TargetAggregateIdentifier  val excCZId: UUID, val assignment: PU )
data class UnAssignKaFromExcCZCommand(@TargetAggregateIdentifier  val excCZId: UUID )
data class AssignKeToExcCZCommand(@TargetAggregateIdentifier  val excCZId: UUID, val assignment: PU )
data class UnAssignKeFromExcCZCommand(@TargetAggregateIdentifier  val excCZId: UUID )
data class AssignKpToExcCZCommand(@TargetAggregateIdentifier  val excCZId: UUID, val assignment: PU )
data class UnAssignKpFromExcCZCommand(@TargetAggregateIdentifier  val excCZId: UUID )
data class AssignTaToExcCZCommand(@TargetAggregateIdentifier  val excCZId: UUID, val assignment: Seconds )
data class UnAssignTaFromExcCZCommand(@TargetAggregateIdentifier  val excCZId: UUID )
data class AssignTcToExcCZCommand(@TargetAggregateIdentifier  val excCZId: UUID, val assignment: Seconds )
data class UnAssignTcFromExcCZCommand(@TargetAggregateIdentifier  val excCZId: UUID )
data class AssignTeToExcCZCommand(@TargetAggregateIdentifier  val excCZId: UUID, val assignment: Seconds )
data class UnAssignTeFromExcCZCommand(@TargetAggregateIdentifier  val excCZId: UUID )
data class AssignVrmaxToExcCZCommand(@TargetAggregateIdentifier  val excCZId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcCZCommand(@TargetAggregateIdentifier  val excCZId: UUID )
data class AssignVrminToExcCZCommand(@TargetAggregateIdentifier  val excCZId: UUID, val assignment: PU )
data class UnAssignVrminFromExcCZCommand(@TargetAggregateIdentifier  val excCZId: UUID )

// multiple association commands


// ExcDC1A Commands
data class CreateExcDC1ACommand(
    @TargetAggregateIdentifier  var excDC1AId: UUID? = null
)

data class UpdateExcDC1ACommand(
    @TargetAggregateIdentifier var excDC1AId: UUID? = null,
    var edfmax: PU,
    var efd1: PU,
    var efd2: PU,
    var efdmin: PU,
    var exclim: BooleanProxy,
    var ka: PU,
    var ke: PU,
    var kf: PU,
    var ks: PU,
    var seefd1: Simple_Float,
    var seefd2: Simple_Float,
    var ta: Seconds,
    var tb: Seconds,
    var tc: Seconds,
    var te: Seconds,
    var tf: Seconds,
    var vrmax: PU,
    var vrmin: PU
)

data class DeleteExcDC1ACommand(@TargetAggregateIdentifier  var excDC1AId: UUID? = null)

// single association commands
data class AssignEdfmaxToExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID, val assignment: PU )
data class UnAssignEdfmaxFromExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID )
data class AssignEfd1ToExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID, val assignment: PU )
data class UnAssignEfd1FromExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID )
data class AssignEfd2ToExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID, val assignment: PU )
data class UnAssignEfd2FromExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID )
data class AssignEfdminToExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID, val assignment: PU )
data class UnAssignEfdminFromExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID )
data class AssignExclimToExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID, val assignment: BooleanProxy )
data class UnAssignExclimFromExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID )
data class AssignKaToExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID, val assignment: PU )
data class UnAssignKaFromExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID )
data class AssignKeToExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID, val assignment: PU )
data class UnAssignKeFromExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID )
data class AssignKfToExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID, val assignment: PU )
data class UnAssignKfFromExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID )
data class AssignKsToExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID, val assignment: PU )
data class UnAssignKsFromExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID )
data class AssignSeefd1ToExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID, val assignment: Simple_Float )
data class UnAssignSeefd1FromExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID )
data class AssignSeefd2ToExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID, val assignment: Simple_Float )
data class UnAssignSeefd2FromExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID )
data class AssignTaToExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID, val assignment: Seconds )
data class UnAssignTaFromExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID )
data class AssignTbToExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID, val assignment: Seconds )
data class UnAssignTbFromExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID )
data class AssignTcToExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID, val assignment: Seconds )
data class UnAssignTcFromExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID )
data class AssignTeToExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID, val assignment: Seconds )
data class UnAssignTeFromExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID )
data class AssignTfToExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID, val assignment: Seconds )
data class UnAssignTfFromExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID )
data class AssignVrmaxToExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID )
data class AssignVrminToExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID, val assignment: PU )
data class UnAssignVrminFromExcDC1ACommand(@TargetAggregateIdentifier  val excDC1AId: UUID )

// multiple association commands


// ExcDC2A Commands
data class CreateExcDC2ACommand(
    @TargetAggregateIdentifier  var excDC2AId: UUID? = null
)

data class UpdateExcDC2ACommand(
    @TargetAggregateIdentifier var excDC2AId: UUID? = null,
    var efd1: PU,
    var efd2: PU,
    var exclim: BooleanProxy,
    var ka: PU,
    var ke: PU,
    var kf: PU,
    var ks: PU,
    var seefd1: Simple_Float,
    var seefd2: Simple_Float,
    var ta: Seconds,
    var tb: Seconds,
    var tc: Seconds,
    var te: Seconds,
    var tf: Seconds,
    var tf1: Seconds,
    var vrmax: PU,
    var vrmin: PU,
    var vtlim: BooleanProxy
)

data class DeleteExcDC2ACommand(@TargetAggregateIdentifier  var excDC2AId: UUID? = null)

// single association commands
data class AssignEfd1ToExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID, val assignment: PU )
data class UnAssignEfd1FromExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID )
data class AssignEfd2ToExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID, val assignment: PU )
data class UnAssignEfd2FromExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID )
data class AssignExclimToExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID, val assignment: BooleanProxy )
data class UnAssignExclimFromExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID )
data class AssignKaToExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID, val assignment: PU )
data class UnAssignKaFromExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID )
data class AssignKeToExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID, val assignment: PU )
data class UnAssignKeFromExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID )
data class AssignKfToExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID, val assignment: PU )
data class UnAssignKfFromExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID )
data class AssignKsToExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID, val assignment: PU )
data class UnAssignKsFromExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID )
data class AssignSeefd1ToExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID, val assignment: Simple_Float )
data class UnAssignSeefd1FromExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID )
data class AssignSeefd2ToExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID, val assignment: Simple_Float )
data class UnAssignSeefd2FromExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID )
data class AssignTaToExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID, val assignment: Seconds )
data class UnAssignTaFromExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID )
data class AssignTbToExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID, val assignment: Seconds )
data class UnAssignTbFromExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID )
data class AssignTcToExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID, val assignment: Seconds )
data class UnAssignTcFromExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID )
data class AssignTeToExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID, val assignment: Seconds )
data class UnAssignTeFromExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID )
data class AssignTfToExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID, val assignment: Seconds )
data class UnAssignTfFromExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID )
data class AssignTf1ToExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID, val assignment: Seconds )
data class UnAssignTf1FromExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID )
data class AssignVrmaxToExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID )
data class AssignVrminToExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID, val assignment: PU )
data class UnAssignVrminFromExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID )
data class AssignVtlimToExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID, val assignment: BooleanProxy )
data class UnAssignVtlimFromExcDC2ACommand(@TargetAggregateIdentifier  val excDC2AId: UUID )

// multiple association commands


// ExcDC3A Commands
data class CreateExcDC3ACommand(
    @TargetAggregateIdentifier  var excDC3AId: UUID? = null
)

data class UpdateExcDC3ACommand(
    @TargetAggregateIdentifier var excDC3AId: UUID? = null,
    var edfmax: PU,
    var efd1: PU,
    var efd2: PU,
    var efdlim: BooleanProxy,
    var efdmin: PU,
    var exclim: BooleanProxy,
    var ke: PU,
    var kr: PU,
    var ks: PU,
    var kv: PU,
    var seefd1: Simple_Float,
    var seefd2: Simple_Float,
    var te: Seconds,
    var trh: Seconds,
    var vrmax: PU,
    var vrmin: PU
)

data class DeleteExcDC3ACommand(@TargetAggregateIdentifier  var excDC3AId: UUID? = null)

// single association commands
data class AssignEdfmaxToExcDC3ACommand(@TargetAggregateIdentifier  val excDC3AId: UUID, val assignment: PU )
data class UnAssignEdfmaxFromExcDC3ACommand(@TargetAggregateIdentifier  val excDC3AId: UUID )
data class AssignEfd1ToExcDC3ACommand(@TargetAggregateIdentifier  val excDC3AId: UUID, val assignment: PU )
data class UnAssignEfd1FromExcDC3ACommand(@TargetAggregateIdentifier  val excDC3AId: UUID )
data class AssignEfd2ToExcDC3ACommand(@TargetAggregateIdentifier  val excDC3AId: UUID, val assignment: PU )
data class UnAssignEfd2FromExcDC3ACommand(@TargetAggregateIdentifier  val excDC3AId: UUID )
data class AssignEfdlimToExcDC3ACommand(@TargetAggregateIdentifier  val excDC3AId: UUID, val assignment: BooleanProxy )
data class UnAssignEfdlimFromExcDC3ACommand(@TargetAggregateIdentifier  val excDC3AId: UUID )
data class AssignEfdminToExcDC3ACommand(@TargetAggregateIdentifier  val excDC3AId: UUID, val assignment: PU )
data class UnAssignEfdminFromExcDC3ACommand(@TargetAggregateIdentifier  val excDC3AId: UUID )
data class AssignExclimToExcDC3ACommand(@TargetAggregateIdentifier  val excDC3AId: UUID, val assignment: BooleanProxy )
data class UnAssignExclimFromExcDC3ACommand(@TargetAggregateIdentifier  val excDC3AId: UUID )
data class AssignKeToExcDC3ACommand(@TargetAggregateIdentifier  val excDC3AId: UUID, val assignment: PU )
data class UnAssignKeFromExcDC3ACommand(@TargetAggregateIdentifier  val excDC3AId: UUID )
data class AssignKrToExcDC3ACommand(@TargetAggregateIdentifier  val excDC3AId: UUID, val assignment: PU )
data class UnAssignKrFromExcDC3ACommand(@TargetAggregateIdentifier  val excDC3AId: UUID )
data class AssignKsToExcDC3ACommand(@TargetAggregateIdentifier  val excDC3AId: UUID, val assignment: PU )
data class UnAssignKsFromExcDC3ACommand(@TargetAggregateIdentifier  val excDC3AId: UUID )
data class AssignKvToExcDC3ACommand(@TargetAggregateIdentifier  val excDC3AId: UUID, val assignment: PU )
data class UnAssignKvFromExcDC3ACommand(@TargetAggregateIdentifier  val excDC3AId: UUID )
data class AssignSeefd1ToExcDC3ACommand(@TargetAggregateIdentifier  val excDC3AId: UUID, val assignment: Simple_Float )
data class UnAssignSeefd1FromExcDC3ACommand(@TargetAggregateIdentifier  val excDC3AId: UUID )
data class AssignSeefd2ToExcDC3ACommand(@TargetAggregateIdentifier  val excDC3AId: UUID, val assignment: Simple_Float )
data class UnAssignSeefd2FromExcDC3ACommand(@TargetAggregateIdentifier  val excDC3AId: UUID )
data class AssignTeToExcDC3ACommand(@TargetAggregateIdentifier  val excDC3AId: UUID, val assignment: Seconds )
data class UnAssignTeFromExcDC3ACommand(@TargetAggregateIdentifier  val excDC3AId: UUID )
data class AssignTrhToExcDC3ACommand(@TargetAggregateIdentifier  val excDC3AId: UUID, val assignment: Seconds )
data class UnAssignTrhFromExcDC3ACommand(@TargetAggregateIdentifier  val excDC3AId: UUID )
data class AssignVrmaxToExcDC3ACommand(@TargetAggregateIdentifier  val excDC3AId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcDC3ACommand(@TargetAggregateIdentifier  val excDC3AId: UUID )
data class AssignVrminToExcDC3ACommand(@TargetAggregateIdentifier  val excDC3AId: UUID, val assignment: PU )
data class UnAssignVrminFromExcDC3ACommand(@TargetAggregateIdentifier  val excDC3AId: UUID )

// multiple association commands


// ExcDC3A1 Commands
data class CreateExcDC3A1Command(
    @TargetAggregateIdentifier  var excDC3A1Id: UUID? = null
)

data class UpdateExcDC3A1Command(
    @TargetAggregateIdentifier var excDC3A1Id: UUID? = null,
    var exclim: BooleanProxy,
    var ka: PU,
    var ke: PU,
    var kf: PU,
    var ki: PU,
    var kp: PU,
    var ta: Seconds,
    var te: Seconds,
    var tf: Seconds,
    var vb1max: PU,
    var vblim: BooleanProxy,
    var vbmax: PU,
    var vrmax: PU,
    var vrmin: PU
)

data class DeleteExcDC3A1Command(@TargetAggregateIdentifier  var excDC3A1Id: UUID? = null)

// single association commands
data class AssignExclimToExcDC3A1Command(@TargetAggregateIdentifier  val excDC3A1Id: UUID, val assignment: BooleanProxy )
data class UnAssignExclimFromExcDC3A1Command(@TargetAggregateIdentifier  val excDC3A1Id: UUID )
data class AssignKaToExcDC3A1Command(@TargetAggregateIdentifier  val excDC3A1Id: UUID, val assignment: PU )
data class UnAssignKaFromExcDC3A1Command(@TargetAggregateIdentifier  val excDC3A1Id: UUID )
data class AssignKeToExcDC3A1Command(@TargetAggregateIdentifier  val excDC3A1Id: UUID, val assignment: PU )
data class UnAssignKeFromExcDC3A1Command(@TargetAggregateIdentifier  val excDC3A1Id: UUID )
data class AssignKfToExcDC3A1Command(@TargetAggregateIdentifier  val excDC3A1Id: UUID, val assignment: PU )
data class UnAssignKfFromExcDC3A1Command(@TargetAggregateIdentifier  val excDC3A1Id: UUID )
data class AssignKiToExcDC3A1Command(@TargetAggregateIdentifier  val excDC3A1Id: UUID, val assignment: PU )
data class UnAssignKiFromExcDC3A1Command(@TargetAggregateIdentifier  val excDC3A1Id: UUID )
data class AssignKpToExcDC3A1Command(@TargetAggregateIdentifier  val excDC3A1Id: UUID, val assignment: PU )
data class UnAssignKpFromExcDC3A1Command(@TargetAggregateIdentifier  val excDC3A1Id: UUID )
data class AssignTaToExcDC3A1Command(@TargetAggregateIdentifier  val excDC3A1Id: UUID, val assignment: Seconds )
data class UnAssignTaFromExcDC3A1Command(@TargetAggregateIdentifier  val excDC3A1Id: UUID )
data class AssignTeToExcDC3A1Command(@TargetAggregateIdentifier  val excDC3A1Id: UUID, val assignment: Seconds )
data class UnAssignTeFromExcDC3A1Command(@TargetAggregateIdentifier  val excDC3A1Id: UUID )
data class AssignTfToExcDC3A1Command(@TargetAggregateIdentifier  val excDC3A1Id: UUID, val assignment: Seconds )
data class UnAssignTfFromExcDC3A1Command(@TargetAggregateIdentifier  val excDC3A1Id: UUID )
data class AssignVb1maxToExcDC3A1Command(@TargetAggregateIdentifier  val excDC3A1Id: UUID, val assignment: PU )
data class UnAssignVb1maxFromExcDC3A1Command(@TargetAggregateIdentifier  val excDC3A1Id: UUID )
data class AssignVblimToExcDC3A1Command(@TargetAggregateIdentifier  val excDC3A1Id: UUID, val assignment: BooleanProxy )
data class UnAssignVblimFromExcDC3A1Command(@TargetAggregateIdentifier  val excDC3A1Id: UUID )
data class AssignVbmaxToExcDC3A1Command(@TargetAggregateIdentifier  val excDC3A1Id: UUID, val assignment: PU )
data class UnAssignVbmaxFromExcDC3A1Command(@TargetAggregateIdentifier  val excDC3A1Id: UUID )
data class AssignVrmaxToExcDC3A1Command(@TargetAggregateIdentifier  val excDC3A1Id: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcDC3A1Command(@TargetAggregateIdentifier  val excDC3A1Id: UUID )
data class AssignVrminToExcDC3A1Command(@TargetAggregateIdentifier  val excDC3A1Id: UUID, val assignment: PU )
data class UnAssignVrminFromExcDC3A1Command(@TargetAggregateIdentifier  val excDC3A1Id: UUID )

// multiple association commands


// ExcELIN1 Commands
data class CreateExcELIN1Command(
    @TargetAggregateIdentifier  var excELIN1Id: UUID? = null
)

data class UpdateExcELIN1Command(
    @TargetAggregateIdentifier var excELIN1Id: UUID? = null,
    var dpnf: PU,
    var efmax: PU,
    var efmin: PU,
    var ks1: PU,
    var ks2: PU,
    var smax: PU,
    var tfi: Seconds,
    var tnu: Seconds,
    var ts1: Seconds,
    var ts2: Seconds,
    var tsw: Seconds,
    var vpi: PU,
    var vpnf: PU,
    var vpu: PU,
    var xe: PU
)

data class DeleteExcELIN1Command(@TargetAggregateIdentifier  var excELIN1Id: UUID? = null)

// single association commands
data class AssignDpnfToExcELIN1Command(@TargetAggregateIdentifier  val excELIN1Id: UUID, val assignment: PU )
data class UnAssignDpnfFromExcELIN1Command(@TargetAggregateIdentifier  val excELIN1Id: UUID )
data class AssignEfmaxToExcELIN1Command(@TargetAggregateIdentifier  val excELIN1Id: UUID, val assignment: PU )
data class UnAssignEfmaxFromExcELIN1Command(@TargetAggregateIdentifier  val excELIN1Id: UUID )
data class AssignEfminToExcELIN1Command(@TargetAggregateIdentifier  val excELIN1Id: UUID, val assignment: PU )
data class UnAssignEfminFromExcELIN1Command(@TargetAggregateIdentifier  val excELIN1Id: UUID )
data class AssignKs1ToExcELIN1Command(@TargetAggregateIdentifier  val excELIN1Id: UUID, val assignment: PU )
data class UnAssignKs1FromExcELIN1Command(@TargetAggregateIdentifier  val excELIN1Id: UUID )
data class AssignKs2ToExcELIN1Command(@TargetAggregateIdentifier  val excELIN1Id: UUID, val assignment: PU )
data class UnAssignKs2FromExcELIN1Command(@TargetAggregateIdentifier  val excELIN1Id: UUID )
data class AssignSmaxToExcELIN1Command(@TargetAggregateIdentifier  val excELIN1Id: UUID, val assignment: PU )
data class UnAssignSmaxFromExcELIN1Command(@TargetAggregateIdentifier  val excELIN1Id: UUID )
data class AssignTfiToExcELIN1Command(@TargetAggregateIdentifier  val excELIN1Id: UUID, val assignment: Seconds )
data class UnAssignTfiFromExcELIN1Command(@TargetAggregateIdentifier  val excELIN1Id: UUID )
data class AssignTnuToExcELIN1Command(@TargetAggregateIdentifier  val excELIN1Id: UUID, val assignment: Seconds )
data class UnAssignTnuFromExcELIN1Command(@TargetAggregateIdentifier  val excELIN1Id: UUID )
data class AssignTs1ToExcELIN1Command(@TargetAggregateIdentifier  val excELIN1Id: UUID, val assignment: Seconds )
data class UnAssignTs1FromExcELIN1Command(@TargetAggregateIdentifier  val excELIN1Id: UUID )
data class AssignTs2ToExcELIN1Command(@TargetAggregateIdentifier  val excELIN1Id: UUID, val assignment: Seconds )
data class UnAssignTs2FromExcELIN1Command(@TargetAggregateIdentifier  val excELIN1Id: UUID )
data class AssignTswToExcELIN1Command(@TargetAggregateIdentifier  val excELIN1Id: UUID, val assignment: Seconds )
data class UnAssignTswFromExcELIN1Command(@TargetAggregateIdentifier  val excELIN1Id: UUID )
data class AssignVpiToExcELIN1Command(@TargetAggregateIdentifier  val excELIN1Id: UUID, val assignment: PU )
data class UnAssignVpiFromExcELIN1Command(@TargetAggregateIdentifier  val excELIN1Id: UUID )
data class AssignVpnfToExcELIN1Command(@TargetAggregateIdentifier  val excELIN1Id: UUID, val assignment: PU )
data class UnAssignVpnfFromExcELIN1Command(@TargetAggregateIdentifier  val excELIN1Id: UUID )
data class AssignVpuToExcELIN1Command(@TargetAggregateIdentifier  val excELIN1Id: UUID, val assignment: PU )
data class UnAssignVpuFromExcELIN1Command(@TargetAggregateIdentifier  val excELIN1Id: UUID )
data class AssignXeToExcELIN1Command(@TargetAggregateIdentifier  val excELIN1Id: UUID, val assignment: PU )
data class UnAssignXeFromExcELIN1Command(@TargetAggregateIdentifier  val excELIN1Id: UUID )

// multiple association commands


// ExcELIN2 Commands
data class CreateExcELIN2Command(
    @TargetAggregateIdentifier  var excELIN2Id: UUID? = null
)

data class UpdateExcELIN2Command(
    @TargetAggregateIdentifier var excELIN2Id: UUID? = null,
    var efdbas: PU,
    var iefmax: PU,
    var iefmax2: PU,
    var iefmin: PU,
    var k1: PU,
    var k1ec: PU,
    var k2: PU,
    var k3: PU,
    var k4: PU,
    var kd1: PU,
    var ke2: PU,
    var ketb: PU,
    var pid1max: PU,
    var seve1: PU,
    var seve2: PU,
    var tb1: Seconds,
    var te: Seconds,
    var te2: Seconds,
    var ti1: PU,
    var ti3: Seconds,
    var ti4: Seconds,
    var tr4: Seconds,
    var upmax: PU,
    var upmin: PU,
    var ve1: PU,
    var ve2: PU,
    var xp: PU
)

data class DeleteExcELIN2Command(@TargetAggregateIdentifier  var excELIN2Id: UUID? = null)

// single association commands
data class AssignEfdbasToExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID, val assignment: PU )
data class UnAssignEfdbasFromExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID )
data class AssignIefmaxToExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID, val assignment: PU )
data class UnAssignIefmaxFromExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID )
data class AssignIefmax2ToExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID, val assignment: PU )
data class UnAssignIefmax2FromExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID )
data class AssignIefminToExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID, val assignment: PU )
data class UnAssignIefminFromExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID )
data class AssignK1ToExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID, val assignment: PU )
data class UnAssignK1FromExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID )
data class AssignK1ecToExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID, val assignment: PU )
data class UnAssignK1ecFromExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID )
data class AssignK2ToExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID, val assignment: PU )
data class UnAssignK2FromExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID )
data class AssignK3ToExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID, val assignment: PU )
data class UnAssignK3FromExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID )
data class AssignK4ToExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID, val assignment: PU )
data class UnAssignK4FromExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID )
data class AssignKd1ToExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID, val assignment: PU )
data class UnAssignKd1FromExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID )
data class AssignKe2ToExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID, val assignment: PU )
data class UnAssignKe2FromExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID )
data class AssignKetbToExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID, val assignment: PU )
data class UnAssignKetbFromExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID )
data class AssignPid1maxToExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID, val assignment: PU )
data class UnAssignPid1maxFromExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID )
data class AssignSeve1ToExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID, val assignment: PU )
data class UnAssignSeve1FromExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID )
data class AssignSeve2ToExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID, val assignment: PU )
data class UnAssignSeve2FromExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID )
data class AssignTb1ToExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID, val assignment: Seconds )
data class UnAssignTb1FromExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID )
data class AssignTeToExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID, val assignment: Seconds )
data class UnAssignTeFromExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID )
data class AssignTe2ToExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID, val assignment: Seconds )
data class UnAssignTe2FromExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID )
data class AssignTi1ToExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID, val assignment: PU )
data class UnAssignTi1FromExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID )
data class AssignTi3ToExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID, val assignment: Seconds )
data class UnAssignTi3FromExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID )
data class AssignTi4ToExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID, val assignment: Seconds )
data class UnAssignTi4FromExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID )
data class AssignTr4ToExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID, val assignment: Seconds )
data class UnAssignTr4FromExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID )
data class AssignUpmaxToExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID, val assignment: PU )
data class UnAssignUpmaxFromExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID )
data class AssignUpminToExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID, val assignment: PU )
data class UnAssignUpminFromExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID )
data class AssignVe1ToExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID, val assignment: PU )
data class UnAssignVe1FromExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID )
data class AssignVe2ToExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID, val assignment: PU )
data class UnAssignVe2FromExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID )
data class AssignXpToExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID, val assignment: PU )
data class UnAssignXpFromExcELIN2Command(@TargetAggregateIdentifier  val excELIN2Id: UUID )

// multiple association commands


// ExcHU Commands
data class CreateExcHUCommand(
    @TargetAggregateIdentifier  var excHUId: UUID? = null
)

data class UpdateExcHUCommand(
    @TargetAggregateIdentifier var excHUId: UUID? = null,
    var ae: PU,
    var ai: PU,
    var atr: PU,
    var emax: PU,
    var emin: PU,
    var imax: PU,
    var imin: PU,
    var ke: Simple_Float,
    var ki: Simple_Float,
    var te: Seconds,
    var ti: Seconds,
    var tr: Seconds
)

data class DeleteExcHUCommand(@TargetAggregateIdentifier  var excHUId: UUID? = null)

// single association commands
data class AssignAeToExcHUCommand(@TargetAggregateIdentifier  val excHUId: UUID, val assignment: PU )
data class UnAssignAeFromExcHUCommand(@TargetAggregateIdentifier  val excHUId: UUID )
data class AssignAiToExcHUCommand(@TargetAggregateIdentifier  val excHUId: UUID, val assignment: PU )
data class UnAssignAiFromExcHUCommand(@TargetAggregateIdentifier  val excHUId: UUID )
data class AssignAtrToExcHUCommand(@TargetAggregateIdentifier  val excHUId: UUID, val assignment: PU )
data class UnAssignAtrFromExcHUCommand(@TargetAggregateIdentifier  val excHUId: UUID )
data class AssignEmaxToExcHUCommand(@TargetAggregateIdentifier  val excHUId: UUID, val assignment: PU )
data class UnAssignEmaxFromExcHUCommand(@TargetAggregateIdentifier  val excHUId: UUID )
data class AssignEminToExcHUCommand(@TargetAggregateIdentifier  val excHUId: UUID, val assignment: PU )
data class UnAssignEminFromExcHUCommand(@TargetAggregateIdentifier  val excHUId: UUID )
data class AssignImaxToExcHUCommand(@TargetAggregateIdentifier  val excHUId: UUID, val assignment: PU )
data class UnAssignImaxFromExcHUCommand(@TargetAggregateIdentifier  val excHUId: UUID )
data class AssignIminToExcHUCommand(@TargetAggregateIdentifier  val excHUId: UUID, val assignment: PU )
data class UnAssignIminFromExcHUCommand(@TargetAggregateIdentifier  val excHUId: UUID )
data class AssignKeToExcHUCommand(@TargetAggregateIdentifier  val excHUId: UUID, val assignment: Simple_Float )
data class UnAssignKeFromExcHUCommand(@TargetAggregateIdentifier  val excHUId: UUID )
data class AssignKiToExcHUCommand(@TargetAggregateIdentifier  val excHUId: UUID, val assignment: Simple_Float )
data class UnAssignKiFromExcHUCommand(@TargetAggregateIdentifier  val excHUId: UUID )
data class AssignTeToExcHUCommand(@TargetAggregateIdentifier  val excHUId: UUID, val assignment: Seconds )
data class UnAssignTeFromExcHUCommand(@TargetAggregateIdentifier  val excHUId: UUID )
data class AssignTiToExcHUCommand(@TargetAggregateIdentifier  val excHUId: UUID, val assignment: Seconds )
data class UnAssignTiFromExcHUCommand(@TargetAggregateIdentifier  val excHUId: UUID )
data class AssignTrToExcHUCommand(@TargetAggregateIdentifier  val excHUId: UUID, val assignment: Seconds )
data class UnAssignTrFromExcHUCommand(@TargetAggregateIdentifier  val excHUId: UUID )

// multiple association commands


// ExcIEEEAC1A Commands
data class CreateExcIEEEAC1ACommand(
    @TargetAggregateIdentifier  var excIEEEAC1AId: UUID? = null
)

data class UpdateExcIEEEAC1ACommand(
    @TargetAggregateIdentifier var excIEEEAC1AId: UUID? = null,
    var ka: PU,
    var kc: PU,
    var kd: PU,
    var ke: PU,
    var kf: PU,
    var seve1: Simple_Float,
    var seve2: Simple_Float,
    var ta: Seconds,
    var tb: Seconds,
    var tc: Seconds,
    var te: Seconds,
    var tf: Seconds,
    var vamax: PU,
    var vamin: PU,
    var ve1: PU,
    var ve2: PU,
    var vrmax: PU,
    var vrmin: PU
)

data class DeleteExcIEEEAC1ACommand(@TargetAggregateIdentifier  var excIEEEAC1AId: UUID? = null)

// single association commands
data class AssignKaToExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID, val assignment: PU )
data class UnAssignKaFromExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID )
data class AssignKcToExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID, val assignment: PU )
data class UnAssignKcFromExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID )
data class AssignKdToExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID, val assignment: PU )
data class UnAssignKdFromExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID )
data class AssignKeToExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID, val assignment: PU )
data class UnAssignKeFromExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID )
data class AssignKfToExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID, val assignment: PU )
data class UnAssignKfFromExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID )
data class AssignSeve1ToExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID, val assignment: Simple_Float )
data class UnAssignSeve1FromExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID )
data class AssignSeve2ToExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID, val assignment: Simple_Float )
data class UnAssignSeve2FromExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID )
data class AssignTaToExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID, val assignment: Seconds )
data class UnAssignTaFromExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID )
data class AssignTbToExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID, val assignment: Seconds )
data class UnAssignTbFromExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID )
data class AssignTcToExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID, val assignment: Seconds )
data class UnAssignTcFromExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID )
data class AssignTeToExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID, val assignment: Seconds )
data class UnAssignTeFromExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID )
data class AssignTfToExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID, val assignment: Seconds )
data class UnAssignTfFromExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID )
data class AssignVamaxToExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID, val assignment: PU )
data class UnAssignVamaxFromExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID )
data class AssignVaminToExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID, val assignment: PU )
data class UnAssignVaminFromExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID )
data class AssignVe1ToExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID, val assignment: PU )
data class UnAssignVe1FromExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID )
data class AssignVe2ToExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID, val assignment: PU )
data class UnAssignVe2FromExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID )
data class AssignVrmaxToExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID )
data class AssignVrminToExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID, val assignment: PU )
data class UnAssignVrminFromExcIEEEAC1ACommand(@TargetAggregateIdentifier  val excIEEEAC1AId: UUID )

// multiple association commands


// ExcIEEEAC2A Commands
data class CreateExcIEEEAC2ACommand(
    @TargetAggregateIdentifier  var excIEEEAC2AId: UUID? = null
)

data class UpdateExcIEEEAC2ACommand(
    @TargetAggregateIdentifier var excIEEEAC2AId: UUID? = null,
    var ka: PU,
    var kb: PU,
    var kc: PU,
    var kd: PU,
    var ke: PU,
    var kf: PU,
    var kh: PU,
    var seve1: Simple_Float,
    var seve2: Simple_Float,
    var ta: Seconds,
    var tb: Seconds,
    var tc: Seconds,
    var te: Seconds,
    var tf: Seconds,
    var vamax: PU,
    var vamin: PU,
    var ve1: PU,
    var ve2: PU,
    var vfemax: PU,
    var vrmax: PU,
    var vrmin: PU
)

data class DeleteExcIEEEAC2ACommand(@TargetAggregateIdentifier  var excIEEEAC2AId: UUID? = null)

// single association commands
data class AssignKaToExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID, val assignment: PU )
data class UnAssignKaFromExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID )
data class AssignKbToExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID, val assignment: PU )
data class UnAssignKbFromExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID )
data class AssignKcToExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID, val assignment: PU )
data class UnAssignKcFromExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID )
data class AssignKdToExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID, val assignment: PU )
data class UnAssignKdFromExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID )
data class AssignKeToExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID, val assignment: PU )
data class UnAssignKeFromExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID )
data class AssignKfToExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID, val assignment: PU )
data class UnAssignKfFromExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID )
data class AssignKhToExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID, val assignment: PU )
data class UnAssignKhFromExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID )
data class AssignSeve1ToExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID, val assignment: Simple_Float )
data class UnAssignSeve1FromExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID )
data class AssignSeve2ToExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID, val assignment: Simple_Float )
data class UnAssignSeve2FromExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID )
data class AssignTaToExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID, val assignment: Seconds )
data class UnAssignTaFromExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID )
data class AssignTbToExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID, val assignment: Seconds )
data class UnAssignTbFromExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID )
data class AssignTcToExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID, val assignment: Seconds )
data class UnAssignTcFromExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID )
data class AssignTeToExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID, val assignment: Seconds )
data class UnAssignTeFromExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID )
data class AssignTfToExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID, val assignment: Seconds )
data class UnAssignTfFromExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID )
data class AssignVamaxToExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID, val assignment: PU )
data class UnAssignVamaxFromExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID )
data class AssignVaminToExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID, val assignment: PU )
data class UnAssignVaminFromExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID )
data class AssignVe1ToExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID, val assignment: PU )
data class UnAssignVe1FromExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID )
data class AssignVe2ToExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID, val assignment: PU )
data class UnAssignVe2FromExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID )
data class AssignVfemaxToExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID, val assignment: PU )
data class UnAssignVfemaxFromExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID )
data class AssignVrmaxToExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID )
data class AssignVrminToExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID, val assignment: PU )
data class UnAssignVrminFromExcIEEEAC2ACommand(@TargetAggregateIdentifier  val excIEEEAC2AId: UUID )

// multiple association commands


// ExcIEEEAC3A Commands
data class CreateExcIEEEAC3ACommand(
    @TargetAggregateIdentifier  var excIEEEAC3AId: UUID? = null
)

data class UpdateExcIEEEAC3ACommand(
    @TargetAggregateIdentifier var excIEEEAC3AId: UUID? = null,
    var efdn: PU,
    var ka: PU,
    var kc: PU,
    var kd: PU,
    var ke: PU,
    var kf: PU,
    var kn: PU,
    var kr: PU,
    var seve1: Simple_Float,
    var seve2: Simple_Float,
    var ta: Seconds,
    var tb: Seconds,
    var tc: Seconds,
    var te: Seconds,
    var tf: Seconds,
    var vamax: PU,
    var vamin: PU,
    var ve1: PU,
    var ve2: PU,
    var vemin: PU,
    var vfemax: PU
)

data class DeleteExcIEEEAC3ACommand(@TargetAggregateIdentifier  var excIEEEAC3AId: UUID? = null)

// single association commands
data class AssignEfdnToExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID, val assignment: PU )
data class UnAssignEfdnFromExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID )
data class AssignKaToExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID, val assignment: PU )
data class UnAssignKaFromExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID )
data class AssignKcToExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID, val assignment: PU )
data class UnAssignKcFromExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID )
data class AssignKdToExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID, val assignment: PU )
data class UnAssignKdFromExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID )
data class AssignKeToExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID, val assignment: PU )
data class UnAssignKeFromExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID )
data class AssignKfToExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID, val assignment: PU )
data class UnAssignKfFromExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID )
data class AssignKnToExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID, val assignment: PU )
data class UnAssignKnFromExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID )
data class AssignKrToExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID, val assignment: PU )
data class UnAssignKrFromExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID )
data class AssignSeve1ToExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID, val assignment: Simple_Float )
data class UnAssignSeve1FromExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID )
data class AssignSeve2ToExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID, val assignment: Simple_Float )
data class UnAssignSeve2FromExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID )
data class AssignTaToExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID, val assignment: Seconds )
data class UnAssignTaFromExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID )
data class AssignTbToExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID, val assignment: Seconds )
data class UnAssignTbFromExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID )
data class AssignTcToExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID, val assignment: Seconds )
data class UnAssignTcFromExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID )
data class AssignTeToExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID, val assignment: Seconds )
data class UnAssignTeFromExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID )
data class AssignTfToExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID, val assignment: Seconds )
data class UnAssignTfFromExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID )
data class AssignVamaxToExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID, val assignment: PU )
data class UnAssignVamaxFromExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID )
data class AssignVaminToExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID, val assignment: PU )
data class UnAssignVaminFromExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID )
data class AssignVe1ToExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID, val assignment: PU )
data class UnAssignVe1FromExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID )
data class AssignVe2ToExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID, val assignment: PU )
data class UnAssignVe2FromExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID )
data class AssignVeminToExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID, val assignment: PU )
data class UnAssignVeminFromExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID )
data class AssignVfemaxToExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID, val assignment: PU )
data class UnAssignVfemaxFromExcIEEEAC3ACommand(@TargetAggregateIdentifier  val excIEEEAC3AId: UUID )

// multiple association commands


// ExcIEEEAC4A Commands
data class CreateExcIEEEAC4ACommand(
    @TargetAggregateIdentifier  var excIEEEAC4AId: UUID? = null
)

data class UpdateExcIEEEAC4ACommand(
    @TargetAggregateIdentifier var excIEEEAC4AId: UUID? = null,
    var ka: PU,
    var kc: PU,
    var ta: Seconds,
    var tb: Seconds,
    var tc: Seconds,
    var vimax: PU,
    var vimin: PU,
    var vrmax: PU,
    var vrmin: PU
)

data class DeleteExcIEEEAC4ACommand(@TargetAggregateIdentifier  var excIEEEAC4AId: UUID? = null)

// single association commands
data class AssignKaToExcIEEEAC4ACommand(@TargetAggregateIdentifier  val excIEEEAC4AId: UUID, val assignment: PU )
data class UnAssignKaFromExcIEEEAC4ACommand(@TargetAggregateIdentifier  val excIEEEAC4AId: UUID )
data class AssignKcToExcIEEEAC4ACommand(@TargetAggregateIdentifier  val excIEEEAC4AId: UUID, val assignment: PU )
data class UnAssignKcFromExcIEEEAC4ACommand(@TargetAggregateIdentifier  val excIEEEAC4AId: UUID )
data class AssignTaToExcIEEEAC4ACommand(@TargetAggregateIdentifier  val excIEEEAC4AId: UUID, val assignment: Seconds )
data class UnAssignTaFromExcIEEEAC4ACommand(@TargetAggregateIdentifier  val excIEEEAC4AId: UUID )
data class AssignTbToExcIEEEAC4ACommand(@TargetAggregateIdentifier  val excIEEEAC4AId: UUID, val assignment: Seconds )
data class UnAssignTbFromExcIEEEAC4ACommand(@TargetAggregateIdentifier  val excIEEEAC4AId: UUID )
data class AssignTcToExcIEEEAC4ACommand(@TargetAggregateIdentifier  val excIEEEAC4AId: UUID, val assignment: Seconds )
data class UnAssignTcFromExcIEEEAC4ACommand(@TargetAggregateIdentifier  val excIEEEAC4AId: UUID )
data class AssignVimaxToExcIEEEAC4ACommand(@TargetAggregateIdentifier  val excIEEEAC4AId: UUID, val assignment: PU )
data class UnAssignVimaxFromExcIEEEAC4ACommand(@TargetAggregateIdentifier  val excIEEEAC4AId: UUID )
data class AssignViminToExcIEEEAC4ACommand(@TargetAggregateIdentifier  val excIEEEAC4AId: UUID, val assignment: PU )
data class UnAssignViminFromExcIEEEAC4ACommand(@TargetAggregateIdentifier  val excIEEEAC4AId: UUID )
data class AssignVrmaxToExcIEEEAC4ACommand(@TargetAggregateIdentifier  val excIEEEAC4AId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcIEEEAC4ACommand(@TargetAggregateIdentifier  val excIEEEAC4AId: UUID )
data class AssignVrminToExcIEEEAC4ACommand(@TargetAggregateIdentifier  val excIEEEAC4AId: UUID, val assignment: PU )
data class UnAssignVrminFromExcIEEEAC4ACommand(@TargetAggregateIdentifier  val excIEEEAC4AId: UUID )

// multiple association commands


// ExcIEEEAC5A Commands
data class CreateExcIEEEAC5ACommand(
    @TargetAggregateIdentifier  var excIEEEAC5AId: UUID? = null
)

data class UpdateExcIEEEAC5ACommand(
    @TargetAggregateIdentifier var excIEEEAC5AId: UUID? = null,
    var efd1: PU,
    var efd2: PU,
    var ka: PU,
    var ke: PU,
    var kf: PU,
    var seefd1: Simple_Float,
    var seefd2: Simple_Float,
    var ta: Seconds,
    var te: Seconds,
    var tf1: Seconds,
    var tf2: Seconds,
    var tf3: Seconds,
    var vrmax: PU,
    var vrmin: PU
)

data class DeleteExcIEEEAC5ACommand(@TargetAggregateIdentifier  var excIEEEAC5AId: UUID? = null)

// single association commands
data class AssignEfd1ToExcIEEEAC5ACommand(@TargetAggregateIdentifier  val excIEEEAC5AId: UUID, val assignment: PU )
data class UnAssignEfd1FromExcIEEEAC5ACommand(@TargetAggregateIdentifier  val excIEEEAC5AId: UUID )
data class AssignEfd2ToExcIEEEAC5ACommand(@TargetAggregateIdentifier  val excIEEEAC5AId: UUID, val assignment: PU )
data class UnAssignEfd2FromExcIEEEAC5ACommand(@TargetAggregateIdentifier  val excIEEEAC5AId: UUID )
data class AssignKaToExcIEEEAC5ACommand(@TargetAggregateIdentifier  val excIEEEAC5AId: UUID, val assignment: PU )
data class UnAssignKaFromExcIEEEAC5ACommand(@TargetAggregateIdentifier  val excIEEEAC5AId: UUID )
data class AssignKeToExcIEEEAC5ACommand(@TargetAggregateIdentifier  val excIEEEAC5AId: UUID, val assignment: PU )
data class UnAssignKeFromExcIEEEAC5ACommand(@TargetAggregateIdentifier  val excIEEEAC5AId: UUID )
data class AssignKfToExcIEEEAC5ACommand(@TargetAggregateIdentifier  val excIEEEAC5AId: UUID, val assignment: PU )
data class UnAssignKfFromExcIEEEAC5ACommand(@TargetAggregateIdentifier  val excIEEEAC5AId: UUID )
data class AssignSeefd1ToExcIEEEAC5ACommand(@TargetAggregateIdentifier  val excIEEEAC5AId: UUID, val assignment: Simple_Float )
data class UnAssignSeefd1FromExcIEEEAC5ACommand(@TargetAggregateIdentifier  val excIEEEAC5AId: UUID )
data class AssignSeefd2ToExcIEEEAC5ACommand(@TargetAggregateIdentifier  val excIEEEAC5AId: UUID, val assignment: Simple_Float )
data class UnAssignSeefd2FromExcIEEEAC5ACommand(@TargetAggregateIdentifier  val excIEEEAC5AId: UUID )
data class AssignTaToExcIEEEAC5ACommand(@TargetAggregateIdentifier  val excIEEEAC5AId: UUID, val assignment: Seconds )
data class UnAssignTaFromExcIEEEAC5ACommand(@TargetAggregateIdentifier  val excIEEEAC5AId: UUID )
data class AssignTeToExcIEEEAC5ACommand(@TargetAggregateIdentifier  val excIEEEAC5AId: UUID, val assignment: Seconds )
data class UnAssignTeFromExcIEEEAC5ACommand(@TargetAggregateIdentifier  val excIEEEAC5AId: UUID )
data class AssignTf1ToExcIEEEAC5ACommand(@TargetAggregateIdentifier  val excIEEEAC5AId: UUID, val assignment: Seconds )
data class UnAssignTf1FromExcIEEEAC5ACommand(@TargetAggregateIdentifier  val excIEEEAC5AId: UUID )
data class AssignTf2ToExcIEEEAC5ACommand(@TargetAggregateIdentifier  val excIEEEAC5AId: UUID, val assignment: Seconds )
data class UnAssignTf2FromExcIEEEAC5ACommand(@TargetAggregateIdentifier  val excIEEEAC5AId: UUID )
data class AssignTf3ToExcIEEEAC5ACommand(@TargetAggregateIdentifier  val excIEEEAC5AId: UUID, val assignment: Seconds )
data class UnAssignTf3FromExcIEEEAC5ACommand(@TargetAggregateIdentifier  val excIEEEAC5AId: UUID )
data class AssignVrmaxToExcIEEEAC5ACommand(@TargetAggregateIdentifier  val excIEEEAC5AId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcIEEEAC5ACommand(@TargetAggregateIdentifier  val excIEEEAC5AId: UUID )
data class AssignVrminToExcIEEEAC5ACommand(@TargetAggregateIdentifier  val excIEEEAC5AId: UUID, val assignment: PU )
data class UnAssignVrminFromExcIEEEAC5ACommand(@TargetAggregateIdentifier  val excIEEEAC5AId: UUID )

// multiple association commands


// ExcIEEEAC6A Commands
data class CreateExcIEEEAC6ACommand(
    @TargetAggregateIdentifier  var excIEEEAC6AId: UUID? = null
)

data class UpdateExcIEEEAC6ACommand(
    @TargetAggregateIdentifier var excIEEEAC6AId: UUID? = null,
    var ka: PU,
    var kc: PU,
    var kd: PU,
    var ke: PU,
    var kh: PU,
    var seve1: Simple_Float,
    var seve2: Simple_Float,
    var ta: Seconds,
    var tb: Seconds,
    var tc: Seconds,
    var te: Seconds,
    var th: Seconds,
    var tj: Seconds,
    var tk: Seconds,
    var vamax: PU,
    var vamin: PU,
    var ve1: PU,
    var ve2: PU,
    var vfelim: PU,
    var vhmax: PU,
    var vrmax: PU,
    var vrmin: PU
)

data class DeleteExcIEEEAC6ACommand(@TargetAggregateIdentifier  var excIEEEAC6AId: UUID? = null)

// single association commands
data class AssignKaToExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID, val assignment: PU )
data class UnAssignKaFromExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID )
data class AssignKcToExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID, val assignment: PU )
data class UnAssignKcFromExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID )
data class AssignKdToExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID, val assignment: PU )
data class UnAssignKdFromExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID )
data class AssignKeToExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID, val assignment: PU )
data class UnAssignKeFromExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID )
data class AssignKhToExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID, val assignment: PU )
data class UnAssignKhFromExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID )
data class AssignSeve1ToExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID, val assignment: Simple_Float )
data class UnAssignSeve1FromExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID )
data class AssignSeve2ToExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID, val assignment: Simple_Float )
data class UnAssignSeve2FromExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID )
data class AssignTaToExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID, val assignment: Seconds )
data class UnAssignTaFromExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID )
data class AssignTbToExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID, val assignment: Seconds )
data class UnAssignTbFromExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID )
data class AssignTcToExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID, val assignment: Seconds )
data class UnAssignTcFromExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID )
data class AssignTeToExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID, val assignment: Seconds )
data class UnAssignTeFromExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID )
data class AssignThToExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID, val assignment: Seconds )
data class UnAssignThFromExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID )
data class AssignTjToExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID, val assignment: Seconds )
data class UnAssignTjFromExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID )
data class AssignTkToExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID, val assignment: Seconds )
data class UnAssignTkFromExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID )
data class AssignVamaxToExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID, val assignment: PU )
data class UnAssignVamaxFromExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID )
data class AssignVaminToExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID, val assignment: PU )
data class UnAssignVaminFromExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID )
data class AssignVe1ToExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID, val assignment: PU )
data class UnAssignVe1FromExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID )
data class AssignVe2ToExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID, val assignment: PU )
data class UnAssignVe2FromExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID )
data class AssignVfelimToExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID, val assignment: PU )
data class UnAssignVfelimFromExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID )
data class AssignVhmaxToExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID, val assignment: PU )
data class UnAssignVhmaxFromExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID )
data class AssignVrmaxToExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID )
data class AssignVrminToExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID, val assignment: PU )
data class UnAssignVrminFromExcIEEEAC6ACommand(@TargetAggregateIdentifier  val excIEEEAC6AId: UUID )

// multiple association commands


// ExcIEEEAC7B Commands
data class CreateExcIEEEAC7BCommand(
    @TargetAggregateIdentifier  var excIEEEAC7BId: UUID? = null
)

data class UpdateExcIEEEAC7BCommand(
    @TargetAggregateIdentifier var excIEEEAC7BId: UUID? = null,
    var kc: PU,
    var kd: PU,
    var kdr: PU,
    var ke: PU,
    var kf1: PU,
    var kf2: PU,
    var kf3: PU,
    var kia: PU,
    var kir: PU,
    var kl: PU,
    var kp: PU,
    var kpa: PU,
    var kpr: PU,
    var seve1: Simple_Float,
    var seve2: Simple_Float,
    var tdr: Seconds,
    var te: Seconds,
    var tf: Seconds,
    var vamax: PU,
    var vamin: PU,
    var ve1: PU,
    var ve2: PU,
    var vemin: PU,
    var vfemax: PU,
    var vrmax: PU,
    var vrmin: PU
)

data class DeleteExcIEEEAC7BCommand(@TargetAggregateIdentifier  var excIEEEAC7BId: UUID? = null)

// single association commands
data class AssignKcToExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID, val assignment: PU )
data class UnAssignKcFromExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID )
data class AssignKdToExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID, val assignment: PU )
data class UnAssignKdFromExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID )
data class AssignKdrToExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID, val assignment: PU )
data class UnAssignKdrFromExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID )
data class AssignKeToExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID, val assignment: PU )
data class UnAssignKeFromExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID )
data class AssignKf1ToExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID, val assignment: PU )
data class UnAssignKf1FromExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID )
data class AssignKf2ToExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID, val assignment: PU )
data class UnAssignKf2FromExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID )
data class AssignKf3ToExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID, val assignment: PU )
data class UnAssignKf3FromExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID )
data class AssignKiaToExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID, val assignment: PU )
data class UnAssignKiaFromExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID )
data class AssignKirToExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID, val assignment: PU )
data class UnAssignKirFromExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID )
data class AssignKlToExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID, val assignment: PU )
data class UnAssignKlFromExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID )
data class AssignKpToExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID, val assignment: PU )
data class UnAssignKpFromExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID )
data class AssignKpaToExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID, val assignment: PU )
data class UnAssignKpaFromExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID )
data class AssignKprToExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID, val assignment: PU )
data class UnAssignKprFromExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID )
data class AssignSeve1ToExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID, val assignment: Simple_Float )
data class UnAssignSeve1FromExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID )
data class AssignSeve2ToExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID, val assignment: Simple_Float )
data class UnAssignSeve2FromExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID )
data class AssignTdrToExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID, val assignment: Seconds )
data class UnAssignTdrFromExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID )
data class AssignTeToExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID, val assignment: Seconds )
data class UnAssignTeFromExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID )
data class AssignTfToExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID, val assignment: Seconds )
data class UnAssignTfFromExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID )
data class AssignVamaxToExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID, val assignment: PU )
data class UnAssignVamaxFromExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID )
data class AssignVaminToExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID, val assignment: PU )
data class UnAssignVaminFromExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID )
data class AssignVe1ToExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID, val assignment: PU )
data class UnAssignVe1FromExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID )
data class AssignVe2ToExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID, val assignment: PU )
data class UnAssignVe2FromExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID )
data class AssignVeminToExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID, val assignment: PU )
data class UnAssignVeminFromExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID )
data class AssignVfemaxToExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID, val assignment: PU )
data class UnAssignVfemaxFromExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID )
data class AssignVrmaxToExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID )
data class AssignVrminToExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID, val assignment: PU )
data class UnAssignVrminFromExcIEEEAC7BCommand(@TargetAggregateIdentifier  val excIEEEAC7BId: UUID )

// multiple association commands


// ExcIEEEAC8B Commands
data class CreateExcIEEEAC8BCommand(
    @TargetAggregateIdentifier  var excIEEEAC8BId: UUID? = null
)

data class UpdateExcIEEEAC8BCommand(
    @TargetAggregateIdentifier var excIEEEAC8BId: UUID? = null,
    var ka: PU,
    var kc: PU,
    var kd: PU,
    var kdr: PU,
    var ke: PU,
    var kir: PU,
    var kpr: PU,
    var seve1: Simple_Float,
    var seve2: Simple_Float,
    var ta: Seconds,
    var tdr: Seconds,
    var te: Seconds,
    var ve1: PU,
    var ve2: PU,
    var vemin: PU,
    var vfemax: PU,
    var vrmax: PU,
    var vrmin: PU
)

data class DeleteExcIEEEAC8BCommand(@TargetAggregateIdentifier  var excIEEEAC8BId: UUID? = null)

// single association commands
data class AssignKaToExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID, val assignment: PU )
data class UnAssignKaFromExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID )
data class AssignKcToExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID, val assignment: PU )
data class UnAssignKcFromExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID )
data class AssignKdToExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID, val assignment: PU )
data class UnAssignKdFromExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID )
data class AssignKdrToExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID, val assignment: PU )
data class UnAssignKdrFromExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID )
data class AssignKeToExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID, val assignment: PU )
data class UnAssignKeFromExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID )
data class AssignKirToExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID, val assignment: PU )
data class UnAssignKirFromExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID )
data class AssignKprToExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID, val assignment: PU )
data class UnAssignKprFromExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID )
data class AssignSeve1ToExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID, val assignment: Simple_Float )
data class UnAssignSeve1FromExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID )
data class AssignSeve2ToExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID, val assignment: Simple_Float )
data class UnAssignSeve2FromExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID )
data class AssignTaToExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID, val assignment: Seconds )
data class UnAssignTaFromExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID )
data class AssignTdrToExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID, val assignment: Seconds )
data class UnAssignTdrFromExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID )
data class AssignTeToExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID, val assignment: Seconds )
data class UnAssignTeFromExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID )
data class AssignVe1ToExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID, val assignment: PU )
data class UnAssignVe1FromExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID )
data class AssignVe2ToExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID, val assignment: PU )
data class UnAssignVe2FromExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID )
data class AssignVeminToExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID, val assignment: PU )
data class UnAssignVeminFromExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID )
data class AssignVfemaxToExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID, val assignment: PU )
data class UnAssignVfemaxFromExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID )
data class AssignVrmaxToExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID )
data class AssignVrminToExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID, val assignment: PU )
data class UnAssignVrminFromExcIEEEAC8BCommand(@TargetAggregateIdentifier  val excIEEEAC8BId: UUID )

// multiple association commands


// ExcIEEEDC1A Commands
data class CreateExcIEEEDC1ACommand(
    @TargetAggregateIdentifier  var excIEEEDC1AId: UUID? = null
)

data class UpdateExcIEEEDC1ACommand(
    @TargetAggregateIdentifier var excIEEEDC1AId: UUID? = null,
    var efd1: PU,
    var efd2: PU,
    var exclim: BooleanProxy,
    var ka: PU,
    var ke: PU,
    var kf: PU,
    var seefd1: Simple_Float,
    var seefd2: Simple_Float,
    var ta: Seconds,
    var tb: Seconds,
    var tc: Seconds,
    var te: Seconds,
    var tf: Seconds,
    var uelin: BooleanProxy,
    var vrmax: PU,
    var vrmin: PU
)

data class DeleteExcIEEEDC1ACommand(@TargetAggregateIdentifier  var excIEEEDC1AId: UUID? = null)

// single association commands
data class AssignEfd1ToExcIEEEDC1ACommand(@TargetAggregateIdentifier  val excIEEEDC1AId: UUID, val assignment: PU )
data class UnAssignEfd1FromExcIEEEDC1ACommand(@TargetAggregateIdentifier  val excIEEEDC1AId: UUID )
data class AssignEfd2ToExcIEEEDC1ACommand(@TargetAggregateIdentifier  val excIEEEDC1AId: UUID, val assignment: PU )
data class UnAssignEfd2FromExcIEEEDC1ACommand(@TargetAggregateIdentifier  val excIEEEDC1AId: UUID )
data class AssignExclimToExcIEEEDC1ACommand(@TargetAggregateIdentifier  val excIEEEDC1AId: UUID, val assignment: BooleanProxy )
data class UnAssignExclimFromExcIEEEDC1ACommand(@TargetAggregateIdentifier  val excIEEEDC1AId: UUID )
data class AssignKaToExcIEEEDC1ACommand(@TargetAggregateIdentifier  val excIEEEDC1AId: UUID, val assignment: PU )
data class UnAssignKaFromExcIEEEDC1ACommand(@TargetAggregateIdentifier  val excIEEEDC1AId: UUID )
data class AssignKeToExcIEEEDC1ACommand(@TargetAggregateIdentifier  val excIEEEDC1AId: UUID, val assignment: PU )
data class UnAssignKeFromExcIEEEDC1ACommand(@TargetAggregateIdentifier  val excIEEEDC1AId: UUID )
data class AssignKfToExcIEEEDC1ACommand(@TargetAggregateIdentifier  val excIEEEDC1AId: UUID, val assignment: PU )
data class UnAssignKfFromExcIEEEDC1ACommand(@TargetAggregateIdentifier  val excIEEEDC1AId: UUID )
data class AssignSeefd1ToExcIEEEDC1ACommand(@TargetAggregateIdentifier  val excIEEEDC1AId: UUID, val assignment: Simple_Float )
data class UnAssignSeefd1FromExcIEEEDC1ACommand(@TargetAggregateIdentifier  val excIEEEDC1AId: UUID )
data class AssignSeefd2ToExcIEEEDC1ACommand(@TargetAggregateIdentifier  val excIEEEDC1AId: UUID, val assignment: Simple_Float )
data class UnAssignSeefd2FromExcIEEEDC1ACommand(@TargetAggregateIdentifier  val excIEEEDC1AId: UUID )
data class AssignTaToExcIEEEDC1ACommand(@TargetAggregateIdentifier  val excIEEEDC1AId: UUID, val assignment: Seconds )
data class UnAssignTaFromExcIEEEDC1ACommand(@TargetAggregateIdentifier  val excIEEEDC1AId: UUID )
data class AssignTbToExcIEEEDC1ACommand(@TargetAggregateIdentifier  val excIEEEDC1AId: UUID, val assignment: Seconds )
data class UnAssignTbFromExcIEEEDC1ACommand(@TargetAggregateIdentifier  val excIEEEDC1AId: UUID )
data class AssignTcToExcIEEEDC1ACommand(@TargetAggregateIdentifier  val excIEEEDC1AId: UUID, val assignment: Seconds )
data class UnAssignTcFromExcIEEEDC1ACommand(@TargetAggregateIdentifier  val excIEEEDC1AId: UUID )
data class AssignTeToExcIEEEDC1ACommand(@TargetAggregateIdentifier  val excIEEEDC1AId: UUID, val assignment: Seconds )
data class UnAssignTeFromExcIEEEDC1ACommand(@TargetAggregateIdentifier  val excIEEEDC1AId: UUID )
data class AssignTfToExcIEEEDC1ACommand(@TargetAggregateIdentifier  val excIEEEDC1AId: UUID, val assignment: Seconds )
data class UnAssignTfFromExcIEEEDC1ACommand(@TargetAggregateIdentifier  val excIEEEDC1AId: UUID )
data class AssignUelinToExcIEEEDC1ACommand(@TargetAggregateIdentifier  val excIEEEDC1AId: UUID, val assignment: BooleanProxy )
data class UnAssignUelinFromExcIEEEDC1ACommand(@TargetAggregateIdentifier  val excIEEEDC1AId: UUID )
data class AssignVrmaxToExcIEEEDC1ACommand(@TargetAggregateIdentifier  val excIEEEDC1AId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcIEEEDC1ACommand(@TargetAggregateIdentifier  val excIEEEDC1AId: UUID )
data class AssignVrminToExcIEEEDC1ACommand(@TargetAggregateIdentifier  val excIEEEDC1AId: UUID, val assignment: PU )
data class UnAssignVrminFromExcIEEEDC1ACommand(@TargetAggregateIdentifier  val excIEEEDC1AId: UUID )

// multiple association commands


// ExcIEEEDC2A Commands
data class CreateExcIEEEDC2ACommand(
    @TargetAggregateIdentifier  var excIEEEDC2AId: UUID? = null
)

data class UpdateExcIEEEDC2ACommand(
    @TargetAggregateIdentifier var excIEEEDC2AId: UUID? = null,
    var efd1: PU,
    var efd2: PU,
    var exclim: PU,
    var ka: PU,
    var ke: PU,
    var kf: PU,
    var seefd1: Simple_Float,
    var seefd2: Simple_Float,
    var ta: Seconds,
    var tb: Seconds,
    var tc: Seconds,
    var te: Seconds,
    var tf: Seconds,
    var uelin: BooleanProxy,
    var vrmax: PU,
    var vrmin: PU
)

data class DeleteExcIEEEDC2ACommand(@TargetAggregateIdentifier  var excIEEEDC2AId: UUID? = null)

// single association commands
data class AssignEfd1ToExcIEEEDC2ACommand(@TargetAggregateIdentifier  val excIEEEDC2AId: UUID, val assignment: PU )
data class UnAssignEfd1FromExcIEEEDC2ACommand(@TargetAggregateIdentifier  val excIEEEDC2AId: UUID )
data class AssignEfd2ToExcIEEEDC2ACommand(@TargetAggregateIdentifier  val excIEEEDC2AId: UUID, val assignment: PU )
data class UnAssignEfd2FromExcIEEEDC2ACommand(@TargetAggregateIdentifier  val excIEEEDC2AId: UUID )
data class AssignExclimToExcIEEEDC2ACommand(@TargetAggregateIdentifier  val excIEEEDC2AId: UUID, val assignment: PU )
data class UnAssignExclimFromExcIEEEDC2ACommand(@TargetAggregateIdentifier  val excIEEEDC2AId: UUID )
data class AssignKaToExcIEEEDC2ACommand(@TargetAggregateIdentifier  val excIEEEDC2AId: UUID, val assignment: PU )
data class UnAssignKaFromExcIEEEDC2ACommand(@TargetAggregateIdentifier  val excIEEEDC2AId: UUID )
data class AssignKeToExcIEEEDC2ACommand(@TargetAggregateIdentifier  val excIEEEDC2AId: UUID, val assignment: PU )
data class UnAssignKeFromExcIEEEDC2ACommand(@TargetAggregateIdentifier  val excIEEEDC2AId: UUID )
data class AssignKfToExcIEEEDC2ACommand(@TargetAggregateIdentifier  val excIEEEDC2AId: UUID, val assignment: PU )
data class UnAssignKfFromExcIEEEDC2ACommand(@TargetAggregateIdentifier  val excIEEEDC2AId: UUID )
data class AssignSeefd1ToExcIEEEDC2ACommand(@TargetAggregateIdentifier  val excIEEEDC2AId: UUID, val assignment: Simple_Float )
data class UnAssignSeefd1FromExcIEEEDC2ACommand(@TargetAggregateIdentifier  val excIEEEDC2AId: UUID )
data class AssignSeefd2ToExcIEEEDC2ACommand(@TargetAggregateIdentifier  val excIEEEDC2AId: UUID, val assignment: Simple_Float )
data class UnAssignSeefd2FromExcIEEEDC2ACommand(@TargetAggregateIdentifier  val excIEEEDC2AId: UUID )
data class AssignTaToExcIEEEDC2ACommand(@TargetAggregateIdentifier  val excIEEEDC2AId: UUID, val assignment: Seconds )
data class UnAssignTaFromExcIEEEDC2ACommand(@TargetAggregateIdentifier  val excIEEEDC2AId: UUID )
data class AssignTbToExcIEEEDC2ACommand(@TargetAggregateIdentifier  val excIEEEDC2AId: UUID, val assignment: Seconds )
data class UnAssignTbFromExcIEEEDC2ACommand(@TargetAggregateIdentifier  val excIEEEDC2AId: UUID )
data class AssignTcToExcIEEEDC2ACommand(@TargetAggregateIdentifier  val excIEEEDC2AId: UUID, val assignment: Seconds )
data class UnAssignTcFromExcIEEEDC2ACommand(@TargetAggregateIdentifier  val excIEEEDC2AId: UUID )
data class AssignTeToExcIEEEDC2ACommand(@TargetAggregateIdentifier  val excIEEEDC2AId: UUID, val assignment: Seconds )
data class UnAssignTeFromExcIEEEDC2ACommand(@TargetAggregateIdentifier  val excIEEEDC2AId: UUID )
data class AssignTfToExcIEEEDC2ACommand(@TargetAggregateIdentifier  val excIEEEDC2AId: UUID, val assignment: Seconds )
data class UnAssignTfFromExcIEEEDC2ACommand(@TargetAggregateIdentifier  val excIEEEDC2AId: UUID )
data class AssignUelinToExcIEEEDC2ACommand(@TargetAggregateIdentifier  val excIEEEDC2AId: UUID, val assignment: BooleanProxy )
data class UnAssignUelinFromExcIEEEDC2ACommand(@TargetAggregateIdentifier  val excIEEEDC2AId: UUID )
data class AssignVrmaxToExcIEEEDC2ACommand(@TargetAggregateIdentifier  val excIEEEDC2AId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcIEEEDC2ACommand(@TargetAggregateIdentifier  val excIEEEDC2AId: UUID )
data class AssignVrminToExcIEEEDC2ACommand(@TargetAggregateIdentifier  val excIEEEDC2AId: UUID, val assignment: PU )
data class UnAssignVrminFromExcIEEEDC2ACommand(@TargetAggregateIdentifier  val excIEEEDC2AId: UUID )

// multiple association commands


// ExcIEEEDC3A Commands
data class CreateExcIEEEDC3ACommand(
    @TargetAggregateIdentifier  var excIEEEDC3AId: UUID? = null
)

data class UpdateExcIEEEDC3ACommand(
    @TargetAggregateIdentifier var excIEEEDC3AId: UUID? = null,
    var efd1: PU,
    var efd2: PU,
    var exclim: BooleanProxy,
    var ke: PU,
    var kv: PU,
    var seefd1: Simple_Float,
    var seefd2: Simple_Float,
    var te: Seconds,
    var trh: Seconds,
    var vrmax: PU,
    var vrmin: PU
)

data class DeleteExcIEEEDC3ACommand(@TargetAggregateIdentifier  var excIEEEDC3AId: UUID? = null)

// single association commands
data class AssignEfd1ToExcIEEEDC3ACommand(@TargetAggregateIdentifier  val excIEEEDC3AId: UUID, val assignment: PU )
data class UnAssignEfd1FromExcIEEEDC3ACommand(@TargetAggregateIdentifier  val excIEEEDC3AId: UUID )
data class AssignEfd2ToExcIEEEDC3ACommand(@TargetAggregateIdentifier  val excIEEEDC3AId: UUID, val assignment: PU )
data class UnAssignEfd2FromExcIEEEDC3ACommand(@TargetAggregateIdentifier  val excIEEEDC3AId: UUID )
data class AssignExclimToExcIEEEDC3ACommand(@TargetAggregateIdentifier  val excIEEEDC3AId: UUID, val assignment: BooleanProxy )
data class UnAssignExclimFromExcIEEEDC3ACommand(@TargetAggregateIdentifier  val excIEEEDC3AId: UUID )
data class AssignKeToExcIEEEDC3ACommand(@TargetAggregateIdentifier  val excIEEEDC3AId: UUID, val assignment: PU )
data class UnAssignKeFromExcIEEEDC3ACommand(@TargetAggregateIdentifier  val excIEEEDC3AId: UUID )
data class AssignKvToExcIEEEDC3ACommand(@TargetAggregateIdentifier  val excIEEEDC3AId: UUID, val assignment: PU )
data class UnAssignKvFromExcIEEEDC3ACommand(@TargetAggregateIdentifier  val excIEEEDC3AId: UUID )
data class AssignSeefd1ToExcIEEEDC3ACommand(@TargetAggregateIdentifier  val excIEEEDC3AId: UUID, val assignment: Simple_Float )
data class UnAssignSeefd1FromExcIEEEDC3ACommand(@TargetAggregateIdentifier  val excIEEEDC3AId: UUID )
data class AssignSeefd2ToExcIEEEDC3ACommand(@TargetAggregateIdentifier  val excIEEEDC3AId: UUID, val assignment: Simple_Float )
data class UnAssignSeefd2FromExcIEEEDC3ACommand(@TargetAggregateIdentifier  val excIEEEDC3AId: UUID )
data class AssignTeToExcIEEEDC3ACommand(@TargetAggregateIdentifier  val excIEEEDC3AId: UUID, val assignment: Seconds )
data class UnAssignTeFromExcIEEEDC3ACommand(@TargetAggregateIdentifier  val excIEEEDC3AId: UUID )
data class AssignTrhToExcIEEEDC3ACommand(@TargetAggregateIdentifier  val excIEEEDC3AId: UUID, val assignment: Seconds )
data class UnAssignTrhFromExcIEEEDC3ACommand(@TargetAggregateIdentifier  val excIEEEDC3AId: UUID )
data class AssignVrmaxToExcIEEEDC3ACommand(@TargetAggregateIdentifier  val excIEEEDC3AId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcIEEEDC3ACommand(@TargetAggregateIdentifier  val excIEEEDC3AId: UUID )
data class AssignVrminToExcIEEEDC3ACommand(@TargetAggregateIdentifier  val excIEEEDC3AId: UUID, val assignment: PU )
data class UnAssignVrminFromExcIEEEDC3ACommand(@TargetAggregateIdentifier  val excIEEEDC3AId: UUID )

// multiple association commands


// ExcIEEEDC4B Commands
data class CreateExcIEEEDC4BCommand(
    @TargetAggregateIdentifier  var excIEEEDC4BId: UUID? = null
)

data class UpdateExcIEEEDC4BCommand(
    @TargetAggregateIdentifier var excIEEEDC4BId: UUID? = null,
    var efd1: PU,
    var efd2: PU,
    var ka: PU,
    var kd: PU,
    var ke: PU,
    var kf: PU,
    var ki: PU,
    var kp: PU,
    var oelin: BooleanProxy,
    var seefd1: Simple_Float,
    var seefd2: Simple_Float,
    var ta: Seconds,
    var td: Seconds,
    var te: Seconds,
    var tf: Seconds,
    var uelin: BooleanProxy,
    var vemin: PU,
    var vrmax: PU,
    var vrmin: PU
)

data class DeleteExcIEEEDC4BCommand(@TargetAggregateIdentifier  var excIEEEDC4BId: UUID? = null)

// single association commands
data class AssignEfd1ToExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID, val assignment: PU )
data class UnAssignEfd1FromExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID )
data class AssignEfd2ToExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID, val assignment: PU )
data class UnAssignEfd2FromExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID )
data class AssignKaToExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID, val assignment: PU )
data class UnAssignKaFromExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID )
data class AssignKdToExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID, val assignment: PU )
data class UnAssignKdFromExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID )
data class AssignKeToExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID, val assignment: PU )
data class UnAssignKeFromExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID )
data class AssignKfToExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID, val assignment: PU )
data class UnAssignKfFromExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID )
data class AssignKiToExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID, val assignment: PU )
data class UnAssignKiFromExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID )
data class AssignKpToExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID, val assignment: PU )
data class UnAssignKpFromExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID )
data class AssignOelinToExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID, val assignment: BooleanProxy )
data class UnAssignOelinFromExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID )
data class AssignSeefd1ToExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID, val assignment: Simple_Float )
data class UnAssignSeefd1FromExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID )
data class AssignSeefd2ToExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID, val assignment: Simple_Float )
data class UnAssignSeefd2FromExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID )
data class AssignTaToExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID, val assignment: Seconds )
data class UnAssignTaFromExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID )
data class AssignTdToExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID, val assignment: Seconds )
data class UnAssignTdFromExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID )
data class AssignTeToExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID, val assignment: Seconds )
data class UnAssignTeFromExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID )
data class AssignTfToExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID, val assignment: Seconds )
data class UnAssignTfFromExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID )
data class AssignUelinToExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID, val assignment: BooleanProxy )
data class UnAssignUelinFromExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID )
data class AssignVeminToExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID, val assignment: PU )
data class UnAssignVeminFromExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID )
data class AssignVrmaxToExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID )
data class AssignVrminToExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID, val assignment: PU )
data class UnAssignVrminFromExcIEEEDC4BCommand(@TargetAggregateIdentifier  val excIEEEDC4BId: UUID )

// multiple association commands


// ExcIEEEST1A Commands
data class CreateExcIEEEST1ACommand(
    @TargetAggregateIdentifier var excIEEEST1AId: UUID? = null,
    @Enumerated(EnumType.STRING) var uelin: ExcIEEEST1AUELselectorKind
)

data class UpdateExcIEEEST1ACommand(
    @TargetAggregateIdentifier var excIEEEST1AId: UUID? = null,
    var ilr: PU,
    var ka: PU,
    var kc: PU,
    var kf: PU,
    var klr: PU,
    var pssin: BooleanProxy,
    var ta: Seconds,
    var tb: Seconds,
    var tb1: Seconds,
    var tc: Seconds,
    var tc1: Seconds,
    var tf: Seconds,
    @Enumerated(EnumType.STRING) var uelin: ExcIEEEST1AUELselectorKind,
    var vamax: PU,
    var vamin: PU,
    var vimax: PU,
    var vimin: PU,
    var vrmax: PU,
    var vrmin: PU
)

data class DeleteExcIEEEST1ACommand(@TargetAggregateIdentifier  var excIEEEST1AId: UUID? = null)

// single association commands
data class AssignIlrToExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID, val assignment: PU )
data class UnAssignIlrFromExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID )
data class AssignKaToExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID, val assignment: PU )
data class UnAssignKaFromExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID )
data class AssignKcToExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID, val assignment: PU )
data class UnAssignKcFromExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID )
data class AssignKfToExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID, val assignment: PU )
data class UnAssignKfFromExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID )
data class AssignKlrToExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID, val assignment: PU )
data class UnAssignKlrFromExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID )
data class AssignPssinToExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID, val assignment: BooleanProxy )
data class UnAssignPssinFromExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID )
data class AssignTaToExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID, val assignment: Seconds )
data class UnAssignTaFromExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID )
data class AssignTbToExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID, val assignment: Seconds )
data class UnAssignTbFromExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID )
data class AssignTb1ToExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID, val assignment: Seconds )
data class UnAssignTb1FromExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID )
data class AssignTcToExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID, val assignment: Seconds )
data class UnAssignTcFromExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID )
data class AssignTc1ToExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID, val assignment: Seconds )
data class UnAssignTc1FromExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID )
data class AssignTfToExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID, val assignment: Seconds )
data class UnAssignTfFromExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID )
data class AssignVamaxToExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID, val assignment: PU )
data class UnAssignVamaxFromExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID )
data class AssignVaminToExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID, val assignment: PU )
data class UnAssignVaminFromExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID )
data class AssignVimaxToExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID, val assignment: PU )
data class UnAssignVimaxFromExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID )
data class AssignViminToExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID, val assignment: PU )
data class UnAssignViminFromExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID )
data class AssignVrmaxToExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID )
data class AssignVrminToExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID, val assignment: PU )
data class UnAssignVrminFromExcIEEEST1ACommand(@TargetAggregateIdentifier  val excIEEEST1AId: UUID )

// multiple association commands


// ExcIEEEST2A Commands
data class CreateExcIEEEST2ACommand(
    @TargetAggregateIdentifier  var excIEEEST2AId: UUID? = null
)

data class UpdateExcIEEEST2ACommand(
    @TargetAggregateIdentifier var excIEEEST2AId: UUID? = null,
    var efdmax: PU,
    var ka: PU,
    var kc: PU,
    var ke: PU,
    var kf: PU,
    var ki: PU,
    var kp: PU,
    var ta: Seconds,
    var te: Seconds,
    var tf: Seconds,
    var uelin: BooleanProxy,
    var vrmax: PU,
    var vrmin: PU
)

data class DeleteExcIEEEST2ACommand(@TargetAggregateIdentifier  var excIEEEST2AId: UUID? = null)

// single association commands
data class AssignEfdmaxToExcIEEEST2ACommand(@TargetAggregateIdentifier  val excIEEEST2AId: UUID, val assignment: PU )
data class UnAssignEfdmaxFromExcIEEEST2ACommand(@TargetAggregateIdentifier  val excIEEEST2AId: UUID )
data class AssignKaToExcIEEEST2ACommand(@TargetAggregateIdentifier  val excIEEEST2AId: UUID, val assignment: PU )
data class UnAssignKaFromExcIEEEST2ACommand(@TargetAggregateIdentifier  val excIEEEST2AId: UUID )
data class AssignKcToExcIEEEST2ACommand(@TargetAggregateIdentifier  val excIEEEST2AId: UUID, val assignment: PU )
data class UnAssignKcFromExcIEEEST2ACommand(@TargetAggregateIdentifier  val excIEEEST2AId: UUID )
data class AssignKeToExcIEEEST2ACommand(@TargetAggregateIdentifier  val excIEEEST2AId: UUID, val assignment: PU )
data class UnAssignKeFromExcIEEEST2ACommand(@TargetAggregateIdentifier  val excIEEEST2AId: UUID )
data class AssignKfToExcIEEEST2ACommand(@TargetAggregateIdentifier  val excIEEEST2AId: UUID, val assignment: PU )
data class UnAssignKfFromExcIEEEST2ACommand(@TargetAggregateIdentifier  val excIEEEST2AId: UUID )
data class AssignKiToExcIEEEST2ACommand(@TargetAggregateIdentifier  val excIEEEST2AId: UUID, val assignment: PU )
data class UnAssignKiFromExcIEEEST2ACommand(@TargetAggregateIdentifier  val excIEEEST2AId: UUID )
data class AssignKpToExcIEEEST2ACommand(@TargetAggregateIdentifier  val excIEEEST2AId: UUID, val assignment: PU )
data class UnAssignKpFromExcIEEEST2ACommand(@TargetAggregateIdentifier  val excIEEEST2AId: UUID )
data class AssignTaToExcIEEEST2ACommand(@TargetAggregateIdentifier  val excIEEEST2AId: UUID, val assignment: Seconds )
data class UnAssignTaFromExcIEEEST2ACommand(@TargetAggregateIdentifier  val excIEEEST2AId: UUID )
data class AssignTeToExcIEEEST2ACommand(@TargetAggregateIdentifier  val excIEEEST2AId: UUID, val assignment: Seconds )
data class UnAssignTeFromExcIEEEST2ACommand(@TargetAggregateIdentifier  val excIEEEST2AId: UUID )
data class AssignTfToExcIEEEST2ACommand(@TargetAggregateIdentifier  val excIEEEST2AId: UUID, val assignment: Seconds )
data class UnAssignTfFromExcIEEEST2ACommand(@TargetAggregateIdentifier  val excIEEEST2AId: UUID )
data class AssignUelinToExcIEEEST2ACommand(@TargetAggregateIdentifier  val excIEEEST2AId: UUID, val assignment: BooleanProxy )
data class UnAssignUelinFromExcIEEEST2ACommand(@TargetAggregateIdentifier  val excIEEEST2AId: UUID )
data class AssignVrmaxToExcIEEEST2ACommand(@TargetAggregateIdentifier  val excIEEEST2AId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcIEEEST2ACommand(@TargetAggregateIdentifier  val excIEEEST2AId: UUID )
data class AssignVrminToExcIEEEST2ACommand(@TargetAggregateIdentifier  val excIEEEST2AId: UUID, val assignment: PU )
data class UnAssignVrminFromExcIEEEST2ACommand(@TargetAggregateIdentifier  val excIEEEST2AId: UUID )

// multiple association commands


// ExcIEEEST3A Commands
data class CreateExcIEEEST3ACommand(
    @TargetAggregateIdentifier  var excIEEEST3AId: UUID? = null
)

data class UpdateExcIEEEST3ACommand(
    @TargetAggregateIdentifier var excIEEEST3AId: UUID? = null,
    var ka: PU,
    var kc: PU,
    var kg: PU,
    var ki: PU,
    var km: PU,
    var kp: PU,
    var ta: Seconds,
    var tb: Seconds,
    var tc: Seconds,
    var thetap: AngleDegrees,
    var tm: Seconds,
    var vbmax: PU,
    var vgmax: PU,
    var vimax: PU,
    var vimin: PU,
    var vmmax: PU,
    var vmmin: PU,
    var vrmax: PU,
    var vrmin: PU,
    var xl: PU
)

data class DeleteExcIEEEST3ACommand(@TargetAggregateIdentifier  var excIEEEST3AId: UUID? = null)

// single association commands
data class AssignKaToExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID, val assignment: PU )
data class UnAssignKaFromExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID )
data class AssignKcToExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID, val assignment: PU )
data class UnAssignKcFromExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID )
data class AssignKgToExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID, val assignment: PU )
data class UnAssignKgFromExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID )
data class AssignKiToExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID, val assignment: PU )
data class UnAssignKiFromExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID )
data class AssignKmToExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID, val assignment: PU )
data class UnAssignKmFromExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID )
data class AssignKpToExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID, val assignment: PU )
data class UnAssignKpFromExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID )
data class AssignTaToExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID, val assignment: Seconds )
data class UnAssignTaFromExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID )
data class AssignTbToExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID, val assignment: Seconds )
data class UnAssignTbFromExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID )
data class AssignTcToExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID, val assignment: Seconds )
data class UnAssignTcFromExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID )
data class AssignThetapToExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID, val assignment: AngleDegrees )
data class UnAssignThetapFromExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID )
data class AssignTmToExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID, val assignment: Seconds )
data class UnAssignTmFromExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID )
data class AssignVbmaxToExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID, val assignment: PU )
data class UnAssignVbmaxFromExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID )
data class AssignVgmaxToExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID, val assignment: PU )
data class UnAssignVgmaxFromExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID )
data class AssignVimaxToExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID, val assignment: PU )
data class UnAssignVimaxFromExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID )
data class AssignViminToExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID, val assignment: PU )
data class UnAssignViminFromExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID )
data class AssignVmmaxToExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID, val assignment: PU )
data class UnAssignVmmaxFromExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID )
data class AssignVmminToExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID, val assignment: PU )
data class UnAssignVmminFromExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID )
data class AssignVrmaxToExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID )
data class AssignVrminToExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID, val assignment: PU )
data class UnAssignVrminFromExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID )
data class AssignXlToExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID, val assignment: PU )
data class UnAssignXlFromExcIEEEST3ACommand(@TargetAggregateIdentifier  val excIEEEST3AId: UUID )

// multiple association commands


// ExcIEEEST4B Commands
data class CreateExcIEEEST4BCommand(
    @TargetAggregateIdentifier  var excIEEEST4BId: UUID? = null
)

data class UpdateExcIEEEST4BCommand(
    @TargetAggregateIdentifier var excIEEEST4BId: UUID? = null,
    var kc: PU,
    var kg: PU,
    var ki: PU,
    var kim: PU,
    var kir: PU,
    var kp: PU,
    var kpm: PU,
    var kpr: PU,
    var ta: Seconds,
    var thetap: AngleDegrees,
    var vbmax: PU,
    var vmmax: PU,
    var vmmin: PU,
    var vrmax: PU,
    var vrmin: PU,
    var xl: PU
)

data class DeleteExcIEEEST4BCommand(@TargetAggregateIdentifier  var excIEEEST4BId: UUID? = null)

// single association commands
data class AssignKcToExcIEEEST4BCommand(@TargetAggregateIdentifier  val excIEEEST4BId: UUID, val assignment: PU )
data class UnAssignKcFromExcIEEEST4BCommand(@TargetAggregateIdentifier  val excIEEEST4BId: UUID )
data class AssignKgToExcIEEEST4BCommand(@TargetAggregateIdentifier  val excIEEEST4BId: UUID, val assignment: PU )
data class UnAssignKgFromExcIEEEST4BCommand(@TargetAggregateIdentifier  val excIEEEST4BId: UUID )
data class AssignKiToExcIEEEST4BCommand(@TargetAggregateIdentifier  val excIEEEST4BId: UUID, val assignment: PU )
data class UnAssignKiFromExcIEEEST4BCommand(@TargetAggregateIdentifier  val excIEEEST4BId: UUID )
data class AssignKimToExcIEEEST4BCommand(@TargetAggregateIdentifier  val excIEEEST4BId: UUID, val assignment: PU )
data class UnAssignKimFromExcIEEEST4BCommand(@TargetAggregateIdentifier  val excIEEEST4BId: UUID )
data class AssignKirToExcIEEEST4BCommand(@TargetAggregateIdentifier  val excIEEEST4BId: UUID, val assignment: PU )
data class UnAssignKirFromExcIEEEST4BCommand(@TargetAggregateIdentifier  val excIEEEST4BId: UUID )
data class AssignKpToExcIEEEST4BCommand(@TargetAggregateIdentifier  val excIEEEST4BId: UUID, val assignment: PU )
data class UnAssignKpFromExcIEEEST4BCommand(@TargetAggregateIdentifier  val excIEEEST4BId: UUID )
data class AssignKpmToExcIEEEST4BCommand(@TargetAggregateIdentifier  val excIEEEST4BId: UUID, val assignment: PU )
data class UnAssignKpmFromExcIEEEST4BCommand(@TargetAggregateIdentifier  val excIEEEST4BId: UUID )
data class AssignKprToExcIEEEST4BCommand(@TargetAggregateIdentifier  val excIEEEST4BId: UUID, val assignment: PU )
data class UnAssignKprFromExcIEEEST4BCommand(@TargetAggregateIdentifier  val excIEEEST4BId: UUID )
data class AssignTaToExcIEEEST4BCommand(@TargetAggregateIdentifier  val excIEEEST4BId: UUID, val assignment: Seconds )
data class UnAssignTaFromExcIEEEST4BCommand(@TargetAggregateIdentifier  val excIEEEST4BId: UUID )
data class AssignThetapToExcIEEEST4BCommand(@TargetAggregateIdentifier  val excIEEEST4BId: UUID, val assignment: AngleDegrees )
data class UnAssignThetapFromExcIEEEST4BCommand(@TargetAggregateIdentifier  val excIEEEST4BId: UUID )
data class AssignVbmaxToExcIEEEST4BCommand(@TargetAggregateIdentifier  val excIEEEST4BId: UUID, val assignment: PU )
data class UnAssignVbmaxFromExcIEEEST4BCommand(@TargetAggregateIdentifier  val excIEEEST4BId: UUID )
data class AssignVmmaxToExcIEEEST4BCommand(@TargetAggregateIdentifier  val excIEEEST4BId: UUID, val assignment: PU )
data class UnAssignVmmaxFromExcIEEEST4BCommand(@TargetAggregateIdentifier  val excIEEEST4BId: UUID )
data class AssignVmminToExcIEEEST4BCommand(@TargetAggregateIdentifier  val excIEEEST4BId: UUID, val assignment: PU )
data class UnAssignVmminFromExcIEEEST4BCommand(@TargetAggregateIdentifier  val excIEEEST4BId: UUID )
data class AssignVrmaxToExcIEEEST4BCommand(@TargetAggregateIdentifier  val excIEEEST4BId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcIEEEST4BCommand(@TargetAggregateIdentifier  val excIEEEST4BId: UUID )
data class AssignVrminToExcIEEEST4BCommand(@TargetAggregateIdentifier  val excIEEEST4BId: UUID, val assignment: PU )
data class UnAssignVrminFromExcIEEEST4BCommand(@TargetAggregateIdentifier  val excIEEEST4BId: UUID )
data class AssignXlToExcIEEEST4BCommand(@TargetAggregateIdentifier  val excIEEEST4BId: UUID, val assignment: PU )
data class UnAssignXlFromExcIEEEST4BCommand(@TargetAggregateIdentifier  val excIEEEST4BId: UUID )

// multiple association commands


// ExcIEEEST5B Commands
data class CreateExcIEEEST5BCommand(
    @TargetAggregateIdentifier  var excIEEEST5BId: UUID? = null
)

data class UpdateExcIEEEST5BCommand(
    @TargetAggregateIdentifier var excIEEEST5BId: UUID? = null,
    var kc: PU,
    var kr: PU,
    var t1: Seconds,
    var tb1: Seconds,
    var tb2: Seconds,
    var tc1: Seconds,
    var tc2: Seconds,
    var tob1: Seconds,
    var tob2: Seconds,
    var toc1: Seconds,
    var toc2: Seconds,
    var tub1: Seconds,
    var tub2: Seconds,
    var tuc1: Seconds,
    var tuc2: Seconds,
    var vrmax: PU,
    var vrmin: PU
)

data class DeleteExcIEEEST5BCommand(@TargetAggregateIdentifier  var excIEEEST5BId: UUID? = null)

// single association commands
data class AssignKcToExcIEEEST5BCommand(@TargetAggregateIdentifier  val excIEEEST5BId: UUID, val assignment: PU )
data class UnAssignKcFromExcIEEEST5BCommand(@TargetAggregateIdentifier  val excIEEEST5BId: UUID )
data class AssignKrToExcIEEEST5BCommand(@TargetAggregateIdentifier  val excIEEEST5BId: UUID, val assignment: PU )
data class UnAssignKrFromExcIEEEST5BCommand(@TargetAggregateIdentifier  val excIEEEST5BId: UUID )
data class AssignT1ToExcIEEEST5BCommand(@TargetAggregateIdentifier  val excIEEEST5BId: UUID, val assignment: Seconds )
data class UnAssignT1FromExcIEEEST5BCommand(@TargetAggregateIdentifier  val excIEEEST5BId: UUID )
data class AssignTb1ToExcIEEEST5BCommand(@TargetAggregateIdentifier  val excIEEEST5BId: UUID, val assignment: Seconds )
data class UnAssignTb1FromExcIEEEST5BCommand(@TargetAggregateIdentifier  val excIEEEST5BId: UUID )
data class AssignTb2ToExcIEEEST5BCommand(@TargetAggregateIdentifier  val excIEEEST5BId: UUID, val assignment: Seconds )
data class UnAssignTb2FromExcIEEEST5BCommand(@TargetAggregateIdentifier  val excIEEEST5BId: UUID )
data class AssignTc1ToExcIEEEST5BCommand(@TargetAggregateIdentifier  val excIEEEST5BId: UUID, val assignment: Seconds )
data class UnAssignTc1FromExcIEEEST5BCommand(@TargetAggregateIdentifier  val excIEEEST5BId: UUID )
data class AssignTc2ToExcIEEEST5BCommand(@TargetAggregateIdentifier  val excIEEEST5BId: UUID, val assignment: Seconds )
data class UnAssignTc2FromExcIEEEST5BCommand(@TargetAggregateIdentifier  val excIEEEST5BId: UUID )
data class AssignTob1ToExcIEEEST5BCommand(@TargetAggregateIdentifier  val excIEEEST5BId: UUID, val assignment: Seconds )
data class UnAssignTob1FromExcIEEEST5BCommand(@TargetAggregateIdentifier  val excIEEEST5BId: UUID )
data class AssignTob2ToExcIEEEST5BCommand(@TargetAggregateIdentifier  val excIEEEST5BId: UUID, val assignment: Seconds )
data class UnAssignTob2FromExcIEEEST5BCommand(@TargetAggregateIdentifier  val excIEEEST5BId: UUID )
data class AssignToc1ToExcIEEEST5BCommand(@TargetAggregateIdentifier  val excIEEEST5BId: UUID, val assignment: Seconds )
data class UnAssignToc1FromExcIEEEST5BCommand(@TargetAggregateIdentifier  val excIEEEST5BId: UUID )
data class AssignToc2ToExcIEEEST5BCommand(@TargetAggregateIdentifier  val excIEEEST5BId: UUID, val assignment: Seconds )
data class UnAssignToc2FromExcIEEEST5BCommand(@TargetAggregateIdentifier  val excIEEEST5BId: UUID )
data class AssignTub1ToExcIEEEST5BCommand(@TargetAggregateIdentifier  val excIEEEST5BId: UUID, val assignment: Seconds )
data class UnAssignTub1FromExcIEEEST5BCommand(@TargetAggregateIdentifier  val excIEEEST5BId: UUID )
data class AssignTub2ToExcIEEEST5BCommand(@TargetAggregateIdentifier  val excIEEEST5BId: UUID, val assignment: Seconds )
data class UnAssignTub2FromExcIEEEST5BCommand(@TargetAggregateIdentifier  val excIEEEST5BId: UUID )
data class AssignTuc1ToExcIEEEST5BCommand(@TargetAggregateIdentifier  val excIEEEST5BId: UUID, val assignment: Seconds )
data class UnAssignTuc1FromExcIEEEST5BCommand(@TargetAggregateIdentifier  val excIEEEST5BId: UUID )
data class AssignTuc2ToExcIEEEST5BCommand(@TargetAggregateIdentifier  val excIEEEST5BId: UUID, val assignment: Seconds )
data class UnAssignTuc2FromExcIEEEST5BCommand(@TargetAggregateIdentifier  val excIEEEST5BId: UUID )
data class AssignVrmaxToExcIEEEST5BCommand(@TargetAggregateIdentifier  val excIEEEST5BId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcIEEEST5BCommand(@TargetAggregateIdentifier  val excIEEEST5BId: UUID )
data class AssignVrminToExcIEEEST5BCommand(@TargetAggregateIdentifier  val excIEEEST5BId: UUID, val assignment: PU )
data class UnAssignVrminFromExcIEEEST5BCommand(@TargetAggregateIdentifier  val excIEEEST5BId: UUID )

// multiple association commands


// ExcIEEEST6B Commands
data class CreateExcIEEEST6BCommand(
    @TargetAggregateIdentifier var excIEEEST6BId: UUID? = null,
    @Enumerated(EnumType.STRING) var oelin: ExcST6BOELselectorKind
)

data class UpdateExcIEEEST6BCommand(
    @TargetAggregateIdentifier var excIEEEST6BId: UUID? = null,
    var ilr: PU,
    var kci: PU,
    var kff: PU,
    var kg: PU,
    var kia: PU,
    var klr: PU,
    var km: PU,
    var kpa: PU,
    @Enumerated(EnumType.STRING) var oelin: ExcST6BOELselectorKind,
    var tg: Seconds,
    var vamax: PU,
    var vamin: PU,
    var vrmax: PU,
    var vrmin: PU
)

data class DeleteExcIEEEST6BCommand(@TargetAggregateIdentifier  var excIEEEST6BId: UUID? = null)

// single association commands
data class AssignIlrToExcIEEEST6BCommand(@TargetAggregateIdentifier  val excIEEEST6BId: UUID, val assignment: PU )
data class UnAssignIlrFromExcIEEEST6BCommand(@TargetAggregateIdentifier  val excIEEEST6BId: UUID )
data class AssignKciToExcIEEEST6BCommand(@TargetAggregateIdentifier  val excIEEEST6BId: UUID, val assignment: PU )
data class UnAssignKciFromExcIEEEST6BCommand(@TargetAggregateIdentifier  val excIEEEST6BId: UUID )
data class AssignKffToExcIEEEST6BCommand(@TargetAggregateIdentifier  val excIEEEST6BId: UUID, val assignment: PU )
data class UnAssignKffFromExcIEEEST6BCommand(@TargetAggregateIdentifier  val excIEEEST6BId: UUID )
data class AssignKgToExcIEEEST6BCommand(@TargetAggregateIdentifier  val excIEEEST6BId: UUID, val assignment: PU )
data class UnAssignKgFromExcIEEEST6BCommand(@TargetAggregateIdentifier  val excIEEEST6BId: UUID )
data class AssignKiaToExcIEEEST6BCommand(@TargetAggregateIdentifier  val excIEEEST6BId: UUID, val assignment: PU )
data class UnAssignKiaFromExcIEEEST6BCommand(@TargetAggregateIdentifier  val excIEEEST6BId: UUID )
data class AssignKlrToExcIEEEST6BCommand(@TargetAggregateIdentifier  val excIEEEST6BId: UUID, val assignment: PU )
data class UnAssignKlrFromExcIEEEST6BCommand(@TargetAggregateIdentifier  val excIEEEST6BId: UUID )
data class AssignKmToExcIEEEST6BCommand(@TargetAggregateIdentifier  val excIEEEST6BId: UUID, val assignment: PU )
data class UnAssignKmFromExcIEEEST6BCommand(@TargetAggregateIdentifier  val excIEEEST6BId: UUID )
data class AssignKpaToExcIEEEST6BCommand(@TargetAggregateIdentifier  val excIEEEST6BId: UUID, val assignment: PU )
data class UnAssignKpaFromExcIEEEST6BCommand(@TargetAggregateIdentifier  val excIEEEST6BId: UUID )
data class AssignTgToExcIEEEST6BCommand(@TargetAggregateIdentifier  val excIEEEST6BId: UUID, val assignment: Seconds )
data class UnAssignTgFromExcIEEEST6BCommand(@TargetAggregateIdentifier  val excIEEEST6BId: UUID )
data class AssignVamaxToExcIEEEST6BCommand(@TargetAggregateIdentifier  val excIEEEST6BId: UUID, val assignment: PU )
data class UnAssignVamaxFromExcIEEEST6BCommand(@TargetAggregateIdentifier  val excIEEEST6BId: UUID )
data class AssignVaminToExcIEEEST6BCommand(@TargetAggregateIdentifier  val excIEEEST6BId: UUID, val assignment: PU )
data class UnAssignVaminFromExcIEEEST6BCommand(@TargetAggregateIdentifier  val excIEEEST6BId: UUID )
data class AssignVrmaxToExcIEEEST6BCommand(@TargetAggregateIdentifier  val excIEEEST6BId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcIEEEST6BCommand(@TargetAggregateIdentifier  val excIEEEST6BId: UUID )
data class AssignVrminToExcIEEEST6BCommand(@TargetAggregateIdentifier  val excIEEEST6BId: UUID, val assignment: PU )
data class UnAssignVrminFromExcIEEEST6BCommand(@TargetAggregateIdentifier  val excIEEEST6BId: UUID )

// multiple association commands


// ExcIEEEST7B Commands
data class CreateExcIEEEST7BCommand(
    @TargetAggregateIdentifier var excIEEEST7BId: UUID? = null,
    @Enumerated(EnumType.STRING) var oelin: ExcST7BOELselectorKind,
    @Enumerated(EnumType.STRING) var uelin: ExcST7BUELselectorKind
)

data class UpdateExcIEEEST7BCommand(
    @TargetAggregateIdentifier var excIEEEST7BId: UUID? = null,
    var kh: PU,
    var kia: PU,
    var kl: PU,
    var kpa: PU,
    @Enumerated(EnumType.STRING) var oelin: ExcST7BOELselectorKind,
    var tb: Seconds,
    var tc: Seconds,
    var tf: Seconds,
    var tg: Seconds,
    var tia: Seconds,
    @Enumerated(EnumType.STRING) var uelin: ExcST7BUELselectorKind,
    var vmax: PU,
    var vmin: PU,
    var vrmax: PU,
    var vrmin: PU
)

data class DeleteExcIEEEST7BCommand(@TargetAggregateIdentifier  var excIEEEST7BId: UUID? = null)

// single association commands
data class AssignKhToExcIEEEST7BCommand(@TargetAggregateIdentifier  val excIEEEST7BId: UUID, val assignment: PU )
data class UnAssignKhFromExcIEEEST7BCommand(@TargetAggregateIdentifier  val excIEEEST7BId: UUID )
data class AssignKiaToExcIEEEST7BCommand(@TargetAggregateIdentifier  val excIEEEST7BId: UUID, val assignment: PU )
data class UnAssignKiaFromExcIEEEST7BCommand(@TargetAggregateIdentifier  val excIEEEST7BId: UUID )
data class AssignKlToExcIEEEST7BCommand(@TargetAggregateIdentifier  val excIEEEST7BId: UUID, val assignment: PU )
data class UnAssignKlFromExcIEEEST7BCommand(@TargetAggregateIdentifier  val excIEEEST7BId: UUID )
data class AssignKpaToExcIEEEST7BCommand(@TargetAggregateIdentifier  val excIEEEST7BId: UUID, val assignment: PU )
data class UnAssignKpaFromExcIEEEST7BCommand(@TargetAggregateIdentifier  val excIEEEST7BId: UUID )
data class AssignTbToExcIEEEST7BCommand(@TargetAggregateIdentifier  val excIEEEST7BId: UUID, val assignment: Seconds )
data class UnAssignTbFromExcIEEEST7BCommand(@TargetAggregateIdentifier  val excIEEEST7BId: UUID )
data class AssignTcToExcIEEEST7BCommand(@TargetAggregateIdentifier  val excIEEEST7BId: UUID, val assignment: Seconds )
data class UnAssignTcFromExcIEEEST7BCommand(@TargetAggregateIdentifier  val excIEEEST7BId: UUID )
data class AssignTfToExcIEEEST7BCommand(@TargetAggregateIdentifier  val excIEEEST7BId: UUID, val assignment: Seconds )
data class UnAssignTfFromExcIEEEST7BCommand(@TargetAggregateIdentifier  val excIEEEST7BId: UUID )
data class AssignTgToExcIEEEST7BCommand(@TargetAggregateIdentifier  val excIEEEST7BId: UUID, val assignment: Seconds )
data class UnAssignTgFromExcIEEEST7BCommand(@TargetAggregateIdentifier  val excIEEEST7BId: UUID )
data class AssignTiaToExcIEEEST7BCommand(@TargetAggregateIdentifier  val excIEEEST7BId: UUID, val assignment: Seconds )
data class UnAssignTiaFromExcIEEEST7BCommand(@TargetAggregateIdentifier  val excIEEEST7BId: UUID )
data class AssignVmaxToExcIEEEST7BCommand(@TargetAggregateIdentifier  val excIEEEST7BId: UUID, val assignment: PU )
data class UnAssignVmaxFromExcIEEEST7BCommand(@TargetAggregateIdentifier  val excIEEEST7BId: UUID )
data class AssignVminToExcIEEEST7BCommand(@TargetAggregateIdentifier  val excIEEEST7BId: UUID, val assignment: PU )
data class UnAssignVminFromExcIEEEST7BCommand(@TargetAggregateIdentifier  val excIEEEST7BId: UUID )
data class AssignVrmaxToExcIEEEST7BCommand(@TargetAggregateIdentifier  val excIEEEST7BId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcIEEEST7BCommand(@TargetAggregateIdentifier  val excIEEEST7BId: UUID )
data class AssignVrminToExcIEEEST7BCommand(@TargetAggregateIdentifier  val excIEEEST7BId: UUID, val assignment: PU )
data class UnAssignVrminFromExcIEEEST7BCommand(@TargetAggregateIdentifier  val excIEEEST7BId: UUID )

// multiple association commands


// ExcOEX3T Commands
data class CreateExcOEX3TCommand(
    @TargetAggregateIdentifier  var excOEX3TId: UUID? = null
)

data class UpdateExcOEX3TCommand(
    @TargetAggregateIdentifier var excOEX3TId: UUID? = null,
    var e1: PU,
    var e2: PU,
    var ka: PU,
    var kc: PU,
    var kd: PU,
    var ke: PU,
    var kf: PU,
    var see1: PU,
    var see2: PU,
    var t1: Seconds,
    var t2: Seconds,
    var t3: Seconds,
    var t4: Seconds,
    var t5: Seconds,
    var t6: Seconds,
    var te: Seconds,
    var tf: Seconds,
    var vrmax: PU,
    var vrmin: PU
)

data class DeleteExcOEX3TCommand(@TargetAggregateIdentifier  var excOEX3TId: UUID? = null)

// single association commands
data class AssignE1ToExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID, val assignment: PU )
data class UnAssignE1FromExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID )
data class AssignE2ToExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID, val assignment: PU )
data class UnAssignE2FromExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID )
data class AssignKaToExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID, val assignment: PU )
data class UnAssignKaFromExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID )
data class AssignKcToExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID, val assignment: PU )
data class UnAssignKcFromExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID )
data class AssignKdToExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID, val assignment: PU )
data class UnAssignKdFromExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID )
data class AssignKeToExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID, val assignment: PU )
data class UnAssignKeFromExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID )
data class AssignKfToExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID, val assignment: PU )
data class UnAssignKfFromExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID )
data class AssignSee1ToExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID, val assignment: PU )
data class UnAssignSee1FromExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID )
data class AssignSee2ToExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID, val assignment: PU )
data class UnAssignSee2FromExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID )
data class AssignT1ToExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID, val assignment: Seconds )
data class UnAssignT1FromExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID )
data class AssignT2ToExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID, val assignment: Seconds )
data class UnAssignT2FromExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID )
data class AssignT3ToExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID, val assignment: Seconds )
data class UnAssignT3FromExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID )
data class AssignT4ToExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID, val assignment: Seconds )
data class UnAssignT4FromExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID )
data class AssignT5ToExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID, val assignment: Seconds )
data class UnAssignT5FromExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID )
data class AssignT6ToExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID, val assignment: Seconds )
data class UnAssignT6FromExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID )
data class AssignTeToExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID, val assignment: Seconds )
data class UnAssignTeFromExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID )
data class AssignTfToExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID, val assignment: Seconds )
data class UnAssignTfFromExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID )
data class AssignVrmaxToExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID )
data class AssignVrminToExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID, val assignment: PU )
data class UnAssignVrminFromExcOEX3TCommand(@TargetAggregateIdentifier  val excOEX3TId: UUID )

// multiple association commands


// ExcPIC Commands
data class CreateExcPICCommand(
    @TargetAggregateIdentifier  var excPICId: UUID? = null
)

data class UpdateExcPICCommand(
    @TargetAggregateIdentifier var excPICId: UUID? = null,
    var e1: PU,
    var e2: PU,
    var efdmax: PU,
    var efdmin: PU,
    var ka: PU,
    var kc: PU,
    var ke: PU,
    var kf: PU,
    var ki: PU,
    var kp: PU,
    var se1: PU,
    var se2: PU,
    var ta1: Seconds,
    var ta2: Seconds,
    var ta3: Seconds,
    var ta4: Seconds,
    var te: Seconds,
    var tf1: Seconds,
    var tf2: Seconds,
    var vr1: PU,
    var vr2: PU,
    var vrmax: PU,
    var vrmin: PU
)

data class DeleteExcPICCommand(@TargetAggregateIdentifier  var excPICId: UUID? = null)

// single association commands
data class AssignE1ToExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID, val assignment: PU )
data class UnAssignE1FromExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID )
data class AssignE2ToExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID, val assignment: PU )
data class UnAssignE2FromExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID )
data class AssignEfdmaxToExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID, val assignment: PU )
data class UnAssignEfdmaxFromExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID )
data class AssignEfdminToExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID, val assignment: PU )
data class UnAssignEfdminFromExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID )
data class AssignKaToExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID, val assignment: PU )
data class UnAssignKaFromExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID )
data class AssignKcToExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID, val assignment: PU )
data class UnAssignKcFromExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID )
data class AssignKeToExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID, val assignment: PU )
data class UnAssignKeFromExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID )
data class AssignKfToExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID, val assignment: PU )
data class UnAssignKfFromExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID )
data class AssignKiToExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID, val assignment: PU )
data class UnAssignKiFromExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID )
data class AssignKpToExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID, val assignment: PU )
data class UnAssignKpFromExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID )
data class AssignSe1ToExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID, val assignment: PU )
data class UnAssignSe1FromExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID )
data class AssignSe2ToExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID, val assignment: PU )
data class UnAssignSe2FromExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID )
data class AssignTa1ToExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID, val assignment: Seconds )
data class UnAssignTa1FromExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID )
data class AssignTa2ToExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID, val assignment: Seconds )
data class UnAssignTa2FromExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID )
data class AssignTa3ToExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID, val assignment: Seconds )
data class UnAssignTa3FromExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID )
data class AssignTa4ToExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID, val assignment: Seconds )
data class UnAssignTa4FromExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID )
data class AssignTeToExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID, val assignment: Seconds )
data class UnAssignTeFromExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID )
data class AssignTf1ToExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID, val assignment: Seconds )
data class UnAssignTf1FromExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID )
data class AssignTf2ToExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID, val assignment: Seconds )
data class UnAssignTf2FromExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID )
data class AssignVr1ToExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID, val assignment: PU )
data class UnAssignVr1FromExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID )
data class AssignVr2ToExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID, val assignment: PU )
data class UnAssignVr2FromExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID )
data class AssignVrmaxToExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID )
data class AssignVrminToExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID, val assignment: PU )
data class UnAssignVrminFromExcPICCommand(@TargetAggregateIdentifier  val excPICId: UUID )

// multiple association commands


// ExcREXS Commands
data class CreateExcREXSCommand(
    @TargetAggregateIdentifier var excREXSId: UUID? = null,
    @Enumerated(EnumType.STRING) var fbf: ExcREXSFeedbackSignalKind
)

data class UpdateExcREXSCommand(
    @TargetAggregateIdentifier var excREXSId: UUID? = null,
    var e1: PU,
    var e2: PU,
    @Enumerated(EnumType.STRING) var fbf: ExcREXSFeedbackSignalKind,
    var flimf: PU,
    var kc: PU,
    var kd: PU,
    var ke: PU,
    var kefd: PU,
    var kf: Seconds,
    var kh: PU,
    var kii: PU,
    var kip: PU,
    var ks: PU,
    var kvi: PU,
    var kvp: PU,
    var kvphz: PU,
    var nvphz: PU,
    var se1: PU,
    var se2: PU,
    var ta: Seconds,
    var tb1: Seconds,
    var tb2: Seconds,
    var tc1: Seconds,
    var tc2: Seconds,
    var te: Seconds,
    var tf: Seconds,
    var tf1: Seconds,
    var tf2: Seconds,
    var tp: Seconds,
    var vcmax: PU,
    var vfmax: PU,
    var vfmin: PU,
    var vimax: PU,
    var vrmax: PU,
    var vrmin: PU,
    var xc: PU
)

data class DeleteExcREXSCommand(@TargetAggregateIdentifier  var excREXSId: UUID? = null)

// single association commands
data class AssignE1ToExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID, val assignment: PU )
data class UnAssignE1FromExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID )
data class AssignE2ToExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID, val assignment: PU )
data class UnAssignE2FromExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID )
data class AssignFlimfToExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID, val assignment: PU )
data class UnAssignFlimfFromExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID )
data class AssignKcToExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID, val assignment: PU )
data class UnAssignKcFromExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID )
data class AssignKdToExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID, val assignment: PU )
data class UnAssignKdFromExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID )
data class AssignKeToExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID, val assignment: PU )
data class UnAssignKeFromExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID )
data class AssignKefdToExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID, val assignment: PU )
data class UnAssignKefdFromExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID )
data class AssignKfToExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID, val assignment: Seconds )
data class UnAssignKfFromExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID )
data class AssignKhToExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID, val assignment: PU )
data class UnAssignKhFromExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID )
data class AssignKiiToExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID, val assignment: PU )
data class UnAssignKiiFromExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID )
data class AssignKipToExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID, val assignment: PU )
data class UnAssignKipFromExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID )
data class AssignKsToExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID, val assignment: PU )
data class UnAssignKsFromExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID )
data class AssignKviToExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID, val assignment: PU )
data class UnAssignKviFromExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID )
data class AssignKvpToExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID, val assignment: PU )
data class UnAssignKvpFromExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID )
data class AssignKvphzToExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID, val assignment: PU )
data class UnAssignKvphzFromExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID )
data class AssignNvphzToExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID, val assignment: PU )
data class UnAssignNvphzFromExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID )
data class AssignSe1ToExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID, val assignment: PU )
data class UnAssignSe1FromExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID )
data class AssignSe2ToExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID, val assignment: PU )
data class UnAssignSe2FromExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID )
data class AssignTaToExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID, val assignment: Seconds )
data class UnAssignTaFromExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID )
data class AssignTb1ToExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID, val assignment: Seconds )
data class UnAssignTb1FromExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID )
data class AssignTb2ToExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID, val assignment: Seconds )
data class UnAssignTb2FromExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID )
data class AssignTc1ToExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID, val assignment: Seconds )
data class UnAssignTc1FromExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID )
data class AssignTc2ToExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID, val assignment: Seconds )
data class UnAssignTc2FromExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID )
data class AssignTeToExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID, val assignment: Seconds )
data class UnAssignTeFromExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID )
data class AssignTfToExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID, val assignment: Seconds )
data class UnAssignTfFromExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID )
data class AssignTf1ToExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID, val assignment: Seconds )
data class UnAssignTf1FromExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID )
data class AssignTf2ToExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID, val assignment: Seconds )
data class UnAssignTf2FromExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID )
data class AssignTpToExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID, val assignment: Seconds )
data class UnAssignTpFromExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID )
data class AssignVcmaxToExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID, val assignment: PU )
data class UnAssignVcmaxFromExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID )
data class AssignVfmaxToExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID, val assignment: PU )
data class UnAssignVfmaxFromExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID )
data class AssignVfminToExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID, val assignment: PU )
data class UnAssignVfminFromExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID )
data class AssignVimaxToExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID, val assignment: PU )
data class UnAssignVimaxFromExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID )
data class AssignVrmaxToExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID )
data class AssignVrminToExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID, val assignment: PU )
data class UnAssignVrminFromExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID )
data class AssignXcToExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID, val assignment: PU )
data class UnAssignXcFromExcREXSCommand(@TargetAggregateIdentifier  val excREXSId: UUID )

// multiple association commands


// ExcSCRX Commands
data class CreateExcSCRXCommand(
    @TargetAggregateIdentifier  var excSCRXId: UUID? = null
)

data class UpdateExcSCRXCommand(
    @TargetAggregateIdentifier var excSCRXId: UUID? = null,
    var cswitch: BooleanProxy,
    var emax: PU,
    var emin: PU,
    var k: PU,
    var rcrfd: Simple_Float,
    var tatb: Simple_Float,
    var tb: Seconds,
    var te: Seconds
)

data class DeleteExcSCRXCommand(@TargetAggregateIdentifier  var excSCRXId: UUID? = null)

// single association commands
data class AssignCswitchToExcSCRXCommand(@TargetAggregateIdentifier  val excSCRXId: UUID, val assignment: BooleanProxy )
data class UnAssignCswitchFromExcSCRXCommand(@TargetAggregateIdentifier  val excSCRXId: UUID )
data class AssignEmaxToExcSCRXCommand(@TargetAggregateIdentifier  val excSCRXId: UUID, val assignment: PU )
data class UnAssignEmaxFromExcSCRXCommand(@TargetAggregateIdentifier  val excSCRXId: UUID )
data class AssignEminToExcSCRXCommand(@TargetAggregateIdentifier  val excSCRXId: UUID, val assignment: PU )
data class UnAssignEminFromExcSCRXCommand(@TargetAggregateIdentifier  val excSCRXId: UUID )
data class AssignKToExcSCRXCommand(@TargetAggregateIdentifier  val excSCRXId: UUID, val assignment: PU )
data class UnAssignKFromExcSCRXCommand(@TargetAggregateIdentifier  val excSCRXId: UUID )
data class AssignRcrfdToExcSCRXCommand(@TargetAggregateIdentifier  val excSCRXId: UUID, val assignment: Simple_Float )
data class UnAssignRcrfdFromExcSCRXCommand(@TargetAggregateIdentifier  val excSCRXId: UUID )
data class AssignTatbToExcSCRXCommand(@TargetAggregateIdentifier  val excSCRXId: UUID, val assignment: Simple_Float )
data class UnAssignTatbFromExcSCRXCommand(@TargetAggregateIdentifier  val excSCRXId: UUID )
data class AssignTbToExcSCRXCommand(@TargetAggregateIdentifier  val excSCRXId: UUID, val assignment: Seconds )
data class UnAssignTbFromExcSCRXCommand(@TargetAggregateIdentifier  val excSCRXId: UUID )
data class AssignTeToExcSCRXCommand(@TargetAggregateIdentifier  val excSCRXId: UUID, val assignment: Seconds )
data class UnAssignTeFromExcSCRXCommand(@TargetAggregateIdentifier  val excSCRXId: UUID )

// multiple association commands


// ExcSEXS Commands
data class CreateExcSEXSCommand(
    @TargetAggregateIdentifier  var excSEXSId: UUID? = null
)

data class UpdateExcSEXSCommand(
    @TargetAggregateIdentifier var excSEXSId: UUID? = null,
    var efdmax: PU,
    var efdmin: PU,
    var emax: PU,
    var emin: PU,
    var k: PU,
    var kc: PU,
    var tatb: Simple_Float,
    var tb: Seconds,
    var tc: Seconds,
    var te: Seconds
)

data class DeleteExcSEXSCommand(@TargetAggregateIdentifier  var excSEXSId: UUID? = null)

// single association commands
data class AssignEfdmaxToExcSEXSCommand(@TargetAggregateIdentifier  val excSEXSId: UUID, val assignment: PU )
data class UnAssignEfdmaxFromExcSEXSCommand(@TargetAggregateIdentifier  val excSEXSId: UUID )
data class AssignEfdminToExcSEXSCommand(@TargetAggregateIdentifier  val excSEXSId: UUID, val assignment: PU )
data class UnAssignEfdminFromExcSEXSCommand(@TargetAggregateIdentifier  val excSEXSId: UUID )
data class AssignEmaxToExcSEXSCommand(@TargetAggregateIdentifier  val excSEXSId: UUID, val assignment: PU )
data class UnAssignEmaxFromExcSEXSCommand(@TargetAggregateIdentifier  val excSEXSId: UUID )
data class AssignEminToExcSEXSCommand(@TargetAggregateIdentifier  val excSEXSId: UUID, val assignment: PU )
data class UnAssignEminFromExcSEXSCommand(@TargetAggregateIdentifier  val excSEXSId: UUID )
data class AssignKToExcSEXSCommand(@TargetAggregateIdentifier  val excSEXSId: UUID, val assignment: PU )
data class UnAssignKFromExcSEXSCommand(@TargetAggregateIdentifier  val excSEXSId: UUID )
data class AssignKcToExcSEXSCommand(@TargetAggregateIdentifier  val excSEXSId: UUID, val assignment: PU )
data class UnAssignKcFromExcSEXSCommand(@TargetAggregateIdentifier  val excSEXSId: UUID )
data class AssignTatbToExcSEXSCommand(@TargetAggregateIdentifier  val excSEXSId: UUID, val assignment: Simple_Float )
data class UnAssignTatbFromExcSEXSCommand(@TargetAggregateIdentifier  val excSEXSId: UUID )
data class AssignTbToExcSEXSCommand(@TargetAggregateIdentifier  val excSEXSId: UUID, val assignment: Seconds )
data class UnAssignTbFromExcSEXSCommand(@TargetAggregateIdentifier  val excSEXSId: UUID )
data class AssignTcToExcSEXSCommand(@TargetAggregateIdentifier  val excSEXSId: UUID, val assignment: Seconds )
data class UnAssignTcFromExcSEXSCommand(@TargetAggregateIdentifier  val excSEXSId: UUID )
data class AssignTeToExcSEXSCommand(@TargetAggregateIdentifier  val excSEXSId: UUID, val assignment: Seconds )
data class UnAssignTeFromExcSEXSCommand(@TargetAggregateIdentifier  val excSEXSId: UUID )

// multiple association commands


// ExcSK Commands
data class CreateExcSKCommand(
    @TargetAggregateIdentifier  var excSKId: UUID? = null
)

data class UpdateExcSKCommand(
    @TargetAggregateIdentifier var excSKId: UUID? = null,
    var efdmax: PU,
    var efdmin: PU,
    var emax: PU,
    var emin: PU,
    var k: PU,
    var k1: PU,
    var k2: PU,
    var kc: PU,
    var kce: PU,
    var kd: PU,
    var kgob: PU,
    var kp: PU,
    var kqi: PU,
    var kqob: PU,
    var kqp: PU,
    var nq: PU,
    var qconoff: BooleanProxy,
    var qz: PU,
    var remote: BooleanProxy,
    var sbase: ApparentPower,
    var tc: Seconds,
    var te: Seconds,
    var ti: Seconds,
    var tp: Seconds,
    var tr: Seconds,
    var uimax: PU,
    var uimin: PU,
    var urmax: PU,
    var urmin: PU,
    var vtmax: PU,
    var vtmin: PU,
    var yp: PU
)

data class DeleteExcSKCommand(@TargetAggregateIdentifier  var excSKId: UUID? = null)

// single association commands
data class AssignEfdmaxToExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID, val assignment: PU )
data class UnAssignEfdmaxFromExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID )
data class AssignEfdminToExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID, val assignment: PU )
data class UnAssignEfdminFromExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID )
data class AssignEmaxToExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID, val assignment: PU )
data class UnAssignEmaxFromExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID )
data class AssignEminToExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID, val assignment: PU )
data class UnAssignEminFromExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID )
data class AssignKToExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID, val assignment: PU )
data class UnAssignKFromExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID )
data class AssignK1ToExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID, val assignment: PU )
data class UnAssignK1FromExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID )
data class AssignK2ToExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID, val assignment: PU )
data class UnAssignK2FromExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID )
data class AssignKcToExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID, val assignment: PU )
data class UnAssignKcFromExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID )
data class AssignKceToExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID, val assignment: PU )
data class UnAssignKceFromExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID )
data class AssignKdToExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID, val assignment: PU )
data class UnAssignKdFromExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID )
data class AssignKgobToExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID, val assignment: PU )
data class UnAssignKgobFromExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID )
data class AssignKpToExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID, val assignment: PU )
data class UnAssignKpFromExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID )
data class AssignKqiToExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID, val assignment: PU )
data class UnAssignKqiFromExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID )
data class AssignKqobToExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID, val assignment: PU )
data class UnAssignKqobFromExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID )
data class AssignKqpToExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID, val assignment: PU )
data class UnAssignKqpFromExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID )
data class AssignNqToExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID, val assignment: PU )
data class UnAssignNqFromExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID )
data class AssignQconoffToExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID, val assignment: BooleanProxy )
data class UnAssignQconoffFromExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID )
data class AssignQzToExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID, val assignment: PU )
data class UnAssignQzFromExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID )
data class AssignRemoteToExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID, val assignment: BooleanProxy )
data class UnAssignRemoteFromExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID )
data class AssignSbaseToExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID, val assignment: ApparentPower )
data class UnAssignSbaseFromExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID )
data class AssignTcToExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID, val assignment: Seconds )
data class UnAssignTcFromExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID )
data class AssignTeToExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID, val assignment: Seconds )
data class UnAssignTeFromExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID )
data class AssignTiToExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID, val assignment: Seconds )
data class UnAssignTiFromExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID )
data class AssignTpToExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID, val assignment: Seconds )
data class UnAssignTpFromExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID )
data class AssignTrToExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID, val assignment: Seconds )
data class UnAssignTrFromExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID )
data class AssignUimaxToExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID, val assignment: PU )
data class UnAssignUimaxFromExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID )
data class AssignUiminToExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID, val assignment: PU )
data class UnAssignUiminFromExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID )
data class AssignUrmaxToExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID, val assignment: PU )
data class UnAssignUrmaxFromExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID )
data class AssignUrminToExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID, val assignment: PU )
data class UnAssignUrminFromExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID )
data class AssignVtmaxToExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID, val assignment: PU )
data class UnAssignVtmaxFromExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID )
data class AssignVtminToExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID, val assignment: PU )
data class UnAssignVtminFromExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID )
data class AssignYpToExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID, val assignment: PU )
data class UnAssignYpFromExcSKCommand(@TargetAggregateIdentifier  val excSKId: UUID )

// multiple association commands


// ExcST1A Commands
data class CreateExcST1ACommand(
    @TargetAggregateIdentifier  var excST1AId: UUID? = null
)

data class UpdateExcST1ACommand(
    @TargetAggregateIdentifier var excST1AId: UUID? = null,
    var ilr: PU,
    var ka: PU,
    var kc: PU,
    var kf: PU,
    var klr: PU,
    var ta: Seconds,
    var tb: Seconds,
    var tb1: Seconds,
    var tc: Seconds,
    var tc1: Seconds,
    var tf: Seconds,
    var vamax: PU,
    var vamin: PU,
    var vimax: PU,
    var vimin: PU,
    var vrmax: PU,
    var vrmin: PU,
    var xe: PU
)

data class DeleteExcST1ACommand(@TargetAggregateIdentifier  var excST1AId: UUID? = null)

// single association commands
data class AssignIlrToExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID, val assignment: PU )
data class UnAssignIlrFromExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID )
data class AssignKaToExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID, val assignment: PU )
data class UnAssignKaFromExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID )
data class AssignKcToExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID, val assignment: PU )
data class UnAssignKcFromExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID )
data class AssignKfToExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID, val assignment: PU )
data class UnAssignKfFromExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID )
data class AssignKlrToExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID, val assignment: PU )
data class UnAssignKlrFromExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID )
data class AssignTaToExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID, val assignment: Seconds )
data class UnAssignTaFromExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID )
data class AssignTbToExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID, val assignment: Seconds )
data class UnAssignTbFromExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID )
data class AssignTb1ToExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID, val assignment: Seconds )
data class UnAssignTb1FromExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID )
data class AssignTcToExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID, val assignment: Seconds )
data class UnAssignTcFromExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID )
data class AssignTc1ToExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID, val assignment: Seconds )
data class UnAssignTc1FromExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID )
data class AssignTfToExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID, val assignment: Seconds )
data class UnAssignTfFromExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID )
data class AssignVamaxToExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID, val assignment: PU )
data class UnAssignVamaxFromExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID )
data class AssignVaminToExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID, val assignment: PU )
data class UnAssignVaminFromExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID )
data class AssignVimaxToExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID, val assignment: PU )
data class UnAssignVimaxFromExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID )
data class AssignViminToExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID, val assignment: PU )
data class UnAssignViminFromExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID )
data class AssignVrmaxToExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID )
data class AssignVrminToExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID, val assignment: PU )
data class UnAssignVrminFromExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID )
data class AssignXeToExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID, val assignment: PU )
data class UnAssignXeFromExcST1ACommand(@TargetAggregateIdentifier  val excST1AId: UUID )

// multiple association commands


// ExcST2A Commands
data class CreateExcST2ACommand(
    @TargetAggregateIdentifier  var excST2AId: UUID? = null
)

data class UpdateExcST2ACommand(
    @TargetAggregateIdentifier var excST2AId: UUID? = null,
    var efdmax: PU,
    var ka: PU,
    var kc: PU,
    var ke: PU,
    var kf: PU,
    var ki: PU,
    var kp: PU,
    var ta: Seconds,
    var tb: Seconds,
    var tc: Seconds,
    var te: Seconds,
    var tf: Seconds,
    var uelin: BooleanProxy,
    var vrmax: PU,
    var vrmin: PU
)

data class DeleteExcST2ACommand(@TargetAggregateIdentifier  var excST2AId: UUID? = null)

// single association commands
data class AssignEfdmaxToExcST2ACommand(@TargetAggregateIdentifier  val excST2AId: UUID, val assignment: PU )
data class UnAssignEfdmaxFromExcST2ACommand(@TargetAggregateIdentifier  val excST2AId: UUID )
data class AssignKaToExcST2ACommand(@TargetAggregateIdentifier  val excST2AId: UUID, val assignment: PU )
data class UnAssignKaFromExcST2ACommand(@TargetAggregateIdentifier  val excST2AId: UUID )
data class AssignKcToExcST2ACommand(@TargetAggregateIdentifier  val excST2AId: UUID, val assignment: PU )
data class UnAssignKcFromExcST2ACommand(@TargetAggregateIdentifier  val excST2AId: UUID )
data class AssignKeToExcST2ACommand(@TargetAggregateIdentifier  val excST2AId: UUID, val assignment: PU )
data class UnAssignKeFromExcST2ACommand(@TargetAggregateIdentifier  val excST2AId: UUID )
data class AssignKfToExcST2ACommand(@TargetAggregateIdentifier  val excST2AId: UUID, val assignment: PU )
data class UnAssignKfFromExcST2ACommand(@TargetAggregateIdentifier  val excST2AId: UUID )
data class AssignKiToExcST2ACommand(@TargetAggregateIdentifier  val excST2AId: UUID, val assignment: PU )
data class UnAssignKiFromExcST2ACommand(@TargetAggregateIdentifier  val excST2AId: UUID )
data class AssignKpToExcST2ACommand(@TargetAggregateIdentifier  val excST2AId: UUID, val assignment: PU )
data class UnAssignKpFromExcST2ACommand(@TargetAggregateIdentifier  val excST2AId: UUID )
data class AssignTaToExcST2ACommand(@TargetAggregateIdentifier  val excST2AId: UUID, val assignment: Seconds )
data class UnAssignTaFromExcST2ACommand(@TargetAggregateIdentifier  val excST2AId: UUID )
data class AssignTbToExcST2ACommand(@TargetAggregateIdentifier  val excST2AId: UUID, val assignment: Seconds )
data class UnAssignTbFromExcST2ACommand(@TargetAggregateIdentifier  val excST2AId: UUID )
data class AssignTcToExcST2ACommand(@TargetAggregateIdentifier  val excST2AId: UUID, val assignment: Seconds )
data class UnAssignTcFromExcST2ACommand(@TargetAggregateIdentifier  val excST2AId: UUID )
data class AssignTeToExcST2ACommand(@TargetAggregateIdentifier  val excST2AId: UUID, val assignment: Seconds )
data class UnAssignTeFromExcST2ACommand(@TargetAggregateIdentifier  val excST2AId: UUID )
data class AssignTfToExcST2ACommand(@TargetAggregateIdentifier  val excST2AId: UUID, val assignment: Seconds )
data class UnAssignTfFromExcST2ACommand(@TargetAggregateIdentifier  val excST2AId: UUID )
data class AssignUelinToExcST2ACommand(@TargetAggregateIdentifier  val excST2AId: UUID, val assignment: BooleanProxy )
data class UnAssignUelinFromExcST2ACommand(@TargetAggregateIdentifier  val excST2AId: UUID )
data class AssignVrmaxToExcST2ACommand(@TargetAggregateIdentifier  val excST2AId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcST2ACommand(@TargetAggregateIdentifier  val excST2AId: UUID )
data class AssignVrminToExcST2ACommand(@TargetAggregateIdentifier  val excST2AId: UUID, val assignment: PU )
data class UnAssignVrminFromExcST2ACommand(@TargetAggregateIdentifier  val excST2AId: UUID )

// multiple association commands


// ExcST3A Commands
data class CreateExcST3ACommand(
    @TargetAggregateIdentifier  var excST3AId: UUID? = null
)

data class UpdateExcST3ACommand(
    @TargetAggregateIdentifier var excST3AId: UUID? = null,
    var efdmax: PU,
    var kc: PU,
    var kg: PU,
    var ki: PU,
    var kj: PU,
    var km: PU,
    var kp: PU,
    var ks: PU,
    var ks1: PU,
    var tb: Seconds,
    var tc: Seconds,
    var thetap: AngleDegrees,
    var tm: Seconds,
    var vbmax: PU,
    var vgmax: PU,
    var vimax: PU,
    var vimin: PU,
    var vrmax: PU,
    var vrmin: PU,
    var xl: PU
)

data class DeleteExcST3ACommand(@TargetAggregateIdentifier  var excST3AId: UUID? = null)

// single association commands
data class AssignEfdmaxToExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID, val assignment: PU )
data class UnAssignEfdmaxFromExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID )
data class AssignKcToExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID, val assignment: PU )
data class UnAssignKcFromExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID )
data class AssignKgToExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID, val assignment: PU )
data class UnAssignKgFromExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID )
data class AssignKiToExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID, val assignment: PU )
data class UnAssignKiFromExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID )
data class AssignKjToExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID, val assignment: PU )
data class UnAssignKjFromExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID )
data class AssignKmToExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID, val assignment: PU )
data class UnAssignKmFromExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID )
data class AssignKpToExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID, val assignment: PU )
data class UnAssignKpFromExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID )
data class AssignKsToExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID, val assignment: PU )
data class UnAssignKsFromExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID )
data class AssignKs1ToExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID, val assignment: PU )
data class UnAssignKs1FromExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID )
data class AssignTbToExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID, val assignment: Seconds )
data class UnAssignTbFromExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID )
data class AssignTcToExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID, val assignment: Seconds )
data class UnAssignTcFromExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID )
data class AssignThetapToExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID, val assignment: AngleDegrees )
data class UnAssignThetapFromExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID )
data class AssignTmToExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID, val assignment: Seconds )
data class UnAssignTmFromExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID )
data class AssignVbmaxToExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID, val assignment: PU )
data class UnAssignVbmaxFromExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID )
data class AssignVgmaxToExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID, val assignment: PU )
data class UnAssignVgmaxFromExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID )
data class AssignVimaxToExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID, val assignment: PU )
data class UnAssignVimaxFromExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID )
data class AssignViminToExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID, val assignment: PU )
data class UnAssignViminFromExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID )
data class AssignVrmaxToExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID )
data class AssignVrminToExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID, val assignment: PU )
data class UnAssignVrminFromExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID )
data class AssignXlToExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID, val assignment: PU )
data class UnAssignXlFromExcST3ACommand(@TargetAggregateIdentifier  val excST3AId: UUID )

// multiple association commands


// ExcST4B Commands
data class CreateExcST4BCommand(
    @TargetAggregateIdentifier  var excST4BId: UUID? = null
)

data class UpdateExcST4BCommand(
    @TargetAggregateIdentifier var excST4BId: UUID? = null,
    var kc: PU,
    var kg: PU,
    var ki: PU,
    var kim: PU,
    var kir: PU,
    var kp: PU,
    var kpm: PU,
    var kpr: PU,
    var lvgate: BooleanProxy,
    var ta: Seconds,
    var thetap: AngleDegrees,
    var uel: BooleanProxy,
    var vbmax: PU,
    var vgmax: PU,
    var vmmax: PU,
    var vmmin: PU,
    var vrmax: PU,
    var vrmin: PU,
    var xl: PU
)

data class DeleteExcST4BCommand(@TargetAggregateIdentifier  var excST4BId: UUID? = null)

// single association commands
data class AssignKcToExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID, val assignment: PU )
data class UnAssignKcFromExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID )
data class AssignKgToExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID, val assignment: PU )
data class UnAssignKgFromExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID )
data class AssignKiToExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID, val assignment: PU )
data class UnAssignKiFromExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID )
data class AssignKimToExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID, val assignment: PU )
data class UnAssignKimFromExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID )
data class AssignKirToExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID, val assignment: PU )
data class UnAssignKirFromExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID )
data class AssignKpToExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID, val assignment: PU )
data class UnAssignKpFromExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID )
data class AssignKpmToExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID, val assignment: PU )
data class UnAssignKpmFromExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID )
data class AssignKprToExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID, val assignment: PU )
data class UnAssignKprFromExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID )
data class AssignLvgateToExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID, val assignment: BooleanProxy )
data class UnAssignLvgateFromExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID )
data class AssignTaToExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID, val assignment: Seconds )
data class UnAssignTaFromExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID )
data class AssignThetapToExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID, val assignment: AngleDegrees )
data class UnAssignThetapFromExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID )
data class AssignUelToExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID, val assignment: BooleanProxy )
data class UnAssignUelFromExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID )
data class AssignVbmaxToExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID, val assignment: PU )
data class UnAssignVbmaxFromExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID )
data class AssignVgmaxToExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID, val assignment: PU )
data class UnAssignVgmaxFromExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID )
data class AssignVmmaxToExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID, val assignment: PU )
data class UnAssignVmmaxFromExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID )
data class AssignVmminToExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID, val assignment: PU )
data class UnAssignVmminFromExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID )
data class AssignVrmaxToExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID )
data class AssignVrminToExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID, val assignment: PU )
data class UnAssignVrminFromExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID )
data class AssignXlToExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID, val assignment: PU )
data class UnAssignXlFromExcST4BCommand(@TargetAggregateIdentifier  val excST4BId: UUID )

// multiple association commands


// ExcST6B Commands
data class CreateExcST6BCommand(
    @TargetAggregateIdentifier var excST6BId: UUID? = null,
    @Enumerated(EnumType.STRING) var oelin: ExcST6BOELselectorKind
)

data class UpdateExcST6BCommand(
    @TargetAggregateIdentifier var excST6BId: UUID? = null,
    var ilr: PU,
    var k1: BooleanProxy,
    var kcl: PU,
    var kff: PU,
    var kg: PU,
    var kia: PU,
    var klr: PU,
    var km: PU,
    var kpa: PU,
    var kvd: PU,
    @Enumerated(EnumType.STRING) var oelin: ExcST6BOELselectorKind,
    var tg: Seconds,
    var ts: Seconds,
    var tvd: Seconds,
    var vamax: PU,
    var vamin: PU,
    var vilim: BooleanProxy,
    var vimax: PU,
    var vimin: PU,
    var vmult: BooleanProxy,
    var vrmax: PU,
    var vrmin: PU,
    var xc: PU
)

data class DeleteExcST6BCommand(@TargetAggregateIdentifier  var excST6BId: UUID? = null)

// single association commands
data class AssignIlrToExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID, val assignment: PU )
data class UnAssignIlrFromExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID )
data class AssignK1ToExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID, val assignment: BooleanProxy )
data class UnAssignK1FromExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID )
data class AssignKclToExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID, val assignment: PU )
data class UnAssignKclFromExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID )
data class AssignKffToExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID, val assignment: PU )
data class UnAssignKffFromExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID )
data class AssignKgToExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID, val assignment: PU )
data class UnAssignKgFromExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID )
data class AssignKiaToExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID, val assignment: PU )
data class UnAssignKiaFromExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID )
data class AssignKlrToExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID, val assignment: PU )
data class UnAssignKlrFromExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID )
data class AssignKmToExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID, val assignment: PU )
data class UnAssignKmFromExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID )
data class AssignKpaToExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID, val assignment: PU )
data class UnAssignKpaFromExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID )
data class AssignKvdToExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID, val assignment: PU )
data class UnAssignKvdFromExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID )
data class AssignTgToExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID, val assignment: Seconds )
data class UnAssignTgFromExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID )
data class AssignTsToExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID, val assignment: Seconds )
data class UnAssignTsFromExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID )
data class AssignTvdToExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID, val assignment: Seconds )
data class UnAssignTvdFromExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID )
data class AssignVamaxToExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID, val assignment: PU )
data class UnAssignVamaxFromExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID )
data class AssignVaminToExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID, val assignment: PU )
data class UnAssignVaminFromExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID )
data class AssignVilimToExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID, val assignment: BooleanProxy )
data class UnAssignVilimFromExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID )
data class AssignVimaxToExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID, val assignment: PU )
data class UnAssignVimaxFromExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID )
data class AssignViminToExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID, val assignment: PU )
data class UnAssignViminFromExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID )
data class AssignVmultToExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID, val assignment: BooleanProxy )
data class UnAssignVmultFromExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID )
data class AssignVrmaxToExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID )
data class AssignVrminToExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID, val assignment: PU )
data class UnAssignVrminFromExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID )
data class AssignXcToExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID, val assignment: PU )
data class UnAssignXcFromExcST6BCommand(@TargetAggregateIdentifier  val excST6BId: UUID )

// multiple association commands


// ExcST7B Commands
data class CreateExcST7BCommand(
    @TargetAggregateIdentifier var excST7BId: UUID? = null,
    @Enumerated(EnumType.STRING) var oelin: ExcST7BOELselectorKind,
    @Enumerated(EnumType.STRING) var uelin: ExcST7BUELselectorKind
)

data class UpdateExcST7BCommand(
    @TargetAggregateIdentifier var excST7BId: UUID? = null,
    var kh: PU,
    var kia: PU,
    var kl: PU,
    var kpa: PU,
    @Enumerated(EnumType.STRING) var oelin: ExcST7BOELselectorKind,
    var tb: Seconds,
    var tc: Seconds,
    var tf: Seconds,
    var tg: Seconds,
    var tia: Seconds,
    var ts: Seconds,
    @Enumerated(EnumType.STRING) var uelin: ExcST7BUELselectorKind,
    var vmax: PU,
    var vmin: PU,
    var vrmax: PU,
    var vrmin: PU
)

data class DeleteExcST7BCommand(@TargetAggregateIdentifier  var excST7BId: UUID? = null)

// single association commands
data class AssignKhToExcST7BCommand(@TargetAggregateIdentifier  val excST7BId: UUID, val assignment: PU )
data class UnAssignKhFromExcST7BCommand(@TargetAggregateIdentifier  val excST7BId: UUID )
data class AssignKiaToExcST7BCommand(@TargetAggregateIdentifier  val excST7BId: UUID, val assignment: PU )
data class UnAssignKiaFromExcST7BCommand(@TargetAggregateIdentifier  val excST7BId: UUID )
data class AssignKlToExcST7BCommand(@TargetAggregateIdentifier  val excST7BId: UUID, val assignment: PU )
data class UnAssignKlFromExcST7BCommand(@TargetAggregateIdentifier  val excST7BId: UUID )
data class AssignKpaToExcST7BCommand(@TargetAggregateIdentifier  val excST7BId: UUID, val assignment: PU )
data class UnAssignKpaFromExcST7BCommand(@TargetAggregateIdentifier  val excST7BId: UUID )
data class AssignTbToExcST7BCommand(@TargetAggregateIdentifier  val excST7BId: UUID, val assignment: Seconds )
data class UnAssignTbFromExcST7BCommand(@TargetAggregateIdentifier  val excST7BId: UUID )
data class AssignTcToExcST7BCommand(@TargetAggregateIdentifier  val excST7BId: UUID, val assignment: Seconds )
data class UnAssignTcFromExcST7BCommand(@TargetAggregateIdentifier  val excST7BId: UUID )
data class AssignTfToExcST7BCommand(@TargetAggregateIdentifier  val excST7BId: UUID, val assignment: Seconds )
data class UnAssignTfFromExcST7BCommand(@TargetAggregateIdentifier  val excST7BId: UUID )
data class AssignTgToExcST7BCommand(@TargetAggregateIdentifier  val excST7BId: UUID, val assignment: Seconds )
data class UnAssignTgFromExcST7BCommand(@TargetAggregateIdentifier  val excST7BId: UUID )
data class AssignTiaToExcST7BCommand(@TargetAggregateIdentifier  val excST7BId: UUID, val assignment: Seconds )
data class UnAssignTiaFromExcST7BCommand(@TargetAggregateIdentifier  val excST7BId: UUID )
data class AssignTsToExcST7BCommand(@TargetAggregateIdentifier  val excST7BId: UUID, val assignment: Seconds )
data class UnAssignTsFromExcST7BCommand(@TargetAggregateIdentifier  val excST7BId: UUID )
data class AssignVmaxToExcST7BCommand(@TargetAggregateIdentifier  val excST7BId: UUID, val assignment: PU )
data class UnAssignVmaxFromExcST7BCommand(@TargetAggregateIdentifier  val excST7BId: UUID )
data class AssignVminToExcST7BCommand(@TargetAggregateIdentifier  val excST7BId: UUID, val assignment: PU )
data class UnAssignVminFromExcST7BCommand(@TargetAggregateIdentifier  val excST7BId: UUID )
data class AssignVrmaxToExcST7BCommand(@TargetAggregateIdentifier  val excST7BId: UUID, val assignment: PU )
data class UnAssignVrmaxFromExcST7BCommand(@TargetAggregateIdentifier  val excST7BId: UUID )
data class AssignVrminToExcST7BCommand(@TargetAggregateIdentifier  val excST7BId: UUID, val assignment: PU )
data class UnAssignVrminFromExcST7BCommand(@TargetAggregateIdentifier  val excST7BId: UUID )

// multiple association commands


// ExcitationSystemDynamics Commands
data class CreateExcitationSystemDynamicsCommand(
    @TargetAggregateIdentifier  var excitationSystemDynamicsId: UUID? = null
)

data class UpdateExcitationSystemDynamicsCommand(
    @TargetAggregateIdentifier  var excitationSystemDynamicsId: UUID? = null
)

data class DeleteExcitationSystemDynamicsCommand(@TargetAggregateIdentifier  var excitationSystemDynamicsId: UUID? = null)

// single association commands

// multiple association commands


// ExcitationSystemUserDefined Commands
data class CreateExcitationSystemUserDefinedCommand(
    @TargetAggregateIdentifier  var excitationSystemUserDefinedId: UUID? = null
)

data class UpdateExcitationSystemUserDefinedCommand(
    @TargetAggregateIdentifier var excitationSystemUserDefinedId: UUID? = null,
    var proprietary: BooleanProxy
)

data class DeleteExcitationSystemUserDefinedCommand(@TargetAggregateIdentifier  var excitationSystemUserDefinedId: UUID? = null)

// single association commands
data class AssignProprietaryToExcitationSystemUserDefinedCommand(@TargetAggregateIdentifier  val excitationSystemUserDefinedId: UUID, val assignment: BooleanProxy )
data class UnAssignProprietaryFromExcitationSystemUserDefinedCommand(@TargetAggregateIdentifier  val excitationSystemUserDefinedId: UUID )

// multiple association commands


// ExtensionVersion Commands
data class CreateExtensionVersionCommand(
    @TargetAggregateIdentifier  var extensionVersionId: UUID? = null
)

data class UpdateExtensionVersionCommand(
    @TargetAggregateIdentifier var extensionVersionId: UUID? = null,
    var date: DateProxy,
    var namespaceURI: StringProxy
)

data class DeleteExtensionVersionCommand(@TargetAggregateIdentifier  var extensionVersionId: UUID? = null)

// single association commands
data class AssignDateToExtensionVersionCommand(@TargetAggregateIdentifier  val extensionVersionId: UUID, val assignment: DateProxy )
data class UnAssignDateFromExtensionVersionCommand(@TargetAggregateIdentifier  val extensionVersionId: UUID )
data class AssignNamespaceURIToExtensionVersionCommand(@TargetAggregateIdentifier  val extensionVersionId: UUID, val assignment: StringProxy )
data class UnAssignNamespaceURIFromExtensionVersionCommand(@TargetAggregateIdentifier  val extensionVersionId: UUID )

// multiple association commands


// ExternalNetworkInjection Commands
data class CreateExternalNetworkInjectionCommand(
    @TargetAggregateIdentifier  var externalNetworkInjectionId: UUID? = null
)

data class UpdateExternalNetworkInjectionCommand(
    @TargetAggregateIdentifier var externalNetworkInjectionId: UUID? = null,
    var governorSCD: ActivePowerPerFrequency,
    var ikSecond: BooleanProxy,
    var maxInitialSymShCCurrent: CurrentFlow,
    var maxP: ActivePower,
    var maxQ: ReactivePower,
    var maxR0ToX0Ratio: Simple_Float,
    var maxR1ToX1Ratio: Simple_Float,
    var maxZ0ToZ1Ratio: Simple_Float,
    var minInitialSymShCCurrent: CurrentFlow,
    var minP: ActivePower,
    var minQ: ReactivePower,
    var minR0ToX0Ratio: Simple_Float,
    var minR1ToX1Ratio: Simple_Float,
    var minZ0ToZ1Ratio: Simple_Float,
    var voltageFactor: PU
)

data class DeleteExternalNetworkInjectionCommand(@TargetAggregateIdentifier  var externalNetworkInjectionId: UUID? = null)

// single association commands
data class AssignGovernorSCDToExternalNetworkInjectionCommand(@TargetAggregateIdentifier  val externalNetworkInjectionId: UUID, val assignment: ActivePowerPerFrequency )
data class UnAssignGovernorSCDFromExternalNetworkInjectionCommand(@TargetAggregateIdentifier  val externalNetworkInjectionId: UUID )
data class AssignIkSecondToExternalNetworkInjectionCommand(@TargetAggregateIdentifier  val externalNetworkInjectionId: UUID, val assignment: BooleanProxy )
data class UnAssignIkSecondFromExternalNetworkInjectionCommand(@TargetAggregateIdentifier  val externalNetworkInjectionId: UUID )
data class AssignMaxInitialSymShCCurrentToExternalNetworkInjectionCommand(@TargetAggregateIdentifier  val externalNetworkInjectionId: UUID, val assignment: CurrentFlow )
data class UnAssignMaxInitialSymShCCurrentFromExternalNetworkInjectionCommand(@TargetAggregateIdentifier  val externalNetworkInjectionId: UUID )
data class AssignMaxPToExternalNetworkInjectionCommand(@TargetAggregateIdentifier  val externalNetworkInjectionId: UUID, val assignment: ActivePower )
data class UnAssignMaxPFromExternalNetworkInjectionCommand(@TargetAggregateIdentifier  val externalNetworkInjectionId: UUID )
data class AssignMaxQToExternalNetworkInjectionCommand(@TargetAggregateIdentifier  val externalNetworkInjectionId: UUID, val assignment: ReactivePower )
data class UnAssignMaxQFromExternalNetworkInjectionCommand(@TargetAggregateIdentifier  val externalNetworkInjectionId: UUID )
data class AssignMaxR0ToX0RatioToExternalNetworkInjectionCommand(@TargetAggregateIdentifier  val externalNetworkInjectionId: UUID, val assignment: Simple_Float )
data class UnAssignMaxR0ToX0RatioFromExternalNetworkInjectionCommand(@TargetAggregateIdentifier  val externalNetworkInjectionId: UUID )
data class AssignMaxR1ToX1RatioToExternalNetworkInjectionCommand(@TargetAggregateIdentifier  val externalNetworkInjectionId: UUID, val assignment: Simple_Float )
data class UnAssignMaxR1ToX1RatioFromExternalNetworkInjectionCommand(@TargetAggregateIdentifier  val externalNetworkInjectionId: UUID )
data class AssignMaxZ0ToZ1RatioToExternalNetworkInjectionCommand(@TargetAggregateIdentifier  val externalNetworkInjectionId: UUID, val assignment: Simple_Float )
data class UnAssignMaxZ0ToZ1RatioFromExternalNetworkInjectionCommand(@TargetAggregateIdentifier  val externalNetworkInjectionId: UUID )
data class AssignMinInitialSymShCCurrentToExternalNetworkInjectionCommand(@TargetAggregateIdentifier  val externalNetworkInjectionId: UUID, val assignment: CurrentFlow )
data class UnAssignMinInitialSymShCCurrentFromExternalNetworkInjectionCommand(@TargetAggregateIdentifier  val externalNetworkInjectionId: UUID )
data class AssignMinPToExternalNetworkInjectionCommand(@TargetAggregateIdentifier  val externalNetworkInjectionId: UUID, val assignment: ActivePower )
data class UnAssignMinPFromExternalNetworkInjectionCommand(@TargetAggregateIdentifier  val externalNetworkInjectionId: UUID )
data class AssignMinQToExternalNetworkInjectionCommand(@TargetAggregateIdentifier  val externalNetworkInjectionId: UUID, val assignment: ReactivePower )
data class UnAssignMinQFromExternalNetworkInjectionCommand(@TargetAggregateIdentifier  val externalNetworkInjectionId: UUID )
data class AssignMinR0ToX0RatioToExternalNetworkInjectionCommand(@TargetAggregateIdentifier  val externalNetworkInjectionId: UUID, val assignment: Simple_Float )
data class UnAssignMinR0ToX0RatioFromExternalNetworkInjectionCommand(@TargetAggregateIdentifier  val externalNetworkInjectionId: UUID )
data class AssignMinR1ToX1RatioToExternalNetworkInjectionCommand(@TargetAggregateIdentifier  val externalNetworkInjectionId: UUID, val assignment: Simple_Float )
data class UnAssignMinR1ToX1RatioFromExternalNetworkInjectionCommand(@TargetAggregateIdentifier  val externalNetworkInjectionId: UUID )
data class AssignMinZ0ToZ1RatioToExternalNetworkInjectionCommand(@TargetAggregateIdentifier  val externalNetworkInjectionId: UUID, val assignment: Simple_Float )
data class UnAssignMinZ0ToZ1RatioFromExternalNetworkInjectionCommand(@TargetAggregateIdentifier  val externalNetworkInjectionId: UUID )
data class AssignVoltageFactorToExternalNetworkInjectionCommand(@TargetAggregateIdentifier  val externalNetworkInjectionId: UUID, val assignment: PU )
data class UnAssignVoltageFactorFromExternalNetworkInjectionCommand(@TargetAggregateIdentifier  val externalNetworkInjectionId: UUID )

// multiple association commands


// FloatProxy Commands
data class CreateFloatProxyCommand(
    @TargetAggregateIdentifier  var floatProxyId: UUID? = null
)

data class UpdateFloatProxyCommand(
    @TargetAggregateIdentifier  var floatProxyId: UUID? = null
)

data class DeleteFloatProxyCommand(@TargetAggregateIdentifier  var floatProxyId: UUID? = null)

// single association commands

// multiple association commands


// FossilFuel Commands
data class CreateFossilFuelCommand(
    @TargetAggregateIdentifier var fossilFuelId: UUID? = null,
    @Enumerated(EnumType.STRING) var fossilFuelType: FuelType
)

data class UpdateFossilFuelCommand(
    @TargetAggregateIdentifier var fossilFuelId: UUID? = null,
    @Enumerated(EnumType.STRING) var fossilFuelType: FuelType
)

data class DeleteFossilFuelCommand(@TargetAggregateIdentifier  var fossilFuelId: UUID? = null)

// single association commands

// multiple association commands


// Frequency Commands
data class CreateFrequencyCommand(
    @TargetAggregateIdentifier var frequencyId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol
)

data class UpdateFrequencyCommand(
    @TargetAggregateIdentifier var frequencyId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol,
    var value: FloatProxy
)

data class DeleteFrequencyCommand(@TargetAggregateIdentifier  var frequencyId: UUID? = null)

// single association commands
data class AssignValueToFrequencyCommand(@TargetAggregateIdentifier  val frequencyId: UUID, val assignment: FloatProxy )
data class UnAssignValueFromFrequencyCommand(@TargetAggregateIdentifier  val frequencyId: UUID )

// multiple association commands


// GenICompensationForGenJ Commands
data class CreateGenICompensationForGenJCommand(
    @TargetAggregateIdentifier  var genICompensationForGenJId: UUID? = null
)

data class UpdateGenICompensationForGenJCommand(
    @TargetAggregateIdentifier var genICompensationForGenJId: UUID? = null,
    var rcij: PU,
    var xcij: PU
)

data class DeleteGenICompensationForGenJCommand(@TargetAggregateIdentifier  var genICompensationForGenJId: UUID? = null)

// single association commands
data class AssignRcijToGenICompensationForGenJCommand(@TargetAggregateIdentifier  val genICompensationForGenJId: UUID, val assignment: PU )
data class UnAssignRcijFromGenICompensationForGenJCommand(@TargetAggregateIdentifier  val genICompensationForGenJId: UUID )
data class AssignXcijToGenICompensationForGenJCommand(@TargetAggregateIdentifier  val genICompensationForGenJId: UUID, val assignment: PU )
data class UnAssignXcijFromGenICompensationForGenJCommand(@TargetAggregateIdentifier  val genICompensationForGenJId: UUID )

// multiple association commands


// GeneratingUnit Commands
data class CreateGeneratingUnitCommand(
    @TargetAggregateIdentifier var generatingUnitId: UUID? = null,
    @Enumerated(EnumType.STRING) var genControlSource: GeneratorControlSource
)

data class UpdateGeneratingUnitCommand(
    @TargetAggregateIdentifier var generatingUnitId: UUID? = null,
    @Enumerated(EnumType.STRING) var genControlSource: GeneratorControlSource,
    var governorSCD: PerCent,
    var initialP: ActivePower,
    var longPF: Simple_Float,
    var maximumAllowableSpinningReserve: ActivePower,
    var maxOperatingP: ActivePower,
    var minOperatingP: ActivePower,
    var nominalP: ActivePower,
    var ratedGrossMaxP: ActivePower,
    var ratedGrossMinP: ActivePower,
    var ratedNetMaxP: ActivePower,
    var shortPF: Simple_Float,
    var startupCost: Money,
    var totalEfficiency: PerCent,
    var variableCost: Money
)

data class DeleteGeneratingUnitCommand(@TargetAggregateIdentifier  var generatingUnitId: UUID? = null)

// single association commands
data class AssignGovernorSCDToGeneratingUnitCommand(@TargetAggregateIdentifier  val generatingUnitId: UUID, val assignment: PerCent )
data class UnAssignGovernorSCDFromGeneratingUnitCommand(@TargetAggregateIdentifier  val generatingUnitId: UUID )
data class AssignInitialPToGeneratingUnitCommand(@TargetAggregateIdentifier  val generatingUnitId: UUID, val assignment: ActivePower )
data class UnAssignInitialPFromGeneratingUnitCommand(@TargetAggregateIdentifier  val generatingUnitId: UUID )
data class AssignLongPFToGeneratingUnitCommand(@TargetAggregateIdentifier  val generatingUnitId: UUID, val assignment: Simple_Float )
data class UnAssignLongPFFromGeneratingUnitCommand(@TargetAggregateIdentifier  val generatingUnitId: UUID )
data class AssignMaximumAllowableSpinningReserveToGeneratingUnitCommand(@TargetAggregateIdentifier  val generatingUnitId: UUID, val assignment: ActivePower )
data class UnAssignMaximumAllowableSpinningReserveFromGeneratingUnitCommand(@TargetAggregateIdentifier  val generatingUnitId: UUID )
data class AssignMaxOperatingPToGeneratingUnitCommand(@TargetAggregateIdentifier  val generatingUnitId: UUID, val assignment: ActivePower )
data class UnAssignMaxOperatingPFromGeneratingUnitCommand(@TargetAggregateIdentifier  val generatingUnitId: UUID )
data class AssignMinOperatingPToGeneratingUnitCommand(@TargetAggregateIdentifier  val generatingUnitId: UUID, val assignment: ActivePower )
data class UnAssignMinOperatingPFromGeneratingUnitCommand(@TargetAggregateIdentifier  val generatingUnitId: UUID )
data class AssignNominalPToGeneratingUnitCommand(@TargetAggregateIdentifier  val generatingUnitId: UUID, val assignment: ActivePower )
data class UnAssignNominalPFromGeneratingUnitCommand(@TargetAggregateIdentifier  val generatingUnitId: UUID )
data class AssignRatedGrossMaxPToGeneratingUnitCommand(@TargetAggregateIdentifier  val generatingUnitId: UUID, val assignment: ActivePower )
data class UnAssignRatedGrossMaxPFromGeneratingUnitCommand(@TargetAggregateIdentifier  val generatingUnitId: UUID )
data class AssignRatedGrossMinPToGeneratingUnitCommand(@TargetAggregateIdentifier  val generatingUnitId: UUID, val assignment: ActivePower )
data class UnAssignRatedGrossMinPFromGeneratingUnitCommand(@TargetAggregateIdentifier  val generatingUnitId: UUID )
data class AssignRatedNetMaxPToGeneratingUnitCommand(@TargetAggregateIdentifier  val generatingUnitId: UUID, val assignment: ActivePower )
data class UnAssignRatedNetMaxPFromGeneratingUnitCommand(@TargetAggregateIdentifier  val generatingUnitId: UUID )
data class AssignShortPFToGeneratingUnitCommand(@TargetAggregateIdentifier  val generatingUnitId: UUID, val assignment: Simple_Float )
data class UnAssignShortPFFromGeneratingUnitCommand(@TargetAggregateIdentifier  val generatingUnitId: UUID )
data class AssignStartupCostToGeneratingUnitCommand(@TargetAggregateIdentifier  val generatingUnitId: UUID, val assignment: Money )
data class UnAssignStartupCostFromGeneratingUnitCommand(@TargetAggregateIdentifier  val generatingUnitId: UUID )
data class AssignTotalEfficiencyToGeneratingUnitCommand(@TargetAggregateIdentifier  val generatingUnitId: UUID, val assignment: PerCent )
data class UnAssignTotalEfficiencyFromGeneratingUnitCommand(@TargetAggregateIdentifier  val generatingUnitId: UUID )
data class AssignVariableCostToGeneratingUnitCommand(@TargetAggregateIdentifier  val generatingUnitId: UUID, val assignment: Money )
data class UnAssignVariableCostFromGeneratingUnitCommand(@TargetAggregateIdentifier  val generatingUnitId: UUID )

// multiple association commands


// GeographicalLocationVersion Commands
data class CreateGeographicalLocationVersionCommand(
    @TargetAggregateIdentifier  var geographicalLocationVersionId: UUID? = null
)

data class UpdateGeographicalLocationVersionCommand(
    @TargetAggregateIdentifier var geographicalLocationVersionId: UUID? = null,
    var baseUML: StringProxy,
    var baseURI: StringProxy,
    var date: DateProxy,
    var differenceModelURI: StringProxy,
    var entsoeUML: StringProxy,
    var entsoeURI: StringProxy,
    var modelDescriptionURI: StringProxy,
    var namespaceRDF: StringProxy,
    var namespaceUML: StringProxy,
    var shortName: StringProxy
)

data class DeleteGeographicalLocationVersionCommand(@TargetAggregateIdentifier  var geographicalLocationVersionId: UUID? = null)

// single association commands
data class AssignBaseUMLToGeographicalLocationVersionCommand(@TargetAggregateIdentifier  val geographicalLocationVersionId: UUID, val assignment: StringProxy )
data class UnAssignBaseUMLFromGeographicalLocationVersionCommand(@TargetAggregateIdentifier  val geographicalLocationVersionId: UUID )
data class AssignBaseURIToGeographicalLocationVersionCommand(@TargetAggregateIdentifier  val geographicalLocationVersionId: UUID, val assignment: StringProxy )
data class UnAssignBaseURIFromGeographicalLocationVersionCommand(@TargetAggregateIdentifier  val geographicalLocationVersionId: UUID )
data class AssignDateToGeographicalLocationVersionCommand(@TargetAggregateIdentifier  val geographicalLocationVersionId: UUID, val assignment: DateProxy )
data class UnAssignDateFromGeographicalLocationVersionCommand(@TargetAggregateIdentifier  val geographicalLocationVersionId: UUID )
data class AssignDifferenceModelURIToGeographicalLocationVersionCommand(@TargetAggregateIdentifier  val geographicalLocationVersionId: UUID, val assignment: StringProxy )
data class UnAssignDifferenceModelURIFromGeographicalLocationVersionCommand(@TargetAggregateIdentifier  val geographicalLocationVersionId: UUID )
data class AssignEntsoeUMLToGeographicalLocationVersionCommand(@TargetAggregateIdentifier  val geographicalLocationVersionId: UUID, val assignment: StringProxy )
data class UnAssignEntsoeUMLFromGeographicalLocationVersionCommand(@TargetAggregateIdentifier  val geographicalLocationVersionId: UUID )
data class AssignEntsoeURIToGeographicalLocationVersionCommand(@TargetAggregateIdentifier  val geographicalLocationVersionId: UUID, val assignment: StringProxy )
data class UnAssignEntsoeURIFromGeographicalLocationVersionCommand(@TargetAggregateIdentifier  val geographicalLocationVersionId: UUID )
data class AssignModelDescriptionURIToGeographicalLocationVersionCommand(@TargetAggregateIdentifier  val geographicalLocationVersionId: UUID, val assignment: StringProxy )
data class UnAssignModelDescriptionURIFromGeographicalLocationVersionCommand(@TargetAggregateIdentifier  val geographicalLocationVersionId: UUID )
data class AssignNamespaceRDFToGeographicalLocationVersionCommand(@TargetAggregateIdentifier  val geographicalLocationVersionId: UUID, val assignment: StringProxy )
data class UnAssignNamespaceRDFFromGeographicalLocationVersionCommand(@TargetAggregateIdentifier  val geographicalLocationVersionId: UUID )
data class AssignNamespaceUMLToGeographicalLocationVersionCommand(@TargetAggregateIdentifier  val geographicalLocationVersionId: UUID, val assignment: StringProxy )
data class UnAssignNamespaceUMLFromGeographicalLocationVersionCommand(@TargetAggregateIdentifier  val geographicalLocationVersionId: UUID )
data class AssignShortNameToGeographicalLocationVersionCommand(@TargetAggregateIdentifier  val geographicalLocationVersionId: UUID, val assignment: StringProxy )
data class UnAssignShortNameFromGeographicalLocationVersionCommand(@TargetAggregateIdentifier  val geographicalLocationVersionId: UUID )

// multiple association commands


// GeographicalRegion Commands
data class CreateGeographicalRegionCommand(
    @TargetAggregateIdentifier  var geographicalRegionId: UUID? = null
)

data class UpdateGeographicalRegionCommand(
    @TargetAggregateIdentifier  var geographicalRegionId: UUID? = null
)

data class DeleteGeographicalRegionCommand(@TargetAggregateIdentifier  var geographicalRegionId: UUID? = null)

// single association commands

// multiple association commands


// GovCT1 Commands
data class CreateGovCT1Command(
    @TargetAggregateIdentifier var govCT1Id: UUID? = null,
    @Enumerated(EnumType.STRING) var rselect: DroopSignalFeedbackKind
)

data class UpdateGovCT1Command(
    @TargetAggregateIdentifier var govCT1Id: UUID? = null,
    var aset: Simple_Float,
    var db: PU,
    var dm: PU,
    var ka: PU,
    var kdgov: PU,
    var kigov: PU,
    var kiload: PU,
    var kimw: PU,
    var kpgov: PU,
    var kpload: PU,
    var kturb: PU,
    var ldref: PU,
    var maxerr: PU,
    var minerr: PU,
    var mwbase: ActivePower,
    var r: PU,
    var rclose: Simple_Float,
    var rdown: PU,
    var ropen: Simple_Float,
    @Enumerated(EnumType.STRING) var rselect: DroopSignalFeedbackKind,
    var rup: PU,
    var ta: Seconds,
    var tact: Seconds,
    var tb: Seconds,
    var tc: Seconds,
    var tdgov: Seconds,
    var teng: Seconds,
    var tfload: Seconds,
    var tpelec: Seconds,
    var tsa: Seconds,
    var tsb: Seconds,
    var vmax: PU,
    var vmin: PU,
    var wfnl: PU,
    var wfspd: BooleanProxy
)

data class DeleteGovCT1Command(@TargetAggregateIdentifier  var govCT1Id: UUID? = null)

// single association commands
data class AssignAsetToGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID, val assignment: Simple_Float )
data class UnAssignAsetFromGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID )
data class AssignDbToGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID, val assignment: PU )
data class UnAssignDbFromGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID )
data class AssignDmToGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID, val assignment: PU )
data class UnAssignDmFromGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID )
data class AssignKaToGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID, val assignment: PU )
data class UnAssignKaFromGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID )
data class AssignKdgovToGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID, val assignment: PU )
data class UnAssignKdgovFromGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID )
data class AssignKigovToGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID, val assignment: PU )
data class UnAssignKigovFromGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID )
data class AssignKiloadToGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID, val assignment: PU )
data class UnAssignKiloadFromGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID )
data class AssignKimwToGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID, val assignment: PU )
data class UnAssignKimwFromGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID )
data class AssignKpgovToGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID, val assignment: PU )
data class UnAssignKpgovFromGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID )
data class AssignKploadToGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID, val assignment: PU )
data class UnAssignKploadFromGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID )
data class AssignKturbToGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID, val assignment: PU )
data class UnAssignKturbFromGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID )
data class AssignLdrefToGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID, val assignment: PU )
data class UnAssignLdrefFromGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID )
data class AssignMaxerrToGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID, val assignment: PU )
data class UnAssignMaxerrFromGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID )
data class AssignMinerrToGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID, val assignment: PU )
data class UnAssignMinerrFromGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID )
data class AssignMwbaseToGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID, val assignment: ActivePower )
data class UnAssignMwbaseFromGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID )
data class AssignRToGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID, val assignment: PU )
data class UnAssignRFromGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID )
data class AssignRcloseToGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID, val assignment: Simple_Float )
data class UnAssignRcloseFromGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID )
data class AssignRdownToGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID, val assignment: PU )
data class UnAssignRdownFromGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID )
data class AssignRopenToGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID, val assignment: Simple_Float )
data class UnAssignRopenFromGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID )
data class AssignRupToGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID, val assignment: PU )
data class UnAssignRupFromGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID )
data class AssignTaToGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID, val assignment: Seconds )
data class UnAssignTaFromGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID )
data class AssignTactToGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID, val assignment: Seconds )
data class UnAssignTactFromGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID )
data class AssignTbToGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID, val assignment: Seconds )
data class UnAssignTbFromGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID )
data class AssignTcToGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID, val assignment: Seconds )
data class UnAssignTcFromGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID )
data class AssignTdgovToGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID, val assignment: Seconds )
data class UnAssignTdgovFromGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID )
data class AssignTengToGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID, val assignment: Seconds )
data class UnAssignTengFromGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID )
data class AssignTfloadToGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID, val assignment: Seconds )
data class UnAssignTfloadFromGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID )
data class AssignTpelecToGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID, val assignment: Seconds )
data class UnAssignTpelecFromGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID )
data class AssignTsaToGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID, val assignment: Seconds )
data class UnAssignTsaFromGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID )
data class AssignTsbToGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID, val assignment: Seconds )
data class UnAssignTsbFromGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID )
data class AssignVmaxToGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID, val assignment: PU )
data class UnAssignVmaxFromGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID )
data class AssignVminToGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID, val assignment: PU )
data class UnAssignVminFromGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID )
data class AssignWfnlToGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID, val assignment: PU )
data class UnAssignWfnlFromGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID )
data class AssignWfspdToGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID, val assignment: BooleanProxy )
data class UnAssignWfspdFromGovCT1Command(@TargetAggregateIdentifier  val govCT1Id: UUID )

// multiple association commands


// GovCT2 Commands
data class CreateGovCT2Command(
    @TargetAggregateIdentifier var govCT2Id: UUID? = null,
    @Enumerated(EnumType.STRING) var rselect: DroopSignalFeedbackKind
)

data class UpdateGovCT2Command(
    @TargetAggregateIdentifier var govCT2Id: UUID? = null,
    var aset: Simple_Float,
    var db: PU,
    var dm: PU,
    var flim1: Frequency,
    var flim10: Frequency,
    var flim2: Frequency,
    var flim3: Frequency,
    var flim4: Frequency,
    var flim5: Frequency,
    var flim6: Frequency,
    var flim7: Frequency,
    var flim8: Frequency,
    var flim9: Frequency,
    var ka: PU,
    var kdgov: PU,
    var kigov: PU,
    var kiload: PU,
    var kimw: PU,
    var kpgov: PU,
    var kpload: PU,
    var kturb: PU,
    var ldref: PU,
    var maxerr: PU,
    var minerr: PU,
    var mwbase: ActivePower,
    var plim1: PU,
    var plim10: PU,
    var plim2: PU,
    var plim3: PU,
    var plim4: PU,
    var plim5: PU,
    var plim6: PU,
    var plim7: PU,
    var plim8: PU,
    var plim9: PU,
    var prate: PU,
    var r: PU,
    var rclose: Simple_Float,
    var rdown: PU,
    var ropen: Simple_Float,
    @Enumerated(EnumType.STRING) var rselect: DroopSignalFeedbackKind,
    var rup: PU,
    var ta: Seconds,
    var tact: Seconds,
    var tb: Seconds,
    var tc: Seconds,
    var tdgov: Seconds,
    var teng: Seconds,
    var tfload: Seconds,
    var tpelec: Seconds,
    var tsa: Seconds,
    var tsb: Seconds,
    var vmax: PU,
    var vmin: PU,
    var wfnl: PU,
    var wfspd: BooleanProxy
)

data class DeleteGovCT2Command(@TargetAggregateIdentifier  var govCT2Id: UUID? = null)

// single association commands
data class AssignAsetToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: Simple_Float )
data class UnAssignAsetFromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignDbToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: PU )
data class UnAssignDbFromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignDmToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: PU )
data class UnAssignDmFromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignFlim1ToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: Frequency )
data class UnAssignFlim1FromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignFlim10ToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: Frequency )
data class UnAssignFlim10FromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignFlim2ToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: Frequency )
data class UnAssignFlim2FromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignFlim3ToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: Frequency )
data class UnAssignFlim3FromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignFlim4ToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: Frequency )
data class UnAssignFlim4FromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignFlim5ToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: Frequency )
data class UnAssignFlim5FromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignFlim6ToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: Frequency )
data class UnAssignFlim6FromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignFlim7ToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: Frequency )
data class UnAssignFlim7FromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignFlim8ToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: Frequency )
data class UnAssignFlim8FromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignFlim9ToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: Frequency )
data class UnAssignFlim9FromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignKaToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: PU )
data class UnAssignKaFromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignKdgovToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: PU )
data class UnAssignKdgovFromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignKigovToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: PU )
data class UnAssignKigovFromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignKiloadToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: PU )
data class UnAssignKiloadFromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignKimwToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: PU )
data class UnAssignKimwFromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignKpgovToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: PU )
data class UnAssignKpgovFromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignKploadToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: PU )
data class UnAssignKploadFromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignKturbToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: PU )
data class UnAssignKturbFromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignLdrefToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: PU )
data class UnAssignLdrefFromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignMaxerrToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: PU )
data class UnAssignMaxerrFromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignMinerrToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: PU )
data class UnAssignMinerrFromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignMwbaseToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: ActivePower )
data class UnAssignMwbaseFromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignPlim1ToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: PU )
data class UnAssignPlim1FromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignPlim10ToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: PU )
data class UnAssignPlim10FromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignPlim2ToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: PU )
data class UnAssignPlim2FromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignPlim3ToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: PU )
data class UnAssignPlim3FromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignPlim4ToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: PU )
data class UnAssignPlim4FromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignPlim5ToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: PU )
data class UnAssignPlim5FromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignPlim6ToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: PU )
data class UnAssignPlim6FromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignPlim7ToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: PU )
data class UnAssignPlim7FromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignPlim8ToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: PU )
data class UnAssignPlim8FromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignPlim9ToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: PU )
data class UnAssignPlim9FromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignPrateToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: PU )
data class UnAssignPrateFromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignRToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: PU )
data class UnAssignRFromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignRcloseToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: Simple_Float )
data class UnAssignRcloseFromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignRdownToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: PU )
data class UnAssignRdownFromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignRopenToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: Simple_Float )
data class UnAssignRopenFromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignRupToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: PU )
data class UnAssignRupFromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignTaToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: Seconds )
data class UnAssignTaFromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignTactToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: Seconds )
data class UnAssignTactFromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignTbToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: Seconds )
data class UnAssignTbFromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignTcToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: Seconds )
data class UnAssignTcFromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignTdgovToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: Seconds )
data class UnAssignTdgovFromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignTengToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: Seconds )
data class UnAssignTengFromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignTfloadToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: Seconds )
data class UnAssignTfloadFromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignTpelecToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: Seconds )
data class UnAssignTpelecFromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignTsaToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: Seconds )
data class UnAssignTsaFromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignTsbToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: Seconds )
data class UnAssignTsbFromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignVmaxToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: PU )
data class UnAssignVmaxFromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignVminToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: PU )
data class UnAssignVminFromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignWfnlToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: PU )
data class UnAssignWfnlFromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )
data class AssignWfspdToGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID, val assignment: BooleanProxy )
data class UnAssignWfspdFromGovCT2Command(@TargetAggregateIdentifier  val govCT2Id: UUID )

// multiple association commands


// GovGAST Commands
data class CreateGovGASTCommand(
    @TargetAggregateIdentifier  var govGASTId: UUID? = null
)

data class UpdateGovGASTCommand(
    @TargetAggregateIdentifier var govGASTId: UUID? = null,
    var at: PU,
    var dturb: PU,
    var kt: PU,
    var mwbase: ActivePower,
    var r: PU,
    var t1: Seconds,
    var t2: Seconds,
    var t3: Seconds,
    var vmax: PU,
    var vmin: PU
)

data class DeleteGovGASTCommand(@TargetAggregateIdentifier  var govGASTId: UUID? = null)

// single association commands
data class AssignAtToGovGASTCommand(@TargetAggregateIdentifier  val govGASTId: UUID, val assignment: PU )
data class UnAssignAtFromGovGASTCommand(@TargetAggregateIdentifier  val govGASTId: UUID )
data class AssignDturbToGovGASTCommand(@TargetAggregateIdentifier  val govGASTId: UUID, val assignment: PU )
data class UnAssignDturbFromGovGASTCommand(@TargetAggregateIdentifier  val govGASTId: UUID )
data class AssignKtToGovGASTCommand(@TargetAggregateIdentifier  val govGASTId: UUID, val assignment: PU )
data class UnAssignKtFromGovGASTCommand(@TargetAggregateIdentifier  val govGASTId: UUID )
data class AssignMwbaseToGovGASTCommand(@TargetAggregateIdentifier  val govGASTId: UUID, val assignment: ActivePower )
data class UnAssignMwbaseFromGovGASTCommand(@TargetAggregateIdentifier  val govGASTId: UUID )
data class AssignRToGovGASTCommand(@TargetAggregateIdentifier  val govGASTId: UUID, val assignment: PU )
data class UnAssignRFromGovGASTCommand(@TargetAggregateIdentifier  val govGASTId: UUID )
data class AssignT1ToGovGASTCommand(@TargetAggregateIdentifier  val govGASTId: UUID, val assignment: Seconds )
data class UnAssignT1FromGovGASTCommand(@TargetAggregateIdentifier  val govGASTId: UUID )
data class AssignT2ToGovGASTCommand(@TargetAggregateIdentifier  val govGASTId: UUID, val assignment: Seconds )
data class UnAssignT2FromGovGASTCommand(@TargetAggregateIdentifier  val govGASTId: UUID )
data class AssignT3ToGovGASTCommand(@TargetAggregateIdentifier  val govGASTId: UUID, val assignment: Seconds )
data class UnAssignT3FromGovGASTCommand(@TargetAggregateIdentifier  val govGASTId: UUID )
data class AssignVmaxToGovGASTCommand(@TargetAggregateIdentifier  val govGASTId: UUID, val assignment: PU )
data class UnAssignVmaxFromGovGASTCommand(@TargetAggregateIdentifier  val govGASTId: UUID )
data class AssignVminToGovGASTCommand(@TargetAggregateIdentifier  val govGASTId: UUID, val assignment: PU )
data class UnAssignVminFromGovGASTCommand(@TargetAggregateIdentifier  val govGASTId: UUID )

// multiple association commands


// GovGAST1 Commands
data class CreateGovGAST1Command(
    @TargetAggregateIdentifier  var govGAST1Id: UUID? = null
)

data class UpdateGovGAST1Command(
    @TargetAggregateIdentifier var govGAST1Id: UUID? = null,
    var a: Simple_Float,
    var b: Simple_Float,
    var db1: Frequency,
    var db2: ActivePower,
    var eps: Frequency,
    var fidle: PU,
    var gv1: PU,
    var gv2: PU,
    var gv3: PU,
    var gv4: PU,
    var gv5: PU,
    var gv6: PU,
    var ka: PU,
    var kt: PU,
    var lmax: PU,
    var loadinc: PU,
    var ltrate: Simple_Float,
    var mwbase: ActivePower,
    var pgv1: PU,
    var pgv2: PU,
    var pgv3: PU,
    var pgv4: PU,
    var pgv5: PU,
    var pgv6: PU,
    var r: PU,
    var rmax: Simple_Float,
    var t1: Seconds,
    var t2: Seconds,
    var t3: Seconds,
    var t4: Seconds,
    var t5: Seconds,
    var tltr: Seconds,
    var vmax: PU,
    var vmin: PU
)

data class DeleteGovGAST1Command(@TargetAggregateIdentifier  var govGAST1Id: UUID? = null)

// single association commands
data class AssignAToGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID, val assignment: Simple_Float )
data class UnAssignAFromGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID )
data class AssignBToGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID, val assignment: Simple_Float )
data class UnAssignBFromGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID )
data class AssignDb1ToGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID, val assignment: Frequency )
data class UnAssignDb1FromGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID )
data class AssignDb2ToGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID, val assignment: ActivePower )
data class UnAssignDb2FromGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID )
data class AssignEpsToGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID, val assignment: Frequency )
data class UnAssignEpsFromGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID )
data class AssignFidleToGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID, val assignment: PU )
data class UnAssignFidleFromGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID )
data class AssignGv1ToGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID, val assignment: PU )
data class UnAssignGv1FromGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID )
data class AssignGv2ToGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID, val assignment: PU )
data class UnAssignGv2FromGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID )
data class AssignGv3ToGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID, val assignment: PU )
data class UnAssignGv3FromGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID )
data class AssignGv4ToGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID, val assignment: PU )
data class UnAssignGv4FromGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID )
data class AssignGv5ToGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID, val assignment: PU )
data class UnAssignGv5FromGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID )
data class AssignGv6ToGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID, val assignment: PU )
data class UnAssignGv6FromGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID )
data class AssignKaToGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID, val assignment: PU )
data class UnAssignKaFromGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID )
data class AssignKtToGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID, val assignment: PU )
data class UnAssignKtFromGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID )
data class AssignLmaxToGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID, val assignment: PU )
data class UnAssignLmaxFromGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID )
data class AssignLoadincToGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID, val assignment: PU )
data class UnAssignLoadincFromGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID )
data class AssignLtrateToGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID, val assignment: Simple_Float )
data class UnAssignLtrateFromGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID )
data class AssignMwbaseToGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID, val assignment: ActivePower )
data class UnAssignMwbaseFromGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID )
data class AssignPgv1ToGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID, val assignment: PU )
data class UnAssignPgv1FromGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID )
data class AssignPgv2ToGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID, val assignment: PU )
data class UnAssignPgv2FromGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID )
data class AssignPgv3ToGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID, val assignment: PU )
data class UnAssignPgv3FromGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID )
data class AssignPgv4ToGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID, val assignment: PU )
data class UnAssignPgv4FromGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID )
data class AssignPgv5ToGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID, val assignment: PU )
data class UnAssignPgv5FromGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID )
data class AssignPgv6ToGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID, val assignment: PU )
data class UnAssignPgv6FromGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID )
data class AssignRToGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID, val assignment: PU )
data class UnAssignRFromGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID )
data class AssignRmaxToGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID, val assignment: Simple_Float )
data class UnAssignRmaxFromGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID )
data class AssignT1ToGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID, val assignment: Seconds )
data class UnAssignT1FromGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID )
data class AssignT2ToGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID, val assignment: Seconds )
data class UnAssignT2FromGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID )
data class AssignT3ToGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID, val assignment: Seconds )
data class UnAssignT3FromGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID )
data class AssignT4ToGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID, val assignment: Seconds )
data class UnAssignT4FromGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID )
data class AssignT5ToGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID, val assignment: Seconds )
data class UnAssignT5FromGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID )
data class AssignTltrToGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID, val assignment: Seconds )
data class UnAssignTltrFromGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID )
data class AssignVmaxToGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID, val assignment: PU )
data class UnAssignVmaxFromGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID )
data class AssignVminToGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID, val assignment: PU )
data class UnAssignVminFromGovGAST1Command(@TargetAggregateIdentifier  val govGAST1Id: UUID )

// multiple association commands


// GovGAST2 Commands
data class CreateGovGAST2Command(
    @TargetAggregateIdentifier  var govGAST2Id: UUID? = null
)

data class UpdateGovGAST2Command(
    @TargetAggregateIdentifier var govGAST2Id: UUID? = null,
    var a: Simple_Float,
    var af1: PU,
    var af2: PU,
    var b: Simple_Float,
    var bf1: PU,
    var bf2: PU,
    var c: Simple_Float,
    var cf2: PU,
    var ecr: Seconds,
    var etd: Seconds,
    var k3: PU,
    var k4: PU,
    var k5: PU,
    var k6: PU,
    var kf: PU,
    var mwbase: ActivePower,
    var t: Seconds,
    var t3: Seconds,
    var t4: Seconds,
    var t5: Seconds,
    var tc: Temperature,
    var tcd: Seconds,
    var tf: Seconds,
    var tmax: PU,
    var tmin: PU,
    var tr: Temperature,
    var trate: ActivePower,
    var tt: Seconds,
    var w: PU,
    var x: Seconds,
    var y: Seconds,
    var z: BooleanProxy
)

data class DeleteGovGAST2Command(@TargetAggregateIdentifier  var govGAST2Id: UUID? = null)

// single association commands
data class AssignAToGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID, val assignment: Simple_Float )
data class UnAssignAFromGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID )
data class AssignAf1ToGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID, val assignment: PU )
data class UnAssignAf1FromGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID )
data class AssignAf2ToGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID, val assignment: PU )
data class UnAssignAf2FromGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID )
data class AssignBToGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID, val assignment: Simple_Float )
data class UnAssignBFromGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID )
data class AssignBf1ToGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID, val assignment: PU )
data class UnAssignBf1FromGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID )
data class AssignBf2ToGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID, val assignment: PU )
data class UnAssignBf2FromGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID )
data class AssignCToGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID, val assignment: Simple_Float )
data class UnAssignCFromGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID )
data class AssignCf2ToGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID, val assignment: PU )
data class UnAssignCf2FromGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID )
data class AssignEcrToGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID, val assignment: Seconds )
data class UnAssignEcrFromGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID )
data class AssignEtdToGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID, val assignment: Seconds )
data class UnAssignEtdFromGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID )
data class AssignK3ToGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID, val assignment: PU )
data class UnAssignK3FromGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID )
data class AssignK4ToGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID, val assignment: PU )
data class UnAssignK4FromGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID )
data class AssignK5ToGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID, val assignment: PU )
data class UnAssignK5FromGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID )
data class AssignK6ToGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID, val assignment: PU )
data class UnAssignK6FromGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID )
data class AssignKfToGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID, val assignment: PU )
data class UnAssignKfFromGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID )
data class AssignMwbaseToGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID, val assignment: ActivePower )
data class UnAssignMwbaseFromGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID )
data class AssignTToGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID, val assignment: Seconds )
data class UnAssignTFromGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID )
data class AssignT3ToGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID, val assignment: Seconds )
data class UnAssignT3FromGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID )
data class AssignT4ToGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID, val assignment: Seconds )
data class UnAssignT4FromGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID )
data class AssignT5ToGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID, val assignment: Seconds )
data class UnAssignT5FromGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID )
data class AssignTcToGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID, val assignment: Temperature )
data class UnAssignTcFromGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID )
data class AssignTcdToGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID, val assignment: Seconds )
data class UnAssignTcdFromGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID )
data class AssignTfToGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID, val assignment: Seconds )
data class UnAssignTfFromGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID )
data class AssignTmaxToGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID, val assignment: PU )
data class UnAssignTmaxFromGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID )
data class AssignTminToGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID, val assignment: PU )
data class UnAssignTminFromGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID )
data class AssignTrToGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID, val assignment: Temperature )
data class UnAssignTrFromGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID )
data class AssignTrateToGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID, val assignment: ActivePower )
data class UnAssignTrateFromGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID )
data class AssignTtToGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID, val assignment: Seconds )
data class UnAssignTtFromGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID )
data class AssignWToGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID, val assignment: PU )
data class UnAssignWFromGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID )
data class AssignXToGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID, val assignment: Seconds )
data class UnAssignXFromGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID )
data class AssignYToGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID, val assignment: Seconds )
data class UnAssignYFromGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID )
data class AssignZToGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID, val assignment: BooleanProxy )
data class UnAssignZFromGovGAST2Command(@TargetAggregateIdentifier  val govGAST2Id: UUID )

// multiple association commands


// GovGAST3 Commands
data class CreateGovGAST3Command(
    @TargetAggregateIdentifier  var govGAST3Id: UUID? = null
)

data class UpdateGovGAST3Command(
    @TargetAggregateIdentifier var govGAST3Id: UUID? = null,
    var bca: Simple_Float,
    var bp: PU,
    var dtc: Temperature,
    var ka: PU,
    var kac: Simple_Float,
    var kca: Simple_Float,
    var ksi: Simple_Float,
    var ky: Simple_Float,
    var mnef: PU,
    var mxef: PU,
    var rcmn: PU,
    var rcmx: PU,
    var tac: Seconds,
    var tc: Seconds,
    var td: Seconds,
    var tfen: Temperature,
    var tg: Seconds,
    var tsi: Seconds,
    var tt: Temperature,
    var ttc: Seconds,
    var ty: Seconds
)

data class DeleteGovGAST3Command(@TargetAggregateIdentifier  var govGAST3Id: UUID? = null)

// single association commands
data class AssignBcaToGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID, val assignment: Simple_Float )
data class UnAssignBcaFromGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID )
data class AssignBpToGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID, val assignment: PU )
data class UnAssignBpFromGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID )
data class AssignDtcToGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID, val assignment: Temperature )
data class UnAssignDtcFromGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID )
data class AssignKaToGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID, val assignment: PU )
data class UnAssignKaFromGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID )
data class AssignKacToGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID, val assignment: Simple_Float )
data class UnAssignKacFromGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID )
data class AssignKcaToGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID, val assignment: Simple_Float )
data class UnAssignKcaFromGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID )
data class AssignKsiToGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID, val assignment: Simple_Float )
data class UnAssignKsiFromGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID )
data class AssignKyToGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID, val assignment: Simple_Float )
data class UnAssignKyFromGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID )
data class AssignMnefToGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID, val assignment: PU )
data class UnAssignMnefFromGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID )
data class AssignMxefToGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID, val assignment: PU )
data class UnAssignMxefFromGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID )
data class AssignRcmnToGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID, val assignment: PU )
data class UnAssignRcmnFromGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID )
data class AssignRcmxToGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID, val assignment: PU )
data class UnAssignRcmxFromGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID )
data class AssignTacToGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID, val assignment: Seconds )
data class UnAssignTacFromGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID )
data class AssignTcToGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID, val assignment: Seconds )
data class UnAssignTcFromGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID )
data class AssignTdToGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID, val assignment: Seconds )
data class UnAssignTdFromGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID )
data class AssignTfenToGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID, val assignment: Temperature )
data class UnAssignTfenFromGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID )
data class AssignTgToGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID, val assignment: Seconds )
data class UnAssignTgFromGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID )
data class AssignTsiToGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID, val assignment: Seconds )
data class UnAssignTsiFromGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID )
data class AssignTtToGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID, val assignment: Temperature )
data class UnAssignTtFromGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID )
data class AssignTtcToGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID, val assignment: Seconds )
data class UnAssignTtcFromGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID )
data class AssignTyToGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID, val assignment: Seconds )
data class UnAssignTyFromGovGAST3Command(@TargetAggregateIdentifier  val govGAST3Id: UUID )

// multiple association commands


// GovGAST4 Commands
data class CreateGovGAST4Command(
    @TargetAggregateIdentifier  var govGAST4Id: UUID? = null
)

data class UpdateGovGAST4Command(
    @TargetAggregateIdentifier var govGAST4Id: UUID? = null,
    var bp: PU,
    var ktm: PU,
    var mnef: PU,
    var mxef: PU,
    var rymn: PU,
    var rymx: PU,
    var ta: Seconds,
    var tc: Seconds,
    var tcm: Seconds,
    var tm: Seconds,
    var tv: Seconds
)

data class DeleteGovGAST4Command(@TargetAggregateIdentifier  var govGAST4Id: UUID? = null)

// single association commands
data class AssignBpToGovGAST4Command(@TargetAggregateIdentifier  val govGAST4Id: UUID, val assignment: PU )
data class UnAssignBpFromGovGAST4Command(@TargetAggregateIdentifier  val govGAST4Id: UUID )
data class AssignKtmToGovGAST4Command(@TargetAggregateIdentifier  val govGAST4Id: UUID, val assignment: PU )
data class UnAssignKtmFromGovGAST4Command(@TargetAggregateIdentifier  val govGAST4Id: UUID )
data class AssignMnefToGovGAST4Command(@TargetAggregateIdentifier  val govGAST4Id: UUID, val assignment: PU )
data class UnAssignMnefFromGovGAST4Command(@TargetAggregateIdentifier  val govGAST4Id: UUID )
data class AssignMxefToGovGAST4Command(@TargetAggregateIdentifier  val govGAST4Id: UUID, val assignment: PU )
data class UnAssignMxefFromGovGAST4Command(@TargetAggregateIdentifier  val govGAST4Id: UUID )
data class AssignRymnToGovGAST4Command(@TargetAggregateIdentifier  val govGAST4Id: UUID, val assignment: PU )
data class UnAssignRymnFromGovGAST4Command(@TargetAggregateIdentifier  val govGAST4Id: UUID )
data class AssignRymxToGovGAST4Command(@TargetAggregateIdentifier  val govGAST4Id: UUID, val assignment: PU )
data class UnAssignRymxFromGovGAST4Command(@TargetAggregateIdentifier  val govGAST4Id: UUID )
data class AssignTaToGovGAST4Command(@TargetAggregateIdentifier  val govGAST4Id: UUID, val assignment: Seconds )
data class UnAssignTaFromGovGAST4Command(@TargetAggregateIdentifier  val govGAST4Id: UUID )
data class AssignTcToGovGAST4Command(@TargetAggregateIdentifier  val govGAST4Id: UUID, val assignment: Seconds )
data class UnAssignTcFromGovGAST4Command(@TargetAggregateIdentifier  val govGAST4Id: UUID )
data class AssignTcmToGovGAST4Command(@TargetAggregateIdentifier  val govGAST4Id: UUID, val assignment: Seconds )
data class UnAssignTcmFromGovGAST4Command(@TargetAggregateIdentifier  val govGAST4Id: UUID )
data class AssignTmToGovGAST4Command(@TargetAggregateIdentifier  val govGAST4Id: UUID, val assignment: Seconds )
data class UnAssignTmFromGovGAST4Command(@TargetAggregateIdentifier  val govGAST4Id: UUID )
data class AssignTvToGovGAST4Command(@TargetAggregateIdentifier  val govGAST4Id: UUID, val assignment: Seconds )
data class UnAssignTvFromGovGAST4Command(@TargetAggregateIdentifier  val govGAST4Id: UUID )

// multiple association commands


// GovGASTWD Commands
data class CreateGovGASTWDCommand(
    @TargetAggregateIdentifier  var govGASTWDId: UUID? = null
)

data class UpdateGovGASTWDCommand(
    @TargetAggregateIdentifier var govGASTWDId: UUID? = null,
    var a: Simple_Float,
    var af1: PU,
    var af2: PU,
    var b: Simple_Float,
    var bf1: PU,
    var bf2: PU,
    var c: Simple_Float,
    var cf2: PU,
    var ecr: Seconds,
    var etd: Seconds,
    var k3: PU,
    var k4: PU,
    var k5: PU,
    var k6: PU,
    var kd: PU,
    var kdroop: PU,
    var kf: PU,
    var ki: PU,
    var kp: PU,
    var mwbase: ActivePower,
    var t: Seconds,
    var t3: Seconds,
    var t4: Seconds,
    var t5: Seconds,
    var tc: Temperature,
    var tcd: Seconds,
    var td: Seconds,
    var tf: Seconds,
    var tmax: PU,
    var tmin: PU,
    var tr: Temperature,
    var trate: ActivePower,
    var tt: Seconds
)

data class DeleteGovGASTWDCommand(@TargetAggregateIdentifier  var govGASTWDId: UUID? = null)

// single association commands
data class AssignAToGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID, val assignment: Simple_Float )
data class UnAssignAFromGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID )
data class AssignAf1ToGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID, val assignment: PU )
data class UnAssignAf1FromGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID )
data class AssignAf2ToGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID, val assignment: PU )
data class UnAssignAf2FromGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID )
data class AssignBToGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID, val assignment: Simple_Float )
data class UnAssignBFromGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID )
data class AssignBf1ToGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID, val assignment: PU )
data class UnAssignBf1FromGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID )
data class AssignBf2ToGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID, val assignment: PU )
data class UnAssignBf2FromGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID )
data class AssignCToGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID, val assignment: Simple_Float )
data class UnAssignCFromGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID )
data class AssignCf2ToGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID, val assignment: PU )
data class UnAssignCf2FromGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID )
data class AssignEcrToGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID, val assignment: Seconds )
data class UnAssignEcrFromGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID )
data class AssignEtdToGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID, val assignment: Seconds )
data class UnAssignEtdFromGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID )
data class AssignK3ToGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID, val assignment: PU )
data class UnAssignK3FromGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID )
data class AssignK4ToGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID, val assignment: PU )
data class UnAssignK4FromGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID )
data class AssignK5ToGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID, val assignment: PU )
data class UnAssignK5FromGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID )
data class AssignK6ToGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID, val assignment: PU )
data class UnAssignK6FromGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID )
data class AssignKdToGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID, val assignment: PU )
data class UnAssignKdFromGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID )
data class AssignKdroopToGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID, val assignment: PU )
data class UnAssignKdroopFromGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID )
data class AssignKfToGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID, val assignment: PU )
data class UnAssignKfFromGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID )
data class AssignKiToGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID, val assignment: PU )
data class UnAssignKiFromGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID )
data class AssignKpToGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID, val assignment: PU )
data class UnAssignKpFromGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID )
data class AssignMwbaseToGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID, val assignment: ActivePower )
data class UnAssignMwbaseFromGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID )
data class AssignTToGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID, val assignment: Seconds )
data class UnAssignTFromGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID )
data class AssignT3ToGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID, val assignment: Seconds )
data class UnAssignT3FromGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID )
data class AssignT4ToGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID, val assignment: Seconds )
data class UnAssignT4FromGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID )
data class AssignT5ToGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID, val assignment: Seconds )
data class UnAssignT5FromGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID )
data class AssignTcToGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID, val assignment: Temperature )
data class UnAssignTcFromGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID )
data class AssignTcdToGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID, val assignment: Seconds )
data class UnAssignTcdFromGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID )
data class AssignTdToGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID, val assignment: Seconds )
data class UnAssignTdFromGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID )
data class AssignTfToGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID, val assignment: Seconds )
data class UnAssignTfFromGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID )
data class AssignTmaxToGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID, val assignment: PU )
data class UnAssignTmaxFromGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID )
data class AssignTminToGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID, val assignment: PU )
data class UnAssignTminFromGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID )
data class AssignTrToGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID, val assignment: Temperature )
data class UnAssignTrFromGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID )
data class AssignTrateToGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID, val assignment: ActivePower )
data class UnAssignTrateFromGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID )
data class AssignTtToGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID, val assignment: Seconds )
data class UnAssignTtFromGovGASTWDCommand(@TargetAggregateIdentifier  val govGASTWDId: UUID )

// multiple association commands


// GovHydro1 Commands
data class CreateGovHydro1Command(
    @TargetAggregateIdentifier  var govHydro1Id: UUID? = null
)

data class UpdateGovHydro1Command(
    @TargetAggregateIdentifier var govHydro1Id: UUID? = null,
    var at: PU,
    var dturb: PU,
    var gmax: PU,
    var gmin: PU,
    var hdam: PU,
    var mwbase: ActivePower,
    var qnl: PU,
    var rperm: PU,
    var rtemp: PU,
    var tf: Seconds,
    var tg: Seconds,
    var tr: Seconds,
    var tw: Seconds,
    var velm: Simple_Float
)

data class DeleteGovHydro1Command(@TargetAggregateIdentifier  var govHydro1Id: UUID? = null)

// single association commands
data class AssignAtToGovHydro1Command(@TargetAggregateIdentifier  val govHydro1Id: UUID, val assignment: PU )
data class UnAssignAtFromGovHydro1Command(@TargetAggregateIdentifier  val govHydro1Id: UUID )
data class AssignDturbToGovHydro1Command(@TargetAggregateIdentifier  val govHydro1Id: UUID, val assignment: PU )
data class UnAssignDturbFromGovHydro1Command(@TargetAggregateIdentifier  val govHydro1Id: UUID )
data class AssignGmaxToGovHydro1Command(@TargetAggregateIdentifier  val govHydro1Id: UUID, val assignment: PU )
data class UnAssignGmaxFromGovHydro1Command(@TargetAggregateIdentifier  val govHydro1Id: UUID )
data class AssignGminToGovHydro1Command(@TargetAggregateIdentifier  val govHydro1Id: UUID, val assignment: PU )
data class UnAssignGminFromGovHydro1Command(@TargetAggregateIdentifier  val govHydro1Id: UUID )
data class AssignHdamToGovHydro1Command(@TargetAggregateIdentifier  val govHydro1Id: UUID, val assignment: PU )
data class UnAssignHdamFromGovHydro1Command(@TargetAggregateIdentifier  val govHydro1Id: UUID )
data class AssignMwbaseToGovHydro1Command(@TargetAggregateIdentifier  val govHydro1Id: UUID, val assignment: ActivePower )
data class UnAssignMwbaseFromGovHydro1Command(@TargetAggregateIdentifier  val govHydro1Id: UUID )
data class AssignQnlToGovHydro1Command(@TargetAggregateIdentifier  val govHydro1Id: UUID, val assignment: PU )
data class UnAssignQnlFromGovHydro1Command(@TargetAggregateIdentifier  val govHydro1Id: UUID )
data class AssignRpermToGovHydro1Command(@TargetAggregateIdentifier  val govHydro1Id: UUID, val assignment: PU )
data class UnAssignRpermFromGovHydro1Command(@TargetAggregateIdentifier  val govHydro1Id: UUID )
data class AssignRtempToGovHydro1Command(@TargetAggregateIdentifier  val govHydro1Id: UUID, val assignment: PU )
data class UnAssignRtempFromGovHydro1Command(@TargetAggregateIdentifier  val govHydro1Id: UUID )
data class AssignTfToGovHydro1Command(@TargetAggregateIdentifier  val govHydro1Id: UUID, val assignment: Seconds )
data class UnAssignTfFromGovHydro1Command(@TargetAggregateIdentifier  val govHydro1Id: UUID )
data class AssignTgToGovHydro1Command(@TargetAggregateIdentifier  val govHydro1Id: UUID, val assignment: Seconds )
data class UnAssignTgFromGovHydro1Command(@TargetAggregateIdentifier  val govHydro1Id: UUID )
data class AssignTrToGovHydro1Command(@TargetAggregateIdentifier  val govHydro1Id: UUID, val assignment: Seconds )
data class UnAssignTrFromGovHydro1Command(@TargetAggregateIdentifier  val govHydro1Id: UUID )
data class AssignTwToGovHydro1Command(@TargetAggregateIdentifier  val govHydro1Id: UUID, val assignment: Seconds )
data class UnAssignTwFromGovHydro1Command(@TargetAggregateIdentifier  val govHydro1Id: UUID )
data class AssignVelmToGovHydro1Command(@TargetAggregateIdentifier  val govHydro1Id: UUID, val assignment: Simple_Float )
data class UnAssignVelmFromGovHydro1Command(@TargetAggregateIdentifier  val govHydro1Id: UUID )

// multiple association commands


// GovHydro2 Commands
data class CreateGovHydro2Command(
    @TargetAggregateIdentifier  var govHydro2Id: UUID? = null
)

data class UpdateGovHydro2Command(
    @TargetAggregateIdentifier var govHydro2Id: UUID? = null,
    var aturb: PU,
    var bturb: PU,
    var db1: Frequency,
    var db2: ActivePower,
    var eps: Frequency,
    var gv1: PU,
    var gv2: PU,
    var gv3: PU,
    var gv4: PU,
    var gv5: PU,
    var gv6: PU,
    var kturb: PU,
    var mwbase: ActivePower,
    var pgv1: PU,
    var pgv2: PU,
    var pgv3: PU,
    var pgv4: PU,
    var pgv5: PU,
    var pgv6: PU,
    var pmax: PU,
    var pmin: PU,
    var rperm: PU,
    var rtemp: PU,
    var tg: Seconds,
    var tp: Seconds,
    var tr: Seconds,
    var tw: Seconds,
    var uc: Simple_Float,
    var uo: Simple_Float
)

data class DeleteGovHydro2Command(@TargetAggregateIdentifier  var govHydro2Id: UUID? = null)

// single association commands
data class AssignAturbToGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID, val assignment: PU )
data class UnAssignAturbFromGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID )
data class AssignBturbToGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID, val assignment: PU )
data class UnAssignBturbFromGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID )
data class AssignDb1ToGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID, val assignment: Frequency )
data class UnAssignDb1FromGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID )
data class AssignDb2ToGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID, val assignment: ActivePower )
data class UnAssignDb2FromGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID )
data class AssignEpsToGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID, val assignment: Frequency )
data class UnAssignEpsFromGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID )
data class AssignGv1ToGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID, val assignment: PU )
data class UnAssignGv1FromGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID )
data class AssignGv2ToGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID, val assignment: PU )
data class UnAssignGv2FromGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID )
data class AssignGv3ToGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID, val assignment: PU )
data class UnAssignGv3FromGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID )
data class AssignGv4ToGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID, val assignment: PU )
data class UnAssignGv4FromGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID )
data class AssignGv5ToGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID, val assignment: PU )
data class UnAssignGv5FromGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID )
data class AssignGv6ToGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID, val assignment: PU )
data class UnAssignGv6FromGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID )
data class AssignKturbToGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID, val assignment: PU )
data class UnAssignKturbFromGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID )
data class AssignMwbaseToGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID, val assignment: ActivePower )
data class UnAssignMwbaseFromGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID )
data class AssignPgv1ToGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID, val assignment: PU )
data class UnAssignPgv1FromGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID )
data class AssignPgv2ToGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID, val assignment: PU )
data class UnAssignPgv2FromGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID )
data class AssignPgv3ToGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID, val assignment: PU )
data class UnAssignPgv3FromGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID )
data class AssignPgv4ToGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID, val assignment: PU )
data class UnAssignPgv4FromGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID )
data class AssignPgv5ToGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID, val assignment: PU )
data class UnAssignPgv5FromGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID )
data class AssignPgv6ToGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID, val assignment: PU )
data class UnAssignPgv6FromGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID )
data class AssignPmaxToGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID, val assignment: PU )
data class UnAssignPmaxFromGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID )
data class AssignPminToGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID, val assignment: PU )
data class UnAssignPminFromGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID )
data class AssignRpermToGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID, val assignment: PU )
data class UnAssignRpermFromGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID )
data class AssignRtempToGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID, val assignment: PU )
data class UnAssignRtempFromGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID )
data class AssignTgToGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID, val assignment: Seconds )
data class UnAssignTgFromGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID )
data class AssignTpToGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID, val assignment: Seconds )
data class UnAssignTpFromGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID )
data class AssignTrToGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID, val assignment: Seconds )
data class UnAssignTrFromGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID )
data class AssignTwToGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID, val assignment: Seconds )
data class UnAssignTwFromGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID )
data class AssignUcToGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID, val assignment: Simple_Float )
data class UnAssignUcFromGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID )
data class AssignUoToGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID, val assignment: Simple_Float )
data class UnAssignUoFromGovHydro2Command(@TargetAggregateIdentifier  val govHydro2Id: UUID )

// multiple association commands


// GovHydro3 Commands
data class CreateGovHydro3Command(
    @TargetAggregateIdentifier  var govHydro3Id: UUID? = null
)

data class UpdateGovHydro3Command(
    @TargetAggregateIdentifier var govHydro3Id: UUID? = null,
    var at: PU,
    var db1: Frequency,
    var db2: ActivePower,
    var dturb: PU,
    var eps: Frequency,
    var governorControl: BooleanProxy,
    var gv1: PU,
    var gv2: PU,
    var gv3: PU,
    var gv4: PU,
    var gv5: PU,
    var gv6: PU,
    var h0: PU,
    var k1: PU,
    var k2: PU,
    var kg: PU,
    var ki: PU,
    var mwbase: ActivePower,
    var pgv1: PU,
    var pgv2: PU,
    var pgv3: PU,
    var pgv4: PU,
    var pgv5: PU,
    var pgv6: PU,
    var pmax: PU,
    var pmin: PU,
    var qnl: PU,
    var relec: PU,
    var rgate: PU,
    var td: Seconds,
    var tf: Seconds,
    var tp: Seconds,
    var tt: Seconds,
    var tw: Seconds,
    var velcl: Simple_Float,
    var velop: Simple_Float
)

data class DeleteGovHydro3Command(@TargetAggregateIdentifier  var govHydro3Id: UUID? = null)

// single association commands
data class AssignAtToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: PU )
data class UnAssignAtFromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )
data class AssignDb1ToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: Frequency )
data class UnAssignDb1FromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )
data class AssignDb2ToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: ActivePower )
data class UnAssignDb2FromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )
data class AssignDturbToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: PU )
data class UnAssignDturbFromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )
data class AssignEpsToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: Frequency )
data class UnAssignEpsFromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )
data class AssignGovernorControlToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: BooleanProxy )
data class UnAssignGovernorControlFromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )
data class AssignGv1ToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: PU )
data class UnAssignGv1FromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )
data class AssignGv2ToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: PU )
data class UnAssignGv2FromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )
data class AssignGv3ToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: PU )
data class UnAssignGv3FromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )
data class AssignGv4ToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: PU )
data class UnAssignGv4FromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )
data class AssignGv5ToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: PU )
data class UnAssignGv5FromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )
data class AssignGv6ToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: PU )
data class UnAssignGv6FromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )
data class AssignH0ToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: PU )
data class UnAssignH0FromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )
data class AssignK1ToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: PU )
data class UnAssignK1FromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )
data class AssignK2ToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: PU )
data class UnAssignK2FromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )
data class AssignKgToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: PU )
data class UnAssignKgFromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )
data class AssignKiToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: PU )
data class UnAssignKiFromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )
data class AssignMwbaseToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: ActivePower )
data class UnAssignMwbaseFromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )
data class AssignPgv1ToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: PU )
data class UnAssignPgv1FromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )
data class AssignPgv2ToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: PU )
data class UnAssignPgv2FromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )
data class AssignPgv3ToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: PU )
data class UnAssignPgv3FromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )
data class AssignPgv4ToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: PU )
data class UnAssignPgv4FromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )
data class AssignPgv5ToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: PU )
data class UnAssignPgv5FromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )
data class AssignPgv6ToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: PU )
data class UnAssignPgv6FromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )
data class AssignPmaxToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: PU )
data class UnAssignPmaxFromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )
data class AssignPminToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: PU )
data class UnAssignPminFromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )
data class AssignQnlToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: PU )
data class UnAssignQnlFromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )
data class AssignRelecToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: PU )
data class UnAssignRelecFromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )
data class AssignRgateToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: PU )
data class UnAssignRgateFromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )
data class AssignTdToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: Seconds )
data class UnAssignTdFromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )
data class AssignTfToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: Seconds )
data class UnAssignTfFromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )
data class AssignTpToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: Seconds )
data class UnAssignTpFromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )
data class AssignTtToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: Seconds )
data class UnAssignTtFromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )
data class AssignTwToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: Seconds )
data class UnAssignTwFromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )
data class AssignVelclToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: Simple_Float )
data class UnAssignVelclFromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )
data class AssignVelopToGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID, val assignment: Simple_Float )
data class UnAssignVelopFromGovHydro3Command(@TargetAggregateIdentifier  val govHydro3Id: UUID )

// multiple association commands


// GovHydro4 Commands
data class CreateGovHydro4Command(
    @TargetAggregateIdentifier  var govHydro4Id: UUID? = null
)

data class UpdateGovHydro4Command(
    @TargetAggregateIdentifier var govHydro4Id: UUID? = null,
    var at: PU,
    var bgv0: PU,
    var bgv1: PU,
    var bgv2: PU,
    var bgv3: PU,
    var bgv4: PU,
    var bgv5: PU,
    var bmax: Simple_Float,
    var db1: Frequency,
    var db2: ActivePower,
    var dturb: PU,
    var eps: Frequency,
    var gmax: PU,
    var gmin: PU,
    var gv0: PU,
    var gv1: PU,
    var gv2: PU,
    var gv3: PU,
    var gv4: PU,
    var gv5: PU,
    var hdam: PU,
    var mwbase: ActivePower,
    var pgv0: PU,
    var pgv1: PU,
    var pgv2: PU,
    var pgv3: PU,
    var pgv4: PU,
    var pgv5: PU,
    var qn1: PU,
    var rperm: Seconds,
    var rtemp: Seconds,
    var tblade: Seconds,
    var tg: Seconds,
    var tp: Seconds,
    var tr: Seconds,
    var tw: Seconds,
    var uc: Simple_Float,
    var uo: Simple_Float
)

data class DeleteGovHydro4Command(@TargetAggregateIdentifier  var govHydro4Id: UUID? = null)

// single association commands
data class AssignAtToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: PU )
data class UnAssignAtFromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignBgv0ToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: PU )
data class UnAssignBgv0FromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignBgv1ToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: PU )
data class UnAssignBgv1FromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignBgv2ToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: PU )
data class UnAssignBgv2FromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignBgv3ToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: PU )
data class UnAssignBgv3FromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignBgv4ToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: PU )
data class UnAssignBgv4FromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignBgv5ToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: PU )
data class UnAssignBgv5FromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignBmaxToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: Simple_Float )
data class UnAssignBmaxFromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignDb1ToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: Frequency )
data class UnAssignDb1FromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignDb2ToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: ActivePower )
data class UnAssignDb2FromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignDturbToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: PU )
data class UnAssignDturbFromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignEpsToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: Frequency )
data class UnAssignEpsFromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignGmaxToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: PU )
data class UnAssignGmaxFromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignGminToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: PU )
data class UnAssignGminFromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignGv0ToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: PU )
data class UnAssignGv0FromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignGv1ToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: PU )
data class UnAssignGv1FromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignGv2ToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: PU )
data class UnAssignGv2FromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignGv3ToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: PU )
data class UnAssignGv3FromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignGv4ToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: PU )
data class UnAssignGv4FromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignGv5ToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: PU )
data class UnAssignGv5FromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignHdamToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: PU )
data class UnAssignHdamFromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignMwbaseToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: ActivePower )
data class UnAssignMwbaseFromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignPgv0ToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: PU )
data class UnAssignPgv0FromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignPgv1ToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: PU )
data class UnAssignPgv1FromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignPgv2ToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: PU )
data class UnAssignPgv2FromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignPgv3ToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: PU )
data class UnAssignPgv3FromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignPgv4ToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: PU )
data class UnAssignPgv4FromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignPgv5ToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: PU )
data class UnAssignPgv5FromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignQn1ToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: PU )
data class UnAssignQn1FromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignRpermToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: Seconds )
data class UnAssignRpermFromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignRtempToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: Seconds )
data class UnAssignRtempFromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignTbladeToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: Seconds )
data class UnAssignTbladeFromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignTgToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: Seconds )
data class UnAssignTgFromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignTpToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: Seconds )
data class UnAssignTpFromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignTrToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: Seconds )
data class UnAssignTrFromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignTwToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: Seconds )
data class UnAssignTwFromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignUcToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: Simple_Float )
data class UnAssignUcFromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )
data class AssignUoToGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID, val assignment: Simple_Float )
data class UnAssignUoFromGovHydro4Command(@TargetAggregateIdentifier  val govHydro4Id: UUID )

// multiple association commands


// GovHydroDD Commands
data class CreateGovHydroDDCommand(
    @TargetAggregateIdentifier  var govHydroDDId: UUID? = null
)

data class UpdateGovHydroDDCommand(
    @TargetAggregateIdentifier var govHydroDDId: UUID? = null,
    var aturb: PU,
    var bturb: PU,
    var db1: Frequency,
    var db2: ActivePower,
    var eps: Frequency,
    var gmax: PU,
    var gmin: PU,
    var gv1: PU,
    var gv2: PU,
    var gv3: PU,
    var gv4: PU,
    var gv5: PU,
    var gv6: PU,
    var inputSignal: BooleanProxy,
    var k1: PU,
    var k2: PU,
    var kg: PU,
    var ki: PU,
    var mwbase: ActivePower,
    var pgv1: PU,
    var pgv2: PU,
    var pgv3: PU,
    var pgv4: PU,
    var pgv5: PU,
    var pgv6: PU,
    var pmax: PU,
    var pmin: PU,
    var r: PU,
    var td: Seconds,
    var tf: Seconds,
    var tp: Seconds,
    var tt: Seconds,
    var tturb: Seconds,
    var velcl: Simple_Float,
    var velop: Simple_Float
)

data class DeleteGovHydroDDCommand(@TargetAggregateIdentifier  var govHydroDDId: UUID? = null)

// single association commands
data class AssignAturbToGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID, val assignment: PU )
data class UnAssignAturbFromGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID )
data class AssignBturbToGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID, val assignment: PU )
data class UnAssignBturbFromGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID )
data class AssignDb1ToGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID, val assignment: Frequency )
data class UnAssignDb1FromGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID )
data class AssignDb2ToGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID, val assignment: ActivePower )
data class UnAssignDb2FromGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID )
data class AssignEpsToGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID, val assignment: Frequency )
data class UnAssignEpsFromGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID )
data class AssignGmaxToGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID, val assignment: PU )
data class UnAssignGmaxFromGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID )
data class AssignGminToGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID, val assignment: PU )
data class UnAssignGminFromGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID )
data class AssignGv1ToGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID, val assignment: PU )
data class UnAssignGv1FromGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID )
data class AssignGv2ToGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID, val assignment: PU )
data class UnAssignGv2FromGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID )
data class AssignGv3ToGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID, val assignment: PU )
data class UnAssignGv3FromGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID )
data class AssignGv4ToGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID, val assignment: PU )
data class UnAssignGv4FromGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID )
data class AssignGv5ToGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID, val assignment: PU )
data class UnAssignGv5FromGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID )
data class AssignGv6ToGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID, val assignment: PU )
data class UnAssignGv6FromGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID )
data class AssignInputSignalToGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID, val assignment: BooleanProxy )
data class UnAssignInputSignalFromGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID )
data class AssignK1ToGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID, val assignment: PU )
data class UnAssignK1FromGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID )
data class AssignK2ToGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID, val assignment: PU )
data class UnAssignK2FromGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID )
data class AssignKgToGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID, val assignment: PU )
data class UnAssignKgFromGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID )
data class AssignKiToGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID, val assignment: PU )
data class UnAssignKiFromGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID )
data class AssignMwbaseToGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID, val assignment: ActivePower )
data class UnAssignMwbaseFromGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID )
data class AssignPgv1ToGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID, val assignment: PU )
data class UnAssignPgv1FromGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID )
data class AssignPgv2ToGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID, val assignment: PU )
data class UnAssignPgv2FromGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID )
data class AssignPgv3ToGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID, val assignment: PU )
data class UnAssignPgv3FromGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID )
data class AssignPgv4ToGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID, val assignment: PU )
data class UnAssignPgv4FromGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID )
data class AssignPgv5ToGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID, val assignment: PU )
data class UnAssignPgv5FromGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID )
data class AssignPgv6ToGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID, val assignment: PU )
data class UnAssignPgv6FromGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID )
data class AssignPmaxToGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID, val assignment: PU )
data class UnAssignPmaxFromGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID )
data class AssignPminToGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID, val assignment: PU )
data class UnAssignPminFromGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID )
data class AssignRToGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID, val assignment: PU )
data class UnAssignRFromGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID )
data class AssignTdToGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID, val assignment: Seconds )
data class UnAssignTdFromGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID )
data class AssignTfToGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID, val assignment: Seconds )
data class UnAssignTfFromGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID )
data class AssignTpToGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID, val assignment: Seconds )
data class UnAssignTpFromGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID )
data class AssignTtToGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID, val assignment: Seconds )
data class UnAssignTtFromGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID )
data class AssignTturbToGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID, val assignment: Seconds )
data class UnAssignTturbFromGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID )
data class AssignVelclToGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID, val assignment: Simple_Float )
data class UnAssignVelclFromGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID )
data class AssignVelopToGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID, val assignment: Simple_Float )
data class UnAssignVelopFromGovHydroDDCommand(@TargetAggregateIdentifier  val govHydroDDId: UUID )

// multiple association commands


// GovHydroFrancis Commands
data class CreateGovHydroFrancisCommand(
    @TargetAggregateIdentifier var govHydroFrancisId: UUID? = null,
    @Enumerated(EnumType.STRING) var governorControl: FrancisGovernorControlKind
)

data class UpdateGovHydroFrancisCommand(
    @TargetAggregateIdentifier var govHydroFrancisId: UUID? = null,
    var am: PU,
    var av0: Area,
    var av1: Area,
    var bp: PU,
    var db1: Frequency,
    var etamax: PU,
    @Enumerated(EnumType.STRING) var governorControl: FrancisGovernorControlKind,
    var h1: Length,
    var h2: Length,
    var hn: Length,
    var kc: PU,
    var kg: PU,
    var kt: PU,
    var qc0: PU,
    var qn: VolumeFlowRate,
    var ta: Seconds,
    var td: Seconds,
    var ts: Seconds,
    var twnc: Seconds,
    var twng: Seconds,
    var tx: Seconds,
    var va: Simple_Float,
    var valvmax: PU,
    var valvmin: PU,
    var vc: Simple_Float,
    var waterTunnelSurgeChamberSimulation: BooleanProxy,
    var zsfc: Length
)

data class DeleteGovHydroFrancisCommand(@TargetAggregateIdentifier  var govHydroFrancisId: UUID? = null)

// single association commands
data class AssignAmToGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID, val assignment: PU )
data class UnAssignAmFromGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID )
data class AssignAv0ToGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID, val assignment: Area )
data class UnAssignAv0FromGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID )
data class AssignAv1ToGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID, val assignment: Area )
data class UnAssignAv1FromGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID )
data class AssignBpToGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID, val assignment: PU )
data class UnAssignBpFromGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID )
data class AssignDb1ToGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID, val assignment: Frequency )
data class UnAssignDb1FromGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID )
data class AssignEtamaxToGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID, val assignment: PU )
data class UnAssignEtamaxFromGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID )
data class AssignH1ToGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID, val assignment: Length )
data class UnAssignH1FromGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID )
data class AssignH2ToGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID, val assignment: Length )
data class UnAssignH2FromGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID )
data class AssignHnToGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID, val assignment: Length )
data class UnAssignHnFromGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID )
data class AssignKcToGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID, val assignment: PU )
data class UnAssignKcFromGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID )
data class AssignKgToGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID, val assignment: PU )
data class UnAssignKgFromGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID )
data class AssignKtToGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID, val assignment: PU )
data class UnAssignKtFromGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID )
data class AssignQc0ToGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID, val assignment: PU )
data class UnAssignQc0FromGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID )
data class AssignQnToGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID, val assignment: VolumeFlowRate )
data class UnAssignQnFromGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID )
data class AssignTaToGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID, val assignment: Seconds )
data class UnAssignTaFromGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID )
data class AssignTdToGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID, val assignment: Seconds )
data class UnAssignTdFromGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID )
data class AssignTsToGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID, val assignment: Seconds )
data class UnAssignTsFromGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID )
data class AssignTwncToGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID, val assignment: Seconds )
data class UnAssignTwncFromGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID )
data class AssignTwngToGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID, val assignment: Seconds )
data class UnAssignTwngFromGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID )
data class AssignTxToGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID, val assignment: Seconds )
data class UnAssignTxFromGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID )
data class AssignVaToGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID, val assignment: Simple_Float )
data class UnAssignVaFromGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID )
data class AssignValvmaxToGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID, val assignment: PU )
data class UnAssignValvmaxFromGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID )
data class AssignValvminToGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID, val assignment: PU )
data class UnAssignValvminFromGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID )
data class AssignVcToGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID, val assignment: Simple_Float )
data class UnAssignVcFromGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID )
data class AssignWaterTunnelSurgeChamberSimulationToGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID, val assignment: BooleanProxy )
data class UnAssignWaterTunnelSurgeChamberSimulationFromGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID )
data class AssignZsfcToGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID, val assignment: Length )
data class UnAssignZsfcFromGovHydroFrancisCommand(@TargetAggregateIdentifier  val govHydroFrancisId: UUID )

// multiple association commands


// GovHydroIEEE0 Commands
data class CreateGovHydroIEEE0Command(
    @TargetAggregateIdentifier  var govHydroIEEE0Id: UUID? = null
)

data class UpdateGovHydroIEEE0Command(
    @TargetAggregateIdentifier var govHydroIEEE0Id: UUID? = null,
    var k: PU,
    var mwbase: ActivePower,
    var pmax: PU,
    var pmin: PU,
    var t1: Seconds,
    var t2: Seconds,
    var t3: Seconds,
    var t4: Seconds
)

data class DeleteGovHydroIEEE0Command(@TargetAggregateIdentifier  var govHydroIEEE0Id: UUID? = null)

// single association commands
data class AssignKToGovHydroIEEE0Command(@TargetAggregateIdentifier  val govHydroIEEE0Id: UUID, val assignment: PU )
data class UnAssignKFromGovHydroIEEE0Command(@TargetAggregateIdentifier  val govHydroIEEE0Id: UUID )
data class AssignMwbaseToGovHydroIEEE0Command(@TargetAggregateIdentifier  val govHydroIEEE0Id: UUID, val assignment: ActivePower )
data class UnAssignMwbaseFromGovHydroIEEE0Command(@TargetAggregateIdentifier  val govHydroIEEE0Id: UUID )
data class AssignPmaxToGovHydroIEEE0Command(@TargetAggregateIdentifier  val govHydroIEEE0Id: UUID, val assignment: PU )
data class UnAssignPmaxFromGovHydroIEEE0Command(@TargetAggregateIdentifier  val govHydroIEEE0Id: UUID )
data class AssignPminToGovHydroIEEE0Command(@TargetAggregateIdentifier  val govHydroIEEE0Id: UUID, val assignment: PU )
data class UnAssignPminFromGovHydroIEEE0Command(@TargetAggregateIdentifier  val govHydroIEEE0Id: UUID )
data class AssignT1ToGovHydroIEEE0Command(@TargetAggregateIdentifier  val govHydroIEEE0Id: UUID, val assignment: Seconds )
data class UnAssignT1FromGovHydroIEEE0Command(@TargetAggregateIdentifier  val govHydroIEEE0Id: UUID )
data class AssignT2ToGovHydroIEEE0Command(@TargetAggregateIdentifier  val govHydroIEEE0Id: UUID, val assignment: Seconds )
data class UnAssignT2FromGovHydroIEEE0Command(@TargetAggregateIdentifier  val govHydroIEEE0Id: UUID )
data class AssignT3ToGovHydroIEEE0Command(@TargetAggregateIdentifier  val govHydroIEEE0Id: UUID, val assignment: Seconds )
data class UnAssignT3FromGovHydroIEEE0Command(@TargetAggregateIdentifier  val govHydroIEEE0Id: UUID )
data class AssignT4ToGovHydroIEEE0Command(@TargetAggregateIdentifier  val govHydroIEEE0Id: UUID, val assignment: Seconds )
data class UnAssignT4FromGovHydroIEEE0Command(@TargetAggregateIdentifier  val govHydroIEEE0Id: UUID )

// multiple association commands


// GovHydroIEEE2 Commands
data class CreateGovHydroIEEE2Command(
    @TargetAggregateIdentifier  var govHydroIEEE2Id: UUID? = null
)

data class UpdateGovHydroIEEE2Command(
    @TargetAggregateIdentifier var govHydroIEEE2Id: UUID? = null,
    var aturb: PU,
    var bturb: PU,
    var gv1: PU,
    var gv2: PU,
    var gv3: PU,
    var gv4: PU,
    var gv5: PU,
    var gv6: PU,
    var kturb: PU,
    var mwbase: ActivePower,
    var pgv1: PU,
    var pgv2: PU,
    var pgv3: PU,
    var pgv4: PU,
    var pgv5: PU,
    var pgv6: PU,
    var pmax: PU,
    var pmin: PU,
    var rperm: PU,
    var rtemp: PU,
    var tg: Seconds,
    var tp: Seconds,
    var tr: Seconds,
    var tw: Seconds,
    var uc: Simple_Float,
    var uo: Simple_Float
)

data class DeleteGovHydroIEEE2Command(@TargetAggregateIdentifier  var govHydroIEEE2Id: UUID? = null)

// single association commands
data class AssignAturbToGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID, val assignment: PU )
data class UnAssignAturbFromGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID )
data class AssignBturbToGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID, val assignment: PU )
data class UnAssignBturbFromGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID )
data class AssignGv1ToGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID, val assignment: PU )
data class UnAssignGv1FromGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID )
data class AssignGv2ToGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID, val assignment: PU )
data class UnAssignGv2FromGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID )
data class AssignGv3ToGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID, val assignment: PU )
data class UnAssignGv3FromGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID )
data class AssignGv4ToGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID, val assignment: PU )
data class UnAssignGv4FromGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID )
data class AssignGv5ToGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID, val assignment: PU )
data class UnAssignGv5FromGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID )
data class AssignGv6ToGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID, val assignment: PU )
data class UnAssignGv6FromGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID )
data class AssignKturbToGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID, val assignment: PU )
data class UnAssignKturbFromGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID )
data class AssignMwbaseToGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID, val assignment: ActivePower )
data class UnAssignMwbaseFromGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID )
data class AssignPgv1ToGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID, val assignment: PU )
data class UnAssignPgv1FromGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID )
data class AssignPgv2ToGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID, val assignment: PU )
data class UnAssignPgv2FromGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID )
data class AssignPgv3ToGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID, val assignment: PU )
data class UnAssignPgv3FromGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID )
data class AssignPgv4ToGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID, val assignment: PU )
data class UnAssignPgv4FromGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID )
data class AssignPgv5ToGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID, val assignment: PU )
data class UnAssignPgv5FromGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID )
data class AssignPgv6ToGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID, val assignment: PU )
data class UnAssignPgv6FromGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID )
data class AssignPmaxToGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID, val assignment: PU )
data class UnAssignPmaxFromGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID )
data class AssignPminToGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID, val assignment: PU )
data class UnAssignPminFromGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID )
data class AssignRpermToGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID, val assignment: PU )
data class UnAssignRpermFromGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID )
data class AssignRtempToGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID, val assignment: PU )
data class UnAssignRtempFromGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID )
data class AssignTgToGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID, val assignment: Seconds )
data class UnAssignTgFromGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID )
data class AssignTpToGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID, val assignment: Seconds )
data class UnAssignTpFromGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID )
data class AssignTrToGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID, val assignment: Seconds )
data class UnAssignTrFromGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID )
data class AssignTwToGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID, val assignment: Seconds )
data class UnAssignTwFromGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID )
data class AssignUcToGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID, val assignment: Simple_Float )
data class UnAssignUcFromGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID )
data class AssignUoToGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID, val assignment: Simple_Float )
data class UnAssignUoFromGovHydroIEEE2Command(@TargetAggregateIdentifier  val govHydroIEEE2Id: UUID )

// multiple association commands


// GovHydroPID Commands
data class CreateGovHydroPIDCommand(
    @TargetAggregateIdentifier  var govHydroPIDId: UUID? = null
)

data class UpdateGovHydroPIDCommand(
    @TargetAggregateIdentifier var govHydroPIDId: UUID? = null,
    var aturb: PU,
    var bturb: PU,
    var db1: Frequency,
    var db2: ActivePower,
    var eps: Frequency,
    var gv1: PU,
    var gv2: PU,
    var gv3: PU,
    var gv4: PU,
    var gv5: PU,
    var gv6: PU,
    var inputSignal: BooleanProxy,
    var kd: PU,
    var kg: PU,
    var ki: PU,
    var kp: PU,
    var mwbase: ActivePower,
    var pgv1: PU,
    var pgv2: PU,
    var pgv3: PU,
    var pgv4: PU,
    var pgv5: PU,
    var pgv6: PU,
    var pmax: PU,
    var pmin: PU,
    var r: PU,
    var td: Seconds,
    var tf: Seconds,
    var tp: Seconds,
    var tt: Seconds,
    var tturb: Seconds,
    var velcl: Simple_Float,
    var velop: Simple_Float
)

data class DeleteGovHydroPIDCommand(@TargetAggregateIdentifier  var govHydroPIDId: UUID? = null)

// single association commands
data class AssignAturbToGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID, val assignment: PU )
data class UnAssignAturbFromGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID )
data class AssignBturbToGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID, val assignment: PU )
data class UnAssignBturbFromGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID )
data class AssignDb1ToGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID, val assignment: Frequency )
data class UnAssignDb1FromGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID )
data class AssignDb2ToGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID, val assignment: ActivePower )
data class UnAssignDb2FromGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID )
data class AssignEpsToGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID, val assignment: Frequency )
data class UnAssignEpsFromGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID )
data class AssignGv1ToGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID, val assignment: PU )
data class UnAssignGv1FromGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID )
data class AssignGv2ToGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID, val assignment: PU )
data class UnAssignGv2FromGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID )
data class AssignGv3ToGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID, val assignment: PU )
data class UnAssignGv3FromGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID )
data class AssignGv4ToGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID, val assignment: PU )
data class UnAssignGv4FromGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID )
data class AssignGv5ToGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID, val assignment: PU )
data class UnAssignGv5FromGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID )
data class AssignGv6ToGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID, val assignment: PU )
data class UnAssignGv6FromGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID )
data class AssignInputSignalToGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID, val assignment: BooleanProxy )
data class UnAssignInputSignalFromGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID )
data class AssignKdToGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID, val assignment: PU )
data class UnAssignKdFromGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID )
data class AssignKgToGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID, val assignment: PU )
data class UnAssignKgFromGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID )
data class AssignKiToGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID, val assignment: PU )
data class UnAssignKiFromGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID )
data class AssignKpToGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID, val assignment: PU )
data class UnAssignKpFromGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID )
data class AssignMwbaseToGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID, val assignment: ActivePower )
data class UnAssignMwbaseFromGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID )
data class AssignPgv1ToGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID, val assignment: PU )
data class UnAssignPgv1FromGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID )
data class AssignPgv2ToGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID, val assignment: PU )
data class UnAssignPgv2FromGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID )
data class AssignPgv3ToGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID, val assignment: PU )
data class UnAssignPgv3FromGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID )
data class AssignPgv4ToGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID, val assignment: PU )
data class UnAssignPgv4FromGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID )
data class AssignPgv5ToGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID, val assignment: PU )
data class UnAssignPgv5FromGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID )
data class AssignPgv6ToGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID, val assignment: PU )
data class UnAssignPgv6FromGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID )
data class AssignPmaxToGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID, val assignment: PU )
data class UnAssignPmaxFromGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID )
data class AssignPminToGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID, val assignment: PU )
data class UnAssignPminFromGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID )
data class AssignRToGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID, val assignment: PU )
data class UnAssignRFromGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID )
data class AssignTdToGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID, val assignment: Seconds )
data class UnAssignTdFromGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID )
data class AssignTfToGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID, val assignment: Seconds )
data class UnAssignTfFromGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID )
data class AssignTpToGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID, val assignment: Seconds )
data class UnAssignTpFromGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID )
data class AssignTtToGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID, val assignment: Seconds )
data class UnAssignTtFromGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID )
data class AssignTturbToGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID, val assignment: Seconds )
data class UnAssignTturbFromGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID )
data class AssignVelclToGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID, val assignment: Simple_Float )
data class UnAssignVelclFromGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID )
data class AssignVelopToGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID, val assignment: Simple_Float )
data class UnAssignVelopFromGovHydroPIDCommand(@TargetAggregateIdentifier  val govHydroPIDId: UUID )

// multiple association commands


// GovHydroPID2 Commands
data class CreateGovHydroPID2Command(
    @TargetAggregateIdentifier  var govHydroPID2Id: UUID? = null
)

data class UpdateGovHydroPID2Command(
    @TargetAggregateIdentifier var govHydroPID2Id: UUID? = null,
    var atw: PU,
    var d: PU,
    var feedbackSignal: BooleanProxy,
    var g0: PU,
    var g1: PU,
    var g2: PU,
    var gmax: PU,
    var gmin: PU,
    var kd: PU,
    var ki: Simple_Float,
    var kp: PU,
    var mwbase: ActivePower,
    var p1: PU,
    var p2: PU,
    var p3: PU,
    var rperm: PU,
    var ta: Seconds,
    var tb: Seconds,
    var treg: Seconds,
    var tw: Seconds,
    var velmax: Simple_Float,
    var velmin: Simple_Float
)

data class DeleteGovHydroPID2Command(@TargetAggregateIdentifier  var govHydroPID2Id: UUID? = null)

// single association commands
data class AssignAtwToGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID, val assignment: PU )
data class UnAssignAtwFromGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID )
data class AssignDToGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID, val assignment: PU )
data class UnAssignDFromGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID )
data class AssignFeedbackSignalToGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID, val assignment: BooleanProxy )
data class UnAssignFeedbackSignalFromGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID )
data class AssignG0ToGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID, val assignment: PU )
data class UnAssignG0FromGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID )
data class AssignG1ToGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID, val assignment: PU )
data class UnAssignG1FromGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID )
data class AssignG2ToGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID, val assignment: PU )
data class UnAssignG2FromGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID )
data class AssignGmaxToGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID, val assignment: PU )
data class UnAssignGmaxFromGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID )
data class AssignGminToGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID, val assignment: PU )
data class UnAssignGminFromGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID )
data class AssignKdToGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID, val assignment: PU )
data class UnAssignKdFromGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID )
data class AssignKiToGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID, val assignment: Simple_Float )
data class UnAssignKiFromGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID )
data class AssignKpToGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID, val assignment: PU )
data class UnAssignKpFromGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID )
data class AssignMwbaseToGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID, val assignment: ActivePower )
data class UnAssignMwbaseFromGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID )
data class AssignP1ToGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID, val assignment: PU )
data class UnAssignP1FromGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID )
data class AssignP2ToGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID, val assignment: PU )
data class UnAssignP2FromGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID )
data class AssignP3ToGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID, val assignment: PU )
data class UnAssignP3FromGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID )
data class AssignRpermToGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID, val assignment: PU )
data class UnAssignRpermFromGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID )
data class AssignTaToGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID, val assignment: Seconds )
data class UnAssignTaFromGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID )
data class AssignTbToGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID, val assignment: Seconds )
data class UnAssignTbFromGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID )
data class AssignTregToGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID, val assignment: Seconds )
data class UnAssignTregFromGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID )
data class AssignTwToGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID, val assignment: Seconds )
data class UnAssignTwFromGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID )
data class AssignVelmaxToGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID, val assignment: Simple_Float )
data class UnAssignVelmaxFromGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID )
data class AssignVelminToGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID, val assignment: Simple_Float )
data class UnAssignVelminFromGovHydroPID2Command(@TargetAggregateIdentifier  val govHydroPID2Id: UUID )

// multiple association commands


// GovHydroPelton Commands
data class CreateGovHydroPeltonCommand(
    @TargetAggregateIdentifier  var govHydroPeltonId: UUID? = null
)

data class UpdateGovHydroPeltonCommand(
    @TargetAggregateIdentifier var govHydroPeltonId: UUID? = null,
    var av0: Area,
    var av1: Area,
    var bp: PU,
    var db1: Frequency,
    var db2: Frequency,
    var h1: Length,
    var h2: Length,
    var hn: Length,
    var kc: PU,
    var kg: PU,
    var qc0: PU,
    var qn: VolumeFlowRate,
    var simplifiedPelton: BooleanProxy,
    var staticCompensating: BooleanProxy,
    var ta: Seconds,
    var ts: Seconds,
    var tv: Seconds,
    var twnc: Seconds,
    var twng: Seconds,
    var tx: Seconds,
    var va: Simple_Float,
    var valvmax: PU,
    var valvmin: PU,
    var vav: PU,
    var vc: Simple_Float,
    var vcv: PU,
    var waterTunnelSurgeChamberSimulation: BooleanProxy,
    var zsfc: Length
)

data class DeleteGovHydroPeltonCommand(@TargetAggregateIdentifier  var govHydroPeltonId: UUID? = null)

// single association commands
data class AssignAv0ToGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID, val assignment: Area )
data class UnAssignAv0FromGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID )
data class AssignAv1ToGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID, val assignment: Area )
data class UnAssignAv1FromGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID )
data class AssignBpToGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID, val assignment: PU )
data class UnAssignBpFromGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID )
data class AssignDb1ToGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID, val assignment: Frequency )
data class UnAssignDb1FromGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID )
data class AssignDb2ToGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID, val assignment: Frequency )
data class UnAssignDb2FromGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID )
data class AssignH1ToGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID, val assignment: Length )
data class UnAssignH1FromGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID )
data class AssignH2ToGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID, val assignment: Length )
data class UnAssignH2FromGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID )
data class AssignHnToGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID, val assignment: Length )
data class UnAssignHnFromGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID )
data class AssignKcToGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID, val assignment: PU )
data class UnAssignKcFromGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID )
data class AssignKgToGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID, val assignment: PU )
data class UnAssignKgFromGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID )
data class AssignQc0ToGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID, val assignment: PU )
data class UnAssignQc0FromGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID )
data class AssignQnToGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID, val assignment: VolumeFlowRate )
data class UnAssignQnFromGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID )
data class AssignSimplifiedPeltonToGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID, val assignment: BooleanProxy )
data class UnAssignSimplifiedPeltonFromGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID )
data class AssignStaticCompensatingToGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID, val assignment: BooleanProxy )
data class UnAssignStaticCompensatingFromGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID )
data class AssignTaToGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID, val assignment: Seconds )
data class UnAssignTaFromGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID )
data class AssignTsToGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID, val assignment: Seconds )
data class UnAssignTsFromGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID )
data class AssignTvToGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID, val assignment: Seconds )
data class UnAssignTvFromGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID )
data class AssignTwncToGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID, val assignment: Seconds )
data class UnAssignTwncFromGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID )
data class AssignTwngToGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID, val assignment: Seconds )
data class UnAssignTwngFromGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID )
data class AssignTxToGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID, val assignment: Seconds )
data class UnAssignTxFromGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID )
data class AssignVaToGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID, val assignment: Simple_Float )
data class UnAssignVaFromGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID )
data class AssignValvmaxToGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID, val assignment: PU )
data class UnAssignValvmaxFromGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID )
data class AssignValvminToGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID, val assignment: PU )
data class UnAssignValvminFromGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID )
data class AssignVavToGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID, val assignment: PU )
data class UnAssignVavFromGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID )
data class AssignVcToGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID, val assignment: Simple_Float )
data class UnAssignVcFromGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID )
data class AssignVcvToGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID, val assignment: PU )
data class UnAssignVcvFromGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID )
data class AssignWaterTunnelSurgeChamberSimulationToGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID, val assignment: BooleanProxy )
data class UnAssignWaterTunnelSurgeChamberSimulationFromGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID )
data class AssignZsfcToGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID, val assignment: Length )
data class UnAssignZsfcFromGovHydroPeltonCommand(@TargetAggregateIdentifier  val govHydroPeltonId: UUID )

// multiple association commands


// GovHydroR Commands
data class CreateGovHydroRCommand(
    @TargetAggregateIdentifier  var govHydroRId: UUID? = null
)

data class UpdateGovHydroRCommand(
    @TargetAggregateIdentifier var govHydroRId: UUID? = null,
    var at: PU,
    var db1: Frequency,
    var db2: ActivePower,
    var dturb: PU,
    var eps: Frequency,
    var gmax: PU,
    var gmin: PU,
    var gv1: PU,
    var gv2: PU,
    var gv3: PU,
    var gv4: PU,
    var gv5: PU,
    var gv6: PU,
    var h0: PU,
    var inputSignal: BooleanProxy,
    var kg: PU,
    var ki: PU,
    var mwbase: ActivePower,
    var pgv1: PU,
    var pgv2: PU,
    var pgv3: PU,
    var pgv4: PU,
    var pgv5: PU,
    var pgv6: PU,
    var pmax: PU,
    var pmin: PU,
    var qnl: PU,
    var r: PU,
    var t1: Seconds,
    var t2: Seconds,
    var t3: Seconds,
    var t4: Seconds,
    var t5: Seconds,
    var t6: Seconds,
    var t7: Seconds,
    var t8: Seconds,
    var td: Seconds,
    var tp: Seconds,
    var tt: Seconds,
    var tw: Seconds,
    var velcl: Simple_Float,
    var velop: Simple_Float
)

data class DeleteGovHydroRCommand(@TargetAggregateIdentifier  var govHydroRId: UUID? = null)

// single association commands
data class AssignAtToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: PU )
data class UnAssignAtFromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignDb1ToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: Frequency )
data class UnAssignDb1FromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignDb2ToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: ActivePower )
data class UnAssignDb2FromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignDturbToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: PU )
data class UnAssignDturbFromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignEpsToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: Frequency )
data class UnAssignEpsFromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignGmaxToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: PU )
data class UnAssignGmaxFromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignGminToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: PU )
data class UnAssignGminFromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignGv1ToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: PU )
data class UnAssignGv1FromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignGv2ToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: PU )
data class UnAssignGv2FromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignGv3ToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: PU )
data class UnAssignGv3FromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignGv4ToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: PU )
data class UnAssignGv4FromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignGv5ToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: PU )
data class UnAssignGv5FromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignGv6ToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: PU )
data class UnAssignGv6FromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignH0ToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: PU )
data class UnAssignH0FromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignInputSignalToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: BooleanProxy )
data class UnAssignInputSignalFromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignKgToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: PU )
data class UnAssignKgFromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignKiToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: PU )
data class UnAssignKiFromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignMwbaseToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: ActivePower )
data class UnAssignMwbaseFromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignPgv1ToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: PU )
data class UnAssignPgv1FromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignPgv2ToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: PU )
data class UnAssignPgv2FromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignPgv3ToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: PU )
data class UnAssignPgv3FromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignPgv4ToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: PU )
data class UnAssignPgv4FromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignPgv5ToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: PU )
data class UnAssignPgv5FromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignPgv6ToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: PU )
data class UnAssignPgv6FromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignPmaxToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: PU )
data class UnAssignPmaxFromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignPminToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: PU )
data class UnAssignPminFromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignQnlToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: PU )
data class UnAssignQnlFromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignRToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: PU )
data class UnAssignRFromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignT1ToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: Seconds )
data class UnAssignT1FromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignT2ToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: Seconds )
data class UnAssignT2FromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignT3ToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: Seconds )
data class UnAssignT3FromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignT4ToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: Seconds )
data class UnAssignT4FromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignT5ToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: Seconds )
data class UnAssignT5FromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignT6ToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: Seconds )
data class UnAssignT6FromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignT7ToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: Seconds )
data class UnAssignT7FromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignT8ToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: Seconds )
data class UnAssignT8FromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignTdToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: Seconds )
data class UnAssignTdFromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignTpToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: Seconds )
data class UnAssignTpFromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignTtToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: Seconds )
data class UnAssignTtFromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignTwToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: Seconds )
data class UnAssignTwFromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignVelclToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: Simple_Float )
data class UnAssignVelclFromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )
data class AssignVelopToGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID, val assignment: Simple_Float )
data class UnAssignVelopFromGovHydroRCommand(@TargetAggregateIdentifier  val govHydroRId: UUID )

// multiple association commands


// GovHydroWEH Commands
data class CreateGovHydroWEHCommand(
    @TargetAggregateIdentifier  var govHydroWEHId: UUID? = null
)

data class UpdateGovHydroWEHCommand(
    @TargetAggregateIdentifier var govHydroWEHId: UUID? = null,
    var db: PU,
    var dicn: PU,
    var dpv: PU,
    var dturb: PU,
    var feedbackSignal: BooleanProxy,
    var fl1: PU,
    var fl2: PU,
    var fl3: PU,
    var fl4: PU,
    var fl5: PU,
    var fp1: PU,
    var fp10: PU,
    var fp2: PU,
    var fp3: PU,
    var fp4: PU,
    var fp5: PU,
    var fp6: PU,
    var fp7: PU,
    var fp8: PU,
    var fp9: PU,
    var gmax: PU,
    var gmin: PU,
    var gtmxcl: PU,
    var gtmxop: PU,
    var gv1: PU,
    var gv2: PU,
    var gv3: PU,
    var gv4: PU,
    var gv5: PU,
    var kd: PU,
    var ki: PU,
    var kp: PU,
    var mwbase: ActivePower,
    var pmss1: PU,
    var pmss10: PU,
    var pmss2: PU,
    var pmss3: PU,
    var pmss4: PU,
    var pmss5: PU,
    var pmss6: PU,
    var pmss7: PU,
    var pmss8: PU,
    var pmss9: PU,
    var rpg: Simple_Float,
    var rpp: Simple_Float,
    var td: Seconds,
    var tdv: Seconds,
    var tg: Seconds,
    var tp: Seconds,
    var tpe: Seconds,
    var tw: Seconds
)

data class DeleteGovHydroWEHCommand(@TargetAggregateIdentifier  var govHydroWEHId: UUID? = null)

// single association commands
data class AssignDbToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignDbFromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignDicnToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignDicnFromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignDpvToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignDpvFromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignDturbToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignDturbFromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignFeedbackSignalToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: BooleanProxy )
data class UnAssignFeedbackSignalFromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignFl1ToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignFl1FromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignFl2ToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignFl2FromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignFl3ToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignFl3FromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignFl4ToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignFl4FromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignFl5ToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignFl5FromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignFp1ToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignFp1FromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignFp10ToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignFp10FromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignFp2ToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignFp2FromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignFp3ToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignFp3FromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignFp4ToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignFp4FromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignFp5ToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignFp5FromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignFp6ToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignFp6FromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignFp7ToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignFp7FromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignFp8ToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignFp8FromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignFp9ToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignFp9FromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignGmaxToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignGmaxFromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignGminToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignGminFromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignGtmxclToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignGtmxclFromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignGtmxopToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignGtmxopFromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignGv1ToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignGv1FromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignGv2ToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignGv2FromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignGv3ToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignGv3FromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignGv4ToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignGv4FromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignGv5ToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignGv5FromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignKdToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignKdFromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignKiToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignKiFromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignKpToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignKpFromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignMwbaseToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: ActivePower )
data class UnAssignMwbaseFromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignPmss1ToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignPmss1FromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignPmss10ToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignPmss10FromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignPmss2ToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignPmss2FromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignPmss3ToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignPmss3FromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignPmss4ToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignPmss4FromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignPmss5ToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignPmss5FromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignPmss6ToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignPmss6FromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignPmss7ToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignPmss7FromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignPmss8ToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignPmss8FromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignPmss9ToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: PU )
data class UnAssignPmss9FromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignRpgToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: Simple_Float )
data class UnAssignRpgFromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignRppToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: Simple_Float )
data class UnAssignRppFromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignTdToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: Seconds )
data class UnAssignTdFromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignTdvToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: Seconds )
data class UnAssignTdvFromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignTgToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: Seconds )
data class UnAssignTgFromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignTpToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: Seconds )
data class UnAssignTpFromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignTpeToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: Seconds )
data class UnAssignTpeFromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )
data class AssignTwToGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID, val assignment: Seconds )
data class UnAssignTwFromGovHydroWEHCommand(@TargetAggregateIdentifier  val govHydroWEHId: UUID )

// multiple association commands


// GovHydroWPID Commands
data class CreateGovHydroWPIDCommand(
    @TargetAggregateIdentifier  var govHydroWPIDId: UUID? = null
)

data class UpdateGovHydroWPIDCommand(
    @TargetAggregateIdentifier var govHydroWPIDId: UUID? = null,
    var d: PU,
    var gatmax: PU,
    var gatmin: PU,
    var gv1: PU,
    var gv2: PU,
    var gv3: PU,
    var kd: PU,
    var ki: PU,
    var kp: PU,
    var mwbase: ActivePower,
    var pgv1: PU,
    var pgv2: PU,
    var pgv3: PU,
    var pmax: PU,
    var pmin: PU,
    var reg: PU,
    var ta: Seconds,
    var tb: Seconds,
    var treg: Seconds,
    var tw: Seconds,
    var velmax: PU,
    var velmin: PU
)

data class DeleteGovHydroWPIDCommand(@TargetAggregateIdentifier  var govHydroWPIDId: UUID? = null)

// single association commands
data class AssignDToGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID, val assignment: PU )
data class UnAssignDFromGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID )
data class AssignGatmaxToGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID, val assignment: PU )
data class UnAssignGatmaxFromGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID )
data class AssignGatminToGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID, val assignment: PU )
data class UnAssignGatminFromGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID )
data class AssignGv1ToGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID, val assignment: PU )
data class UnAssignGv1FromGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID )
data class AssignGv2ToGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID, val assignment: PU )
data class UnAssignGv2FromGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID )
data class AssignGv3ToGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID, val assignment: PU )
data class UnAssignGv3FromGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID )
data class AssignKdToGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID, val assignment: PU )
data class UnAssignKdFromGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID )
data class AssignKiToGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID, val assignment: PU )
data class UnAssignKiFromGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID )
data class AssignKpToGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID, val assignment: PU )
data class UnAssignKpFromGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID )
data class AssignMwbaseToGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID, val assignment: ActivePower )
data class UnAssignMwbaseFromGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID )
data class AssignPgv1ToGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID, val assignment: PU )
data class UnAssignPgv1FromGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID )
data class AssignPgv2ToGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID, val assignment: PU )
data class UnAssignPgv2FromGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID )
data class AssignPgv3ToGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID, val assignment: PU )
data class UnAssignPgv3FromGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID )
data class AssignPmaxToGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID, val assignment: PU )
data class UnAssignPmaxFromGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID )
data class AssignPminToGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID, val assignment: PU )
data class UnAssignPminFromGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID )
data class AssignRegToGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID, val assignment: PU )
data class UnAssignRegFromGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID )
data class AssignTaToGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID, val assignment: Seconds )
data class UnAssignTaFromGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID )
data class AssignTbToGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID, val assignment: Seconds )
data class UnAssignTbFromGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID )
data class AssignTregToGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID, val assignment: Seconds )
data class UnAssignTregFromGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID )
data class AssignTwToGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID, val assignment: Seconds )
data class UnAssignTwFromGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID )
data class AssignVelmaxToGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID, val assignment: PU )
data class UnAssignVelmaxFromGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID )
data class AssignVelminToGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID, val assignment: PU )
data class UnAssignVelminFromGovHydroWPIDCommand(@TargetAggregateIdentifier  val govHydroWPIDId: UUID )

// multiple association commands


// GovSteam0 Commands
data class CreateGovSteam0Command(
    @TargetAggregateIdentifier  var govSteam0Id: UUID? = null
)

data class UpdateGovSteam0Command(
    @TargetAggregateIdentifier var govSteam0Id: UUID? = null,
    var dt: PU,
    var mwbase: ActivePower,
    var r: PU,
    var t1: Seconds,
    var t2: Seconds,
    var t3: Seconds,
    var vmax: PU,
    var vmin: PU
)

data class DeleteGovSteam0Command(@TargetAggregateIdentifier  var govSteam0Id: UUID? = null)

// single association commands
data class AssignDtToGovSteam0Command(@TargetAggregateIdentifier  val govSteam0Id: UUID, val assignment: PU )
data class UnAssignDtFromGovSteam0Command(@TargetAggregateIdentifier  val govSteam0Id: UUID )
data class AssignMwbaseToGovSteam0Command(@TargetAggregateIdentifier  val govSteam0Id: UUID, val assignment: ActivePower )
data class UnAssignMwbaseFromGovSteam0Command(@TargetAggregateIdentifier  val govSteam0Id: UUID )
data class AssignRToGovSteam0Command(@TargetAggregateIdentifier  val govSteam0Id: UUID, val assignment: PU )
data class UnAssignRFromGovSteam0Command(@TargetAggregateIdentifier  val govSteam0Id: UUID )
data class AssignT1ToGovSteam0Command(@TargetAggregateIdentifier  val govSteam0Id: UUID, val assignment: Seconds )
data class UnAssignT1FromGovSteam0Command(@TargetAggregateIdentifier  val govSteam0Id: UUID )
data class AssignT2ToGovSteam0Command(@TargetAggregateIdentifier  val govSteam0Id: UUID, val assignment: Seconds )
data class UnAssignT2FromGovSteam0Command(@TargetAggregateIdentifier  val govSteam0Id: UUID )
data class AssignT3ToGovSteam0Command(@TargetAggregateIdentifier  val govSteam0Id: UUID, val assignment: Seconds )
data class UnAssignT3FromGovSteam0Command(@TargetAggregateIdentifier  val govSteam0Id: UUID )
data class AssignVmaxToGovSteam0Command(@TargetAggregateIdentifier  val govSteam0Id: UUID, val assignment: PU )
data class UnAssignVmaxFromGovSteam0Command(@TargetAggregateIdentifier  val govSteam0Id: UUID )
data class AssignVminToGovSteam0Command(@TargetAggregateIdentifier  val govSteam0Id: UUID, val assignment: PU )
data class UnAssignVminFromGovSteam0Command(@TargetAggregateIdentifier  val govSteam0Id: UUID )

// multiple association commands


// GovSteam1 Commands
data class CreateGovSteam1Command(
    @TargetAggregateIdentifier  var govSteam1Id: UUID? = null
)

data class UpdateGovSteam1Command(
    @TargetAggregateIdentifier var govSteam1Id: UUID? = null,
    var db1: Frequency,
    var db2: ActivePower,
    var eps: Frequency,
    var gv1: PU,
    var gv2: PU,
    var gv3: PU,
    var gv4: PU,
    var gv5: PU,
    var gv6: PU,
    var k: PU,
    var k1: Simple_Float,
    var k2: Simple_Float,
    var k3: Simple_Float,
    var k4: Simple_Float,
    var k5: Simple_Float,
    var k6: Simple_Float,
    var k7: Simple_Float,
    var k8: Simple_Float,
    var mwbase: ActivePower,
    var pgv1: PU,
    var pgv2: PU,
    var pgv3: PU,
    var pgv4: PU,
    var pgv5: PU,
    var pgv6: PU,
    var pmax: PU,
    var pmin: PU,
    var sdb1: BooleanProxy,
    var sdb2: BooleanProxy,
    var t1: Seconds,
    var t2: Seconds,
    var t3: Seconds,
    var t4: Seconds,
    var t5: Seconds,
    var t6: Seconds,
    var t7: Seconds,
    var uc: Simple_Float,
    var uo: Simple_Float,
    var valve: BooleanProxy
)

data class DeleteGovSteam1Command(@TargetAggregateIdentifier  var govSteam1Id: UUID? = null)

// single association commands
data class AssignDb1ToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: Frequency )
data class UnAssignDb1FromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignDb2ToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: ActivePower )
data class UnAssignDb2FromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignEpsToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: Frequency )
data class UnAssignEpsFromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignGv1ToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: PU )
data class UnAssignGv1FromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignGv2ToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: PU )
data class UnAssignGv2FromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignGv3ToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: PU )
data class UnAssignGv3FromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignGv4ToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: PU )
data class UnAssignGv4FromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignGv5ToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: PU )
data class UnAssignGv5FromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignGv6ToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: PU )
data class UnAssignGv6FromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignKToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: PU )
data class UnAssignKFromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignK1ToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: Simple_Float )
data class UnAssignK1FromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignK2ToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: Simple_Float )
data class UnAssignK2FromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignK3ToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: Simple_Float )
data class UnAssignK3FromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignK4ToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: Simple_Float )
data class UnAssignK4FromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignK5ToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: Simple_Float )
data class UnAssignK5FromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignK6ToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: Simple_Float )
data class UnAssignK6FromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignK7ToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: Simple_Float )
data class UnAssignK7FromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignK8ToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: Simple_Float )
data class UnAssignK8FromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignMwbaseToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: ActivePower )
data class UnAssignMwbaseFromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignPgv1ToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: PU )
data class UnAssignPgv1FromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignPgv2ToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: PU )
data class UnAssignPgv2FromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignPgv3ToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: PU )
data class UnAssignPgv3FromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignPgv4ToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: PU )
data class UnAssignPgv4FromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignPgv5ToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: PU )
data class UnAssignPgv5FromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignPgv6ToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: PU )
data class UnAssignPgv6FromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignPmaxToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: PU )
data class UnAssignPmaxFromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignPminToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: PU )
data class UnAssignPminFromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignSdb1ToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: BooleanProxy )
data class UnAssignSdb1FromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignSdb2ToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: BooleanProxy )
data class UnAssignSdb2FromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignT1ToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: Seconds )
data class UnAssignT1FromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignT2ToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: Seconds )
data class UnAssignT2FromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignT3ToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: Seconds )
data class UnAssignT3FromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignT4ToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: Seconds )
data class UnAssignT4FromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignT5ToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: Seconds )
data class UnAssignT5FromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignT6ToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: Seconds )
data class UnAssignT6FromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignT7ToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: Seconds )
data class UnAssignT7FromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignUcToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: Simple_Float )
data class UnAssignUcFromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignUoToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: Simple_Float )
data class UnAssignUoFromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )
data class AssignValveToGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID, val assignment: BooleanProxy )
data class UnAssignValveFromGovSteam1Command(@TargetAggregateIdentifier  val govSteam1Id: UUID )

// multiple association commands


// GovSteam2 Commands
data class CreateGovSteam2Command(
    @TargetAggregateIdentifier  var govSteam2Id: UUID? = null
)

data class UpdateGovSteam2Command(
    @TargetAggregateIdentifier var govSteam2Id: UUID? = null,
    var dbf: PU,
    var k: Simple_Float,
    var mnef: PU,
    var mxef: PU,
    var pmax: PU,
    var pmin: PU,
    var t1: Seconds,
    var t2: Seconds
)

data class DeleteGovSteam2Command(@TargetAggregateIdentifier  var govSteam2Id: UUID? = null)

// single association commands
data class AssignDbfToGovSteam2Command(@TargetAggregateIdentifier  val govSteam2Id: UUID, val assignment: PU )
data class UnAssignDbfFromGovSteam2Command(@TargetAggregateIdentifier  val govSteam2Id: UUID )
data class AssignKToGovSteam2Command(@TargetAggregateIdentifier  val govSteam2Id: UUID, val assignment: Simple_Float )
data class UnAssignKFromGovSteam2Command(@TargetAggregateIdentifier  val govSteam2Id: UUID )
data class AssignMnefToGovSteam2Command(@TargetAggregateIdentifier  val govSteam2Id: UUID, val assignment: PU )
data class UnAssignMnefFromGovSteam2Command(@TargetAggregateIdentifier  val govSteam2Id: UUID )
data class AssignMxefToGovSteam2Command(@TargetAggregateIdentifier  val govSteam2Id: UUID, val assignment: PU )
data class UnAssignMxefFromGovSteam2Command(@TargetAggregateIdentifier  val govSteam2Id: UUID )
data class AssignPmaxToGovSteam2Command(@TargetAggregateIdentifier  val govSteam2Id: UUID, val assignment: PU )
data class UnAssignPmaxFromGovSteam2Command(@TargetAggregateIdentifier  val govSteam2Id: UUID )
data class AssignPminToGovSteam2Command(@TargetAggregateIdentifier  val govSteam2Id: UUID, val assignment: PU )
data class UnAssignPminFromGovSteam2Command(@TargetAggregateIdentifier  val govSteam2Id: UUID )
data class AssignT1ToGovSteam2Command(@TargetAggregateIdentifier  val govSteam2Id: UUID, val assignment: Seconds )
data class UnAssignT1FromGovSteam2Command(@TargetAggregateIdentifier  val govSteam2Id: UUID )
data class AssignT2ToGovSteam2Command(@TargetAggregateIdentifier  val govSteam2Id: UUID, val assignment: Seconds )
data class UnAssignT2FromGovSteam2Command(@TargetAggregateIdentifier  val govSteam2Id: UUID )

// multiple association commands


// GovSteamCC Commands
data class CreateGovSteamCCCommand(
    @TargetAggregateIdentifier  var govSteamCCId: UUID? = null
)

data class UpdateGovSteamCCCommand(
    @TargetAggregateIdentifier var govSteamCCId: UUID? = null,
    var dhp: PU,
    var dlp: PU,
    var fhp: PU,
    var flp: PU,
    var mwbase: ActivePower,
    var pmaxhp: PU,
    var pmaxlp: PU,
    var rhp: PU,
    var rlp: PU,
    var t1hp: Seconds,
    var t1lp: Seconds,
    var t3hp: Seconds,
    var t3lp: Seconds,
    var t4hp: Seconds,
    var t4lp: Seconds,
    var t5hp: Seconds,
    var t5lp: Seconds
)

data class DeleteGovSteamCCCommand(@TargetAggregateIdentifier  var govSteamCCId: UUID? = null)

// single association commands
data class AssignDhpToGovSteamCCCommand(@TargetAggregateIdentifier  val govSteamCCId: UUID, val assignment: PU )
data class UnAssignDhpFromGovSteamCCCommand(@TargetAggregateIdentifier  val govSteamCCId: UUID )
data class AssignDlpToGovSteamCCCommand(@TargetAggregateIdentifier  val govSteamCCId: UUID, val assignment: PU )
data class UnAssignDlpFromGovSteamCCCommand(@TargetAggregateIdentifier  val govSteamCCId: UUID )
data class AssignFhpToGovSteamCCCommand(@TargetAggregateIdentifier  val govSteamCCId: UUID, val assignment: PU )
data class UnAssignFhpFromGovSteamCCCommand(@TargetAggregateIdentifier  val govSteamCCId: UUID )
data class AssignFlpToGovSteamCCCommand(@TargetAggregateIdentifier  val govSteamCCId: UUID, val assignment: PU )
data class UnAssignFlpFromGovSteamCCCommand(@TargetAggregateIdentifier  val govSteamCCId: UUID )
data class AssignMwbaseToGovSteamCCCommand(@TargetAggregateIdentifier  val govSteamCCId: UUID, val assignment: ActivePower )
data class UnAssignMwbaseFromGovSteamCCCommand(@TargetAggregateIdentifier  val govSteamCCId: UUID )
data class AssignPmaxhpToGovSteamCCCommand(@TargetAggregateIdentifier  val govSteamCCId: UUID, val assignment: PU )
data class UnAssignPmaxhpFromGovSteamCCCommand(@TargetAggregateIdentifier  val govSteamCCId: UUID )
data class AssignPmaxlpToGovSteamCCCommand(@TargetAggregateIdentifier  val govSteamCCId: UUID, val assignment: PU )
data class UnAssignPmaxlpFromGovSteamCCCommand(@TargetAggregateIdentifier  val govSteamCCId: UUID )
data class AssignRhpToGovSteamCCCommand(@TargetAggregateIdentifier  val govSteamCCId: UUID, val assignment: PU )
data class UnAssignRhpFromGovSteamCCCommand(@TargetAggregateIdentifier  val govSteamCCId: UUID )
data class AssignRlpToGovSteamCCCommand(@TargetAggregateIdentifier  val govSteamCCId: UUID, val assignment: PU )
data class UnAssignRlpFromGovSteamCCCommand(@TargetAggregateIdentifier  val govSteamCCId: UUID )
data class AssignT1hpToGovSteamCCCommand(@TargetAggregateIdentifier  val govSteamCCId: UUID, val assignment: Seconds )
data class UnAssignT1hpFromGovSteamCCCommand(@TargetAggregateIdentifier  val govSteamCCId: UUID )
data class AssignT1lpToGovSteamCCCommand(@TargetAggregateIdentifier  val govSteamCCId: UUID, val assignment: Seconds )
data class UnAssignT1lpFromGovSteamCCCommand(@TargetAggregateIdentifier  val govSteamCCId: UUID )
data class AssignT3hpToGovSteamCCCommand(@TargetAggregateIdentifier  val govSteamCCId: UUID, val assignment: Seconds )
data class UnAssignT3hpFromGovSteamCCCommand(@TargetAggregateIdentifier  val govSteamCCId: UUID )
data class AssignT3lpToGovSteamCCCommand(@TargetAggregateIdentifier  val govSteamCCId: UUID, val assignment: Seconds )
data class UnAssignT3lpFromGovSteamCCCommand(@TargetAggregateIdentifier  val govSteamCCId: UUID )
data class AssignT4hpToGovSteamCCCommand(@TargetAggregateIdentifier  val govSteamCCId: UUID, val assignment: Seconds )
data class UnAssignT4hpFromGovSteamCCCommand(@TargetAggregateIdentifier  val govSteamCCId: UUID )
data class AssignT4lpToGovSteamCCCommand(@TargetAggregateIdentifier  val govSteamCCId: UUID, val assignment: Seconds )
data class UnAssignT4lpFromGovSteamCCCommand(@TargetAggregateIdentifier  val govSteamCCId: UUID )
data class AssignT5hpToGovSteamCCCommand(@TargetAggregateIdentifier  val govSteamCCId: UUID, val assignment: Seconds )
data class UnAssignT5hpFromGovSteamCCCommand(@TargetAggregateIdentifier  val govSteamCCId: UUID )
data class AssignT5lpToGovSteamCCCommand(@TargetAggregateIdentifier  val govSteamCCId: UUID, val assignment: Seconds )
data class UnAssignT5lpFromGovSteamCCCommand(@TargetAggregateIdentifier  val govSteamCCId: UUID )

// multiple association commands


// GovSteamEU Commands
data class CreateGovSteamEUCommand(
    @TargetAggregateIdentifier  var govSteamEUId: UUID? = null
)

data class UpdateGovSteamEUCommand(
    @TargetAggregateIdentifier var govSteamEUId: UUID? = null,
    var chc: Simple_Float,
    var cho: Simple_Float,
    var cic: PU,
    var cio: PU,
    var db1: PU,
    var db2: PU,
    var hhpmax: PU,
    var ke: PU,
    var kfcor: PU,
    var khp: PU,
    var klp: PU,
    var kwcor: PU,
    var mwbase: ActivePower,
    var pmax: PU,
    var prhmax: PU,
    var simx: PU,
    var tb: Seconds,
    var tdp: Seconds,
    var ten: Seconds,
    var tf: Seconds,
    var tfp: Seconds,
    var thp: Seconds,
    var tip: Seconds,
    var tlp: Seconds,
    var tp: Seconds,
    var trh: Seconds,
    var tvhp: Seconds,
    var tvip: Seconds,
    var tw: Seconds,
    var wfmax: PU,
    var wfmin: PU,
    var wmax1: PU,
    var wmax2: PU,
    var wwmax: PU,
    var wwmin: PU
)

data class DeleteGovSteamEUCommand(@TargetAggregateIdentifier  var govSteamEUId: UUID? = null)

// single association commands
data class AssignChcToGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID, val assignment: Simple_Float )
data class UnAssignChcFromGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID )
data class AssignChoToGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID, val assignment: Simple_Float )
data class UnAssignChoFromGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID )
data class AssignCicToGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID, val assignment: PU )
data class UnAssignCicFromGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID )
data class AssignCioToGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID, val assignment: PU )
data class UnAssignCioFromGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID )
data class AssignDb1ToGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID, val assignment: PU )
data class UnAssignDb1FromGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID )
data class AssignDb2ToGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID, val assignment: PU )
data class UnAssignDb2FromGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID )
data class AssignHhpmaxToGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID, val assignment: PU )
data class UnAssignHhpmaxFromGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID )
data class AssignKeToGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID, val assignment: PU )
data class UnAssignKeFromGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID )
data class AssignKfcorToGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID, val assignment: PU )
data class UnAssignKfcorFromGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID )
data class AssignKhpToGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID, val assignment: PU )
data class UnAssignKhpFromGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID )
data class AssignKlpToGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID, val assignment: PU )
data class UnAssignKlpFromGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID )
data class AssignKwcorToGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID, val assignment: PU )
data class UnAssignKwcorFromGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID )
data class AssignMwbaseToGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID, val assignment: ActivePower )
data class UnAssignMwbaseFromGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID )
data class AssignPmaxToGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID, val assignment: PU )
data class UnAssignPmaxFromGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID )
data class AssignPrhmaxToGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID, val assignment: PU )
data class UnAssignPrhmaxFromGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID )
data class AssignSimxToGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID, val assignment: PU )
data class UnAssignSimxFromGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID )
data class AssignTbToGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID, val assignment: Seconds )
data class UnAssignTbFromGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID )
data class AssignTdpToGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID, val assignment: Seconds )
data class UnAssignTdpFromGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID )
data class AssignTenToGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID, val assignment: Seconds )
data class UnAssignTenFromGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID )
data class AssignTfToGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID, val assignment: Seconds )
data class UnAssignTfFromGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID )
data class AssignTfpToGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID, val assignment: Seconds )
data class UnAssignTfpFromGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID )
data class AssignThpToGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID, val assignment: Seconds )
data class UnAssignThpFromGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID )
data class AssignTipToGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID, val assignment: Seconds )
data class UnAssignTipFromGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID )
data class AssignTlpToGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID, val assignment: Seconds )
data class UnAssignTlpFromGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID )
data class AssignTpToGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID, val assignment: Seconds )
data class UnAssignTpFromGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID )
data class AssignTrhToGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID, val assignment: Seconds )
data class UnAssignTrhFromGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID )
data class AssignTvhpToGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID, val assignment: Seconds )
data class UnAssignTvhpFromGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID )
data class AssignTvipToGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID, val assignment: Seconds )
data class UnAssignTvipFromGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID )
data class AssignTwToGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID, val assignment: Seconds )
data class UnAssignTwFromGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID )
data class AssignWfmaxToGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID, val assignment: PU )
data class UnAssignWfmaxFromGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID )
data class AssignWfminToGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID, val assignment: PU )
data class UnAssignWfminFromGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID )
data class AssignWmax1ToGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID, val assignment: PU )
data class UnAssignWmax1FromGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID )
data class AssignWmax2ToGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID, val assignment: PU )
data class UnAssignWmax2FromGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID )
data class AssignWwmaxToGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID, val assignment: PU )
data class UnAssignWwmaxFromGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID )
data class AssignWwminToGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID, val assignment: PU )
data class UnAssignWwminFromGovSteamEUCommand(@TargetAggregateIdentifier  val govSteamEUId: UUID )

// multiple association commands


// GovSteamFV2 Commands
data class CreateGovSteamFV2Command(
    @TargetAggregateIdentifier  var govSteamFV2Id: UUID? = null
)

data class UpdateGovSteamFV2Command(
    @TargetAggregateIdentifier var govSteamFV2Id: UUID? = null,
    var dt: PU,
    var k: PU,
    var mwbase: ActivePower,
    var r: PU,
    var t1: Seconds,
    var t3: Seconds,
    var ta: Seconds,
    var tb: Seconds,
    var tc: Seconds,
    var ti: Seconds,
    var tt: Seconds,
    var vmax: PU,
    var vmin: PU
)

data class DeleteGovSteamFV2Command(@TargetAggregateIdentifier  var govSteamFV2Id: UUID? = null)

// single association commands
data class AssignDtToGovSteamFV2Command(@TargetAggregateIdentifier  val govSteamFV2Id: UUID, val assignment: PU )
data class UnAssignDtFromGovSteamFV2Command(@TargetAggregateIdentifier  val govSteamFV2Id: UUID )
data class AssignKToGovSteamFV2Command(@TargetAggregateIdentifier  val govSteamFV2Id: UUID, val assignment: PU )
data class UnAssignKFromGovSteamFV2Command(@TargetAggregateIdentifier  val govSteamFV2Id: UUID )
data class AssignMwbaseToGovSteamFV2Command(@TargetAggregateIdentifier  val govSteamFV2Id: UUID, val assignment: ActivePower )
data class UnAssignMwbaseFromGovSteamFV2Command(@TargetAggregateIdentifier  val govSteamFV2Id: UUID )
data class AssignRToGovSteamFV2Command(@TargetAggregateIdentifier  val govSteamFV2Id: UUID, val assignment: PU )
data class UnAssignRFromGovSteamFV2Command(@TargetAggregateIdentifier  val govSteamFV2Id: UUID )
data class AssignT1ToGovSteamFV2Command(@TargetAggregateIdentifier  val govSteamFV2Id: UUID, val assignment: Seconds )
data class UnAssignT1FromGovSteamFV2Command(@TargetAggregateIdentifier  val govSteamFV2Id: UUID )
data class AssignT3ToGovSteamFV2Command(@TargetAggregateIdentifier  val govSteamFV2Id: UUID, val assignment: Seconds )
data class UnAssignT3FromGovSteamFV2Command(@TargetAggregateIdentifier  val govSteamFV2Id: UUID )
data class AssignTaToGovSteamFV2Command(@TargetAggregateIdentifier  val govSteamFV2Id: UUID, val assignment: Seconds )
data class UnAssignTaFromGovSteamFV2Command(@TargetAggregateIdentifier  val govSteamFV2Id: UUID )
data class AssignTbToGovSteamFV2Command(@TargetAggregateIdentifier  val govSteamFV2Id: UUID, val assignment: Seconds )
data class UnAssignTbFromGovSteamFV2Command(@TargetAggregateIdentifier  val govSteamFV2Id: UUID )
data class AssignTcToGovSteamFV2Command(@TargetAggregateIdentifier  val govSteamFV2Id: UUID, val assignment: Seconds )
data class UnAssignTcFromGovSteamFV2Command(@TargetAggregateIdentifier  val govSteamFV2Id: UUID )
data class AssignTiToGovSteamFV2Command(@TargetAggregateIdentifier  val govSteamFV2Id: UUID, val assignment: Seconds )
data class UnAssignTiFromGovSteamFV2Command(@TargetAggregateIdentifier  val govSteamFV2Id: UUID )
data class AssignTtToGovSteamFV2Command(@TargetAggregateIdentifier  val govSteamFV2Id: UUID, val assignment: Seconds )
data class UnAssignTtFromGovSteamFV2Command(@TargetAggregateIdentifier  val govSteamFV2Id: UUID )
data class AssignVmaxToGovSteamFV2Command(@TargetAggregateIdentifier  val govSteamFV2Id: UUID, val assignment: PU )
data class UnAssignVmaxFromGovSteamFV2Command(@TargetAggregateIdentifier  val govSteamFV2Id: UUID )
data class AssignVminToGovSteamFV2Command(@TargetAggregateIdentifier  val govSteamFV2Id: UUID, val assignment: PU )
data class UnAssignVminFromGovSteamFV2Command(@TargetAggregateIdentifier  val govSteamFV2Id: UUID )

// multiple association commands


// GovSteamFV3 Commands
data class CreateGovSteamFV3Command(
    @TargetAggregateIdentifier  var govSteamFV3Id: UUID? = null
)

data class UpdateGovSteamFV3Command(
    @TargetAggregateIdentifier var govSteamFV3Id: UUID? = null,
    var k: PU,
    var k1: PU,
    var k2: PU,
    var k3: PU,
    var mwbase: ActivePower,
    var pmax: PU,
    var pmin: PU,
    var prmax: PU,
    var t1: Seconds,
    var t2: Seconds,
    var t3: Seconds,
    var t4: Seconds,
    var t5: Seconds,
    var t6: Seconds,
    var ta: Seconds,
    var tb: Seconds,
    var tc: Seconds,
    var uc: Simple_Float,
    var uo: Simple_Float
)

data class DeleteGovSteamFV3Command(@TargetAggregateIdentifier  var govSteamFV3Id: UUID? = null)

// single association commands
data class AssignKToGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID, val assignment: PU )
data class UnAssignKFromGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID )
data class AssignK1ToGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID, val assignment: PU )
data class UnAssignK1FromGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID )
data class AssignK2ToGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID, val assignment: PU )
data class UnAssignK2FromGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID )
data class AssignK3ToGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID, val assignment: PU )
data class UnAssignK3FromGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID )
data class AssignMwbaseToGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID, val assignment: ActivePower )
data class UnAssignMwbaseFromGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID )
data class AssignPmaxToGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID, val assignment: PU )
data class UnAssignPmaxFromGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID )
data class AssignPminToGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID, val assignment: PU )
data class UnAssignPminFromGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID )
data class AssignPrmaxToGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID, val assignment: PU )
data class UnAssignPrmaxFromGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID )
data class AssignT1ToGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID, val assignment: Seconds )
data class UnAssignT1FromGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID )
data class AssignT2ToGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID, val assignment: Seconds )
data class UnAssignT2FromGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID )
data class AssignT3ToGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID, val assignment: Seconds )
data class UnAssignT3FromGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID )
data class AssignT4ToGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID, val assignment: Seconds )
data class UnAssignT4FromGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID )
data class AssignT5ToGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID, val assignment: Seconds )
data class UnAssignT5FromGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID )
data class AssignT6ToGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID, val assignment: Seconds )
data class UnAssignT6FromGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID )
data class AssignTaToGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID, val assignment: Seconds )
data class UnAssignTaFromGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID )
data class AssignTbToGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID, val assignment: Seconds )
data class UnAssignTbFromGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID )
data class AssignTcToGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID, val assignment: Seconds )
data class UnAssignTcFromGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID )
data class AssignUcToGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID, val assignment: Simple_Float )
data class UnAssignUcFromGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID )
data class AssignUoToGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID, val assignment: Simple_Float )
data class UnAssignUoFromGovSteamFV3Command(@TargetAggregateIdentifier  val govSteamFV3Id: UUID )

// multiple association commands


// GovSteamFV4 Commands
data class CreateGovSteamFV4Command(
    @TargetAggregateIdentifier  var govSteamFV4Id: UUID? = null
)

data class UpdateGovSteamFV4Command(
    @TargetAggregateIdentifier var govSteamFV4Id: UUID? = null,
    var cpsmn: PU,
    var cpsmx: PU,
    var crmn: PU,
    var crmx: PU,
    var kdc: PU,
    var kf1: PU,
    var kf3: PU,
    var khp: PU,
    var kic: PU,
    var kip: PU,
    var kit: PU,
    var kmp1: PU,
    var kmp2: PU,
    var kpc: PU,
    var kpp: PU,
    var kpt: PU,
    var krc: PU,
    var ksh: PU,
    var lpi: PU,
    var lps: PU,
    var mnef: PU,
    var mxef: PU,
    var pr1: PU,
    var pr2: PU,
    var psmn: PU,
    var rsmimn: PU,
    var rsmimx: PU,
    var rvgmn: PU,
    var rvgmx: PU,
    var srmn: PU,
    var srmx: PU,
    var srsmp: PU,
    var svmn: Simple_Float,
    var svmx: Simple_Float,
    var ta: Seconds,
    var tam: Seconds,
    var tc: Seconds,
    var tcm: Seconds,
    var tdc: Seconds,
    var tf1: Seconds,
    var tf2: Seconds,
    var thp: Seconds,
    var tmp: Seconds,
    var trh: Seconds,
    var tv: Seconds,
    var ty: Seconds,
    var y: PU,
    var yhpmn: PU,
    var yhpmx: PU,
    var ympmn: PU,
    var ympmx: PU
)

data class DeleteGovSteamFV4Command(@TargetAggregateIdentifier  var govSteamFV4Id: UUID? = null)

// single association commands
data class AssignCpsmnToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignCpsmnFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignCpsmxToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignCpsmxFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignCrmnToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignCrmnFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignCrmxToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignCrmxFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignKdcToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignKdcFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignKf1ToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignKf1FromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignKf3ToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignKf3FromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignKhpToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignKhpFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignKicToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignKicFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignKipToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignKipFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignKitToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignKitFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignKmp1ToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignKmp1FromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignKmp2ToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignKmp2FromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignKpcToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignKpcFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignKppToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignKppFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignKptToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignKptFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignKrcToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignKrcFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignKshToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignKshFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignLpiToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignLpiFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignLpsToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignLpsFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignMnefToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignMnefFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignMxefToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignMxefFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignPr1ToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignPr1FromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignPr2ToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignPr2FromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignPsmnToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignPsmnFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignRsmimnToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignRsmimnFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignRsmimxToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignRsmimxFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignRvgmnToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignRvgmnFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignRvgmxToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignRvgmxFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignSrmnToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignSrmnFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignSrmxToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignSrmxFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignSrsmpToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignSrsmpFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignSvmnToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: Simple_Float )
data class UnAssignSvmnFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignSvmxToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: Simple_Float )
data class UnAssignSvmxFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignTaToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: Seconds )
data class UnAssignTaFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignTamToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: Seconds )
data class UnAssignTamFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignTcToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: Seconds )
data class UnAssignTcFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignTcmToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: Seconds )
data class UnAssignTcmFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignTdcToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: Seconds )
data class UnAssignTdcFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignTf1ToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: Seconds )
data class UnAssignTf1FromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignTf2ToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: Seconds )
data class UnAssignTf2FromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignThpToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: Seconds )
data class UnAssignThpFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignTmpToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: Seconds )
data class UnAssignTmpFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignTrhToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: Seconds )
data class UnAssignTrhFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignTvToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: Seconds )
data class UnAssignTvFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignTyToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: Seconds )
data class UnAssignTyFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignYToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignYFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignYhpmnToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignYhpmnFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignYhpmxToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignYhpmxFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignYmpmnToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignYmpmnFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )
data class AssignYmpmxToGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID, val assignment: PU )
data class UnAssignYmpmxFromGovSteamFV4Command(@TargetAggregateIdentifier  val govSteamFV4Id: UUID )

// multiple association commands


// GovSteamIEEE1 Commands
data class CreateGovSteamIEEE1Command(
    @TargetAggregateIdentifier  var govSteamIEEE1Id: UUID? = null
)

data class UpdateGovSteamIEEE1Command(
    @TargetAggregateIdentifier var govSteamIEEE1Id: UUID? = null,
    var k: PU,
    var k1: Simple_Float,
    var k2: Simple_Float,
    var k3: Simple_Float,
    var k4: Simple_Float,
    var k5: Simple_Float,
    var k6: Simple_Float,
    var k7: Simple_Float,
    var k8: Simple_Float,
    var mwbase: ActivePower,
    var pmax: PU,
    var pmin: PU,
    var t1: Seconds,
    var t2: Seconds,
    var t3: Seconds,
    var t4: Seconds,
    var t5: Seconds,
    var t6: Seconds,
    var t7: Seconds,
    var uc: Simple_Float,
    var uo: Simple_Float
)

data class DeleteGovSteamIEEE1Command(@TargetAggregateIdentifier  var govSteamIEEE1Id: UUID? = null)

// single association commands
data class AssignKToGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID, val assignment: PU )
data class UnAssignKFromGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID )
data class AssignK1ToGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID, val assignment: Simple_Float )
data class UnAssignK1FromGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID )
data class AssignK2ToGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID, val assignment: Simple_Float )
data class UnAssignK2FromGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID )
data class AssignK3ToGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID, val assignment: Simple_Float )
data class UnAssignK3FromGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID )
data class AssignK4ToGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID, val assignment: Simple_Float )
data class UnAssignK4FromGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID )
data class AssignK5ToGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID, val assignment: Simple_Float )
data class UnAssignK5FromGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID )
data class AssignK6ToGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID, val assignment: Simple_Float )
data class UnAssignK6FromGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID )
data class AssignK7ToGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID, val assignment: Simple_Float )
data class UnAssignK7FromGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID )
data class AssignK8ToGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID, val assignment: Simple_Float )
data class UnAssignK8FromGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID )
data class AssignMwbaseToGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID, val assignment: ActivePower )
data class UnAssignMwbaseFromGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID )
data class AssignPmaxToGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID, val assignment: PU )
data class UnAssignPmaxFromGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID )
data class AssignPminToGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID, val assignment: PU )
data class UnAssignPminFromGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID )
data class AssignT1ToGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID, val assignment: Seconds )
data class UnAssignT1FromGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID )
data class AssignT2ToGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID, val assignment: Seconds )
data class UnAssignT2FromGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID )
data class AssignT3ToGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID, val assignment: Seconds )
data class UnAssignT3FromGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID )
data class AssignT4ToGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID, val assignment: Seconds )
data class UnAssignT4FromGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID )
data class AssignT5ToGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID, val assignment: Seconds )
data class UnAssignT5FromGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID )
data class AssignT6ToGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID, val assignment: Seconds )
data class UnAssignT6FromGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID )
data class AssignT7ToGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID, val assignment: Seconds )
data class UnAssignT7FromGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID )
data class AssignUcToGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID, val assignment: Simple_Float )
data class UnAssignUcFromGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID )
data class AssignUoToGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID, val assignment: Simple_Float )
data class UnAssignUoFromGovSteamIEEE1Command(@TargetAggregateIdentifier  val govSteamIEEE1Id: UUID )

// multiple association commands


// GovSteamSGO Commands
data class CreateGovSteamSGOCommand(
    @TargetAggregateIdentifier  var govSteamSGOId: UUID? = null
)

data class UpdateGovSteamSGOCommand(
    @TargetAggregateIdentifier var govSteamSGOId: UUID? = null,
    var k1: PU,
    var k2: PU,
    var k3: PU,
    var mwbase: ActivePower,
    var pmax: PU,
    var pmin: Seconds,
    var t1: Seconds,
    var t2: Seconds,
    var t3: Seconds,
    var t4: Seconds,
    var t5: Seconds,
    var t6: Seconds
)

data class DeleteGovSteamSGOCommand(@TargetAggregateIdentifier  var govSteamSGOId: UUID? = null)

// single association commands
data class AssignK1ToGovSteamSGOCommand(@TargetAggregateIdentifier  val govSteamSGOId: UUID, val assignment: PU )
data class UnAssignK1FromGovSteamSGOCommand(@TargetAggregateIdentifier  val govSteamSGOId: UUID )
data class AssignK2ToGovSteamSGOCommand(@TargetAggregateIdentifier  val govSteamSGOId: UUID, val assignment: PU )
data class UnAssignK2FromGovSteamSGOCommand(@TargetAggregateIdentifier  val govSteamSGOId: UUID )
data class AssignK3ToGovSteamSGOCommand(@TargetAggregateIdentifier  val govSteamSGOId: UUID, val assignment: PU )
data class UnAssignK3FromGovSteamSGOCommand(@TargetAggregateIdentifier  val govSteamSGOId: UUID )
data class AssignMwbaseToGovSteamSGOCommand(@TargetAggregateIdentifier  val govSteamSGOId: UUID, val assignment: ActivePower )
data class UnAssignMwbaseFromGovSteamSGOCommand(@TargetAggregateIdentifier  val govSteamSGOId: UUID )
data class AssignPmaxToGovSteamSGOCommand(@TargetAggregateIdentifier  val govSteamSGOId: UUID, val assignment: PU )
data class UnAssignPmaxFromGovSteamSGOCommand(@TargetAggregateIdentifier  val govSteamSGOId: UUID )
data class AssignPminToGovSteamSGOCommand(@TargetAggregateIdentifier  val govSteamSGOId: UUID, val assignment: Seconds )
data class UnAssignPminFromGovSteamSGOCommand(@TargetAggregateIdentifier  val govSteamSGOId: UUID )
data class AssignT1ToGovSteamSGOCommand(@TargetAggregateIdentifier  val govSteamSGOId: UUID, val assignment: Seconds )
data class UnAssignT1FromGovSteamSGOCommand(@TargetAggregateIdentifier  val govSteamSGOId: UUID )
data class AssignT2ToGovSteamSGOCommand(@TargetAggregateIdentifier  val govSteamSGOId: UUID, val assignment: Seconds )
data class UnAssignT2FromGovSteamSGOCommand(@TargetAggregateIdentifier  val govSteamSGOId: UUID )
data class AssignT3ToGovSteamSGOCommand(@TargetAggregateIdentifier  val govSteamSGOId: UUID, val assignment: Seconds )
data class UnAssignT3FromGovSteamSGOCommand(@TargetAggregateIdentifier  val govSteamSGOId: UUID )
data class AssignT4ToGovSteamSGOCommand(@TargetAggregateIdentifier  val govSteamSGOId: UUID, val assignment: Seconds )
data class UnAssignT4FromGovSteamSGOCommand(@TargetAggregateIdentifier  val govSteamSGOId: UUID )
data class AssignT5ToGovSteamSGOCommand(@TargetAggregateIdentifier  val govSteamSGOId: UUID, val assignment: Seconds )
data class UnAssignT5FromGovSteamSGOCommand(@TargetAggregateIdentifier  val govSteamSGOId: UUID )
data class AssignT6ToGovSteamSGOCommand(@TargetAggregateIdentifier  val govSteamSGOId: UUID, val assignment: Seconds )
data class UnAssignT6FromGovSteamSGOCommand(@TargetAggregateIdentifier  val govSteamSGOId: UUID )

// multiple association commands


// GrossToNetActivePowerCurve Commands
data class CreateGrossToNetActivePowerCurveCommand(
    @TargetAggregateIdentifier  var grossToNetActivePowerCurveId: UUID? = null
)

data class UpdateGrossToNetActivePowerCurveCommand(
    @TargetAggregateIdentifier  var grossToNetActivePowerCurveId: UUID? = null
)

data class DeleteGrossToNetActivePowerCurveCommand(@TargetAggregateIdentifier  var grossToNetActivePowerCurveId: UUID? = null)

// single association commands

// multiple association commands


// Ground Commands
data class CreateGroundCommand(
    @TargetAggregateIdentifier  var groundId: UUID? = null
)

data class UpdateGroundCommand(
    @TargetAggregateIdentifier  var groundId: UUID? = null
)

data class DeleteGroundCommand(@TargetAggregateIdentifier  var groundId: UUID? = null)

// single association commands

// multiple association commands


// GroundDisconnector Commands
data class CreateGroundDisconnectorCommand(
    @TargetAggregateIdentifier  var groundDisconnectorId: UUID? = null
)

data class UpdateGroundDisconnectorCommand(
    @TargetAggregateIdentifier  var groundDisconnectorId: UUID? = null
)

data class DeleteGroundDisconnectorCommand(@TargetAggregateIdentifier  var groundDisconnectorId: UUID? = null)

// single association commands

// multiple association commands


// GroundingImpedance Commands
data class CreateGroundingImpedanceCommand(
    @TargetAggregateIdentifier  var groundingImpedanceId: UUID? = null
)

data class UpdateGroundingImpedanceCommand(
    @TargetAggregateIdentifier var groundingImpedanceId: UUID? = null,
    var x: Reactance
)

data class DeleteGroundingImpedanceCommand(@TargetAggregateIdentifier  var groundingImpedanceId: UUID? = null)

// single association commands
data class AssignXToGroundingImpedanceCommand(@TargetAggregateIdentifier  val groundingImpedanceId: UUID, val assignment: Reactance )
data class UnAssignXFromGroundingImpedanceCommand(@TargetAggregateIdentifier  val groundingImpedanceId: UUID )

// multiple association commands


// HydroGeneratingUnit Commands
data class CreateHydroGeneratingUnitCommand(
    @TargetAggregateIdentifier var hydroGeneratingUnitId: UUID? = null,
    @Enumerated(EnumType.STRING) var energyConversionCapability: HydroEnergyConversionKind
)

data class UpdateHydroGeneratingUnitCommand(
    @TargetAggregateIdentifier var hydroGeneratingUnitId: UUID? = null,
    @Enumerated(EnumType.STRING) var energyConversionCapability: HydroEnergyConversionKind
)

data class DeleteHydroGeneratingUnitCommand(@TargetAggregateIdentifier  var hydroGeneratingUnitId: UUID? = null)

// single association commands

// multiple association commands


// HydroPowerPlant Commands
data class CreateHydroPowerPlantCommand(
    @TargetAggregateIdentifier var hydroPowerPlantId: UUID? = null,
    @Enumerated(EnumType.STRING) var hydroPlantStorageType: HydroPlantStorageKind
)

data class UpdateHydroPowerPlantCommand(
    @TargetAggregateIdentifier var hydroPowerPlantId: UUID? = null,
    @Enumerated(EnumType.STRING) var hydroPlantStorageType: HydroPlantStorageKind
)

data class DeleteHydroPowerPlantCommand(@TargetAggregateIdentifier  var hydroPowerPlantId: UUID? = null)

// single association commands

// multiple association commands


// HydroPump Commands
data class CreateHydroPumpCommand(
    @TargetAggregateIdentifier  var hydroPumpId: UUID? = null
)

data class UpdateHydroPumpCommand(
    @TargetAggregateIdentifier  var hydroPumpId: UUID? = null
)

data class DeleteHydroPumpCommand(@TargetAggregateIdentifier  var hydroPumpId: UUID? = null)

// single association commands

// multiple association commands


// IdentifiedObject Commands
data class CreateIdentifiedObjectCommand(
    @TargetAggregateIdentifier  var identifiedObjectId: UUID? = null
)

data class UpdateIdentifiedObjectCommand(
    @TargetAggregateIdentifier var identifiedObjectId: UUID? = null,
    var description: StringProxy,
    var energyIdentCodeEic: StringProxy,
    var mRID: StringProxy,
    var name: StringProxy,
    var shortName: StringProxy
)

data class DeleteIdentifiedObjectCommand(@TargetAggregateIdentifier  var identifiedObjectId: UUID? = null)

// single association commands
data class AssignDescriptionToIdentifiedObjectCommand(@TargetAggregateIdentifier  val identifiedObjectId: UUID, val assignment: StringProxy )
data class UnAssignDescriptionFromIdentifiedObjectCommand(@TargetAggregateIdentifier  val identifiedObjectId: UUID )
data class AssignEnergyIdentCodeEicToIdentifiedObjectCommand(@TargetAggregateIdentifier  val identifiedObjectId: UUID, val assignment: StringProxy )
data class UnAssignEnergyIdentCodeEicFromIdentifiedObjectCommand(@TargetAggregateIdentifier  val identifiedObjectId: UUID )
data class AssignMRIDToIdentifiedObjectCommand(@TargetAggregateIdentifier  val identifiedObjectId: UUID, val assignment: StringProxy )
data class UnAssignMRIDFromIdentifiedObjectCommand(@TargetAggregateIdentifier  val identifiedObjectId: UUID )
data class AssignNameToIdentifiedObjectCommand(@TargetAggregateIdentifier  val identifiedObjectId: UUID, val assignment: StringProxy )
data class UnAssignNameFromIdentifiedObjectCommand(@TargetAggregateIdentifier  val identifiedObjectId: UUID )
data class AssignShortNameToIdentifiedObjectCommand(@TargetAggregateIdentifier  val identifiedObjectId: UUID, val assignment: StringProxy )
data class UnAssignShortNameFromIdentifiedObjectCommand(@TargetAggregateIdentifier  val identifiedObjectId: UUID )

// multiple association commands


// Inductance Commands
data class CreateInductanceCommand(
    @TargetAggregateIdentifier var inductanceId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol
)

data class UpdateInductanceCommand(
    @TargetAggregateIdentifier var inductanceId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol,
    var value: FloatProxy
)

data class DeleteInductanceCommand(@TargetAggregateIdentifier  var inductanceId: UUID? = null)

// single association commands
data class AssignValueToInductanceCommand(@TargetAggregateIdentifier  val inductanceId: UUID, val assignment: FloatProxy )
data class UnAssignValueFromInductanceCommand(@TargetAggregateIdentifier  val inductanceId: UUID )

// multiple association commands


// InductancePerLength Commands
data class CreateInductancePerLengthCommand(
    @TargetAggregateIdentifier var inductancePerLengthId: UUID? = null,
    @Enumerated(EnumType.STRING) var denominatorMultiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var denominatorUnit: UnitSymbol,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol
)

data class UpdateInductancePerLengthCommand(
    @TargetAggregateIdentifier var inductancePerLengthId: UUID? = null,
    @Enumerated(EnumType.STRING) var denominatorMultiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var denominatorUnit: UnitSymbol,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol,
    var value: FloatProxy
)

data class DeleteInductancePerLengthCommand(@TargetAggregateIdentifier  var inductancePerLengthId: UUID? = null)

// single association commands
data class AssignValueToInductancePerLengthCommand(@TargetAggregateIdentifier  val inductancePerLengthId: UUID, val assignment: FloatProxy )
data class UnAssignValueFromInductancePerLengthCommand(@TargetAggregateIdentifier  val inductancePerLengthId: UUID )

// multiple association commands


// IntegerProxy Commands
data class CreateIntegerProxyCommand(
    @TargetAggregateIdentifier  var integerProxyId: UUID? = null
)

data class UpdateIntegerProxyCommand(
    @TargetAggregateIdentifier  var integerProxyId: UUID? = null
)

data class DeleteIntegerProxyCommand(@TargetAggregateIdentifier  var integerProxyId: UUID? = null)

// single association commands

// multiple association commands


// Junction Commands
data class CreateJunctionCommand(
    @TargetAggregateIdentifier  var junctionId: UUID? = null
)

data class UpdateJunctionCommand(
    @TargetAggregateIdentifier  var junctionId: UUID? = null
)

data class DeleteJunctionCommand(@TargetAggregateIdentifier  var junctionId: UUID? = null)

// single association commands

// multiple association commands


// Length Commands
data class CreateLengthCommand(
    @TargetAggregateIdentifier var lengthId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol
)

data class UpdateLengthCommand(
    @TargetAggregateIdentifier var lengthId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol,
    var value: FloatProxy
)

data class DeleteLengthCommand(@TargetAggregateIdentifier  var lengthId: UUID? = null)

// single association commands
data class AssignValueToLengthCommand(@TargetAggregateIdentifier  val lengthId: UUID, val assignment: FloatProxy )
data class UnAssignValueFromLengthCommand(@TargetAggregateIdentifier  val lengthId: UUID )

// multiple association commands


// Limit Commands
data class CreateLimitCommand(
    @TargetAggregateIdentifier  var limitId: UUID? = null
)

data class UpdateLimitCommand(
    @TargetAggregateIdentifier  var limitId: UUID? = null
)

data class DeleteLimitCommand(@TargetAggregateIdentifier  var limitId: UUID? = null)

// single association commands

// multiple association commands


// LimitSet Commands
data class CreateLimitSetCommand(
    @TargetAggregateIdentifier  var limitSetId: UUID? = null
)

data class UpdateLimitSetCommand(
    @TargetAggregateIdentifier var limitSetId: UUID? = null,
    var percentageLimitsFlag: BooleanProxy
)

data class DeleteLimitSetCommand(@TargetAggregateIdentifier  var limitSetId: UUID? = null)

// single association commands
data class AssignPercentageLimitsFlagToLimitSetCommand(@TargetAggregateIdentifier  val limitSetId: UUID, val assignment: BooleanProxy )
data class UnAssignPercentageLimitsFlagFromLimitSetCommand(@TargetAggregateIdentifier  val limitSetId: UUID )

// multiple association commands


// Line Commands
data class CreateLineCommand(
    @TargetAggregateIdentifier  var lineId: UUID? = null
)

data class UpdateLineCommand(
    @TargetAggregateIdentifier  var lineId: UUID? = null
)

data class DeleteLineCommand(@TargetAggregateIdentifier  var lineId: UUID? = null)

// single association commands

// multiple association commands


// LinearShuntCompensator Commands
data class CreateLinearShuntCompensatorCommand(
    @TargetAggregateIdentifier  var linearShuntCompensatorId: UUID? = null
)

data class UpdateLinearShuntCompensatorCommand(
    @TargetAggregateIdentifier var linearShuntCompensatorId: UUID? = null,
    var b0PerSection: Susceptance,
    var bPerSection: Susceptance,
    var g0PerSection: Conductance,
    var gPerSection: Conductance
)

data class DeleteLinearShuntCompensatorCommand(@TargetAggregateIdentifier  var linearShuntCompensatorId: UUID? = null)

// single association commands
data class AssignB0PerSectionToLinearShuntCompensatorCommand(@TargetAggregateIdentifier  val linearShuntCompensatorId: UUID, val assignment: Susceptance )
data class UnAssignB0PerSectionFromLinearShuntCompensatorCommand(@TargetAggregateIdentifier  val linearShuntCompensatorId: UUID )
data class AssignBPerSectionToLinearShuntCompensatorCommand(@TargetAggregateIdentifier  val linearShuntCompensatorId: UUID, val assignment: Susceptance )
data class UnAssignBPerSectionFromLinearShuntCompensatorCommand(@TargetAggregateIdentifier  val linearShuntCompensatorId: UUID )
data class AssignG0PerSectionToLinearShuntCompensatorCommand(@TargetAggregateIdentifier  val linearShuntCompensatorId: UUID, val assignment: Conductance )
data class UnAssignG0PerSectionFromLinearShuntCompensatorCommand(@TargetAggregateIdentifier  val linearShuntCompensatorId: UUID )
data class AssignGPerSectionToLinearShuntCompensatorCommand(@TargetAggregateIdentifier  val linearShuntCompensatorId: UUID, val assignment: Conductance )
data class UnAssignGPerSectionFromLinearShuntCompensatorCommand(@TargetAggregateIdentifier  val linearShuntCompensatorId: UUID )

// multiple association commands


// LoadAggregate Commands
data class CreateLoadAggregateCommand(
    @TargetAggregateIdentifier  var loadAggregateId: UUID? = null
)

data class UpdateLoadAggregateCommand(
    @TargetAggregateIdentifier  var loadAggregateId: UUID? = null
)

data class DeleteLoadAggregateCommand(@TargetAggregateIdentifier  var loadAggregateId: UUID? = null)

// single association commands

// multiple association commands


// LoadArea Commands
data class CreateLoadAreaCommand(
    @TargetAggregateIdentifier  var loadAreaId: UUID? = null
)

data class UpdateLoadAreaCommand(
    @TargetAggregateIdentifier  var loadAreaId: UUID? = null
)

data class DeleteLoadAreaCommand(@TargetAggregateIdentifier  var loadAreaId: UUID? = null)

// single association commands

// multiple association commands


// LoadBreakSwitch Commands
data class CreateLoadBreakSwitchCommand(
    @TargetAggregateIdentifier  var loadBreakSwitchId: UUID? = null
)

data class UpdateLoadBreakSwitchCommand(
    @TargetAggregateIdentifier  var loadBreakSwitchId: UUID? = null
)

data class DeleteLoadBreakSwitchCommand(@TargetAggregateIdentifier  var loadBreakSwitchId: UUID? = null)

// single association commands

// multiple association commands


// LoadComposite Commands
data class CreateLoadCompositeCommand(
    @TargetAggregateIdentifier  var loadCompositeId: UUID? = null
)

data class UpdateLoadCompositeCommand(
    @TargetAggregateIdentifier var loadCompositeId: UUID? = null,
    var epfd: Simple_Float,
    var epfs: Simple_Float,
    var epvd: Simple_Float,
    var epvs: Simple_Float,
    var eqfd: Simple_Float,
    var eqfs: Simple_Float,
    var eqvd: Simple_Float,
    var eqvs: Simple_Float,
    var h: Seconds,
    var lfrac: Simple_Float,
    var pfrac: Simple_Float
)

data class DeleteLoadCompositeCommand(@TargetAggregateIdentifier  var loadCompositeId: UUID? = null)

// single association commands
data class AssignEpfdToLoadCompositeCommand(@TargetAggregateIdentifier  val loadCompositeId: UUID, val assignment: Simple_Float )
data class UnAssignEpfdFromLoadCompositeCommand(@TargetAggregateIdentifier  val loadCompositeId: UUID )
data class AssignEpfsToLoadCompositeCommand(@TargetAggregateIdentifier  val loadCompositeId: UUID, val assignment: Simple_Float )
data class UnAssignEpfsFromLoadCompositeCommand(@TargetAggregateIdentifier  val loadCompositeId: UUID )
data class AssignEpvdToLoadCompositeCommand(@TargetAggregateIdentifier  val loadCompositeId: UUID, val assignment: Simple_Float )
data class UnAssignEpvdFromLoadCompositeCommand(@TargetAggregateIdentifier  val loadCompositeId: UUID )
data class AssignEpvsToLoadCompositeCommand(@TargetAggregateIdentifier  val loadCompositeId: UUID, val assignment: Simple_Float )
data class UnAssignEpvsFromLoadCompositeCommand(@TargetAggregateIdentifier  val loadCompositeId: UUID )
data class AssignEqfdToLoadCompositeCommand(@TargetAggregateIdentifier  val loadCompositeId: UUID, val assignment: Simple_Float )
data class UnAssignEqfdFromLoadCompositeCommand(@TargetAggregateIdentifier  val loadCompositeId: UUID )
data class AssignEqfsToLoadCompositeCommand(@TargetAggregateIdentifier  val loadCompositeId: UUID, val assignment: Simple_Float )
data class UnAssignEqfsFromLoadCompositeCommand(@TargetAggregateIdentifier  val loadCompositeId: UUID )
data class AssignEqvdToLoadCompositeCommand(@TargetAggregateIdentifier  val loadCompositeId: UUID, val assignment: Simple_Float )
data class UnAssignEqvdFromLoadCompositeCommand(@TargetAggregateIdentifier  val loadCompositeId: UUID )
data class AssignEqvsToLoadCompositeCommand(@TargetAggregateIdentifier  val loadCompositeId: UUID, val assignment: Simple_Float )
data class UnAssignEqvsFromLoadCompositeCommand(@TargetAggregateIdentifier  val loadCompositeId: UUID )
data class AssignHToLoadCompositeCommand(@TargetAggregateIdentifier  val loadCompositeId: UUID, val assignment: Seconds )
data class UnAssignHFromLoadCompositeCommand(@TargetAggregateIdentifier  val loadCompositeId: UUID )
data class AssignLfracToLoadCompositeCommand(@TargetAggregateIdentifier  val loadCompositeId: UUID, val assignment: Simple_Float )
data class UnAssignLfracFromLoadCompositeCommand(@TargetAggregateIdentifier  val loadCompositeId: UUID )
data class AssignPfracToLoadCompositeCommand(@TargetAggregateIdentifier  val loadCompositeId: UUID, val assignment: Simple_Float )
data class UnAssignPfracFromLoadCompositeCommand(@TargetAggregateIdentifier  val loadCompositeId: UUID )

// multiple association commands


// LoadDynamics Commands
data class CreateLoadDynamicsCommand(
    @TargetAggregateIdentifier  var loadDynamicsId: UUID? = null
)

data class UpdateLoadDynamicsCommand(
    @TargetAggregateIdentifier  var loadDynamicsId: UUID? = null
)

data class DeleteLoadDynamicsCommand(@TargetAggregateIdentifier  var loadDynamicsId: UUID? = null)

// single association commands

// multiple association commands


// LoadGenericNonLinear Commands
data class CreateLoadGenericNonLinearCommand(
    @TargetAggregateIdentifier var loadGenericNonLinearId: UUID? = null,
    @Enumerated(EnumType.STRING) var genericNonLinearLoadModelType: GenericNonLinearLoadModelKind
)

data class UpdateLoadGenericNonLinearCommand(
    @TargetAggregateIdentifier var loadGenericNonLinearId: UUID? = null,
    var bs: Simple_Float,
    var bt: Simple_Float,
    @Enumerated(EnumType.STRING) var genericNonLinearLoadModelType: GenericNonLinearLoadModelKind,
    var ls: Simple_Float,
    var lt: Simple_Float,
    var pt: Simple_Float,
    var qt: Simple_Float,
    var tp: Seconds,
    var tq: Seconds
)

data class DeleteLoadGenericNonLinearCommand(@TargetAggregateIdentifier  var loadGenericNonLinearId: UUID? = null)

// single association commands
data class AssignBsToLoadGenericNonLinearCommand(@TargetAggregateIdentifier  val loadGenericNonLinearId: UUID, val assignment: Simple_Float )
data class UnAssignBsFromLoadGenericNonLinearCommand(@TargetAggregateIdentifier  val loadGenericNonLinearId: UUID )
data class AssignBtToLoadGenericNonLinearCommand(@TargetAggregateIdentifier  val loadGenericNonLinearId: UUID, val assignment: Simple_Float )
data class UnAssignBtFromLoadGenericNonLinearCommand(@TargetAggregateIdentifier  val loadGenericNonLinearId: UUID )
data class AssignLsToLoadGenericNonLinearCommand(@TargetAggregateIdentifier  val loadGenericNonLinearId: UUID, val assignment: Simple_Float )
data class UnAssignLsFromLoadGenericNonLinearCommand(@TargetAggregateIdentifier  val loadGenericNonLinearId: UUID )
data class AssignLtToLoadGenericNonLinearCommand(@TargetAggregateIdentifier  val loadGenericNonLinearId: UUID, val assignment: Simple_Float )
data class UnAssignLtFromLoadGenericNonLinearCommand(@TargetAggregateIdentifier  val loadGenericNonLinearId: UUID )
data class AssignPtToLoadGenericNonLinearCommand(@TargetAggregateIdentifier  val loadGenericNonLinearId: UUID, val assignment: Simple_Float )
data class UnAssignPtFromLoadGenericNonLinearCommand(@TargetAggregateIdentifier  val loadGenericNonLinearId: UUID )
data class AssignQtToLoadGenericNonLinearCommand(@TargetAggregateIdentifier  val loadGenericNonLinearId: UUID, val assignment: Simple_Float )
data class UnAssignQtFromLoadGenericNonLinearCommand(@TargetAggregateIdentifier  val loadGenericNonLinearId: UUID )
data class AssignTpToLoadGenericNonLinearCommand(@TargetAggregateIdentifier  val loadGenericNonLinearId: UUID, val assignment: Seconds )
data class UnAssignTpFromLoadGenericNonLinearCommand(@TargetAggregateIdentifier  val loadGenericNonLinearId: UUID )
data class AssignTqToLoadGenericNonLinearCommand(@TargetAggregateIdentifier  val loadGenericNonLinearId: UUID, val assignment: Seconds )
data class UnAssignTqFromLoadGenericNonLinearCommand(@TargetAggregateIdentifier  val loadGenericNonLinearId: UUID )

// multiple association commands


// LoadGroup Commands
data class CreateLoadGroupCommand(
    @TargetAggregateIdentifier  var loadGroupId: UUID? = null
)

data class UpdateLoadGroupCommand(
    @TargetAggregateIdentifier  var loadGroupId: UUID? = null
)

data class DeleteLoadGroupCommand(@TargetAggregateIdentifier  var loadGroupId: UUID? = null)

// single association commands

// multiple association commands


// LoadMotor Commands
data class CreateLoadMotorCommand(
    @TargetAggregateIdentifier  var loadMotorId: UUID? = null
)

data class UpdateLoadMotorCommand(
    @TargetAggregateIdentifier var loadMotorId: UUID? = null,
    var d: Simple_Float,
    var h: Seconds,
    var lfac: Simple_Float,
    var lp: PU,
    var lpp: PU,
    var ls: PU,
    var pfrac: Simple_Float,
    var ra: PU,
    var tbkr: Seconds,
    var tpo: Seconds,
    var tppo: Seconds,
    var tv: Seconds,
    var vt: PU
)

data class DeleteLoadMotorCommand(@TargetAggregateIdentifier  var loadMotorId: UUID? = null)

// single association commands
data class AssignDToLoadMotorCommand(@TargetAggregateIdentifier  val loadMotorId: UUID, val assignment: Simple_Float )
data class UnAssignDFromLoadMotorCommand(@TargetAggregateIdentifier  val loadMotorId: UUID )
data class AssignHToLoadMotorCommand(@TargetAggregateIdentifier  val loadMotorId: UUID, val assignment: Seconds )
data class UnAssignHFromLoadMotorCommand(@TargetAggregateIdentifier  val loadMotorId: UUID )
data class AssignLfacToLoadMotorCommand(@TargetAggregateIdentifier  val loadMotorId: UUID, val assignment: Simple_Float )
data class UnAssignLfacFromLoadMotorCommand(@TargetAggregateIdentifier  val loadMotorId: UUID )
data class AssignLpToLoadMotorCommand(@TargetAggregateIdentifier  val loadMotorId: UUID, val assignment: PU )
data class UnAssignLpFromLoadMotorCommand(@TargetAggregateIdentifier  val loadMotorId: UUID )
data class AssignLppToLoadMotorCommand(@TargetAggregateIdentifier  val loadMotorId: UUID, val assignment: PU )
data class UnAssignLppFromLoadMotorCommand(@TargetAggregateIdentifier  val loadMotorId: UUID )
data class AssignLsToLoadMotorCommand(@TargetAggregateIdentifier  val loadMotorId: UUID, val assignment: PU )
data class UnAssignLsFromLoadMotorCommand(@TargetAggregateIdentifier  val loadMotorId: UUID )
data class AssignPfracToLoadMotorCommand(@TargetAggregateIdentifier  val loadMotorId: UUID, val assignment: Simple_Float )
data class UnAssignPfracFromLoadMotorCommand(@TargetAggregateIdentifier  val loadMotorId: UUID )
data class AssignRaToLoadMotorCommand(@TargetAggregateIdentifier  val loadMotorId: UUID, val assignment: PU )
data class UnAssignRaFromLoadMotorCommand(@TargetAggregateIdentifier  val loadMotorId: UUID )
data class AssignTbkrToLoadMotorCommand(@TargetAggregateIdentifier  val loadMotorId: UUID, val assignment: Seconds )
data class UnAssignTbkrFromLoadMotorCommand(@TargetAggregateIdentifier  val loadMotorId: UUID )
data class AssignTpoToLoadMotorCommand(@TargetAggregateIdentifier  val loadMotorId: UUID, val assignment: Seconds )
data class UnAssignTpoFromLoadMotorCommand(@TargetAggregateIdentifier  val loadMotorId: UUID )
data class AssignTppoToLoadMotorCommand(@TargetAggregateIdentifier  val loadMotorId: UUID, val assignment: Seconds )
data class UnAssignTppoFromLoadMotorCommand(@TargetAggregateIdentifier  val loadMotorId: UUID )
data class AssignTvToLoadMotorCommand(@TargetAggregateIdentifier  val loadMotorId: UUID, val assignment: Seconds )
data class UnAssignTvFromLoadMotorCommand(@TargetAggregateIdentifier  val loadMotorId: UUID )
data class AssignVtToLoadMotorCommand(@TargetAggregateIdentifier  val loadMotorId: UUID, val assignment: PU )
data class UnAssignVtFromLoadMotorCommand(@TargetAggregateIdentifier  val loadMotorId: UUID )

// multiple association commands


// LoadResponseCharacteristic Commands
data class CreateLoadResponseCharacteristicCommand(
    @TargetAggregateIdentifier  var loadResponseCharacteristicId: UUID? = null
)

data class UpdateLoadResponseCharacteristicCommand(
    @TargetAggregateIdentifier var loadResponseCharacteristicId: UUID? = null,
    var exponentModel: BooleanProxy,
    var pConstantCurrent: Simple_Float,
    var pConstantImpedance: Simple_Float,
    var pConstantPower: Simple_Float,
    var pFrequencyExponent: Simple_Float,
    var pVoltageExponent: Simple_Float,
    var qConstantCurrent: Simple_Float,
    var qConstantImpedance: Simple_Float,
    var qConstantPower: Simple_Float,
    var qFrequencyExponent: Simple_Float,
    var qVoltageExponent: Simple_Float
)

data class DeleteLoadResponseCharacteristicCommand(@TargetAggregateIdentifier  var loadResponseCharacteristicId: UUID? = null)

// single association commands
data class AssignExponentModelToLoadResponseCharacteristicCommand(@TargetAggregateIdentifier  val loadResponseCharacteristicId: UUID, val assignment: BooleanProxy )
data class UnAssignExponentModelFromLoadResponseCharacteristicCommand(@TargetAggregateIdentifier  val loadResponseCharacteristicId: UUID )
data class AssignPConstantCurrentToLoadResponseCharacteristicCommand(@TargetAggregateIdentifier  val loadResponseCharacteristicId: UUID, val assignment: Simple_Float )
data class UnAssignPConstantCurrentFromLoadResponseCharacteristicCommand(@TargetAggregateIdentifier  val loadResponseCharacteristicId: UUID )
data class AssignPConstantImpedanceToLoadResponseCharacteristicCommand(@TargetAggregateIdentifier  val loadResponseCharacteristicId: UUID, val assignment: Simple_Float )
data class UnAssignPConstantImpedanceFromLoadResponseCharacteristicCommand(@TargetAggregateIdentifier  val loadResponseCharacteristicId: UUID )
data class AssignPConstantPowerToLoadResponseCharacteristicCommand(@TargetAggregateIdentifier  val loadResponseCharacteristicId: UUID, val assignment: Simple_Float )
data class UnAssignPConstantPowerFromLoadResponseCharacteristicCommand(@TargetAggregateIdentifier  val loadResponseCharacteristicId: UUID )
data class AssignPFrequencyExponentToLoadResponseCharacteristicCommand(@TargetAggregateIdentifier  val loadResponseCharacteristicId: UUID, val assignment: Simple_Float )
data class UnAssignPFrequencyExponentFromLoadResponseCharacteristicCommand(@TargetAggregateIdentifier  val loadResponseCharacteristicId: UUID )
data class AssignPVoltageExponentToLoadResponseCharacteristicCommand(@TargetAggregateIdentifier  val loadResponseCharacteristicId: UUID, val assignment: Simple_Float )
data class UnAssignPVoltageExponentFromLoadResponseCharacteristicCommand(@TargetAggregateIdentifier  val loadResponseCharacteristicId: UUID )
data class AssignQConstantCurrentToLoadResponseCharacteristicCommand(@TargetAggregateIdentifier  val loadResponseCharacteristicId: UUID, val assignment: Simple_Float )
data class UnAssignQConstantCurrentFromLoadResponseCharacteristicCommand(@TargetAggregateIdentifier  val loadResponseCharacteristicId: UUID )
data class AssignQConstantImpedanceToLoadResponseCharacteristicCommand(@TargetAggregateIdentifier  val loadResponseCharacteristicId: UUID, val assignment: Simple_Float )
data class UnAssignQConstantImpedanceFromLoadResponseCharacteristicCommand(@TargetAggregateIdentifier  val loadResponseCharacteristicId: UUID )
data class AssignQConstantPowerToLoadResponseCharacteristicCommand(@TargetAggregateIdentifier  val loadResponseCharacteristicId: UUID, val assignment: Simple_Float )
data class UnAssignQConstantPowerFromLoadResponseCharacteristicCommand(@TargetAggregateIdentifier  val loadResponseCharacteristicId: UUID )
data class AssignQFrequencyExponentToLoadResponseCharacteristicCommand(@TargetAggregateIdentifier  val loadResponseCharacteristicId: UUID, val assignment: Simple_Float )
data class UnAssignQFrequencyExponentFromLoadResponseCharacteristicCommand(@TargetAggregateIdentifier  val loadResponseCharacteristicId: UUID )
data class AssignQVoltageExponentToLoadResponseCharacteristicCommand(@TargetAggregateIdentifier  val loadResponseCharacteristicId: UUID, val assignment: Simple_Float )
data class UnAssignQVoltageExponentFromLoadResponseCharacteristicCommand(@TargetAggregateIdentifier  val loadResponseCharacteristicId: UUID )

// multiple association commands


// LoadStatic Commands
data class CreateLoadStaticCommand(
    @TargetAggregateIdentifier var loadStaticId: UUID? = null,
    @Enumerated(EnumType.STRING) var staticLoadModelType: StaticLoadModelKind
)

data class UpdateLoadStaticCommand(
    @TargetAggregateIdentifier var loadStaticId: UUID? = null,
    var ep1: Simple_Float,
    var ep2: Simple_Float,
    var ep3: Simple_Float,
    var eq1: Simple_Float,
    var eq2: Simple_Float,
    var eq3: Simple_Float,
    var kp1: Simple_Float,
    var kp2: Simple_Float,
    var kp3: Simple_Float,
    var kp4: Simple_Float,
    var kpf: Simple_Float,
    var kq1: Simple_Float,
    var kq2: Simple_Float,
    var kq3: Simple_Float,
    var kq4: Simple_Float,
    var kqf: Simple_Float,
    @Enumerated(EnumType.STRING) var staticLoadModelType: StaticLoadModelKind
)

data class DeleteLoadStaticCommand(@TargetAggregateIdentifier  var loadStaticId: UUID? = null)

// single association commands
data class AssignEp1ToLoadStaticCommand(@TargetAggregateIdentifier  val loadStaticId: UUID, val assignment: Simple_Float )
data class UnAssignEp1FromLoadStaticCommand(@TargetAggregateIdentifier  val loadStaticId: UUID )
data class AssignEp2ToLoadStaticCommand(@TargetAggregateIdentifier  val loadStaticId: UUID, val assignment: Simple_Float )
data class UnAssignEp2FromLoadStaticCommand(@TargetAggregateIdentifier  val loadStaticId: UUID )
data class AssignEp3ToLoadStaticCommand(@TargetAggregateIdentifier  val loadStaticId: UUID, val assignment: Simple_Float )
data class UnAssignEp3FromLoadStaticCommand(@TargetAggregateIdentifier  val loadStaticId: UUID )
data class AssignEq1ToLoadStaticCommand(@TargetAggregateIdentifier  val loadStaticId: UUID, val assignment: Simple_Float )
data class UnAssignEq1FromLoadStaticCommand(@TargetAggregateIdentifier  val loadStaticId: UUID )
data class AssignEq2ToLoadStaticCommand(@TargetAggregateIdentifier  val loadStaticId: UUID, val assignment: Simple_Float )
data class UnAssignEq2FromLoadStaticCommand(@TargetAggregateIdentifier  val loadStaticId: UUID )
data class AssignEq3ToLoadStaticCommand(@TargetAggregateIdentifier  val loadStaticId: UUID, val assignment: Simple_Float )
data class UnAssignEq3FromLoadStaticCommand(@TargetAggregateIdentifier  val loadStaticId: UUID )
data class AssignKp1ToLoadStaticCommand(@TargetAggregateIdentifier  val loadStaticId: UUID, val assignment: Simple_Float )
data class UnAssignKp1FromLoadStaticCommand(@TargetAggregateIdentifier  val loadStaticId: UUID )
data class AssignKp2ToLoadStaticCommand(@TargetAggregateIdentifier  val loadStaticId: UUID, val assignment: Simple_Float )
data class UnAssignKp2FromLoadStaticCommand(@TargetAggregateIdentifier  val loadStaticId: UUID )
data class AssignKp3ToLoadStaticCommand(@TargetAggregateIdentifier  val loadStaticId: UUID, val assignment: Simple_Float )
data class UnAssignKp3FromLoadStaticCommand(@TargetAggregateIdentifier  val loadStaticId: UUID )
data class AssignKp4ToLoadStaticCommand(@TargetAggregateIdentifier  val loadStaticId: UUID, val assignment: Simple_Float )
data class UnAssignKp4FromLoadStaticCommand(@TargetAggregateIdentifier  val loadStaticId: UUID )
data class AssignKpfToLoadStaticCommand(@TargetAggregateIdentifier  val loadStaticId: UUID, val assignment: Simple_Float )
data class UnAssignKpfFromLoadStaticCommand(@TargetAggregateIdentifier  val loadStaticId: UUID )
data class AssignKq1ToLoadStaticCommand(@TargetAggregateIdentifier  val loadStaticId: UUID, val assignment: Simple_Float )
data class UnAssignKq1FromLoadStaticCommand(@TargetAggregateIdentifier  val loadStaticId: UUID )
data class AssignKq2ToLoadStaticCommand(@TargetAggregateIdentifier  val loadStaticId: UUID, val assignment: Simple_Float )
data class UnAssignKq2FromLoadStaticCommand(@TargetAggregateIdentifier  val loadStaticId: UUID )
data class AssignKq3ToLoadStaticCommand(@TargetAggregateIdentifier  val loadStaticId: UUID, val assignment: Simple_Float )
data class UnAssignKq3FromLoadStaticCommand(@TargetAggregateIdentifier  val loadStaticId: UUID )
data class AssignKq4ToLoadStaticCommand(@TargetAggregateIdentifier  val loadStaticId: UUID, val assignment: Simple_Float )
data class UnAssignKq4FromLoadStaticCommand(@TargetAggregateIdentifier  val loadStaticId: UUID )
data class AssignKqfToLoadStaticCommand(@TargetAggregateIdentifier  val loadStaticId: UUID, val assignment: Simple_Float )
data class UnAssignKqfFromLoadStaticCommand(@TargetAggregateIdentifier  val loadStaticId: UUID )

// multiple association commands


// LoadUserDefined Commands
data class CreateLoadUserDefinedCommand(
    @TargetAggregateIdentifier  var loadUserDefinedId: UUID? = null
)

data class UpdateLoadUserDefinedCommand(
    @TargetAggregateIdentifier var loadUserDefinedId: UUID? = null,
    var proprietary: BooleanProxy
)

data class DeleteLoadUserDefinedCommand(@TargetAggregateIdentifier  var loadUserDefinedId: UUID? = null)

// single association commands
data class AssignProprietaryToLoadUserDefinedCommand(@TargetAggregateIdentifier  val loadUserDefinedId: UUID, val assignment: BooleanProxy )
data class UnAssignProprietaryFromLoadUserDefinedCommand(@TargetAggregateIdentifier  val loadUserDefinedId: UUID )

// multiple association commands


// Location Commands
data class CreateLocationCommand(
    @TargetAggregateIdentifier  var locationId: UUID? = null
)

data class UpdateLocationCommand(
    @TargetAggregateIdentifier  var locationId: UUID? = null
)

data class DeleteLocationCommand(@TargetAggregateIdentifier  var locationId: UUID? = null)

// single association commands

// multiple association commands


// Measurement Commands
data class CreateMeasurementCommand(
    @TargetAggregateIdentifier var measurementId: UUID? = null,
    @Enumerated(EnumType.STRING) var phases: PhaseCode,
    @Enumerated(EnumType.STRING) var unitMultiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unitSymbol: UnitSymbol
)

data class UpdateMeasurementCommand(
    @TargetAggregateIdentifier var measurementId: UUID? = null,
    var measurementType: StringProxy,
    @Enumerated(EnumType.STRING) var phases: PhaseCode,
    @Enumerated(EnumType.STRING) var unitMultiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unitSymbol: UnitSymbol
)

data class DeleteMeasurementCommand(@TargetAggregateIdentifier  var measurementId: UUID? = null)

// single association commands
data class AssignMeasurementTypeToMeasurementCommand(@TargetAggregateIdentifier  val measurementId: UUID, val assignment: StringProxy )
data class UnAssignMeasurementTypeFromMeasurementCommand(@TargetAggregateIdentifier  val measurementId: UUID )

// multiple association commands


// MeasurementValue Commands
data class CreateMeasurementValueCommand(
    @TargetAggregateIdentifier  var measurementValueId: UUID? = null
)

data class UpdateMeasurementValueCommand(
    @TargetAggregateIdentifier var measurementValueId: UUID? = null,
    var sensorAccuracy: PerCent,
    var timeStamp: DateTime
)

data class DeleteMeasurementValueCommand(@TargetAggregateIdentifier  var measurementValueId: UUID? = null)

// single association commands
data class AssignSensorAccuracyToMeasurementValueCommand(@TargetAggregateIdentifier  val measurementValueId: UUID, val assignment: PerCent )
data class UnAssignSensorAccuracyFromMeasurementValueCommand(@TargetAggregateIdentifier  val measurementValueId: UUID )
data class AssignTimeStampToMeasurementValueCommand(@TargetAggregateIdentifier  val measurementValueId: UUID, val assignment: DateTime )
data class UnAssignTimeStampFromMeasurementValueCommand(@TargetAggregateIdentifier  val measurementValueId: UUID )

// multiple association commands


// MeasurementValueQuality Commands
data class CreateMeasurementValueQualityCommand(
    @TargetAggregateIdentifier  var measurementValueQualityId: UUID? = null
)

data class UpdateMeasurementValueQualityCommand(
    @TargetAggregateIdentifier  var measurementValueQualityId: UUID? = null
)

data class DeleteMeasurementValueQualityCommand(@TargetAggregateIdentifier  var measurementValueQualityId: UUID? = null)

// single association commands

// multiple association commands


// MeasurementValueSource Commands
data class CreateMeasurementValueSourceCommand(
    @TargetAggregateIdentifier  var measurementValueSourceId: UUID? = null
)

data class UpdateMeasurementValueSourceCommand(
    @TargetAggregateIdentifier  var measurementValueSourceId: UUID? = null
)

data class DeleteMeasurementValueSourceCommand(@TargetAggregateIdentifier  var measurementValueSourceId: UUID? = null)

// single association commands

// multiple association commands


// MechLoad1 Commands
data class CreateMechLoad1Command(
    @TargetAggregateIdentifier  var mechLoad1Id: UUID? = null
)

data class UpdateMechLoad1Command(
    @TargetAggregateIdentifier var mechLoad1Id: UUID? = null,
    var a: Simple_Float,
    var b: Simple_Float,
    var d: Simple_Float,
    var e: Simple_Float
)

data class DeleteMechLoad1Command(@TargetAggregateIdentifier  var mechLoad1Id: UUID? = null)

// single association commands
data class AssignAToMechLoad1Command(@TargetAggregateIdentifier  val mechLoad1Id: UUID, val assignment: Simple_Float )
data class UnAssignAFromMechLoad1Command(@TargetAggregateIdentifier  val mechLoad1Id: UUID )
data class AssignBToMechLoad1Command(@TargetAggregateIdentifier  val mechLoad1Id: UUID, val assignment: Simple_Float )
data class UnAssignBFromMechLoad1Command(@TargetAggregateIdentifier  val mechLoad1Id: UUID )
data class AssignDToMechLoad1Command(@TargetAggregateIdentifier  val mechLoad1Id: UUID, val assignment: Simple_Float )
data class UnAssignDFromMechLoad1Command(@TargetAggregateIdentifier  val mechLoad1Id: UUID )
data class AssignEToMechLoad1Command(@TargetAggregateIdentifier  val mechLoad1Id: UUID, val assignment: Simple_Float )
data class UnAssignEFromMechLoad1Command(@TargetAggregateIdentifier  val mechLoad1Id: UUID )

// multiple association commands


// MechanicalLoadDynamics Commands
data class CreateMechanicalLoadDynamicsCommand(
    @TargetAggregateIdentifier  var mechanicalLoadDynamicsId: UUID? = null
)

data class UpdateMechanicalLoadDynamicsCommand(
    @TargetAggregateIdentifier  var mechanicalLoadDynamicsId: UUID? = null
)

data class DeleteMechanicalLoadDynamicsCommand(@TargetAggregateIdentifier  var mechanicalLoadDynamicsId: UUID? = null)

// single association commands

// multiple association commands


// MechanicalLoadUserDefined Commands
data class CreateMechanicalLoadUserDefinedCommand(
    @TargetAggregateIdentifier  var mechanicalLoadUserDefinedId: UUID? = null
)

data class UpdateMechanicalLoadUserDefinedCommand(
    @TargetAggregateIdentifier var mechanicalLoadUserDefinedId: UUID? = null,
    var proprietary: BooleanProxy
)

data class DeleteMechanicalLoadUserDefinedCommand(@TargetAggregateIdentifier  var mechanicalLoadUserDefinedId: UUID? = null)

// single association commands
data class AssignProprietaryToMechanicalLoadUserDefinedCommand(@TargetAggregateIdentifier  val mechanicalLoadUserDefinedId: UUID, val assignment: BooleanProxy )
data class UnAssignProprietaryFromMechanicalLoadUserDefinedCommand(@TargetAggregateIdentifier  val mechanicalLoadUserDefinedId: UUID )

// multiple association commands


// Money Commands
data class CreateMoneyCommand(
    @TargetAggregateIdentifier var moneyId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: Currency
)

data class UpdateMoneyCommand(
    @TargetAggregateIdentifier var moneyId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: Currency,
    var value: DecimalProxy
)

data class DeleteMoneyCommand(@TargetAggregateIdentifier  var moneyId: UUID? = null)

// single association commands
data class AssignValueToMoneyCommand(@TargetAggregateIdentifier  val moneyId: UUID, val assignment: DecimalProxy )
data class UnAssignValueFromMoneyCommand(@TargetAggregateIdentifier  val moneyId: UUID )

// multiple association commands


// MonthDay Commands
data class CreateMonthDayCommand(
    @TargetAggregateIdentifier  var monthDayId: UUID? = null
)

data class UpdateMonthDayCommand(
    @TargetAggregateIdentifier  var monthDayId: UUID? = null
)

data class DeleteMonthDayCommand(@TargetAggregateIdentifier  var monthDayId: UUID? = null)

// single association commands

// multiple association commands


// MonthDayInterval Commands
data class CreateMonthDayIntervalCommand(
    @TargetAggregateIdentifier  var monthDayIntervalId: UUID? = null
)

data class UpdateMonthDayIntervalCommand(
    @TargetAggregateIdentifier var monthDayIntervalId: UUID? = null,
    var end: MonthDay,
    var start: MonthDay
)

data class DeleteMonthDayIntervalCommand(@TargetAggregateIdentifier  var monthDayIntervalId: UUID? = null)

// single association commands
data class AssignEndToMonthDayIntervalCommand(@TargetAggregateIdentifier  val monthDayIntervalId: UUID, val assignment: MonthDay )
data class UnAssignEndFromMonthDayIntervalCommand(@TargetAggregateIdentifier  val monthDayIntervalId: UUID )
data class AssignStartToMonthDayIntervalCommand(@TargetAggregateIdentifier  val monthDayIntervalId: UUID, val assignment: MonthDay )
data class UnAssignStartFromMonthDayIntervalCommand(@TargetAggregateIdentifier  val monthDayIntervalId: UUID )

// multiple association commands


// MutualCoupling Commands
data class CreateMutualCouplingCommand(
    @TargetAggregateIdentifier  var mutualCouplingId: UUID? = null
)

data class UpdateMutualCouplingCommand(
    @TargetAggregateIdentifier var mutualCouplingId: UUID? = null,
    var b0ch: Susceptance,
    var distance11: Length,
    var distance12: Length,
    var distance21: Length,
    var distance22: Length,
    var g0ch: Conductance,
    var r0: Resistance,
    var x0: Reactance
)

data class DeleteMutualCouplingCommand(@TargetAggregateIdentifier  var mutualCouplingId: UUID? = null)

// single association commands
data class AssignB0chToMutualCouplingCommand(@TargetAggregateIdentifier  val mutualCouplingId: UUID, val assignment: Susceptance )
data class UnAssignB0chFromMutualCouplingCommand(@TargetAggregateIdentifier  val mutualCouplingId: UUID )
data class AssignDistance11ToMutualCouplingCommand(@TargetAggregateIdentifier  val mutualCouplingId: UUID, val assignment: Length )
data class UnAssignDistance11FromMutualCouplingCommand(@TargetAggregateIdentifier  val mutualCouplingId: UUID )
data class AssignDistance12ToMutualCouplingCommand(@TargetAggregateIdentifier  val mutualCouplingId: UUID, val assignment: Length )
data class UnAssignDistance12FromMutualCouplingCommand(@TargetAggregateIdentifier  val mutualCouplingId: UUID )
data class AssignDistance21ToMutualCouplingCommand(@TargetAggregateIdentifier  val mutualCouplingId: UUID, val assignment: Length )
data class UnAssignDistance21FromMutualCouplingCommand(@TargetAggregateIdentifier  val mutualCouplingId: UUID )
data class AssignDistance22ToMutualCouplingCommand(@TargetAggregateIdentifier  val mutualCouplingId: UUID, val assignment: Length )
data class UnAssignDistance22FromMutualCouplingCommand(@TargetAggregateIdentifier  val mutualCouplingId: UUID )
data class AssignG0chToMutualCouplingCommand(@TargetAggregateIdentifier  val mutualCouplingId: UUID, val assignment: Conductance )
data class UnAssignG0chFromMutualCouplingCommand(@TargetAggregateIdentifier  val mutualCouplingId: UUID )
data class AssignR0ToMutualCouplingCommand(@TargetAggregateIdentifier  val mutualCouplingId: UUID, val assignment: Resistance )
data class UnAssignR0FromMutualCouplingCommand(@TargetAggregateIdentifier  val mutualCouplingId: UUID )
data class AssignX0ToMutualCouplingCommand(@TargetAggregateIdentifier  val mutualCouplingId: UUID, val assignment: Reactance )
data class UnAssignX0FromMutualCouplingCommand(@TargetAggregateIdentifier  val mutualCouplingId: UUID )

// multiple association commands


// NonConformLoad Commands
data class CreateNonConformLoadCommand(
    @TargetAggregateIdentifier  var nonConformLoadId: UUID? = null
)

data class UpdateNonConformLoadCommand(
    @TargetAggregateIdentifier  var nonConformLoadId: UUID? = null
)

data class DeleteNonConformLoadCommand(@TargetAggregateIdentifier  var nonConformLoadId: UUID? = null)

// single association commands

// multiple association commands


// NonConformLoadGroup Commands
data class CreateNonConformLoadGroupCommand(
    @TargetAggregateIdentifier  var nonConformLoadGroupId: UUID? = null
)

data class UpdateNonConformLoadGroupCommand(
    @TargetAggregateIdentifier  var nonConformLoadGroupId: UUID? = null
)

data class DeleteNonConformLoadGroupCommand(@TargetAggregateIdentifier  var nonConformLoadGroupId: UUID? = null)

// single association commands

// multiple association commands


// NonConformLoadSchedule Commands
data class CreateNonConformLoadScheduleCommand(
    @TargetAggregateIdentifier  var nonConformLoadScheduleId: UUID? = null
)

data class UpdateNonConformLoadScheduleCommand(
    @TargetAggregateIdentifier  var nonConformLoadScheduleId: UUID? = null
)

data class DeleteNonConformLoadScheduleCommand(@TargetAggregateIdentifier  var nonConformLoadScheduleId: UUID? = null)

// single association commands

// multiple association commands


// NonlinearShuntCompensator Commands
data class CreateNonlinearShuntCompensatorCommand(
    @TargetAggregateIdentifier  var nonlinearShuntCompensatorId: UUID? = null
)

data class UpdateNonlinearShuntCompensatorCommand(
    @TargetAggregateIdentifier  var nonlinearShuntCompensatorId: UUID? = null
)

data class DeleteNonlinearShuntCompensatorCommand(@TargetAggregateIdentifier  var nonlinearShuntCompensatorId: UUID? = null)

// single association commands

// multiple association commands


// NonlinearShuntCompensatorPoint Commands
data class CreateNonlinearShuntCompensatorPointCommand(
    @TargetAggregateIdentifier  var nonlinearShuntCompensatorPointId: UUID? = null
)

data class UpdateNonlinearShuntCompensatorPointCommand(
    @TargetAggregateIdentifier var nonlinearShuntCompensatorPointId: UUID? = null,
    var b: Susceptance,
    var b0: Susceptance,
    var g: Conductance,
    var g0: Conductance,
    var sectionNumber: IntegerProxy
)

data class DeleteNonlinearShuntCompensatorPointCommand(@TargetAggregateIdentifier  var nonlinearShuntCompensatorPointId: UUID? = null)

// single association commands
data class AssignBToNonlinearShuntCompensatorPointCommand(@TargetAggregateIdentifier  val nonlinearShuntCompensatorPointId: UUID, val assignment: Susceptance )
data class UnAssignBFromNonlinearShuntCompensatorPointCommand(@TargetAggregateIdentifier  val nonlinearShuntCompensatorPointId: UUID )
data class AssignB0ToNonlinearShuntCompensatorPointCommand(@TargetAggregateIdentifier  val nonlinearShuntCompensatorPointId: UUID, val assignment: Susceptance )
data class UnAssignB0FromNonlinearShuntCompensatorPointCommand(@TargetAggregateIdentifier  val nonlinearShuntCompensatorPointId: UUID )
data class AssignGToNonlinearShuntCompensatorPointCommand(@TargetAggregateIdentifier  val nonlinearShuntCompensatorPointId: UUID, val assignment: Conductance )
data class UnAssignGFromNonlinearShuntCompensatorPointCommand(@TargetAggregateIdentifier  val nonlinearShuntCompensatorPointId: UUID )
data class AssignG0ToNonlinearShuntCompensatorPointCommand(@TargetAggregateIdentifier  val nonlinearShuntCompensatorPointId: UUID, val assignment: Conductance )
data class UnAssignG0FromNonlinearShuntCompensatorPointCommand(@TargetAggregateIdentifier  val nonlinearShuntCompensatorPointId: UUID )
data class AssignSectionNumberToNonlinearShuntCompensatorPointCommand(@TargetAggregateIdentifier  val nonlinearShuntCompensatorPointId: UUID, val assignment: IntegerProxy )
data class UnAssignSectionNumberFromNonlinearShuntCompensatorPointCommand(@TargetAggregateIdentifier  val nonlinearShuntCompensatorPointId: UUID )

// multiple association commands


// NuclearGeneratingUnit Commands
data class CreateNuclearGeneratingUnitCommand(
    @TargetAggregateIdentifier  var nuclearGeneratingUnitId: UUID? = null
)

data class UpdateNuclearGeneratingUnitCommand(
    @TargetAggregateIdentifier  var nuclearGeneratingUnitId: UUID? = null
)

data class DeleteNuclearGeneratingUnitCommand(@TargetAggregateIdentifier  var nuclearGeneratingUnitId: UUID? = null)

// single association commands

// multiple association commands


// OperationalLimit Commands
data class CreateOperationalLimitCommand(
    @TargetAggregateIdentifier  var operationalLimitId: UUID? = null
)

data class UpdateOperationalLimitCommand(
    @TargetAggregateIdentifier  var operationalLimitId: UUID? = null
)

data class DeleteOperationalLimitCommand(@TargetAggregateIdentifier  var operationalLimitId: UUID? = null)

// single association commands

// multiple association commands


// OperationalLimitSet Commands
data class CreateOperationalLimitSetCommand(
    @TargetAggregateIdentifier  var operationalLimitSetId: UUID? = null
)

data class UpdateOperationalLimitSetCommand(
    @TargetAggregateIdentifier  var operationalLimitSetId: UUID? = null
)

data class DeleteOperationalLimitSetCommand(@TargetAggregateIdentifier  var operationalLimitSetId: UUID? = null)

// single association commands

// multiple association commands


// OperationalLimitType Commands
data class CreateOperationalLimitTypeCommand(
    @TargetAggregateIdentifier var operationalLimitTypeId: UUID? = null,
    @Enumerated(EnumType.STRING) var direction: OperationalLimitDirectionKind,
    @Enumerated(EnumType.STRING) var limitType: LimitTypeEnum
)

data class UpdateOperationalLimitTypeCommand(
    @TargetAggregateIdentifier var operationalLimitTypeId: UUID? = null,
    var acceptableDuration: Seconds,
    @Enumerated(EnumType.STRING) var direction: OperationalLimitDirectionKind,
    @Enumerated(EnumType.STRING) var limitType: LimitTypeEnum
)

data class DeleteOperationalLimitTypeCommand(@TargetAggregateIdentifier  var operationalLimitTypeId: UUID? = null)

// single association commands
data class AssignAcceptableDurationToOperationalLimitTypeCommand(@TargetAggregateIdentifier  val operationalLimitTypeId: UUID, val assignment: Seconds )
data class UnAssignAcceptableDurationFromOperationalLimitTypeCommand(@TargetAggregateIdentifier  val operationalLimitTypeId: UUID )

// multiple association commands


// OverexcLim2 Commands
data class CreateOverexcLim2Command(
    @TargetAggregateIdentifier  var overexcLim2Id: UUID? = null
)

data class UpdateOverexcLim2Command(
    @TargetAggregateIdentifier var overexcLim2Id: UUID? = null,
    var ifdlim: PU,
    var koi: PU,
    var voimax: PU,
    var voimin: PU
)

data class DeleteOverexcLim2Command(@TargetAggregateIdentifier  var overexcLim2Id: UUID? = null)

// single association commands
data class AssignIfdlimToOverexcLim2Command(@TargetAggregateIdentifier  val overexcLim2Id: UUID, val assignment: PU )
data class UnAssignIfdlimFromOverexcLim2Command(@TargetAggregateIdentifier  val overexcLim2Id: UUID )
data class AssignKoiToOverexcLim2Command(@TargetAggregateIdentifier  val overexcLim2Id: UUID, val assignment: PU )
data class UnAssignKoiFromOverexcLim2Command(@TargetAggregateIdentifier  val overexcLim2Id: UUID )
data class AssignVoimaxToOverexcLim2Command(@TargetAggregateIdentifier  val overexcLim2Id: UUID, val assignment: PU )
data class UnAssignVoimaxFromOverexcLim2Command(@TargetAggregateIdentifier  val overexcLim2Id: UUID )
data class AssignVoiminToOverexcLim2Command(@TargetAggregateIdentifier  val overexcLim2Id: UUID, val assignment: PU )
data class UnAssignVoiminFromOverexcLim2Command(@TargetAggregateIdentifier  val overexcLim2Id: UUID )

// multiple association commands


// OverexcLimIEEE Commands
data class CreateOverexcLimIEEECommand(
    @TargetAggregateIdentifier  var overexcLimIEEEId: UUID? = null
)

data class UpdateOverexcLimIEEECommand(
    @TargetAggregateIdentifier var overexcLimIEEEId: UUID? = null,
    var hyst: PU,
    var ifdlim: PU,
    var ifdmax: PU,
    var itfpu: PU,
    var kcd: PU,
    var kramp: Simple_Float
)

data class DeleteOverexcLimIEEECommand(@TargetAggregateIdentifier  var overexcLimIEEEId: UUID? = null)

// single association commands
data class AssignHystToOverexcLimIEEECommand(@TargetAggregateIdentifier  val overexcLimIEEEId: UUID, val assignment: PU )
data class UnAssignHystFromOverexcLimIEEECommand(@TargetAggregateIdentifier  val overexcLimIEEEId: UUID )
data class AssignIfdlimToOverexcLimIEEECommand(@TargetAggregateIdentifier  val overexcLimIEEEId: UUID, val assignment: PU )
data class UnAssignIfdlimFromOverexcLimIEEECommand(@TargetAggregateIdentifier  val overexcLimIEEEId: UUID )
data class AssignIfdmaxToOverexcLimIEEECommand(@TargetAggregateIdentifier  val overexcLimIEEEId: UUID, val assignment: PU )
data class UnAssignIfdmaxFromOverexcLimIEEECommand(@TargetAggregateIdentifier  val overexcLimIEEEId: UUID )
data class AssignItfpuToOverexcLimIEEECommand(@TargetAggregateIdentifier  val overexcLimIEEEId: UUID, val assignment: PU )
data class UnAssignItfpuFromOverexcLimIEEECommand(@TargetAggregateIdentifier  val overexcLimIEEEId: UUID )
data class AssignKcdToOverexcLimIEEECommand(@TargetAggregateIdentifier  val overexcLimIEEEId: UUID, val assignment: PU )
data class UnAssignKcdFromOverexcLimIEEECommand(@TargetAggregateIdentifier  val overexcLimIEEEId: UUID )
data class AssignKrampToOverexcLimIEEECommand(@TargetAggregateIdentifier  val overexcLimIEEEId: UUID, val assignment: Simple_Float )
data class UnAssignKrampFromOverexcLimIEEECommand(@TargetAggregateIdentifier  val overexcLimIEEEId: UUID )

// multiple association commands


// OverexcLimX1 Commands
data class CreateOverexcLimX1Command(
    @TargetAggregateIdentifier  var overexcLimX1Id: UUID? = null
)

data class UpdateOverexcLimX1Command(
    @TargetAggregateIdentifier var overexcLimX1Id: UUID? = null,
    var efd1: PU,
    var efd2: PU,
    var efd3: PU,
    var efddes: PU,
    var efdrated: PU,
    var kmx: PU,
    var t1: Seconds,
    var t2: Seconds,
    var t3: Seconds,
    var vlow: PU
)

data class DeleteOverexcLimX1Command(@TargetAggregateIdentifier  var overexcLimX1Id: UUID? = null)

// single association commands
data class AssignEfd1ToOverexcLimX1Command(@TargetAggregateIdentifier  val overexcLimX1Id: UUID, val assignment: PU )
data class UnAssignEfd1FromOverexcLimX1Command(@TargetAggregateIdentifier  val overexcLimX1Id: UUID )
data class AssignEfd2ToOverexcLimX1Command(@TargetAggregateIdentifier  val overexcLimX1Id: UUID, val assignment: PU )
data class UnAssignEfd2FromOverexcLimX1Command(@TargetAggregateIdentifier  val overexcLimX1Id: UUID )
data class AssignEfd3ToOverexcLimX1Command(@TargetAggregateIdentifier  val overexcLimX1Id: UUID, val assignment: PU )
data class UnAssignEfd3FromOverexcLimX1Command(@TargetAggregateIdentifier  val overexcLimX1Id: UUID )
data class AssignEfddesToOverexcLimX1Command(@TargetAggregateIdentifier  val overexcLimX1Id: UUID, val assignment: PU )
data class UnAssignEfddesFromOverexcLimX1Command(@TargetAggregateIdentifier  val overexcLimX1Id: UUID )
data class AssignEfdratedToOverexcLimX1Command(@TargetAggregateIdentifier  val overexcLimX1Id: UUID, val assignment: PU )
data class UnAssignEfdratedFromOverexcLimX1Command(@TargetAggregateIdentifier  val overexcLimX1Id: UUID )
data class AssignKmxToOverexcLimX1Command(@TargetAggregateIdentifier  val overexcLimX1Id: UUID, val assignment: PU )
data class UnAssignKmxFromOverexcLimX1Command(@TargetAggregateIdentifier  val overexcLimX1Id: UUID )
data class AssignT1ToOverexcLimX1Command(@TargetAggregateIdentifier  val overexcLimX1Id: UUID, val assignment: Seconds )
data class UnAssignT1FromOverexcLimX1Command(@TargetAggregateIdentifier  val overexcLimX1Id: UUID )
data class AssignT2ToOverexcLimX1Command(@TargetAggregateIdentifier  val overexcLimX1Id: UUID, val assignment: Seconds )
data class UnAssignT2FromOverexcLimX1Command(@TargetAggregateIdentifier  val overexcLimX1Id: UUID )
data class AssignT3ToOverexcLimX1Command(@TargetAggregateIdentifier  val overexcLimX1Id: UUID, val assignment: Seconds )
data class UnAssignT3FromOverexcLimX1Command(@TargetAggregateIdentifier  val overexcLimX1Id: UUID )
data class AssignVlowToOverexcLimX1Command(@TargetAggregateIdentifier  val overexcLimX1Id: UUID, val assignment: PU )
data class UnAssignVlowFromOverexcLimX1Command(@TargetAggregateIdentifier  val overexcLimX1Id: UUID )

// multiple association commands


// OverexcLimX2 Commands
data class CreateOverexcLimX2Command(
    @TargetAggregateIdentifier  var overexcLimX2Id: UUID? = null
)

data class UpdateOverexcLimX2Command(
    @TargetAggregateIdentifier var overexcLimX2Id: UUID? = null,
    var efd1: PU,
    var efd2: PU,
    var efd3: PU,
    var efddes: PU,
    var efdrated: PU,
    var kmx: PU,
    var m: BooleanProxy,
    var t1: Seconds,
    var t2: Seconds,
    var t3: Seconds,
    var vlow: PU
)

data class DeleteOverexcLimX2Command(@TargetAggregateIdentifier  var overexcLimX2Id: UUID? = null)

// single association commands
data class AssignEfd1ToOverexcLimX2Command(@TargetAggregateIdentifier  val overexcLimX2Id: UUID, val assignment: PU )
data class UnAssignEfd1FromOverexcLimX2Command(@TargetAggregateIdentifier  val overexcLimX2Id: UUID )
data class AssignEfd2ToOverexcLimX2Command(@TargetAggregateIdentifier  val overexcLimX2Id: UUID, val assignment: PU )
data class UnAssignEfd2FromOverexcLimX2Command(@TargetAggregateIdentifier  val overexcLimX2Id: UUID )
data class AssignEfd3ToOverexcLimX2Command(@TargetAggregateIdentifier  val overexcLimX2Id: UUID, val assignment: PU )
data class UnAssignEfd3FromOverexcLimX2Command(@TargetAggregateIdentifier  val overexcLimX2Id: UUID )
data class AssignEfddesToOverexcLimX2Command(@TargetAggregateIdentifier  val overexcLimX2Id: UUID, val assignment: PU )
data class UnAssignEfddesFromOverexcLimX2Command(@TargetAggregateIdentifier  val overexcLimX2Id: UUID )
data class AssignEfdratedToOverexcLimX2Command(@TargetAggregateIdentifier  val overexcLimX2Id: UUID, val assignment: PU )
data class UnAssignEfdratedFromOverexcLimX2Command(@TargetAggregateIdentifier  val overexcLimX2Id: UUID )
data class AssignKmxToOverexcLimX2Command(@TargetAggregateIdentifier  val overexcLimX2Id: UUID, val assignment: PU )
data class UnAssignKmxFromOverexcLimX2Command(@TargetAggregateIdentifier  val overexcLimX2Id: UUID )
data class AssignMToOverexcLimX2Command(@TargetAggregateIdentifier  val overexcLimX2Id: UUID, val assignment: BooleanProxy )
data class UnAssignMFromOverexcLimX2Command(@TargetAggregateIdentifier  val overexcLimX2Id: UUID )
data class AssignT1ToOverexcLimX2Command(@TargetAggregateIdentifier  val overexcLimX2Id: UUID, val assignment: Seconds )
data class UnAssignT1FromOverexcLimX2Command(@TargetAggregateIdentifier  val overexcLimX2Id: UUID )
data class AssignT2ToOverexcLimX2Command(@TargetAggregateIdentifier  val overexcLimX2Id: UUID, val assignment: Seconds )
data class UnAssignT2FromOverexcLimX2Command(@TargetAggregateIdentifier  val overexcLimX2Id: UUID )
data class AssignT3ToOverexcLimX2Command(@TargetAggregateIdentifier  val overexcLimX2Id: UUID, val assignment: Seconds )
data class UnAssignT3FromOverexcLimX2Command(@TargetAggregateIdentifier  val overexcLimX2Id: UUID )
data class AssignVlowToOverexcLimX2Command(@TargetAggregateIdentifier  val overexcLimX2Id: UUID, val assignment: PU )
data class UnAssignVlowFromOverexcLimX2Command(@TargetAggregateIdentifier  val overexcLimX2Id: UUID )

// multiple association commands


// OverexcitationLimiterDynamics Commands
data class CreateOverexcitationLimiterDynamicsCommand(
    @TargetAggregateIdentifier  var overexcitationLimiterDynamicsId: UUID? = null
)

data class UpdateOverexcitationLimiterDynamicsCommand(
    @TargetAggregateIdentifier  var overexcitationLimiterDynamicsId: UUID? = null
)

data class DeleteOverexcitationLimiterDynamicsCommand(@TargetAggregateIdentifier  var overexcitationLimiterDynamicsId: UUID? = null)

// single association commands

// multiple association commands


// OverexcitationLimiterUserDefined Commands
data class CreateOverexcitationLimiterUserDefinedCommand(
    @TargetAggregateIdentifier  var overexcitationLimiterUserDefinedId: UUID? = null
)

data class UpdateOverexcitationLimiterUserDefinedCommand(
    @TargetAggregateIdentifier var overexcitationLimiterUserDefinedId: UUID? = null,
    var proprietary: BooleanProxy
)

data class DeleteOverexcitationLimiterUserDefinedCommand(@TargetAggregateIdentifier  var overexcitationLimiterUserDefinedId: UUID? = null)

// single association commands
data class AssignProprietaryToOverexcitationLimiterUserDefinedCommand(@TargetAggregateIdentifier  val overexcitationLimiterUserDefinedId: UUID, val assignment: BooleanProxy )
data class UnAssignProprietaryFromOverexcitationLimiterUserDefinedCommand(@TargetAggregateIdentifier  val overexcitationLimiterUserDefinedId: UUID )

// multiple association commands


// PFVArControllerType1Dynamics Commands
data class CreatePFVArControllerType1DynamicsCommand(
    @TargetAggregateIdentifier  var pFVArControllerType1DynamicsId: UUID? = null
)

data class UpdatePFVArControllerType1DynamicsCommand(
    @TargetAggregateIdentifier  var pFVArControllerType1DynamicsId: UUID? = null
)

data class DeletePFVArControllerType1DynamicsCommand(@TargetAggregateIdentifier  var pFVArControllerType1DynamicsId: UUID? = null)

// single association commands

// multiple association commands


// PFVArControllerType1UserDefined Commands
data class CreatePFVArControllerType1UserDefinedCommand(
    @TargetAggregateIdentifier  var pFVArControllerType1UserDefinedId: UUID? = null
)

data class UpdatePFVArControllerType1UserDefinedCommand(
    @TargetAggregateIdentifier var pFVArControllerType1UserDefinedId: UUID? = null,
    var proprietary: BooleanProxy
)

data class DeletePFVArControllerType1UserDefinedCommand(@TargetAggregateIdentifier  var pFVArControllerType1UserDefinedId: UUID? = null)

// single association commands
data class AssignProprietaryToPFVArControllerType1UserDefinedCommand(@TargetAggregateIdentifier  val pFVArControllerType1UserDefinedId: UUID, val assignment: BooleanProxy )
data class UnAssignProprietaryFromPFVArControllerType1UserDefinedCommand(@TargetAggregateIdentifier  val pFVArControllerType1UserDefinedId: UUID )

// multiple association commands


// PFVArControllerType2Dynamics Commands
data class CreatePFVArControllerType2DynamicsCommand(
    @TargetAggregateIdentifier  var pFVArControllerType2DynamicsId: UUID? = null
)

data class UpdatePFVArControllerType2DynamicsCommand(
    @TargetAggregateIdentifier  var pFVArControllerType2DynamicsId: UUID? = null
)

data class DeletePFVArControllerType2DynamicsCommand(@TargetAggregateIdentifier  var pFVArControllerType2DynamicsId: UUID? = null)

// single association commands

// multiple association commands


// PFVArControllerType2UserDefined Commands
data class CreatePFVArControllerType2UserDefinedCommand(
    @TargetAggregateIdentifier  var pFVArControllerType2UserDefinedId: UUID? = null
)

data class UpdatePFVArControllerType2UserDefinedCommand(
    @TargetAggregateIdentifier var pFVArControllerType2UserDefinedId: UUID? = null,
    var proprietary: BooleanProxy
)

data class DeletePFVArControllerType2UserDefinedCommand(@TargetAggregateIdentifier  var pFVArControllerType2UserDefinedId: UUID? = null)

// single association commands
data class AssignProprietaryToPFVArControllerType2UserDefinedCommand(@TargetAggregateIdentifier  val pFVArControllerType2UserDefinedId: UUID, val assignment: BooleanProxy )
data class UnAssignProprietaryFromPFVArControllerType2UserDefinedCommand(@TargetAggregateIdentifier  val pFVArControllerType2UserDefinedId: UUID )

// multiple association commands


// PFVArType1IEEEPFController Commands
data class CreatePFVArType1IEEEPFControllerCommand(
    @TargetAggregateIdentifier  var pFVArType1IEEEPFControllerId: UUID? = null
)

data class UpdatePFVArType1IEEEPFControllerCommand(
    @TargetAggregateIdentifier var pFVArType1IEEEPFControllerId: UUID? = null,
    var ovex: BooleanProxy,
    var tpfc: Seconds,
    var vitmin: PU,
    var vpf: PU,
    var vpfcbw: Simple_Float,
    var vpfref: PU,
    var vvtmax: PU,
    var vvtmin: PU
)

data class DeletePFVArType1IEEEPFControllerCommand(@TargetAggregateIdentifier  var pFVArType1IEEEPFControllerId: UUID? = null)

// single association commands
data class AssignOvexToPFVArType1IEEEPFControllerCommand(@TargetAggregateIdentifier  val pFVArType1IEEEPFControllerId: UUID, val assignment: BooleanProxy )
data class UnAssignOvexFromPFVArType1IEEEPFControllerCommand(@TargetAggregateIdentifier  val pFVArType1IEEEPFControllerId: UUID )
data class AssignTpfcToPFVArType1IEEEPFControllerCommand(@TargetAggregateIdentifier  val pFVArType1IEEEPFControllerId: UUID, val assignment: Seconds )
data class UnAssignTpfcFromPFVArType1IEEEPFControllerCommand(@TargetAggregateIdentifier  val pFVArType1IEEEPFControllerId: UUID )
data class AssignVitminToPFVArType1IEEEPFControllerCommand(@TargetAggregateIdentifier  val pFVArType1IEEEPFControllerId: UUID, val assignment: PU )
data class UnAssignVitminFromPFVArType1IEEEPFControllerCommand(@TargetAggregateIdentifier  val pFVArType1IEEEPFControllerId: UUID )
data class AssignVpfToPFVArType1IEEEPFControllerCommand(@TargetAggregateIdentifier  val pFVArType1IEEEPFControllerId: UUID, val assignment: PU )
data class UnAssignVpfFromPFVArType1IEEEPFControllerCommand(@TargetAggregateIdentifier  val pFVArType1IEEEPFControllerId: UUID )
data class AssignVpfcbwToPFVArType1IEEEPFControllerCommand(@TargetAggregateIdentifier  val pFVArType1IEEEPFControllerId: UUID, val assignment: Simple_Float )
data class UnAssignVpfcbwFromPFVArType1IEEEPFControllerCommand(@TargetAggregateIdentifier  val pFVArType1IEEEPFControllerId: UUID )
data class AssignVpfrefToPFVArType1IEEEPFControllerCommand(@TargetAggregateIdentifier  val pFVArType1IEEEPFControllerId: UUID, val assignment: PU )
data class UnAssignVpfrefFromPFVArType1IEEEPFControllerCommand(@TargetAggregateIdentifier  val pFVArType1IEEEPFControllerId: UUID )
data class AssignVvtmaxToPFVArType1IEEEPFControllerCommand(@TargetAggregateIdentifier  val pFVArType1IEEEPFControllerId: UUID, val assignment: PU )
data class UnAssignVvtmaxFromPFVArType1IEEEPFControllerCommand(@TargetAggregateIdentifier  val pFVArType1IEEEPFControllerId: UUID )
data class AssignVvtminToPFVArType1IEEEPFControllerCommand(@TargetAggregateIdentifier  val pFVArType1IEEEPFControllerId: UUID, val assignment: PU )
data class UnAssignVvtminFromPFVArType1IEEEPFControllerCommand(@TargetAggregateIdentifier  val pFVArType1IEEEPFControllerId: UUID )

// multiple association commands


// PFVArType1IEEEVArController Commands
data class CreatePFVArType1IEEEVArControllerCommand(
    @TargetAggregateIdentifier  var pFVArType1IEEEVArControllerId: UUID? = null
)

data class UpdatePFVArType1IEEEVArControllerCommand(
    @TargetAggregateIdentifier var pFVArType1IEEEVArControllerId: UUID? = null,
    var tvarc: Seconds,
    var vvar: PU,
    var vvarcbw: Simple_Float,
    var vvarref: PU,
    var vvtmax: PU,
    var vvtmin: PU
)

data class DeletePFVArType1IEEEVArControllerCommand(@TargetAggregateIdentifier  var pFVArType1IEEEVArControllerId: UUID? = null)

// single association commands
data class AssignTvarcToPFVArType1IEEEVArControllerCommand(@TargetAggregateIdentifier  val pFVArType1IEEEVArControllerId: UUID, val assignment: Seconds )
data class UnAssignTvarcFromPFVArType1IEEEVArControllerCommand(@TargetAggregateIdentifier  val pFVArType1IEEEVArControllerId: UUID )
data class AssignVvarToPFVArType1IEEEVArControllerCommand(@TargetAggregateIdentifier  val pFVArType1IEEEVArControllerId: UUID, val assignment: PU )
data class UnAssignVvarFromPFVArType1IEEEVArControllerCommand(@TargetAggregateIdentifier  val pFVArType1IEEEVArControllerId: UUID )
data class AssignVvarcbwToPFVArType1IEEEVArControllerCommand(@TargetAggregateIdentifier  val pFVArType1IEEEVArControllerId: UUID, val assignment: Simple_Float )
data class UnAssignVvarcbwFromPFVArType1IEEEVArControllerCommand(@TargetAggregateIdentifier  val pFVArType1IEEEVArControllerId: UUID )
data class AssignVvarrefToPFVArType1IEEEVArControllerCommand(@TargetAggregateIdentifier  val pFVArType1IEEEVArControllerId: UUID, val assignment: PU )
data class UnAssignVvarrefFromPFVArType1IEEEVArControllerCommand(@TargetAggregateIdentifier  val pFVArType1IEEEVArControllerId: UUID )
data class AssignVvtmaxToPFVArType1IEEEVArControllerCommand(@TargetAggregateIdentifier  val pFVArType1IEEEVArControllerId: UUID, val assignment: PU )
data class UnAssignVvtmaxFromPFVArType1IEEEVArControllerCommand(@TargetAggregateIdentifier  val pFVArType1IEEEVArControllerId: UUID )
data class AssignVvtminToPFVArType1IEEEVArControllerCommand(@TargetAggregateIdentifier  val pFVArType1IEEEVArControllerId: UUID, val assignment: PU )
data class UnAssignVvtminFromPFVArType1IEEEVArControllerCommand(@TargetAggregateIdentifier  val pFVArType1IEEEVArControllerId: UUID )

// multiple association commands


// PFVArType2Common1 Commands
data class CreatePFVArType2Common1Command(
    @TargetAggregateIdentifier  var pFVArType2Common1Id: UUID? = null
)

data class UpdatePFVArType2Common1Command(
    @TargetAggregateIdentifier var pFVArType2Common1Id: UUID? = null,
    var j: BooleanProxy,
    var ki: PU,
    var kp: PU,
    var max: PU,
    var ref: PU
)

data class DeletePFVArType2Common1Command(@TargetAggregateIdentifier  var pFVArType2Common1Id: UUID? = null)

// single association commands
data class AssignJToPFVArType2Common1Command(@TargetAggregateIdentifier  val pFVArType2Common1Id: UUID, val assignment: BooleanProxy )
data class UnAssignJFromPFVArType2Common1Command(@TargetAggregateIdentifier  val pFVArType2Common1Id: UUID )
data class AssignKiToPFVArType2Common1Command(@TargetAggregateIdentifier  val pFVArType2Common1Id: UUID, val assignment: PU )
data class UnAssignKiFromPFVArType2Common1Command(@TargetAggregateIdentifier  val pFVArType2Common1Id: UUID )
data class AssignKpToPFVArType2Common1Command(@TargetAggregateIdentifier  val pFVArType2Common1Id: UUID, val assignment: PU )
data class UnAssignKpFromPFVArType2Common1Command(@TargetAggregateIdentifier  val pFVArType2Common1Id: UUID )
data class AssignMaxToPFVArType2Common1Command(@TargetAggregateIdentifier  val pFVArType2Common1Id: UUID, val assignment: PU )
data class UnAssignMaxFromPFVArType2Common1Command(@TargetAggregateIdentifier  val pFVArType2Common1Id: UUID )
data class AssignRefToPFVArType2Common1Command(@TargetAggregateIdentifier  val pFVArType2Common1Id: UUID, val assignment: PU )
data class UnAssignRefFromPFVArType2Common1Command(@TargetAggregateIdentifier  val pFVArType2Common1Id: UUID )

// multiple association commands


// PFVArType2IEEEPFController Commands
data class CreatePFVArType2IEEEPFControllerCommand(
    @TargetAggregateIdentifier  var pFVArType2IEEEPFControllerId: UUID? = null
)

data class UpdatePFVArType2IEEEPFControllerCommand(
    @TargetAggregateIdentifier var pFVArType2IEEEPFControllerId: UUID? = null,
    var exlon: BooleanProxy,
    var ki: PU,
    var kp: PU,
    var pfref: PU,
    var vclmt: PU,
    var vref: PU,
    var vs: Simple_Float
)

data class DeletePFVArType2IEEEPFControllerCommand(@TargetAggregateIdentifier  var pFVArType2IEEEPFControllerId: UUID? = null)

// single association commands
data class AssignExlonToPFVArType2IEEEPFControllerCommand(@TargetAggregateIdentifier  val pFVArType2IEEEPFControllerId: UUID, val assignment: BooleanProxy )
data class UnAssignExlonFromPFVArType2IEEEPFControllerCommand(@TargetAggregateIdentifier  val pFVArType2IEEEPFControllerId: UUID )
data class AssignKiToPFVArType2IEEEPFControllerCommand(@TargetAggregateIdentifier  val pFVArType2IEEEPFControllerId: UUID, val assignment: PU )
data class UnAssignKiFromPFVArType2IEEEPFControllerCommand(@TargetAggregateIdentifier  val pFVArType2IEEEPFControllerId: UUID )
data class AssignKpToPFVArType2IEEEPFControllerCommand(@TargetAggregateIdentifier  val pFVArType2IEEEPFControllerId: UUID, val assignment: PU )
data class UnAssignKpFromPFVArType2IEEEPFControllerCommand(@TargetAggregateIdentifier  val pFVArType2IEEEPFControllerId: UUID )
data class AssignPfrefToPFVArType2IEEEPFControllerCommand(@TargetAggregateIdentifier  val pFVArType2IEEEPFControllerId: UUID, val assignment: PU )
data class UnAssignPfrefFromPFVArType2IEEEPFControllerCommand(@TargetAggregateIdentifier  val pFVArType2IEEEPFControllerId: UUID )
data class AssignVclmtToPFVArType2IEEEPFControllerCommand(@TargetAggregateIdentifier  val pFVArType2IEEEPFControllerId: UUID, val assignment: PU )
data class UnAssignVclmtFromPFVArType2IEEEPFControllerCommand(@TargetAggregateIdentifier  val pFVArType2IEEEPFControllerId: UUID )
data class AssignVrefToPFVArType2IEEEPFControllerCommand(@TargetAggregateIdentifier  val pFVArType2IEEEPFControllerId: UUID, val assignment: PU )
data class UnAssignVrefFromPFVArType2IEEEPFControllerCommand(@TargetAggregateIdentifier  val pFVArType2IEEEPFControllerId: UUID )
data class AssignVsToPFVArType2IEEEPFControllerCommand(@TargetAggregateIdentifier  val pFVArType2IEEEPFControllerId: UUID, val assignment: Simple_Float )
data class UnAssignVsFromPFVArType2IEEEPFControllerCommand(@TargetAggregateIdentifier  val pFVArType2IEEEPFControllerId: UUID )

// multiple association commands


// PFVArType2IEEEVArController Commands
data class CreatePFVArType2IEEEVArControllerCommand(
    @TargetAggregateIdentifier  var pFVArType2IEEEVArControllerId: UUID? = null
)

data class UpdatePFVArType2IEEEVArControllerCommand(
    @TargetAggregateIdentifier var pFVArType2IEEEVArControllerId: UUID? = null,
    var exlon: BooleanProxy,
    var ki: PU,
    var kp: PU,
    var qref: PU,
    var vclmt: PU,
    var vref: PU,
    var vs: Simple_Float
)

data class DeletePFVArType2IEEEVArControllerCommand(@TargetAggregateIdentifier  var pFVArType2IEEEVArControllerId: UUID? = null)

// single association commands
data class AssignExlonToPFVArType2IEEEVArControllerCommand(@TargetAggregateIdentifier  val pFVArType2IEEEVArControllerId: UUID, val assignment: BooleanProxy )
data class UnAssignExlonFromPFVArType2IEEEVArControllerCommand(@TargetAggregateIdentifier  val pFVArType2IEEEVArControllerId: UUID )
data class AssignKiToPFVArType2IEEEVArControllerCommand(@TargetAggregateIdentifier  val pFVArType2IEEEVArControllerId: UUID, val assignment: PU )
data class UnAssignKiFromPFVArType2IEEEVArControllerCommand(@TargetAggregateIdentifier  val pFVArType2IEEEVArControllerId: UUID )
data class AssignKpToPFVArType2IEEEVArControllerCommand(@TargetAggregateIdentifier  val pFVArType2IEEEVArControllerId: UUID, val assignment: PU )
data class UnAssignKpFromPFVArType2IEEEVArControllerCommand(@TargetAggregateIdentifier  val pFVArType2IEEEVArControllerId: UUID )
data class AssignQrefToPFVArType2IEEEVArControllerCommand(@TargetAggregateIdentifier  val pFVArType2IEEEVArControllerId: UUID, val assignment: PU )
data class UnAssignQrefFromPFVArType2IEEEVArControllerCommand(@TargetAggregateIdentifier  val pFVArType2IEEEVArControllerId: UUID )
data class AssignVclmtToPFVArType2IEEEVArControllerCommand(@TargetAggregateIdentifier  val pFVArType2IEEEVArControllerId: UUID, val assignment: PU )
data class UnAssignVclmtFromPFVArType2IEEEVArControllerCommand(@TargetAggregateIdentifier  val pFVArType2IEEEVArControllerId: UUID )
data class AssignVrefToPFVArType2IEEEVArControllerCommand(@TargetAggregateIdentifier  val pFVArType2IEEEVArControllerId: UUID, val assignment: PU )
data class UnAssignVrefFromPFVArType2IEEEVArControllerCommand(@TargetAggregateIdentifier  val pFVArType2IEEEVArControllerId: UUID )
data class AssignVsToPFVArType2IEEEVArControllerCommand(@TargetAggregateIdentifier  val pFVArType2IEEEVArControllerId: UUID, val assignment: Simple_Float )
data class UnAssignVsFromPFVArType2IEEEVArControllerCommand(@TargetAggregateIdentifier  val pFVArType2IEEEVArControllerId: UUID )

// multiple association commands


// PU Commands
data class CreatePUCommand(
    @TargetAggregateIdentifier var pUId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol
)

data class UpdatePUCommand(
    @TargetAggregateIdentifier var pUId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol,
    var value: FloatProxy
)

data class DeletePUCommand(@TargetAggregateIdentifier  var pUId: UUID? = null)

// single association commands
data class AssignValueToPUCommand(@TargetAggregateIdentifier  val pUId: UUID, val assignment: FloatProxy )
data class UnAssignValueFromPUCommand(@TargetAggregateIdentifier  val pUId: UUID )

// multiple association commands


// PerCent Commands
data class CreatePerCentCommand(
    @TargetAggregateIdentifier var perCentId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol
)

data class UpdatePerCentCommand(
    @TargetAggregateIdentifier var perCentId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol,
    var value: FloatProxy
)

data class DeletePerCentCommand(@TargetAggregateIdentifier  var perCentId: UUID? = null)

// single association commands
data class AssignValueToPerCentCommand(@TargetAggregateIdentifier  val perCentId: UUID, val assignment: FloatProxy )
data class UnAssignValueFromPerCentCommand(@TargetAggregateIdentifier  val perCentId: UUID )

// multiple association commands


// PerLengthDCLineParameter Commands
data class CreatePerLengthDCLineParameterCommand(
    @TargetAggregateIdentifier  var perLengthDCLineParameterId: UUID? = null
)

data class UpdatePerLengthDCLineParameterCommand(
    @TargetAggregateIdentifier var perLengthDCLineParameterId: UUID? = null,
    var capacitance: CapacitancePerLength,
    var inductance: InductancePerLength,
    var resistance: ResistancePerLength
)

data class DeletePerLengthDCLineParameterCommand(@TargetAggregateIdentifier  var perLengthDCLineParameterId: UUID? = null)

// single association commands
data class AssignCapacitanceToPerLengthDCLineParameterCommand(@TargetAggregateIdentifier  val perLengthDCLineParameterId: UUID, val assignment: CapacitancePerLength )
data class UnAssignCapacitanceFromPerLengthDCLineParameterCommand(@TargetAggregateIdentifier  val perLengthDCLineParameterId: UUID )
data class AssignInductanceToPerLengthDCLineParameterCommand(@TargetAggregateIdentifier  val perLengthDCLineParameterId: UUID, val assignment: InductancePerLength )
data class UnAssignInductanceFromPerLengthDCLineParameterCommand(@TargetAggregateIdentifier  val perLengthDCLineParameterId: UUID )
data class AssignResistanceToPerLengthDCLineParameterCommand(@TargetAggregateIdentifier  val perLengthDCLineParameterId: UUID, val assignment: ResistancePerLength )
data class UnAssignResistanceFromPerLengthDCLineParameterCommand(@TargetAggregateIdentifier  val perLengthDCLineParameterId: UUID )

// multiple association commands


// PetersenCoil Commands
data class CreatePetersenCoilCommand(
    @TargetAggregateIdentifier var petersenCoilId: UUID? = null,
    @Enumerated(EnumType.STRING) var mode: PetersenCoilModeKind
)

data class UpdatePetersenCoilCommand(
    @TargetAggregateIdentifier var petersenCoilId: UUID? = null,
    @Enumerated(EnumType.STRING) var mode: PetersenCoilModeKind,
    var nominalU: Voltage,
    var offsetCurrent: CurrentFlow,
    var positionCurrent: CurrentFlow,
    var xGroundMax: Reactance,
    var xGroundMin: Reactance,
    var xGroundNominal: Reactance
)

data class DeletePetersenCoilCommand(@TargetAggregateIdentifier  var petersenCoilId: UUID? = null)

// single association commands
data class AssignNominalUToPetersenCoilCommand(@TargetAggregateIdentifier  val petersenCoilId: UUID, val assignment: Voltage )
data class UnAssignNominalUFromPetersenCoilCommand(@TargetAggregateIdentifier  val petersenCoilId: UUID )
data class AssignOffsetCurrentToPetersenCoilCommand(@TargetAggregateIdentifier  val petersenCoilId: UUID, val assignment: CurrentFlow )
data class UnAssignOffsetCurrentFromPetersenCoilCommand(@TargetAggregateIdentifier  val petersenCoilId: UUID )
data class AssignPositionCurrentToPetersenCoilCommand(@TargetAggregateIdentifier  val petersenCoilId: UUID, val assignment: CurrentFlow )
data class UnAssignPositionCurrentFromPetersenCoilCommand(@TargetAggregateIdentifier  val petersenCoilId: UUID )
data class AssignXGroundMaxToPetersenCoilCommand(@TargetAggregateIdentifier  val petersenCoilId: UUID, val assignment: Reactance )
data class UnAssignXGroundMaxFromPetersenCoilCommand(@TargetAggregateIdentifier  val petersenCoilId: UUID )
data class AssignXGroundMinToPetersenCoilCommand(@TargetAggregateIdentifier  val petersenCoilId: UUID, val assignment: Reactance )
data class UnAssignXGroundMinFromPetersenCoilCommand(@TargetAggregateIdentifier  val petersenCoilId: UUID )
data class AssignXGroundNominalToPetersenCoilCommand(@TargetAggregateIdentifier  val petersenCoilId: UUID, val assignment: Reactance )
data class UnAssignXGroundNominalFromPetersenCoilCommand(@TargetAggregateIdentifier  val petersenCoilId: UUID )

// multiple association commands


// PhaseTapChanger Commands
data class CreatePhaseTapChangerCommand(
    @TargetAggregateIdentifier  var phaseTapChangerId: UUID? = null
)

data class UpdatePhaseTapChangerCommand(
    @TargetAggregateIdentifier  var phaseTapChangerId: UUID? = null
)

data class DeletePhaseTapChangerCommand(@TargetAggregateIdentifier  var phaseTapChangerId: UUID? = null)

// single association commands

// multiple association commands


// PhaseTapChangerAsymmetrical Commands
data class CreatePhaseTapChangerAsymmetricalCommand(
    @TargetAggregateIdentifier  var phaseTapChangerAsymmetricalId: UUID? = null
)

data class UpdatePhaseTapChangerAsymmetricalCommand(
    @TargetAggregateIdentifier var phaseTapChangerAsymmetricalId: UUID? = null,
    var windingConnectionAngle: AngleDegrees
)

data class DeletePhaseTapChangerAsymmetricalCommand(@TargetAggregateIdentifier  var phaseTapChangerAsymmetricalId: UUID? = null)

// single association commands
data class AssignWindingConnectionAngleToPhaseTapChangerAsymmetricalCommand(@TargetAggregateIdentifier  val phaseTapChangerAsymmetricalId: UUID, val assignment: AngleDegrees )
data class UnAssignWindingConnectionAngleFromPhaseTapChangerAsymmetricalCommand(@TargetAggregateIdentifier  val phaseTapChangerAsymmetricalId: UUID )

// multiple association commands


// PhaseTapChangerLinear Commands
data class CreatePhaseTapChangerLinearCommand(
    @TargetAggregateIdentifier  var phaseTapChangerLinearId: UUID? = null
)

data class UpdatePhaseTapChangerLinearCommand(
    @TargetAggregateIdentifier var phaseTapChangerLinearId: UUID? = null,
    var stepPhaseShiftIncrement: AngleDegrees,
    var xMax: Reactance,
    var xMin: Reactance
)

data class DeletePhaseTapChangerLinearCommand(@TargetAggregateIdentifier  var phaseTapChangerLinearId: UUID? = null)

// single association commands
data class AssignStepPhaseShiftIncrementToPhaseTapChangerLinearCommand(@TargetAggregateIdentifier  val phaseTapChangerLinearId: UUID, val assignment: AngleDegrees )
data class UnAssignStepPhaseShiftIncrementFromPhaseTapChangerLinearCommand(@TargetAggregateIdentifier  val phaseTapChangerLinearId: UUID )
data class AssignXMaxToPhaseTapChangerLinearCommand(@TargetAggregateIdentifier  val phaseTapChangerLinearId: UUID, val assignment: Reactance )
data class UnAssignXMaxFromPhaseTapChangerLinearCommand(@TargetAggregateIdentifier  val phaseTapChangerLinearId: UUID )
data class AssignXMinToPhaseTapChangerLinearCommand(@TargetAggregateIdentifier  val phaseTapChangerLinearId: UUID, val assignment: Reactance )
data class UnAssignXMinFromPhaseTapChangerLinearCommand(@TargetAggregateIdentifier  val phaseTapChangerLinearId: UUID )

// multiple association commands


// PhaseTapChangerNonLinear Commands
data class CreatePhaseTapChangerNonLinearCommand(
    @TargetAggregateIdentifier  var phaseTapChangerNonLinearId: UUID? = null
)

data class UpdatePhaseTapChangerNonLinearCommand(
    @TargetAggregateIdentifier var phaseTapChangerNonLinearId: UUID? = null,
    var voltageStepIncrement: PerCent,
    var xMax: Reactance,
    var xMin: Reactance
)

data class DeletePhaseTapChangerNonLinearCommand(@TargetAggregateIdentifier  var phaseTapChangerNonLinearId: UUID? = null)

// single association commands
data class AssignVoltageStepIncrementToPhaseTapChangerNonLinearCommand(@TargetAggregateIdentifier  val phaseTapChangerNonLinearId: UUID, val assignment: PerCent )
data class UnAssignVoltageStepIncrementFromPhaseTapChangerNonLinearCommand(@TargetAggregateIdentifier  val phaseTapChangerNonLinearId: UUID )
data class AssignXMaxToPhaseTapChangerNonLinearCommand(@TargetAggregateIdentifier  val phaseTapChangerNonLinearId: UUID, val assignment: Reactance )
data class UnAssignXMaxFromPhaseTapChangerNonLinearCommand(@TargetAggregateIdentifier  val phaseTapChangerNonLinearId: UUID )
data class AssignXMinToPhaseTapChangerNonLinearCommand(@TargetAggregateIdentifier  val phaseTapChangerNonLinearId: UUID, val assignment: Reactance )
data class UnAssignXMinFromPhaseTapChangerNonLinearCommand(@TargetAggregateIdentifier  val phaseTapChangerNonLinearId: UUID )

// multiple association commands


// PhaseTapChangerSymmetrical Commands
data class CreatePhaseTapChangerSymmetricalCommand(
    @TargetAggregateIdentifier  var phaseTapChangerSymmetricalId: UUID? = null
)

data class UpdatePhaseTapChangerSymmetricalCommand(
    @TargetAggregateIdentifier  var phaseTapChangerSymmetricalId: UUID? = null
)

data class DeletePhaseTapChangerSymmetricalCommand(@TargetAggregateIdentifier  var phaseTapChangerSymmetricalId: UUID? = null)

// single association commands

// multiple association commands


// PhaseTapChangerTable Commands
data class CreatePhaseTapChangerTableCommand(
    @TargetAggregateIdentifier  var phaseTapChangerTableId: UUID? = null
)

data class UpdatePhaseTapChangerTableCommand(
    @TargetAggregateIdentifier  var phaseTapChangerTableId: UUID? = null
)

data class DeletePhaseTapChangerTableCommand(@TargetAggregateIdentifier  var phaseTapChangerTableId: UUID? = null)

// single association commands

// multiple association commands


// PhaseTapChangerTablePoint Commands
data class CreatePhaseTapChangerTablePointCommand(
    @TargetAggregateIdentifier  var phaseTapChangerTablePointId: UUID? = null
)

data class UpdatePhaseTapChangerTablePointCommand(
    @TargetAggregateIdentifier var phaseTapChangerTablePointId: UUID? = null,
    var angle: AngleDegrees
)

data class DeletePhaseTapChangerTablePointCommand(@TargetAggregateIdentifier  var phaseTapChangerTablePointId: UUID? = null)

// single association commands
data class AssignAngleToPhaseTapChangerTablePointCommand(@TargetAggregateIdentifier  val phaseTapChangerTablePointId: UUID, val assignment: AngleDegrees )
data class UnAssignAngleFromPhaseTapChangerTablePointCommand(@TargetAggregateIdentifier  val phaseTapChangerTablePointId: UUID )

// multiple association commands


// PhaseTapChangerTabular Commands
data class CreatePhaseTapChangerTabularCommand(
    @TargetAggregateIdentifier  var phaseTapChangerTabularId: UUID? = null
)

data class UpdatePhaseTapChangerTabularCommand(
    @TargetAggregateIdentifier  var phaseTapChangerTabularId: UUID? = null
)

data class DeletePhaseTapChangerTabularCommand(@TargetAggregateIdentifier  var phaseTapChangerTabularId: UUID? = null)

// single association commands

// multiple association commands


// PositionPoint Commands
data class CreatePositionPointCommand(
    @TargetAggregateIdentifier  var positionPointId: UUID? = null
)

data class UpdatePositionPointCommand(
    @TargetAggregateIdentifier var positionPointId: UUID? = null,
    var sequenceNumber: IntegerProxy,
    var xPosition: StringProxy,
    var yPosition: StringProxy,
    var zPosition: StringProxy
)

data class DeletePositionPointCommand(@TargetAggregateIdentifier  var positionPointId: UUID? = null)

// single association commands
data class AssignSequenceNumberToPositionPointCommand(@TargetAggregateIdentifier  val positionPointId: UUID, val assignment: IntegerProxy )
data class UnAssignSequenceNumberFromPositionPointCommand(@TargetAggregateIdentifier  val positionPointId: UUID )
data class AssignXPositionToPositionPointCommand(@TargetAggregateIdentifier  val positionPointId: UUID, val assignment: StringProxy )
data class UnAssignXPositionFromPositionPointCommand(@TargetAggregateIdentifier  val positionPointId: UUID )
data class AssignYPositionToPositionPointCommand(@TargetAggregateIdentifier  val positionPointId: UUID, val assignment: StringProxy )
data class UnAssignYPositionFromPositionPointCommand(@TargetAggregateIdentifier  val positionPointId: UUID )
data class AssignZPositionToPositionPointCommand(@TargetAggregateIdentifier  val positionPointId: UUID, val assignment: StringProxy )
data class UnAssignZPositionFromPositionPointCommand(@TargetAggregateIdentifier  val positionPointId: UUID )

// multiple association commands


// PowerSystemResource Commands
data class CreatePowerSystemResourceCommand(
    @TargetAggregateIdentifier  var powerSystemResourceId: UUID? = null
)

data class UpdatePowerSystemResourceCommand(
    @TargetAggregateIdentifier  var powerSystemResourceId: UUID? = null
)

data class DeletePowerSystemResourceCommand(@TargetAggregateIdentifier  var powerSystemResourceId: UUID? = null)

// single association commands

// multiple association commands


// PowerSystemStabilizerDynamics Commands
data class CreatePowerSystemStabilizerDynamicsCommand(
    @TargetAggregateIdentifier  var powerSystemStabilizerDynamicsId: UUID? = null
)

data class UpdatePowerSystemStabilizerDynamicsCommand(
    @TargetAggregateIdentifier  var powerSystemStabilizerDynamicsId: UUID? = null
)

data class DeletePowerSystemStabilizerDynamicsCommand(@TargetAggregateIdentifier  var powerSystemStabilizerDynamicsId: UUID? = null)

// single association commands

// multiple association commands


// PowerSystemStabilizerUserDefined Commands
data class CreatePowerSystemStabilizerUserDefinedCommand(
    @TargetAggregateIdentifier  var powerSystemStabilizerUserDefinedId: UUID? = null
)

data class UpdatePowerSystemStabilizerUserDefinedCommand(
    @TargetAggregateIdentifier var powerSystemStabilizerUserDefinedId: UUID? = null,
    var proprietary: BooleanProxy
)

data class DeletePowerSystemStabilizerUserDefinedCommand(@TargetAggregateIdentifier  var powerSystemStabilizerUserDefinedId: UUID? = null)

// single association commands
data class AssignProprietaryToPowerSystemStabilizerUserDefinedCommand(@TargetAggregateIdentifier  val powerSystemStabilizerUserDefinedId: UUID, val assignment: BooleanProxy )
data class UnAssignProprietaryFromPowerSystemStabilizerUserDefinedCommand(@TargetAggregateIdentifier  val powerSystemStabilizerUserDefinedId: UUID )

// multiple association commands


// PowerTransformer Commands
data class CreatePowerTransformerCommand(
    @TargetAggregateIdentifier  var powerTransformerId: UUID? = null
)

data class UpdatePowerTransformerCommand(
    @TargetAggregateIdentifier var powerTransformerId: UUID? = null,
    var beforeShCircuitHighestOperatingCurrent: CurrentFlow,
    var beforeShCircuitHighestOperatingVoltage: Voltage,
    var beforeShortCircuitAnglePf: AngleDegrees,
    var highSideMinOperatingU: Voltage,
    var partOfGeneratorUnitFlag: BooleanProxy,
    var operationalValuesConsidered: BooleanProxy
)

data class DeletePowerTransformerCommand(@TargetAggregateIdentifier  var powerTransformerId: UUID? = null)

// single association commands
data class AssignBeforeShCircuitHighestOperatingCurrentToPowerTransformerCommand(@TargetAggregateIdentifier  val powerTransformerId: UUID, val assignment: CurrentFlow )
data class UnAssignBeforeShCircuitHighestOperatingCurrentFromPowerTransformerCommand(@TargetAggregateIdentifier  val powerTransformerId: UUID )
data class AssignBeforeShCircuitHighestOperatingVoltageToPowerTransformerCommand(@TargetAggregateIdentifier  val powerTransformerId: UUID, val assignment: Voltage )
data class UnAssignBeforeShCircuitHighestOperatingVoltageFromPowerTransformerCommand(@TargetAggregateIdentifier  val powerTransformerId: UUID )
data class AssignBeforeShortCircuitAnglePfToPowerTransformerCommand(@TargetAggregateIdentifier  val powerTransformerId: UUID, val assignment: AngleDegrees )
data class UnAssignBeforeShortCircuitAnglePfFromPowerTransformerCommand(@TargetAggregateIdentifier  val powerTransformerId: UUID )
data class AssignHighSideMinOperatingUToPowerTransformerCommand(@TargetAggregateIdentifier  val powerTransformerId: UUID, val assignment: Voltage )
data class UnAssignHighSideMinOperatingUFromPowerTransformerCommand(@TargetAggregateIdentifier  val powerTransformerId: UUID )
data class AssignPartOfGeneratorUnitFlagToPowerTransformerCommand(@TargetAggregateIdentifier  val powerTransformerId: UUID, val assignment: BooleanProxy )
data class UnAssignPartOfGeneratorUnitFlagFromPowerTransformerCommand(@TargetAggregateIdentifier  val powerTransformerId: UUID )
data class AssignOperationalValuesConsideredToPowerTransformerCommand(@TargetAggregateIdentifier  val powerTransformerId: UUID, val assignment: BooleanProxy )
data class UnAssignOperationalValuesConsideredFromPowerTransformerCommand(@TargetAggregateIdentifier  val powerTransformerId: UUID )

// multiple association commands


// PowerTransformerEnd Commands
data class CreatePowerTransformerEndCommand(
    @TargetAggregateIdentifier var powerTransformerEndId: UUID? = null,
    @Enumerated(EnumType.STRING) var connectionKind: WindingConnection
)

data class UpdatePowerTransformerEndCommand(
    @TargetAggregateIdentifier var powerTransformerEndId: UUID? = null,
    var b: Susceptance,
    var b0: Susceptance,
    @Enumerated(EnumType.STRING) var connectionKind: WindingConnection,
    var g: Conductance,
    var g0: Conductance,
    var phaseAngleClock: IntegerProxy,
    var r: Resistance,
    var r0: Resistance,
    var ratedS: ApparentPower,
    var ratedU: Voltage,
    var x: Reactance,
    var x0: Reactance
)

data class DeletePowerTransformerEndCommand(@TargetAggregateIdentifier  var powerTransformerEndId: UUID? = null)

// single association commands
data class AssignBToPowerTransformerEndCommand(@TargetAggregateIdentifier  val powerTransformerEndId: UUID, val assignment: Susceptance )
data class UnAssignBFromPowerTransformerEndCommand(@TargetAggregateIdentifier  val powerTransformerEndId: UUID )
data class AssignB0ToPowerTransformerEndCommand(@TargetAggregateIdentifier  val powerTransformerEndId: UUID, val assignment: Susceptance )
data class UnAssignB0FromPowerTransformerEndCommand(@TargetAggregateIdentifier  val powerTransformerEndId: UUID )
data class AssignGToPowerTransformerEndCommand(@TargetAggregateIdentifier  val powerTransformerEndId: UUID, val assignment: Conductance )
data class UnAssignGFromPowerTransformerEndCommand(@TargetAggregateIdentifier  val powerTransformerEndId: UUID )
data class AssignG0ToPowerTransformerEndCommand(@TargetAggregateIdentifier  val powerTransformerEndId: UUID, val assignment: Conductance )
data class UnAssignG0FromPowerTransformerEndCommand(@TargetAggregateIdentifier  val powerTransformerEndId: UUID )
data class AssignPhaseAngleClockToPowerTransformerEndCommand(@TargetAggregateIdentifier  val powerTransformerEndId: UUID, val assignment: IntegerProxy )
data class UnAssignPhaseAngleClockFromPowerTransformerEndCommand(@TargetAggregateIdentifier  val powerTransformerEndId: UUID )
data class AssignRToPowerTransformerEndCommand(@TargetAggregateIdentifier  val powerTransformerEndId: UUID, val assignment: Resistance )
data class UnAssignRFromPowerTransformerEndCommand(@TargetAggregateIdentifier  val powerTransformerEndId: UUID )
data class AssignR0ToPowerTransformerEndCommand(@TargetAggregateIdentifier  val powerTransformerEndId: UUID, val assignment: Resistance )
data class UnAssignR0FromPowerTransformerEndCommand(@TargetAggregateIdentifier  val powerTransformerEndId: UUID )
data class AssignRatedSToPowerTransformerEndCommand(@TargetAggregateIdentifier  val powerTransformerEndId: UUID, val assignment: ApparentPower )
data class UnAssignRatedSFromPowerTransformerEndCommand(@TargetAggregateIdentifier  val powerTransformerEndId: UUID )
data class AssignRatedUToPowerTransformerEndCommand(@TargetAggregateIdentifier  val powerTransformerEndId: UUID, val assignment: Voltage )
data class UnAssignRatedUFromPowerTransformerEndCommand(@TargetAggregateIdentifier  val powerTransformerEndId: UUID )
data class AssignXToPowerTransformerEndCommand(@TargetAggregateIdentifier  val powerTransformerEndId: UUID, val assignment: Reactance )
data class UnAssignXFromPowerTransformerEndCommand(@TargetAggregateIdentifier  val powerTransformerEndId: UUID )
data class AssignX0ToPowerTransformerEndCommand(@TargetAggregateIdentifier  val powerTransformerEndId: UUID, val assignment: Reactance )
data class UnAssignX0FromPowerTransformerEndCommand(@TargetAggregateIdentifier  val powerTransformerEndId: UUID )

// multiple association commands


// ProprietaryParameterDynamics Commands
data class CreateProprietaryParameterDynamicsCommand(
    @TargetAggregateIdentifier  var proprietaryParameterDynamicsId: UUID? = null
)

data class UpdateProprietaryParameterDynamicsCommand(
    @TargetAggregateIdentifier var proprietaryParameterDynamicsId: UUID? = null,
    var booleanParameterValue: BooleanProxy,
    var floatParameterValue: Simple_Float,
    var integerParameterValue: IntegerProxy,
    var parameterNumber: IntegerProxy
)

data class DeleteProprietaryParameterDynamicsCommand(@TargetAggregateIdentifier  var proprietaryParameterDynamicsId: UUID? = null)

// single association commands
data class AssignBooleanParameterValueToProprietaryParameterDynamicsCommand(@TargetAggregateIdentifier  val proprietaryParameterDynamicsId: UUID, val assignment: BooleanProxy )
data class UnAssignBooleanParameterValueFromProprietaryParameterDynamicsCommand(@TargetAggregateIdentifier  val proprietaryParameterDynamicsId: UUID )
data class AssignFloatParameterValueToProprietaryParameterDynamicsCommand(@TargetAggregateIdentifier  val proprietaryParameterDynamicsId: UUID, val assignment: Simple_Float )
data class UnAssignFloatParameterValueFromProprietaryParameterDynamicsCommand(@TargetAggregateIdentifier  val proprietaryParameterDynamicsId: UUID )
data class AssignIntegerParameterValueToProprietaryParameterDynamicsCommand(@TargetAggregateIdentifier  val proprietaryParameterDynamicsId: UUID, val assignment: IntegerProxy )
data class UnAssignIntegerParameterValueFromProprietaryParameterDynamicsCommand(@TargetAggregateIdentifier  val proprietaryParameterDynamicsId: UUID )
data class AssignParameterNumberToProprietaryParameterDynamicsCommand(@TargetAggregateIdentifier  val proprietaryParameterDynamicsId: UUID, val assignment: IntegerProxy )
data class UnAssignParameterNumberFromProprietaryParameterDynamicsCommand(@TargetAggregateIdentifier  val proprietaryParameterDynamicsId: UUID )

// multiple association commands


// ProtectedSwitch Commands
data class CreateProtectedSwitchCommand(
    @TargetAggregateIdentifier  var protectedSwitchId: UUID? = null
)

data class UpdateProtectedSwitchCommand(
    @TargetAggregateIdentifier  var protectedSwitchId: UUID? = null
)

data class DeleteProtectedSwitchCommand(@TargetAggregateIdentifier  var protectedSwitchId: UUID? = null)

// single association commands

// multiple association commands


// Pss1 Commands
data class CreatePss1Command(
    @TargetAggregateIdentifier  var pss1Id: UUID? = null
)

data class UpdatePss1Command(
    @TargetAggregateIdentifier var pss1Id: UUID? = null,
    var kf: Simple_Float,
    var kpe: Simple_Float,
    var ks: Simple_Float,
    var kw: Simple_Float,
    var pmin: PU,
    var t10: Seconds,
    var t5: Seconds,
    var t6: Seconds,
    var t7: Seconds,
    var t8: Seconds,
    var t9: Seconds,
    var tpe: Seconds,
    var vadat: BooleanProxy,
    var vsmn: PU,
    var vsmx: PU
)

data class DeletePss1Command(@TargetAggregateIdentifier  var pss1Id: UUID? = null)

// single association commands
data class AssignKfToPss1Command(@TargetAggregateIdentifier  val pss1Id: UUID, val assignment: Simple_Float )
data class UnAssignKfFromPss1Command(@TargetAggregateIdentifier  val pss1Id: UUID )
data class AssignKpeToPss1Command(@TargetAggregateIdentifier  val pss1Id: UUID, val assignment: Simple_Float )
data class UnAssignKpeFromPss1Command(@TargetAggregateIdentifier  val pss1Id: UUID )
data class AssignKsToPss1Command(@TargetAggregateIdentifier  val pss1Id: UUID, val assignment: Simple_Float )
data class UnAssignKsFromPss1Command(@TargetAggregateIdentifier  val pss1Id: UUID )
data class AssignKwToPss1Command(@TargetAggregateIdentifier  val pss1Id: UUID, val assignment: Simple_Float )
data class UnAssignKwFromPss1Command(@TargetAggregateIdentifier  val pss1Id: UUID )
data class AssignPminToPss1Command(@TargetAggregateIdentifier  val pss1Id: UUID, val assignment: PU )
data class UnAssignPminFromPss1Command(@TargetAggregateIdentifier  val pss1Id: UUID )
data class AssignT10ToPss1Command(@TargetAggregateIdentifier  val pss1Id: UUID, val assignment: Seconds )
data class UnAssignT10FromPss1Command(@TargetAggregateIdentifier  val pss1Id: UUID )
data class AssignT5ToPss1Command(@TargetAggregateIdentifier  val pss1Id: UUID, val assignment: Seconds )
data class UnAssignT5FromPss1Command(@TargetAggregateIdentifier  val pss1Id: UUID )
data class AssignT6ToPss1Command(@TargetAggregateIdentifier  val pss1Id: UUID, val assignment: Seconds )
data class UnAssignT6FromPss1Command(@TargetAggregateIdentifier  val pss1Id: UUID )
data class AssignT7ToPss1Command(@TargetAggregateIdentifier  val pss1Id: UUID, val assignment: Seconds )
data class UnAssignT7FromPss1Command(@TargetAggregateIdentifier  val pss1Id: UUID )
data class AssignT8ToPss1Command(@TargetAggregateIdentifier  val pss1Id: UUID, val assignment: Seconds )
data class UnAssignT8FromPss1Command(@TargetAggregateIdentifier  val pss1Id: UUID )
data class AssignT9ToPss1Command(@TargetAggregateIdentifier  val pss1Id: UUID, val assignment: Seconds )
data class UnAssignT9FromPss1Command(@TargetAggregateIdentifier  val pss1Id: UUID )
data class AssignTpeToPss1Command(@TargetAggregateIdentifier  val pss1Id: UUID, val assignment: Seconds )
data class UnAssignTpeFromPss1Command(@TargetAggregateIdentifier  val pss1Id: UUID )
data class AssignVadatToPss1Command(@TargetAggregateIdentifier  val pss1Id: UUID, val assignment: BooleanProxy )
data class UnAssignVadatFromPss1Command(@TargetAggregateIdentifier  val pss1Id: UUID )
data class AssignVsmnToPss1Command(@TargetAggregateIdentifier  val pss1Id: UUID, val assignment: PU )
data class UnAssignVsmnFromPss1Command(@TargetAggregateIdentifier  val pss1Id: UUID )
data class AssignVsmxToPss1Command(@TargetAggregateIdentifier  val pss1Id: UUID, val assignment: PU )
data class UnAssignVsmxFromPss1Command(@TargetAggregateIdentifier  val pss1Id: UUID )

// multiple association commands


// Pss1A Commands
data class CreatePss1ACommand(
    @TargetAggregateIdentifier var pss1AId: UUID? = null,
    @Enumerated(EnumType.STRING) var inputSignalType: InputSignalKind
)

data class UpdatePss1ACommand(
    @TargetAggregateIdentifier var pss1AId: UUID? = null,
    var a1: PU,
    var a2: PU,
    var a3: PU,
    var a4: PU,
    var a5: PU,
    var a6: PU,
    var a7: PU,
    var a8: PU,
    @Enumerated(EnumType.STRING) var inputSignalType: InputSignalKind,
    var kd: BooleanProxy,
    var ks: PU,
    var t1: Seconds,
    var t2: Seconds,
    var t3: Seconds,
    var t4: Seconds,
    var t5: Seconds,
    var t6: Seconds,
    var tdelay: Seconds,
    var vcl: PU,
    var vcu: PU,
    var vrmax: PU,
    var vrmin: PU
)

data class DeletePss1ACommand(@TargetAggregateIdentifier  var pss1AId: UUID? = null)

// single association commands
data class AssignA1ToPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID, val assignment: PU )
data class UnAssignA1FromPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID )
data class AssignA2ToPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID, val assignment: PU )
data class UnAssignA2FromPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID )
data class AssignA3ToPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID, val assignment: PU )
data class UnAssignA3FromPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID )
data class AssignA4ToPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID, val assignment: PU )
data class UnAssignA4FromPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID )
data class AssignA5ToPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID, val assignment: PU )
data class UnAssignA5FromPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID )
data class AssignA6ToPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID, val assignment: PU )
data class UnAssignA6FromPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID )
data class AssignA7ToPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID, val assignment: PU )
data class UnAssignA7FromPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID )
data class AssignA8ToPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID, val assignment: PU )
data class UnAssignA8FromPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID )
data class AssignKdToPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID, val assignment: BooleanProxy )
data class UnAssignKdFromPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID )
data class AssignKsToPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID, val assignment: PU )
data class UnAssignKsFromPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID )
data class AssignT1ToPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID, val assignment: Seconds )
data class UnAssignT1FromPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID )
data class AssignT2ToPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID, val assignment: Seconds )
data class UnAssignT2FromPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID )
data class AssignT3ToPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID, val assignment: Seconds )
data class UnAssignT3FromPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID )
data class AssignT4ToPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID, val assignment: Seconds )
data class UnAssignT4FromPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID )
data class AssignT5ToPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID, val assignment: Seconds )
data class UnAssignT5FromPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID )
data class AssignT6ToPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID, val assignment: Seconds )
data class UnAssignT6FromPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID )
data class AssignTdelayToPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID, val assignment: Seconds )
data class UnAssignTdelayFromPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID )
data class AssignVclToPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID, val assignment: PU )
data class UnAssignVclFromPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID )
data class AssignVcuToPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID, val assignment: PU )
data class UnAssignVcuFromPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID )
data class AssignVrmaxToPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID, val assignment: PU )
data class UnAssignVrmaxFromPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID )
data class AssignVrminToPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID, val assignment: PU )
data class UnAssignVrminFromPss1ACommand(@TargetAggregateIdentifier  val pss1AId: UUID )

// multiple association commands


// Pss2B Commands
data class CreatePss2BCommand(
    @TargetAggregateIdentifier var pss2BId: UUID? = null,
    @Enumerated(EnumType.STRING) var inputSignal1Type: InputSignalKind,
    @Enumerated(EnumType.STRING) var inputSignal2Type: InputSignalKind
)

data class UpdatePss2BCommand(
    @TargetAggregateIdentifier var pss2BId: UUID? = null,
    var a: Simple_Float,
    @Enumerated(EnumType.STRING) var inputSignal1Type: InputSignalKind,
    @Enumerated(EnumType.STRING) var inputSignal2Type: InputSignalKind,
    var ks1: PU,
    var ks2: PU,
    var ks3: PU,
    var ks4: PU,
    var m: IntegerProxy,
    var n: IntegerProxy,
    var t1: Seconds,
    var t10: Seconds,
    var t11: Seconds,
    var t2: Seconds,
    var t3: Seconds,
    var t4: Seconds,
    var t6: Seconds,
    var t7: Seconds,
    var t8: Seconds,
    var t9: Seconds,
    var ta: Seconds,
    var tb: Seconds,
    var tw1: Seconds,
    var tw2: Seconds,
    var tw3: Seconds,
    var tw4: Seconds,
    var vsi1max: PU,
    var vsi1min: PU,
    var vsi2max: PU,
    var vsi2min: PU,
    var vstmax: PU,
    var vstmin: PU
)

data class DeletePss2BCommand(@TargetAggregateIdentifier  var pss2BId: UUID? = null)

// single association commands
data class AssignAToPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID, val assignment: Simple_Float )
data class UnAssignAFromPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID )
data class AssignKs1ToPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID, val assignment: PU )
data class UnAssignKs1FromPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID )
data class AssignKs2ToPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID, val assignment: PU )
data class UnAssignKs2FromPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID )
data class AssignKs3ToPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID, val assignment: PU )
data class UnAssignKs3FromPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID )
data class AssignKs4ToPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID, val assignment: PU )
data class UnAssignKs4FromPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID )
data class AssignMToPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID, val assignment: IntegerProxy )
data class UnAssignMFromPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID )
data class AssignNToPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID, val assignment: IntegerProxy )
data class UnAssignNFromPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID )
data class AssignT1ToPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID, val assignment: Seconds )
data class UnAssignT1FromPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID )
data class AssignT10ToPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID, val assignment: Seconds )
data class UnAssignT10FromPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID )
data class AssignT11ToPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID, val assignment: Seconds )
data class UnAssignT11FromPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID )
data class AssignT2ToPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID, val assignment: Seconds )
data class UnAssignT2FromPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID )
data class AssignT3ToPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID, val assignment: Seconds )
data class UnAssignT3FromPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID )
data class AssignT4ToPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID, val assignment: Seconds )
data class UnAssignT4FromPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID )
data class AssignT6ToPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID, val assignment: Seconds )
data class UnAssignT6FromPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID )
data class AssignT7ToPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID, val assignment: Seconds )
data class UnAssignT7FromPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID )
data class AssignT8ToPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID, val assignment: Seconds )
data class UnAssignT8FromPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID )
data class AssignT9ToPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID, val assignment: Seconds )
data class UnAssignT9FromPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID )
data class AssignTaToPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID, val assignment: Seconds )
data class UnAssignTaFromPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID )
data class AssignTbToPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID, val assignment: Seconds )
data class UnAssignTbFromPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID )
data class AssignTw1ToPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID, val assignment: Seconds )
data class UnAssignTw1FromPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID )
data class AssignTw2ToPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID, val assignment: Seconds )
data class UnAssignTw2FromPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID )
data class AssignTw3ToPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID, val assignment: Seconds )
data class UnAssignTw3FromPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID )
data class AssignTw4ToPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID, val assignment: Seconds )
data class UnAssignTw4FromPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID )
data class AssignVsi1maxToPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID, val assignment: PU )
data class UnAssignVsi1maxFromPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID )
data class AssignVsi1minToPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID, val assignment: PU )
data class UnAssignVsi1minFromPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID )
data class AssignVsi2maxToPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID, val assignment: PU )
data class UnAssignVsi2maxFromPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID )
data class AssignVsi2minToPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID, val assignment: PU )
data class UnAssignVsi2minFromPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID )
data class AssignVstmaxToPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID, val assignment: PU )
data class UnAssignVstmaxFromPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID )
data class AssignVstminToPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID, val assignment: PU )
data class UnAssignVstminFromPss2BCommand(@TargetAggregateIdentifier  val pss2BId: UUID )

// multiple association commands


// Pss2ST Commands
data class CreatePss2STCommand(
    @TargetAggregateIdentifier var pss2STId: UUID? = null,
    @Enumerated(EnumType.STRING) var inputSignal1Type: InputSignalKind,
    @Enumerated(EnumType.STRING) var inputSignal2Type: InputSignalKind
)

data class UpdatePss2STCommand(
    @TargetAggregateIdentifier var pss2STId: UUID? = null,
    @Enumerated(EnumType.STRING) var inputSignal1Type: InputSignalKind,
    @Enumerated(EnumType.STRING) var inputSignal2Type: InputSignalKind,
    var k1: PU,
    var k2: PU,
    var lsmax: PU,
    var lsmin: PU,
    var t1: Seconds,
    var t10: Seconds,
    var t2: Seconds,
    var t3: Seconds,
    var t4: Seconds,
    var t5: Seconds,
    var t6: Seconds,
    var t7: Seconds,
    var t8: Seconds,
    var t9: Seconds,
    var vcl: PU,
    var vcu: PU
)

data class DeletePss2STCommand(@TargetAggregateIdentifier  var pss2STId: UUID? = null)

// single association commands
data class AssignK1ToPss2STCommand(@TargetAggregateIdentifier  val pss2STId: UUID, val assignment: PU )
data class UnAssignK1FromPss2STCommand(@TargetAggregateIdentifier  val pss2STId: UUID )
data class AssignK2ToPss2STCommand(@TargetAggregateIdentifier  val pss2STId: UUID, val assignment: PU )
data class UnAssignK2FromPss2STCommand(@TargetAggregateIdentifier  val pss2STId: UUID )
data class AssignLsmaxToPss2STCommand(@TargetAggregateIdentifier  val pss2STId: UUID, val assignment: PU )
data class UnAssignLsmaxFromPss2STCommand(@TargetAggregateIdentifier  val pss2STId: UUID )
data class AssignLsminToPss2STCommand(@TargetAggregateIdentifier  val pss2STId: UUID, val assignment: PU )
data class UnAssignLsminFromPss2STCommand(@TargetAggregateIdentifier  val pss2STId: UUID )
data class AssignT1ToPss2STCommand(@TargetAggregateIdentifier  val pss2STId: UUID, val assignment: Seconds )
data class UnAssignT1FromPss2STCommand(@TargetAggregateIdentifier  val pss2STId: UUID )
data class AssignT10ToPss2STCommand(@TargetAggregateIdentifier  val pss2STId: UUID, val assignment: Seconds )
data class UnAssignT10FromPss2STCommand(@TargetAggregateIdentifier  val pss2STId: UUID )
data class AssignT2ToPss2STCommand(@TargetAggregateIdentifier  val pss2STId: UUID, val assignment: Seconds )
data class UnAssignT2FromPss2STCommand(@TargetAggregateIdentifier  val pss2STId: UUID )
data class AssignT3ToPss2STCommand(@TargetAggregateIdentifier  val pss2STId: UUID, val assignment: Seconds )
data class UnAssignT3FromPss2STCommand(@TargetAggregateIdentifier  val pss2STId: UUID )
data class AssignT4ToPss2STCommand(@TargetAggregateIdentifier  val pss2STId: UUID, val assignment: Seconds )
data class UnAssignT4FromPss2STCommand(@TargetAggregateIdentifier  val pss2STId: UUID )
data class AssignT5ToPss2STCommand(@TargetAggregateIdentifier  val pss2STId: UUID, val assignment: Seconds )
data class UnAssignT5FromPss2STCommand(@TargetAggregateIdentifier  val pss2STId: UUID )
data class AssignT6ToPss2STCommand(@TargetAggregateIdentifier  val pss2STId: UUID, val assignment: Seconds )
data class UnAssignT6FromPss2STCommand(@TargetAggregateIdentifier  val pss2STId: UUID )
data class AssignT7ToPss2STCommand(@TargetAggregateIdentifier  val pss2STId: UUID, val assignment: Seconds )
data class UnAssignT7FromPss2STCommand(@TargetAggregateIdentifier  val pss2STId: UUID )
data class AssignT8ToPss2STCommand(@TargetAggregateIdentifier  val pss2STId: UUID, val assignment: Seconds )
data class UnAssignT8FromPss2STCommand(@TargetAggregateIdentifier  val pss2STId: UUID )
data class AssignT9ToPss2STCommand(@TargetAggregateIdentifier  val pss2STId: UUID, val assignment: Seconds )
data class UnAssignT9FromPss2STCommand(@TargetAggregateIdentifier  val pss2STId: UUID )
data class AssignVclToPss2STCommand(@TargetAggregateIdentifier  val pss2STId: UUID, val assignment: PU )
data class UnAssignVclFromPss2STCommand(@TargetAggregateIdentifier  val pss2STId: UUID )
data class AssignVcuToPss2STCommand(@TargetAggregateIdentifier  val pss2STId: UUID, val assignment: PU )
data class UnAssignVcuFromPss2STCommand(@TargetAggregateIdentifier  val pss2STId: UUID )

// multiple association commands


// Pss5 Commands
data class CreatePss5Command(
    @TargetAggregateIdentifier  var pss5Id: UUID? = null
)

data class UpdatePss5Command(
    @TargetAggregateIdentifier var pss5Id: UUID? = null,
    var ctw2: BooleanProxy,
    var deadband: PU,
    var isfreq: BooleanProxy,
    var kf: Simple_Float,
    var kpe: Simple_Float,
    var kpss: Simple_Float,
    var pmm: PU,
    var tl1: Seconds,
    var tl2: Seconds,
    var tl3: Seconds,
    var tl4: Seconds,
    var tpe: Seconds,
    var tw1: Seconds,
    var tw2: Seconds,
    var vadat: BooleanProxy,
    var vsmn: PU,
    var vsmx: PU
)

data class DeletePss5Command(@TargetAggregateIdentifier  var pss5Id: UUID? = null)

// single association commands
data class AssignCtw2ToPss5Command(@TargetAggregateIdentifier  val pss5Id: UUID, val assignment: BooleanProxy )
data class UnAssignCtw2FromPss5Command(@TargetAggregateIdentifier  val pss5Id: UUID )
data class AssignDeadbandToPss5Command(@TargetAggregateIdentifier  val pss5Id: UUID, val assignment: PU )
data class UnAssignDeadbandFromPss5Command(@TargetAggregateIdentifier  val pss5Id: UUID )
data class AssignIsfreqToPss5Command(@TargetAggregateIdentifier  val pss5Id: UUID, val assignment: BooleanProxy )
data class UnAssignIsfreqFromPss5Command(@TargetAggregateIdentifier  val pss5Id: UUID )
data class AssignKfToPss5Command(@TargetAggregateIdentifier  val pss5Id: UUID, val assignment: Simple_Float )
data class UnAssignKfFromPss5Command(@TargetAggregateIdentifier  val pss5Id: UUID )
data class AssignKpeToPss5Command(@TargetAggregateIdentifier  val pss5Id: UUID, val assignment: Simple_Float )
data class UnAssignKpeFromPss5Command(@TargetAggregateIdentifier  val pss5Id: UUID )
data class AssignKpssToPss5Command(@TargetAggregateIdentifier  val pss5Id: UUID, val assignment: Simple_Float )
data class UnAssignKpssFromPss5Command(@TargetAggregateIdentifier  val pss5Id: UUID )
data class AssignPmmToPss5Command(@TargetAggregateIdentifier  val pss5Id: UUID, val assignment: PU )
data class UnAssignPmmFromPss5Command(@TargetAggregateIdentifier  val pss5Id: UUID )
data class AssignTl1ToPss5Command(@TargetAggregateIdentifier  val pss5Id: UUID, val assignment: Seconds )
data class UnAssignTl1FromPss5Command(@TargetAggregateIdentifier  val pss5Id: UUID )
data class AssignTl2ToPss5Command(@TargetAggregateIdentifier  val pss5Id: UUID, val assignment: Seconds )
data class UnAssignTl2FromPss5Command(@TargetAggregateIdentifier  val pss5Id: UUID )
data class AssignTl3ToPss5Command(@TargetAggregateIdentifier  val pss5Id: UUID, val assignment: Seconds )
data class UnAssignTl3FromPss5Command(@TargetAggregateIdentifier  val pss5Id: UUID )
data class AssignTl4ToPss5Command(@TargetAggregateIdentifier  val pss5Id: UUID, val assignment: Seconds )
data class UnAssignTl4FromPss5Command(@TargetAggregateIdentifier  val pss5Id: UUID )
data class AssignTpeToPss5Command(@TargetAggregateIdentifier  val pss5Id: UUID, val assignment: Seconds )
data class UnAssignTpeFromPss5Command(@TargetAggregateIdentifier  val pss5Id: UUID )
data class AssignTw1ToPss5Command(@TargetAggregateIdentifier  val pss5Id: UUID, val assignment: Seconds )
data class UnAssignTw1FromPss5Command(@TargetAggregateIdentifier  val pss5Id: UUID )
data class AssignTw2ToPss5Command(@TargetAggregateIdentifier  val pss5Id: UUID, val assignment: Seconds )
data class UnAssignTw2FromPss5Command(@TargetAggregateIdentifier  val pss5Id: UUID )
data class AssignVadatToPss5Command(@TargetAggregateIdentifier  val pss5Id: UUID, val assignment: BooleanProxy )
data class UnAssignVadatFromPss5Command(@TargetAggregateIdentifier  val pss5Id: UUID )
data class AssignVsmnToPss5Command(@TargetAggregateIdentifier  val pss5Id: UUID, val assignment: PU )
data class UnAssignVsmnFromPss5Command(@TargetAggregateIdentifier  val pss5Id: UUID )
data class AssignVsmxToPss5Command(@TargetAggregateIdentifier  val pss5Id: UUID, val assignment: PU )
data class UnAssignVsmxFromPss5Command(@TargetAggregateIdentifier  val pss5Id: UUID )

// multiple association commands


// PssELIN2 Commands
data class CreatePssELIN2Command(
    @TargetAggregateIdentifier  var pssELIN2Id: UUID? = null
)

data class UpdatePssELIN2Command(
    @TargetAggregateIdentifier var pssELIN2Id: UUID? = null,
    var apss: PU,
    var ks1: PU,
    var ks2: PU,
    var ppss: PU,
    var psslim: PU,
    var ts1: Seconds,
    var ts2: Seconds,
    var ts3: Seconds,
    var ts4: Seconds,
    var ts5: Seconds,
    var ts6: Seconds
)

data class DeletePssELIN2Command(@TargetAggregateIdentifier  var pssELIN2Id: UUID? = null)

// single association commands
data class AssignApssToPssELIN2Command(@TargetAggregateIdentifier  val pssELIN2Id: UUID, val assignment: PU )
data class UnAssignApssFromPssELIN2Command(@TargetAggregateIdentifier  val pssELIN2Id: UUID )
data class AssignKs1ToPssELIN2Command(@TargetAggregateIdentifier  val pssELIN2Id: UUID, val assignment: PU )
data class UnAssignKs1FromPssELIN2Command(@TargetAggregateIdentifier  val pssELIN2Id: UUID )
data class AssignKs2ToPssELIN2Command(@TargetAggregateIdentifier  val pssELIN2Id: UUID, val assignment: PU )
data class UnAssignKs2FromPssELIN2Command(@TargetAggregateIdentifier  val pssELIN2Id: UUID )
data class AssignPpssToPssELIN2Command(@TargetAggregateIdentifier  val pssELIN2Id: UUID, val assignment: PU )
data class UnAssignPpssFromPssELIN2Command(@TargetAggregateIdentifier  val pssELIN2Id: UUID )
data class AssignPsslimToPssELIN2Command(@TargetAggregateIdentifier  val pssELIN2Id: UUID, val assignment: PU )
data class UnAssignPsslimFromPssELIN2Command(@TargetAggregateIdentifier  val pssELIN2Id: UUID )
data class AssignTs1ToPssELIN2Command(@TargetAggregateIdentifier  val pssELIN2Id: UUID, val assignment: Seconds )
data class UnAssignTs1FromPssELIN2Command(@TargetAggregateIdentifier  val pssELIN2Id: UUID )
data class AssignTs2ToPssELIN2Command(@TargetAggregateIdentifier  val pssELIN2Id: UUID, val assignment: Seconds )
data class UnAssignTs2FromPssELIN2Command(@TargetAggregateIdentifier  val pssELIN2Id: UUID )
data class AssignTs3ToPssELIN2Command(@TargetAggregateIdentifier  val pssELIN2Id: UUID, val assignment: Seconds )
data class UnAssignTs3FromPssELIN2Command(@TargetAggregateIdentifier  val pssELIN2Id: UUID )
data class AssignTs4ToPssELIN2Command(@TargetAggregateIdentifier  val pssELIN2Id: UUID, val assignment: Seconds )
data class UnAssignTs4FromPssELIN2Command(@TargetAggregateIdentifier  val pssELIN2Id: UUID )
data class AssignTs5ToPssELIN2Command(@TargetAggregateIdentifier  val pssELIN2Id: UUID, val assignment: Seconds )
data class UnAssignTs5FromPssELIN2Command(@TargetAggregateIdentifier  val pssELIN2Id: UUID )
data class AssignTs6ToPssELIN2Command(@TargetAggregateIdentifier  val pssELIN2Id: UUID, val assignment: Seconds )
data class UnAssignTs6FromPssELIN2Command(@TargetAggregateIdentifier  val pssELIN2Id: UUID )

// multiple association commands


// PssIEEE1A Commands
data class CreatePssIEEE1ACommand(
    @TargetAggregateIdentifier var pssIEEE1AId: UUID? = null,
    @Enumerated(EnumType.STRING) var inputSignalType: InputSignalKind
)

data class UpdatePssIEEE1ACommand(
    @TargetAggregateIdentifier var pssIEEE1AId: UUID? = null,
    var a1: PU,
    var a2: PU,
    @Enumerated(EnumType.STRING) var inputSignalType: InputSignalKind,
    var ks: PU,
    var t1: Seconds,
    var t2: Seconds,
    var t3: Seconds,
    var t4: Seconds,
    var t5: Seconds,
    var t6: Seconds,
    var vrmax: PU,
    var vrmin: PU
)

data class DeletePssIEEE1ACommand(@TargetAggregateIdentifier  var pssIEEE1AId: UUID? = null)

// single association commands
data class AssignA1ToPssIEEE1ACommand(@TargetAggregateIdentifier  val pssIEEE1AId: UUID, val assignment: PU )
data class UnAssignA1FromPssIEEE1ACommand(@TargetAggregateIdentifier  val pssIEEE1AId: UUID )
data class AssignA2ToPssIEEE1ACommand(@TargetAggregateIdentifier  val pssIEEE1AId: UUID, val assignment: PU )
data class UnAssignA2FromPssIEEE1ACommand(@TargetAggregateIdentifier  val pssIEEE1AId: UUID )
data class AssignKsToPssIEEE1ACommand(@TargetAggregateIdentifier  val pssIEEE1AId: UUID, val assignment: PU )
data class UnAssignKsFromPssIEEE1ACommand(@TargetAggregateIdentifier  val pssIEEE1AId: UUID )
data class AssignT1ToPssIEEE1ACommand(@TargetAggregateIdentifier  val pssIEEE1AId: UUID, val assignment: Seconds )
data class UnAssignT1FromPssIEEE1ACommand(@TargetAggregateIdentifier  val pssIEEE1AId: UUID )
data class AssignT2ToPssIEEE1ACommand(@TargetAggregateIdentifier  val pssIEEE1AId: UUID, val assignment: Seconds )
data class UnAssignT2FromPssIEEE1ACommand(@TargetAggregateIdentifier  val pssIEEE1AId: UUID )
data class AssignT3ToPssIEEE1ACommand(@TargetAggregateIdentifier  val pssIEEE1AId: UUID, val assignment: Seconds )
data class UnAssignT3FromPssIEEE1ACommand(@TargetAggregateIdentifier  val pssIEEE1AId: UUID )
data class AssignT4ToPssIEEE1ACommand(@TargetAggregateIdentifier  val pssIEEE1AId: UUID, val assignment: Seconds )
data class UnAssignT4FromPssIEEE1ACommand(@TargetAggregateIdentifier  val pssIEEE1AId: UUID )
data class AssignT5ToPssIEEE1ACommand(@TargetAggregateIdentifier  val pssIEEE1AId: UUID, val assignment: Seconds )
data class UnAssignT5FromPssIEEE1ACommand(@TargetAggregateIdentifier  val pssIEEE1AId: UUID )
data class AssignT6ToPssIEEE1ACommand(@TargetAggregateIdentifier  val pssIEEE1AId: UUID, val assignment: Seconds )
data class UnAssignT6FromPssIEEE1ACommand(@TargetAggregateIdentifier  val pssIEEE1AId: UUID )
data class AssignVrmaxToPssIEEE1ACommand(@TargetAggregateIdentifier  val pssIEEE1AId: UUID, val assignment: PU )
data class UnAssignVrmaxFromPssIEEE1ACommand(@TargetAggregateIdentifier  val pssIEEE1AId: UUID )
data class AssignVrminToPssIEEE1ACommand(@TargetAggregateIdentifier  val pssIEEE1AId: UUID, val assignment: PU )
data class UnAssignVrminFromPssIEEE1ACommand(@TargetAggregateIdentifier  val pssIEEE1AId: UUID )

// multiple association commands


// PssIEEE2B Commands
data class CreatePssIEEE2BCommand(
    @TargetAggregateIdentifier var pssIEEE2BId: UUID? = null,
    @Enumerated(EnumType.STRING) var inputSignal1Type: InputSignalKind,
    @Enumerated(EnumType.STRING) var inputSignal2Type: InputSignalKind
)

data class UpdatePssIEEE2BCommand(
    @TargetAggregateIdentifier var pssIEEE2BId: UUID? = null,
    @Enumerated(EnumType.STRING) var inputSignal1Type: InputSignalKind,
    @Enumerated(EnumType.STRING) var inputSignal2Type: InputSignalKind,
    var ks1: PU,
    var ks2: PU,
    var ks3: PU,
    var m: IntegerProxy,
    var n: IntegerProxy,
    var t1: Seconds,
    var t10: Seconds,
    var t11: Seconds,
    var t2: Seconds,
    var t3: Seconds,
    var t4: Seconds,
    var t6: Seconds,
    var t7: Seconds,
    var t8: Seconds,
    var t9: Seconds,
    var tw1: Seconds,
    var tw2: Seconds,
    var tw3: Seconds,
    var tw4: Seconds,
    var vsi1max: PU,
    var vsi1min: PU,
    var vsi2max: PU,
    var vsi2min: PU,
    var vstmax: PU,
    var vstmin: PU
)

data class DeletePssIEEE2BCommand(@TargetAggregateIdentifier  var pssIEEE2BId: UUID? = null)

// single association commands
data class AssignKs1ToPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID, val assignment: PU )
data class UnAssignKs1FromPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID )
data class AssignKs2ToPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID, val assignment: PU )
data class UnAssignKs2FromPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID )
data class AssignKs3ToPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID, val assignment: PU )
data class UnAssignKs3FromPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID )
data class AssignMToPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID, val assignment: IntegerProxy )
data class UnAssignMFromPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID )
data class AssignNToPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID, val assignment: IntegerProxy )
data class UnAssignNFromPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID )
data class AssignT1ToPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID, val assignment: Seconds )
data class UnAssignT1FromPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID )
data class AssignT10ToPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID, val assignment: Seconds )
data class UnAssignT10FromPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID )
data class AssignT11ToPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID, val assignment: Seconds )
data class UnAssignT11FromPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID )
data class AssignT2ToPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID, val assignment: Seconds )
data class UnAssignT2FromPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID )
data class AssignT3ToPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID, val assignment: Seconds )
data class UnAssignT3FromPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID )
data class AssignT4ToPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID, val assignment: Seconds )
data class UnAssignT4FromPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID )
data class AssignT6ToPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID, val assignment: Seconds )
data class UnAssignT6FromPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID )
data class AssignT7ToPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID, val assignment: Seconds )
data class UnAssignT7FromPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID )
data class AssignT8ToPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID, val assignment: Seconds )
data class UnAssignT8FromPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID )
data class AssignT9ToPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID, val assignment: Seconds )
data class UnAssignT9FromPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID )
data class AssignTw1ToPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID, val assignment: Seconds )
data class UnAssignTw1FromPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID )
data class AssignTw2ToPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID, val assignment: Seconds )
data class UnAssignTw2FromPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID )
data class AssignTw3ToPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID, val assignment: Seconds )
data class UnAssignTw3FromPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID )
data class AssignTw4ToPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID, val assignment: Seconds )
data class UnAssignTw4FromPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID )
data class AssignVsi1maxToPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID, val assignment: PU )
data class UnAssignVsi1maxFromPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID )
data class AssignVsi1minToPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID, val assignment: PU )
data class UnAssignVsi1minFromPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID )
data class AssignVsi2maxToPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID, val assignment: PU )
data class UnAssignVsi2maxFromPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID )
data class AssignVsi2minToPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID, val assignment: PU )
data class UnAssignVsi2minFromPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID )
data class AssignVstmaxToPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID, val assignment: PU )
data class UnAssignVstmaxFromPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID )
data class AssignVstminToPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID, val assignment: PU )
data class UnAssignVstminFromPssIEEE2BCommand(@TargetAggregateIdentifier  val pssIEEE2BId: UUID )

// multiple association commands


// PssIEEE3B Commands
data class CreatePssIEEE3BCommand(
    @TargetAggregateIdentifier var pssIEEE3BId: UUID? = null,
    @Enumerated(EnumType.STRING) var inputSignal1Type: InputSignalKind,
    @Enumerated(EnumType.STRING) var inputSignal2Type: InputSignalKind
)

data class UpdatePssIEEE3BCommand(
    @TargetAggregateIdentifier var pssIEEE3BId: UUID? = null,
    var a1: PU,
    var a2: PU,
    var a3: PU,
    var a4: PU,
    var a5: PU,
    var a6: PU,
    var a7: PU,
    var a8: PU,
    @Enumerated(EnumType.STRING) var inputSignal1Type: InputSignalKind,
    @Enumerated(EnumType.STRING) var inputSignal2Type: InputSignalKind,
    var ks1: PU,
    var ks2: PU,
    var t1: Seconds,
    var t2: Seconds,
    var tw1: Seconds,
    var tw2: Seconds,
    var tw3: Seconds,
    var vstmax: PU,
    var vstmin: PU
)

data class DeletePssIEEE3BCommand(@TargetAggregateIdentifier  var pssIEEE3BId: UUID? = null)

// single association commands
data class AssignA1ToPssIEEE3BCommand(@TargetAggregateIdentifier  val pssIEEE3BId: UUID, val assignment: PU )
data class UnAssignA1FromPssIEEE3BCommand(@TargetAggregateIdentifier  val pssIEEE3BId: UUID )
data class AssignA2ToPssIEEE3BCommand(@TargetAggregateIdentifier  val pssIEEE3BId: UUID, val assignment: PU )
data class UnAssignA2FromPssIEEE3BCommand(@TargetAggregateIdentifier  val pssIEEE3BId: UUID )
data class AssignA3ToPssIEEE3BCommand(@TargetAggregateIdentifier  val pssIEEE3BId: UUID, val assignment: PU )
data class UnAssignA3FromPssIEEE3BCommand(@TargetAggregateIdentifier  val pssIEEE3BId: UUID )
data class AssignA4ToPssIEEE3BCommand(@TargetAggregateIdentifier  val pssIEEE3BId: UUID, val assignment: PU )
data class UnAssignA4FromPssIEEE3BCommand(@TargetAggregateIdentifier  val pssIEEE3BId: UUID )
data class AssignA5ToPssIEEE3BCommand(@TargetAggregateIdentifier  val pssIEEE3BId: UUID, val assignment: PU )
data class UnAssignA5FromPssIEEE3BCommand(@TargetAggregateIdentifier  val pssIEEE3BId: UUID )
data class AssignA6ToPssIEEE3BCommand(@TargetAggregateIdentifier  val pssIEEE3BId: UUID, val assignment: PU )
data class UnAssignA6FromPssIEEE3BCommand(@TargetAggregateIdentifier  val pssIEEE3BId: UUID )
data class AssignA7ToPssIEEE3BCommand(@TargetAggregateIdentifier  val pssIEEE3BId: UUID, val assignment: PU )
data class UnAssignA7FromPssIEEE3BCommand(@TargetAggregateIdentifier  val pssIEEE3BId: UUID )
data class AssignA8ToPssIEEE3BCommand(@TargetAggregateIdentifier  val pssIEEE3BId: UUID, val assignment: PU )
data class UnAssignA8FromPssIEEE3BCommand(@TargetAggregateIdentifier  val pssIEEE3BId: UUID )
data class AssignKs1ToPssIEEE3BCommand(@TargetAggregateIdentifier  val pssIEEE3BId: UUID, val assignment: PU )
data class UnAssignKs1FromPssIEEE3BCommand(@TargetAggregateIdentifier  val pssIEEE3BId: UUID )
data class AssignKs2ToPssIEEE3BCommand(@TargetAggregateIdentifier  val pssIEEE3BId: UUID, val assignment: PU )
data class UnAssignKs2FromPssIEEE3BCommand(@TargetAggregateIdentifier  val pssIEEE3BId: UUID )
data class AssignT1ToPssIEEE3BCommand(@TargetAggregateIdentifier  val pssIEEE3BId: UUID, val assignment: Seconds )
data class UnAssignT1FromPssIEEE3BCommand(@TargetAggregateIdentifier  val pssIEEE3BId: UUID )
data class AssignT2ToPssIEEE3BCommand(@TargetAggregateIdentifier  val pssIEEE3BId: UUID, val assignment: Seconds )
data class UnAssignT2FromPssIEEE3BCommand(@TargetAggregateIdentifier  val pssIEEE3BId: UUID )
data class AssignTw1ToPssIEEE3BCommand(@TargetAggregateIdentifier  val pssIEEE3BId: UUID, val assignment: Seconds )
data class UnAssignTw1FromPssIEEE3BCommand(@TargetAggregateIdentifier  val pssIEEE3BId: UUID )
data class AssignTw2ToPssIEEE3BCommand(@TargetAggregateIdentifier  val pssIEEE3BId: UUID, val assignment: Seconds )
data class UnAssignTw2FromPssIEEE3BCommand(@TargetAggregateIdentifier  val pssIEEE3BId: UUID )
data class AssignTw3ToPssIEEE3BCommand(@TargetAggregateIdentifier  val pssIEEE3BId: UUID, val assignment: Seconds )
data class UnAssignTw3FromPssIEEE3BCommand(@TargetAggregateIdentifier  val pssIEEE3BId: UUID )
data class AssignVstmaxToPssIEEE3BCommand(@TargetAggregateIdentifier  val pssIEEE3BId: UUID, val assignment: PU )
data class UnAssignVstmaxFromPssIEEE3BCommand(@TargetAggregateIdentifier  val pssIEEE3BId: UUID )
data class AssignVstminToPssIEEE3BCommand(@TargetAggregateIdentifier  val pssIEEE3BId: UUID, val assignment: PU )
data class UnAssignVstminFromPssIEEE3BCommand(@TargetAggregateIdentifier  val pssIEEE3BId: UUID )

// multiple association commands


// PssIEEE4B Commands
data class CreatePssIEEE4BCommand(
    @TargetAggregateIdentifier  var pssIEEE4BId: UUID? = null
)

data class UpdatePssIEEE4BCommand(
    @TargetAggregateIdentifier var pssIEEE4BId: UUID? = null,
    var bwh1: Simple_Float,
    var bwh2: Simple_Float,
    var bwl1: Simple_Float,
    var bwl2: Simple_Float,
    var kh: PU,
    var kh1: PU,
    var kh11: PU,
    var kh17: PU,
    var kh2: PU,
    var ki: PU,
    var ki1: PU,
    var ki11: PU,
    var ki17: PU,
    var ki2: PU,
    var kl: PU,
    var kl1: PU,
    var kl11: PU,
    var kl17: PU,
    var kl2: PU,
    var omeganh1: Simple_Float,
    var omeganh2: Simple_Float,
    var omeganl1: Simple_Float,
    var omeganl2: Simple_Float,
    var th1: Seconds,
    var th10: Seconds,
    var th11: Seconds,
    var th12: Seconds,
    var th2: Seconds,
    var th3: Seconds,
    var th4: Seconds,
    var th5: Seconds,
    var th6: Seconds,
    var th7: Seconds,
    var th8: Seconds,
    var th9: Seconds,
    var ti1: Seconds,
    var ti10: Seconds,
    var ti11: Seconds,
    var ti12: Seconds,
    var ti2: Seconds,
    var ti3: Seconds,
    var ti4: Seconds,
    var ti5: Seconds,
    var ti6: Seconds,
    var ti7: Seconds,
    var ti8: Seconds,
    var ti9: Seconds,
    var tl1: Seconds,
    var tl10: Seconds,
    var tl11: Seconds,
    var tl12: Seconds,
    var tl2: Seconds,
    var tl3: Seconds,
    var tl4: Seconds,
    var tl5: Seconds,
    var tl6: Seconds,
    var tl7: Seconds,
    var tl8: Seconds,
    var tl9: Seconds,
    var vhmax: PU,
    var vhmin: PU,
    var vimax: PU,
    var vimin: PU,
    var vlmax: PU,
    var vlmin: PU,
    var vstmax: PU,
    var vstmin: PU
)

data class DeletePssIEEE4BCommand(@TargetAggregateIdentifier  var pssIEEE4BId: UUID? = null)

// single association commands
data class AssignBwh1ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Simple_Float )
data class UnAssignBwh1FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignBwh2ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Simple_Float )
data class UnAssignBwh2FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignBwl1ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Simple_Float )
data class UnAssignBwl1FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignBwl2ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Simple_Float )
data class UnAssignBwl2FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignKhToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: PU )
data class UnAssignKhFromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignKh1ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: PU )
data class UnAssignKh1FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignKh11ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: PU )
data class UnAssignKh11FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignKh17ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: PU )
data class UnAssignKh17FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignKh2ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: PU )
data class UnAssignKh2FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignKiToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: PU )
data class UnAssignKiFromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignKi1ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: PU )
data class UnAssignKi1FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignKi11ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: PU )
data class UnAssignKi11FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignKi17ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: PU )
data class UnAssignKi17FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignKi2ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: PU )
data class UnAssignKi2FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignKlToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: PU )
data class UnAssignKlFromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignKl1ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: PU )
data class UnAssignKl1FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignKl11ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: PU )
data class UnAssignKl11FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignKl17ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: PU )
data class UnAssignKl17FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignKl2ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: PU )
data class UnAssignKl2FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignOmeganh1ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Simple_Float )
data class UnAssignOmeganh1FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignOmeganh2ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Simple_Float )
data class UnAssignOmeganh2FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignOmeganl1ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Simple_Float )
data class UnAssignOmeganl1FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignOmeganl2ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Simple_Float )
data class UnAssignOmeganl2FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTh1ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTh1FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTh10ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTh10FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTh11ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTh11FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTh12ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTh12FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTh2ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTh2FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTh3ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTh3FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTh4ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTh4FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTh5ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTh5FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTh6ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTh6FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTh7ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTh7FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTh8ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTh8FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTh9ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTh9FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTi1ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTi1FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTi10ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTi10FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTi11ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTi11FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTi12ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTi12FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTi2ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTi2FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTi3ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTi3FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTi4ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTi4FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTi5ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTi5FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTi6ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTi6FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTi7ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTi7FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTi8ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTi8FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTi9ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTi9FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTl1ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTl1FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTl10ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTl10FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTl11ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTl11FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTl12ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTl12FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTl2ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTl2FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTl3ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTl3FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTl4ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTl4FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTl5ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTl5FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTl6ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTl6FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTl7ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTl7FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTl8ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTl8FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignTl9ToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: Seconds )
data class UnAssignTl9FromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignVhmaxToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: PU )
data class UnAssignVhmaxFromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignVhminToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: PU )
data class UnAssignVhminFromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignVimaxToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: PU )
data class UnAssignVimaxFromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignViminToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: PU )
data class UnAssignViminFromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignVlmaxToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: PU )
data class UnAssignVlmaxFromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignVlminToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: PU )
data class UnAssignVlminFromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignVstmaxToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: PU )
data class UnAssignVstmaxFromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )
data class AssignVstminToPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID, val assignment: PU )
data class UnAssignVstminFromPssIEEE4BCommand(@TargetAggregateIdentifier  val pssIEEE4BId: UUID )

// multiple association commands


// PssPTIST1 Commands
data class CreatePssPTIST1Command(
    @TargetAggregateIdentifier  var pssPTIST1Id: UUID? = null
)

data class UpdatePssPTIST1Command(
    @TargetAggregateIdentifier var pssPTIST1Id: UUID? = null,
    var dtc: Seconds,
    var dtf: Seconds,
    var dtp: Seconds,
    var k: PU,
    var m: PU,
    var t1: Seconds,
    var t2: Seconds,
    var t3: Seconds,
    var t4: Seconds,
    var tf: Seconds,
    var tp: Seconds
)

data class DeletePssPTIST1Command(@TargetAggregateIdentifier  var pssPTIST1Id: UUID? = null)

// single association commands
data class AssignDtcToPssPTIST1Command(@TargetAggregateIdentifier  val pssPTIST1Id: UUID, val assignment: Seconds )
data class UnAssignDtcFromPssPTIST1Command(@TargetAggregateIdentifier  val pssPTIST1Id: UUID )
data class AssignDtfToPssPTIST1Command(@TargetAggregateIdentifier  val pssPTIST1Id: UUID, val assignment: Seconds )
data class UnAssignDtfFromPssPTIST1Command(@TargetAggregateIdentifier  val pssPTIST1Id: UUID )
data class AssignDtpToPssPTIST1Command(@TargetAggregateIdentifier  val pssPTIST1Id: UUID, val assignment: Seconds )
data class UnAssignDtpFromPssPTIST1Command(@TargetAggregateIdentifier  val pssPTIST1Id: UUID )
data class AssignKToPssPTIST1Command(@TargetAggregateIdentifier  val pssPTIST1Id: UUID, val assignment: PU )
data class UnAssignKFromPssPTIST1Command(@TargetAggregateIdentifier  val pssPTIST1Id: UUID )
data class AssignMToPssPTIST1Command(@TargetAggregateIdentifier  val pssPTIST1Id: UUID, val assignment: PU )
data class UnAssignMFromPssPTIST1Command(@TargetAggregateIdentifier  val pssPTIST1Id: UUID )
data class AssignT1ToPssPTIST1Command(@TargetAggregateIdentifier  val pssPTIST1Id: UUID, val assignment: Seconds )
data class UnAssignT1FromPssPTIST1Command(@TargetAggregateIdentifier  val pssPTIST1Id: UUID )
data class AssignT2ToPssPTIST1Command(@TargetAggregateIdentifier  val pssPTIST1Id: UUID, val assignment: Seconds )
data class UnAssignT2FromPssPTIST1Command(@TargetAggregateIdentifier  val pssPTIST1Id: UUID )
data class AssignT3ToPssPTIST1Command(@TargetAggregateIdentifier  val pssPTIST1Id: UUID, val assignment: Seconds )
data class UnAssignT3FromPssPTIST1Command(@TargetAggregateIdentifier  val pssPTIST1Id: UUID )
data class AssignT4ToPssPTIST1Command(@TargetAggregateIdentifier  val pssPTIST1Id: UUID, val assignment: Seconds )
data class UnAssignT4FromPssPTIST1Command(@TargetAggregateIdentifier  val pssPTIST1Id: UUID )
data class AssignTfToPssPTIST1Command(@TargetAggregateIdentifier  val pssPTIST1Id: UUID, val assignment: Seconds )
data class UnAssignTfFromPssPTIST1Command(@TargetAggregateIdentifier  val pssPTIST1Id: UUID )
data class AssignTpToPssPTIST1Command(@TargetAggregateIdentifier  val pssPTIST1Id: UUID, val assignment: Seconds )
data class UnAssignTpFromPssPTIST1Command(@TargetAggregateIdentifier  val pssPTIST1Id: UUID )

// multiple association commands


// PssPTIST3 Commands
data class CreatePssPTIST3Command(
    @TargetAggregateIdentifier  var pssPTIST3Id: UUID? = null
)

data class UpdatePssPTIST3Command(
    @TargetAggregateIdentifier var pssPTIST3Id: UUID? = null,
    var a0: PU,
    var a1: PU,
    var a2: PU,
    var a3: PU,
    var a4: PU,
    var a5: PU,
    var al: PU,
    var athres: PU,
    var b0: PU,
    var b1: PU,
    var b2: PU,
    var b3: PU,
    var b4: PU,
    var b5: PU,
    var dl: PU,
    var dtc: Seconds,
    var dtf: Seconds,
    var dtp: Seconds,
    var isw: BooleanProxy,
    var k: PU,
    var lthres: PU,
    var m: PU,
    var nav: Simple_Float,
    var ncl: Simple_Float,
    var ncr: Simple_Float,
    var pmin: PU,
    var t1: Seconds,
    var t2: Seconds,
    var t3: Seconds,
    var t4: Seconds,
    var t5: Seconds,
    var t6: Seconds,
    var tf: Seconds,
    var tp: Seconds
)

data class DeletePssPTIST3Command(@TargetAggregateIdentifier  var pssPTIST3Id: UUID? = null)

// single association commands
data class AssignA0ToPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID, val assignment: PU )
data class UnAssignA0FromPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID )
data class AssignA1ToPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID, val assignment: PU )
data class UnAssignA1FromPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID )
data class AssignA2ToPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID, val assignment: PU )
data class UnAssignA2FromPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID )
data class AssignA3ToPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID, val assignment: PU )
data class UnAssignA3FromPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID )
data class AssignA4ToPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID, val assignment: PU )
data class UnAssignA4FromPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID )
data class AssignA5ToPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID, val assignment: PU )
data class UnAssignA5FromPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID )
data class AssignAlToPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID, val assignment: PU )
data class UnAssignAlFromPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID )
data class AssignAthresToPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID, val assignment: PU )
data class UnAssignAthresFromPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID )
data class AssignB0ToPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID, val assignment: PU )
data class UnAssignB0FromPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID )
data class AssignB1ToPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID, val assignment: PU )
data class UnAssignB1FromPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID )
data class AssignB2ToPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID, val assignment: PU )
data class UnAssignB2FromPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID )
data class AssignB3ToPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID, val assignment: PU )
data class UnAssignB3FromPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID )
data class AssignB4ToPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID, val assignment: PU )
data class UnAssignB4FromPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID )
data class AssignB5ToPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID, val assignment: PU )
data class UnAssignB5FromPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID )
data class AssignDlToPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID, val assignment: PU )
data class UnAssignDlFromPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID )
data class AssignDtcToPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID, val assignment: Seconds )
data class UnAssignDtcFromPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID )
data class AssignDtfToPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID, val assignment: Seconds )
data class UnAssignDtfFromPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID )
data class AssignDtpToPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID, val assignment: Seconds )
data class UnAssignDtpFromPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID )
data class AssignIswToPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID, val assignment: BooleanProxy )
data class UnAssignIswFromPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID )
data class AssignKToPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID, val assignment: PU )
data class UnAssignKFromPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID )
data class AssignLthresToPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID, val assignment: PU )
data class UnAssignLthresFromPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID )
data class AssignMToPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID, val assignment: PU )
data class UnAssignMFromPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID )
data class AssignNavToPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID, val assignment: Simple_Float )
data class UnAssignNavFromPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID )
data class AssignNclToPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID, val assignment: Simple_Float )
data class UnAssignNclFromPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID )
data class AssignNcrToPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID, val assignment: Simple_Float )
data class UnAssignNcrFromPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID )
data class AssignPminToPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID, val assignment: PU )
data class UnAssignPminFromPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID )
data class AssignT1ToPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID, val assignment: Seconds )
data class UnAssignT1FromPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID )
data class AssignT2ToPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID, val assignment: Seconds )
data class UnAssignT2FromPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID )
data class AssignT3ToPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID, val assignment: Seconds )
data class UnAssignT3FromPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID )
data class AssignT4ToPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID, val assignment: Seconds )
data class UnAssignT4FromPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID )
data class AssignT5ToPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID, val assignment: Seconds )
data class UnAssignT5FromPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID )
data class AssignT6ToPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID, val assignment: Seconds )
data class UnAssignT6FromPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID )
data class AssignTfToPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID, val assignment: Seconds )
data class UnAssignTfFromPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID )
data class AssignTpToPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID, val assignment: Seconds )
data class UnAssignTpFromPssPTIST3Command(@TargetAggregateIdentifier  val pssPTIST3Id: UUID )

// multiple association commands


// PssSB4 Commands
data class CreatePssSB4Command(
    @TargetAggregateIdentifier  var pssSB4Id: UUID? = null
)

data class UpdatePssSB4Command(
    @TargetAggregateIdentifier var pssSB4Id: UUID? = null,
    var kx: PU,
    var ta: Seconds,
    var tb: Seconds,
    var tc: Seconds,
    var td: Seconds,
    var te: Seconds,
    var tt: Seconds,
    var tx1: Seconds,
    var tx2: Seconds,
    var vsmax: PU,
    var vsmin: PU
)

data class DeletePssSB4Command(@TargetAggregateIdentifier  var pssSB4Id: UUID? = null)

// single association commands
data class AssignKxToPssSB4Command(@TargetAggregateIdentifier  val pssSB4Id: UUID, val assignment: PU )
data class UnAssignKxFromPssSB4Command(@TargetAggregateIdentifier  val pssSB4Id: UUID )
data class AssignTaToPssSB4Command(@TargetAggregateIdentifier  val pssSB4Id: UUID, val assignment: Seconds )
data class UnAssignTaFromPssSB4Command(@TargetAggregateIdentifier  val pssSB4Id: UUID )
data class AssignTbToPssSB4Command(@TargetAggregateIdentifier  val pssSB4Id: UUID, val assignment: Seconds )
data class UnAssignTbFromPssSB4Command(@TargetAggregateIdentifier  val pssSB4Id: UUID )
data class AssignTcToPssSB4Command(@TargetAggregateIdentifier  val pssSB4Id: UUID, val assignment: Seconds )
data class UnAssignTcFromPssSB4Command(@TargetAggregateIdentifier  val pssSB4Id: UUID )
data class AssignTdToPssSB4Command(@TargetAggregateIdentifier  val pssSB4Id: UUID, val assignment: Seconds )
data class UnAssignTdFromPssSB4Command(@TargetAggregateIdentifier  val pssSB4Id: UUID )
data class AssignTeToPssSB4Command(@TargetAggregateIdentifier  val pssSB4Id: UUID, val assignment: Seconds )
data class UnAssignTeFromPssSB4Command(@TargetAggregateIdentifier  val pssSB4Id: UUID )
data class AssignTtToPssSB4Command(@TargetAggregateIdentifier  val pssSB4Id: UUID, val assignment: Seconds )
data class UnAssignTtFromPssSB4Command(@TargetAggregateIdentifier  val pssSB4Id: UUID )
data class AssignTx1ToPssSB4Command(@TargetAggregateIdentifier  val pssSB4Id: UUID, val assignment: Seconds )
data class UnAssignTx1FromPssSB4Command(@TargetAggregateIdentifier  val pssSB4Id: UUID )
data class AssignTx2ToPssSB4Command(@TargetAggregateIdentifier  val pssSB4Id: UUID, val assignment: Seconds )
data class UnAssignTx2FromPssSB4Command(@TargetAggregateIdentifier  val pssSB4Id: UUID )
data class AssignVsmaxToPssSB4Command(@TargetAggregateIdentifier  val pssSB4Id: UUID, val assignment: PU )
data class UnAssignVsmaxFromPssSB4Command(@TargetAggregateIdentifier  val pssSB4Id: UUID )
data class AssignVsminToPssSB4Command(@TargetAggregateIdentifier  val pssSB4Id: UUID, val assignment: PU )
data class UnAssignVsminFromPssSB4Command(@TargetAggregateIdentifier  val pssSB4Id: UUID )

// multiple association commands


// PssSH Commands
data class CreatePssSHCommand(
    @TargetAggregateIdentifier  var pssSHId: UUID? = null
)

data class UpdatePssSHCommand(
    @TargetAggregateIdentifier var pssSHId: UUID? = null,
    var k: PU,
    var k0: PU,
    var k1: PU,
    var k2: PU,
    var k3: PU,
    var k4: PU,
    var t1: Seconds,
    var t2: Seconds,
    var t3: Seconds,
    var t4: Seconds,
    var td: Seconds,
    var vsmax: PU,
    var vsmin: PU
)

data class DeletePssSHCommand(@TargetAggregateIdentifier  var pssSHId: UUID? = null)

// single association commands
data class AssignKToPssSHCommand(@TargetAggregateIdentifier  val pssSHId: UUID, val assignment: PU )
data class UnAssignKFromPssSHCommand(@TargetAggregateIdentifier  val pssSHId: UUID )
data class AssignK0ToPssSHCommand(@TargetAggregateIdentifier  val pssSHId: UUID, val assignment: PU )
data class UnAssignK0FromPssSHCommand(@TargetAggregateIdentifier  val pssSHId: UUID )
data class AssignK1ToPssSHCommand(@TargetAggregateIdentifier  val pssSHId: UUID, val assignment: PU )
data class UnAssignK1FromPssSHCommand(@TargetAggregateIdentifier  val pssSHId: UUID )
data class AssignK2ToPssSHCommand(@TargetAggregateIdentifier  val pssSHId: UUID, val assignment: PU )
data class UnAssignK2FromPssSHCommand(@TargetAggregateIdentifier  val pssSHId: UUID )
data class AssignK3ToPssSHCommand(@TargetAggregateIdentifier  val pssSHId: UUID, val assignment: PU )
data class UnAssignK3FromPssSHCommand(@TargetAggregateIdentifier  val pssSHId: UUID )
data class AssignK4ToPssSHCommand(@TargetAggregateIdentifier  val pssSHId: UUID, val assignment: PU )
data class UnAssignK4FromPssSHCommand(@TargetAggregateIdentifier  val pssSHId: UUID )
data class AssignT1ToPssSHCommand(@TargetAggregateIdentifier  val pssSHId: UUID, val assignment: Seconds )
data class UnAssignT1FromPssSHCommand(@TargetAggregateIdentifier  val pssSHId: UUID )
data class AssignT2ToPssSHCommand(@TargetAggregateIdentifier  val pssSHId: UUID, val assignment: Seconds )
data class UnAssignT2FromPssSHCommand(@TargetAggregateIdentifier  val pssSHId: UUID )
data class AssignT3ToPssSHCommand(@TargetAggregateIdentifier  val pssSHId: UUID, val assignment: Seconds )
data class UnAssignT3FromPssSHCommand(@TargetAggregateIdentifier  val pssSHId: UUID )
data class AssignT4ToPssSHCommand(@TargetAggregateIdentifier  val pssSHId: UUID, val assignment: Seconds )
data class UnAssignT4FromPssSHCommand(@TargetAggregateIdentifier  val pssSHId: UUID )
data class AssignTdToPssSHCommand(@TargetAggregateIdentifier  val pssSHId: UUID, val assignment: Seconds )
data class UnAssignTdFromPssSHCommand(@TargetAggregateIdentifier  val pssSHId: UUID )
data class AssignVsmaxToPssSHCommand(@TargetAggregateIdentifier  val pssSHId: UUID, val assignment: PU )
data class UnAssignVsmaxFromPssSHCommand(@TargetAggregateIdentifier  val pssSHId: UUID )
data class AssignVsminToPssSHCommand(@TargetAggregateIdentifier  val pssSHId: UUID, val assignment: PU )
data class UnAssignVsminFromPssSHCommand(@TargetAggregateIdentifier  val pssSHId: UUID )

// multiple association commands


// PssSK Commands
data class CreatePssSKCommand(
    @TargetAggregateIdentifier  var pssSKId: UUID? = null
)

data class UpdatePssSKCommand(
    @TargetAggregateIdentifier var pssSKId: UUID? = null,
    var k1: PU,
    var k2: PU,
    var k3: PU,
    var t1: Seconds,
    var t2: Seconds,
    var t3: Seconds,
    var t4: Seconds,
    var t5: Seconds,
    var t6: Seconds,
    var vsmax: PU,
    var vsmin: PU
)

data class DeletePssSKCommand(@TargetAggregateIdentifier  var pssSKId: UUID? = null)

// single association commands
data class AssignK1ToPssSKCommand(@TargetAggregateIdentifier  val pssSKId: UUID, val assignment: PU )
data class UnAssignK1FromPssSKCommand(@TargetAggregateIdentifier  val pssSKId: UUID )
data class AssignK2ToPssSKCommand(@TargetAggregateIdentifier  val pssSKId: UUID, val assignment: PU )
data class UnAssignK2FromPssSKCommand(@TargetAggregateIdentifier  val pssSKId: UUID )
data class AssignK3ToPssSKCommand(@TargetAggregateIdentifier  val pssSKId: UUID, val assignment: PU )
data class UnAssignK3FromPssSKCommand(@TargetAggregateIdentifier  val pssSKId: UUID )
data class AssignT1ToPssSKCommand(@TargetAggregateIdentifier  val pssSKId: UUID, val assignment: Seconds )
data class UnAssignT1FromPssSKCommand(@TargetAggregateIdentifier  val pssSKId: UUID )
data class AssignT2ToPssSKCommand(@TargetAggregateIdentifier  val pssSKId: UUID, val assignment: Seconds )
data class UnAssignT2FromPssSKCommand(@TargetAggregateIdentifier  val pssSKId: UUID )
data class AssignT3ToPssSKCommand(@TargetAggregateIdentifier  val pssSKId: UUID, val assignment: Seconds )
data class UnAssignT3FromPssSKCommand(@TargetAggregateIdentifier  val pssSKId: UUID )
data class AssignT4ToPssSKCommand(@TargetAggregateIdentifier  val pssSKId: UUID, val assignment: Seconds )
data class UnAssignT4FromPssSKCommand(@TargetAggregateIdentifier  val pssSKId: UUID )
data class AssignT5ToPssSKCommand(@TargetAggregateIdentifier  val pssSKId: UUID, val assignment: Seconds )
data class UnAssignT5FromPssSKCommand(@TargetAggregateIdentifier  val pssSKId: UUID )
data class AssignT6ToPssSKCommand(@TargetAggregateIdentifier  val pssSKId: UUID, val assignment: Seconds )
data class UnAssignT6FromPssSKCommand(@TargetAggregateIdentifier  val pssSKId: UUID )
data class AssignVsmaxToPssSKCommand(@TargetAggregateIdentifier  val pssSKId: UUID, val assignment: PU )
data class UnAssignVsmaxFromPssSKCommand(@TargetAggregateIdentifier  val pssSKId: UUID )
data class AssignVsminToPssSKCommand(@TargetAggregateIdentifier  val pssSKId: UUID, val assignment: PU )
data class UnAssignVsminFromPssSKCommand(@TargetAggregateIdentifier  val pssSKId: UUID )

// multiple association commands


// PssWECC Commands
data class CreatePssWECCCommand(
    @TargetAggregateIdentifier var pssWECCId: UUID? = null,
    @Enumerated(EnumType.STRING) var inputSignal1Type: InputSignalKind,
    @Enumerated(EnumType.STRING) var inputSignal2Type: InputSignalKind
)

data class UpdatePssWECCCommand(
    @TargetAggregateIdentifier var pssWECCId: UUID? = null,
    @Enumerated(EnumType.STRING) var inputSignal1Type: InputSignalKind,
    @Enumerated(EnumType.STRING) var inputSignal2Type: InputSignalKind,
    var k1: PU,
    var k2: PU,
    var t1: Seconds,
    var t10: Seconds,
    var t2: Seconds,
    var t3: Seconds,
    var t4: Seconds,
    var t5: Seconds,
    var t6: Seconds,
    var t7: Seconds,
    var t8: Seconds,
    var t9: Seconds,
    var vcl: PU,
    var vcu: PU,
    var vsmax: PU,
    var vsmin: PU
)

data class DeletePssWECCCommand(@TargetAggregateIdentifier  var pssWECCId: UUID? = null)

// single association commands
data class AssignK1ToPssWECCCommand(@TargetAggregateIdentifier  val pssWECCId: UUID, val assignment: PU )
data class UnAssignK1FromPssWECCCommand(@TargetAggregateIdentifier  val pssWECCId: UUID )
data class AssignK2ToPssWECCCommand(@TargetAggregateIdentifier  val pssWECCId: UUID, val assignment: PU )
data class UnAssignK2FromPssWECCCommand(@TargetAggregateIdentifier  val pssWECCId: UUID )
data class AssignT1ToPssWECCCommand(@TargetAggregateIdentifier  val pssWECCId: UUID, val assignment: Seconds )
data class UnAssignT1FromPssWECCCommand(@TargetAggregateIdentifier  val pssWECCId: UUID )
data class AssignT10ToPssWECCCommand(@TargetAggregateIdentifier  val pssWECCId: UUID, val assignment: Seconds )
data class UnAssignT10FromPssWECCCommand(@TargetAggregateIdentifier  val pssWECCId: UUID )
data class AssignT2ToPssWECCCommand(@TargetAggregateIdentifier  val pssWECCId: UUID, val assignment: Seconds )
data class UnAssignT2FromPssWECCCommand(@TargetAggregateIdentifier  val pssWECCId: UUID )
data class AssignT3ToPssWECCCommand(@TargetAggregateIdentifier  val pssWECCId: UUID, val assignment: Seconds )
data class UnAssignT3FromPssWECCCommand(@TargetAggregateIdentifier  val pssWECCId: UUID )
data class AssignT4ToPssWECCCommand(@TargetAggregateIdentifier  val pssWECCId: UUID, val assignment: Seconds )
data class UnAssignT4FromPssWECCCommand(@TargetAggregateIdentifier  val pssWECCId: UUID )
data class AssignT5ToPssWECCCommand(@TargetAggregateIdentifier  val pssWECCId: UUID, val assignment: Seconds )
data class UnAssignT5FromPssWECCCommand(@TargetAggregateIdentifier  val pssWECCId: UUID )
data class AssignT6ToPssWECCCommand(@TargetAggregateIdentifier  val pssWECCId: UUID, val assignment: Seconds )
data class UnAssignT6FromPssWECCCommand(@TargetAggregateIdentifier  val pssWECCId: UUID )
data class AssignT7ToPssWECCCommand(@TargetAggregateIdentifier  val pssWECCId: UUID, val assignment: Seconds )
data class UnAssignT7FromPssWECCCommand(@TargetAggregateIdentifier  val pssWECCId: UUID )
data class AssignT8ToPssWECCCommand(@TargetAggregateIdentifier  val pssWECCId: UUID, val assignment: Seconds )
data class UnAssignT8FromPssWECCCommand(@TargetAggregateIdentifier  val pssWECCId: UUID )
data class AssignT9ToPssWECCCommand(@TargetAggregateIdentifier  val pssWECCId: UUID, val assignment: Seconds )
data class UnAssignT9FromPssWECCCommand(@TargetAggregateIdentifier  val pssWECCId: UUID )
data class AssignVclToPssWECCCommand(@TargetAggregateIdentifier  val pssWECCId: UUID, val assignment: PU )
data class UnAssignVclFromPssWECCCommand(@TargetAggregateIdentifier  val pssWECCId: UUID )
data class AssignVcuToPssWECCCommand(@TargetAggregateIdentifier  val pssWECCId: UUID, val assignment: PU )
data class UnAssignVcuFromPssWECCCommand(@TargetAggregateIdentifier  val pssWECCId: UUID )
data class AssignVsmaxToPssWECCCommand(@TargetAggregateIdentifier  val pssWECCId: UUID, val assignment: PU )
data class UnAssignVsmaxFromPssWECCCommand(@TargetAggregateIdentifier  val pssWECCId: UUID )
data class AssignVsminToPssWECCCommand(@TargetAggregateIdentifier  val pssWECCId: UUID, val assignment: PU )
data class UnAssignVsminFromPssWECCCommand(@TargetAggregateIdentifier  val pssWECCId: UUID )

// multiple association commands


// Quality61850 Commands
data class CreateQuality61850Command(
    @TargetAggregateIdentifier var quality61850Id: UUID? = null,
    @Enumerated(EnumType.STRING) var source: Source,
    @Enumerated(EnumType.STRING) var validity: Validity
)

data class UpdateQuality61850Command(
    @TargetAggregateIdentifier var quality61850Id: UUID? = null,
    var badReference: BooleanProxy,
    var estimatorReplaced: BooleanProxy,
    var failure: BooleanProxy,
    var oldData: BooleanProxy,
    var operatorBlocked: BooleanProxy,
    var oscillatory: BooleanProxy,
    var outOfRange: BooleanProxy,
    var overFlow: BooleanProxy,
    @Enumerated(EnumType.STRING) var source: Source,
    var suspect: BooleanProxy,
    var test: BooleanProxy,
    @Enumerated(EnumType.STRING) var validity: Validity
)

data class DeleteQuality61850Command(@TargetAggregateIdentifier  var quality61850Id: UUID? = null)

// single association commands
data class AssignBadReferenceToQuality61850Command(@TargetAggregateIdentifier  val quality61850Id: UUID, val assignment: BooleanProxy )
data class UnAssignBadReferenceFromQuality61850Command(@TargetAggregateIdentifier  val quality61850Id: UUID )
data class AssignEstimatorReplacedToQuality61850Command(@TargetAggregateIdentifier  val quality61850Id: UUID, val assignment: BooleanProxy )
data class UnAssignEstimatorReplacedFromQuality61850Command(@TargetAggregateIdentifier  val quality61850Id: UUID )
data class AssignFailureToQuality61850Command(@TargetAggregateIdentifier  val quality61850Id: UUID, val assignment: BooleanProxy )
data class UnAssignFailureFromQuality61850Command(@TargetAggregateIdentifier  val quality61850Id: UUID )
data class AssignOldDataToQuality61850Command(@TargetAggregateIdentifier  val quality61850Id: UUID, val assignment: BooleanProxy )
data class UnAssignOldDataFromQuality61850Command(@TargetAggregateIdentifier  val quality61850Id: UUID )
data class AssignOperatorBlockedToQuality61850Command(@TargetAggregateIdentifier  val quality61850Id: UUID, val assignment: BooleanProxy )
data class UnAssignOperatorBlockedFromQuality61850Command(@TargetAggregateIdentifier  val quality61850Id: UUID )
data class AssignOscillatoryToQuality61850Command(@TargetAggregateIdentifier  val quality61850Id: UUID, val assignment: BooleanProxy )
data class UnAssignOscillatoryFromQuality61850Command(@TargetAggregateIdentifier  val quality61850Id: UUID )
data class AssignOutOfRangeToQuality61850Command(@TargetAggregateIdentifier  val quality61850Id: UUID, val assignment: BooleanProxy )
data class UnAssignOutOfRangeFromQuality61850Command(@TargetAggregateIdentifier  val quality61850Id: UUID )
data class AssignOverFlowToQuality61850Command(@TargetAggregateIdentifier  val quality61850Id: UUID, val assignment: BooleanProxy )
data class UnAssignOverFlowFromQuality61850Command(@TargetAggregateIdentifier  val quality61850Id: UUID )
data class AssignSuspectToQuality61850Command(@TargetAggregateIdentifier  val quality61850Id: UUID, val assignment: BooleanProxy )
data class UnAssignSuspectFromQuality61850Command(@TargetAggregateIdentifier  val quality61850Id: UUID )
data class AssignTestToQuality61850Command(@TargetAggregateIdentifier  val quality61850Id: UUID, val assignment: BooleanProxy )
data class UnAssignTestFromQuality61850Command(@TargetAggregateIdentifier  val quality61850Id: UUID )

// multiple association commands


// RaiseLowerCommand Commands
data class CreateRaiseLowerCommandCommand(
    @TargetAggregateIdentifier  var raiseLowerCommandId: UUID? = null
)

data class UpdateRaiseLowerCommandCommand(
    @TargetAggregateIdentifier  var raiseLowerCommandId: UUID? = null
)

data class DeleteRaiseLowerCommandCommand(@TargetAggregateIdentifier  var raiseLowerCommandId: UUID? = null)

// single association commands

// multiple association commands


// RatioTapChanger Commands
data class CreateRatioTapChangerCommand(
    @TargetAggregateIdentifier var ratioTapChangerId: UUID? = null,
    @Enumerated(EnumType.STRING) var tculControlMode: TransformerControlMode
)

data class UpdateRatioTapChangerCommand(
    @TargetAggregateIdentifier var ratioTapChangerId: UUID? = null,
    var stepVoltageIncrement: PerCent,
    @Enumerated(EnumType.STRING) var tculControlMode: TransformerControlMode
)

data class DeleteRatioTapChangerCommand(@TargetAggregateIdentifier  var ratioTapChangerId: UUID? = null)

// single association commands
data class AssignStepVoltageIncrementToRatioTapChangerCommand(@TargetAggregateIdentifier  val ratioTapChangerId: UUID, val assignment: PerCent )
data class UnAssignStepVoltageIncrementFromRatioTapChangerCommand(@TargetAggregateIdentifier  val ratioTapChangerId: UUID )

// multiple association commands


// RatioTapChangerTable Commands
data class CreateRatioTapChangerTableCommand(
    @TargetAggregateIdentifier  var ratioTapChangerTableId: UUID? = null
)

data class UpdateRatioTapChangerTableCommand(
    @TargetAggregateIdentifier  var ratioTapChangerTableId: UUID? = null
)

data class DeleteRatioTapChangerTableCommand(@TargetAggregateIdentifier  var ratioTapChangerTableId: UUID? = null)

// single association commands

// multiple association commands


// RatioTapChangerTablePoint Commands
data class CreateRatioTapChangerTablePointCommand(
    @TargetAggregateIdentifier  var ratioTapChangerTablePointId: UUID? = null
)

data class UpdateRatioTapChangerTablePointCommand(
    @TargetAggregateIdentifier  var ratioTapChangerTablePointId: UUID? = null
)

data class DeleteRatioTapChangerTablePointCommand(@TargetAggregateIdentifier  var ratioTapChangerTablePointId: UUID? = null)

// single association commands

// multiple association commands


// Reactance Commands
data class CreateReactanceCommand(
    @TargetAggregateIdentifier var reactanceId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol
)

data class UpdateReactanceCommand(
    @TargetAggregateIdentifier var reactanceId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol,
    var value: FloatProxy
)

data class DeleteReactanceCommand(@TargetAggregateIdentifier  var reactanceId: UUID? = null)

// single association commands
data class AssignValueToReactanceCommand(@TargetAggregateIdentifier  val reactanceId: UUID, val assignment: FloatProxy )
data class UnAssignValueFromReactanceCommand(@TargetAggregateIdentifier  val reactanceId: UUID )

// multiple association commands


// ReactiveCapabilityCurve Commands
data class CreateReactiveCapabilityCurveCommand(
    @TargetAggregateIdentifier  var reactiveCapabilityCurveId: UUID? = null
)

data class UpdateReactiveCapabilityCurveCommand(
    @TargetAggregateIdentifier  var reactiveCapabilityCurveId: UUID? = null
)

data class DeleteReactiveCapabilityCurveCommand(@TargetAggregateIdentifier  var reactiveCapabilityCurveId: UUID? = null)

// single association commands

// multiple association commands


// ReactivePower Commands
data class CreateReactivePowerCommand(
    @TargetAggregateIdentifier var reactivePowerId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol
)

data class UpdateReactivePowerCommand(
    @TargetAggregateIdentifier var reactivePowerId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol,
    var value: FloatProxy
)

data class DeleteReactivePowerCommand(@TargetAggregateIdentifier  var reactivePowerId: UUID? = null)

// single association commands
data class AssignValueToReactivePowerCommand(@TargetAggregateIdentifier  val reactivePowerId: UUID, val assignment: FloatProxy )
data class UnAssignValueFromReactivePowerCommand(@TargetAggregateIdentifier  val reactivePowerId: UUID )

// multiple association commands


// RegularIntervalSchedule Commands
data class CreateRegularIntervalScheduleCommand(
    @TargetAggregateIdentifier  var regularIntervalScheduleId: UUID? = null
)

data class UpdateRegularIntervalScheduleCommand(
    @TargetAggregateIdentifier var regularIntervalScheduleId: UUID? = null,
    var endTime: DateTime,
    var timeStep: Seconds
)

data class DeleteRegularIntervalScheduleCommand(@TargetAggregateIdentifier  var regularIntervalScheduleId: UUID? = null)

// single association commands
data class AssignEndTimeToRegularIntervalScheduleCommand(@TargetAggregateIdentifier  val regularIntervalScheduleId: UUID, val assignment: DateTime )
data class UnAssignEndTimeFromRegularIntervalScheduleCommand(@TargetAggregateIdentifier  val regularIntervalScheduleId: UUID )
data class AssignTimeStepToRegularIntervalScheduleCommand(@TargetAggregateIdentifier  val regularIntervalScheduleId: UUID, val assignment: Seconds )
data class UnAssignTimeStepFromRegularIntervalScheduleCommand(@TargetAggregateIdentifier  val regularIntervalScheduleId: UUID )

// multiple association commands


// RegularTimePoint Commands
data class CreateRegularTimePointCommand(
    @TargetAggregateIdentifier  var regularTimePointId: UUID? = null
)

data class UpdateRegularTimePointCommand(
    @TargetAggregateIdentifier var regularTimePointId: UUID? = null,
    var sequenceNumber: IntegerProxy,
    var value1: Simple_Float,
    var value2: Simple_Float
)

data class DeleteRegularTimePointCommand(@TargetAggregateIdentifier  var regularTimePointId: UUID? = null)

// single association commands
data class AssignSequenceNumberToRegularTimePointCommand(@TargetAggregateIdentifier  val regularTimePointId: UUID, val assignment: IntegerProxy )
data class UnAssignSequenceNumberFromRegularTimePointCommand(@TargetAggregateIdentifier  val regularTimePointId: UUID )
data class AssignValue1ToRegularTimePointCommand(@TargetAggregateIdentifier  val regularTimePointId: UUID, val assignment: Simple_Float )
data class UnAssignValue1FromRegularTimePointCommand(@TargetAggregateIdentifier  val regularTimePointId: UUID )
data class AssignValue2ToRegularTimePointCommand(@TargetAggregateIdentifier  val regularTimePointId: UUID, val assignment: Simple_Float )
data class UnAssignValue2FromRegularTimePointCommand(@TargetAggregateIdentifier  val regularTimePointId: UUID )

// multiple association commands


// RegulatingCondEq Commands
data class CreateRegulatingCondEqCommand(
    @TargetAggregateIdentifier  var regulatingCondEqId: UUID? = null
)

data class UpdateRegulatingCondEqCommand(
    @TargetAggregateIdentifier  var regulatingCondEqId: UUID? = null
)

data class DeleteRegulatingCondEqCommand(@TargetAggregateIdentifier  var regulatingCondEqId: UUID? = null)

// single association commands

// multiple association commands


// RegulatingControl Commands
data class CreateRegulatingControlCommand(
    @TargetAggregateIdentifier var regulatingControlId: UUID? = null,
    @Enumerated(EnumType.STRING) var mode: RegulatingControlModeKind
)

data class UpdateRegulatingControlCommand(
    @TargetAggregateIdentifier var regulatingControlId: UUID? = null,
    @Enumerated(EnumType.STRING) var mode: RegulatingControlModeKind
)

data class DeleteRegulatingControlCommand(@TargetAggregateIdentifier  var regulatingControlId: UUID? = null)

// single association commands

// multiple association commands


// RegulationSchedule Commands
data class CreateRegulationScheduleCommand(
    @TargetAggregateIdentifier  var regulationScheduleId: UUID? = null
)

data class UpdateRegulationScheduleCommand(
    @TargetAggregateIdentifier  var regulationScheduleId: UUID? = null
)

data class DeleteRegulationScheduleCommand(@TargetAggregateIdentifier  var regulationScheduleId: UUID? = null)

// single association commands

// multiple association commands


// RemoteInputSignal Commands
data class CreateRemoteInputSignalCommand(
    @TargetAggregateIdentifier var remoteInputSignalId: UUID? = null,
    @Enumerated(EnumType.STRING) var remoteSignalType: RemoteSignalKind
)

data class UpdateRemoteInputSignalCommand(
    @TargetAggregateIdentifier var remoteInputSignalId: UUID? = null,
    @Enumerated(EnumType.STRING) var remoteSignalType: RemoteSignalKind
)

data class DeleteRemoteInputSignalCommand(@TargetAggregateIdentifier  var remoteInputSignalId: UUID? = null)

// single association commands

// multiple association commands


// ReportingGroup Commands
data class CreateReportingGroupCommand(
    @TargetAggregateIdentifier  var reportingGroupId: UUID? = null
)

data class UpdateReportingGroupCommand(
    @TargetAggregateIdentifier  var reportingGroupId: UUID? = null
)

data class DeleteReportingGroupCommand(@TargetAggregateIdentifier  var reportingGroupId: UUID? = null)

// single association commands

// multiple association commands


// Resistance Commands
data class CreateResistanceCommand(
    @TargetAggregateIdentifier var resistanceId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol
)

data class UpdateResistanceCommand(
    @TargetAggregateIdentifier var resistanceId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol,
    var value: FloatProxy
)

data class DeleteResistanceCommand(@TargetAggregateIdentifier  var resistanceId: UUID? = null)

// single association commands
data class AssignValueToResistanceCommand(@TargetAggregateIdentifier  val resistanceId: UUID, val assignment: FloatProxy )
data class UnAssignValueFromResistanceCommand(@TargetAggregateIdentifier  val resistanceId: UUID )

// multiple association commands


// ResistancePerLength Commands
data class CreateResistancePerLengthCommand(
    @TargetAggregateIdentifier var resistancePerLengthId: UUID? = null,
    @Enumerated(EnumType.STRING) var denominatorMultiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var denominatorUnit: UnitSymbol,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol
)

data class UpdateResistancePerLengthCommand(
    @TargetAggregateIdentifier var resistancePerLengthId: UUID? = null,
    @Enumerated(EnumType.STRING) var denominatorMultiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var denominatorUnit: UnitSymbol,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol,
    var value: FloatProxy
)

data class DeleteResistancePerLengthCommand(@TargetAggregateIdentifier  var resistancePerLengthId: UUID? = null)

// single association commands
data class AssignValueToResistancePerLengthCommand(@TargetAggregateIdentifier  val resistancePerLengthId: UUID, val assignment: FloatProxy )
data class UnAssignValueFromResistancePerLengthCommand(@TargetAggregateIdentifier  val resistancePerLengthId: UUID )

// multiple association commands


// RotatingMachine Commands
data class CreateRotatingMachineCommand(
    @TargetAggregateIdentifier  var rotatingMachineId: UUID? = null
)

data class UpdateRotatingMachineCommand(
    @TargetAggregateIdentifier var rotatingMachineId: UUID? = null,
    var ratedPowerFactor: Simple_Float,
    var ratedS: ApparentPower,
    var ratedU: Voltage
)

data class DeleteRotatingMachineCommand(@TargetAggregateIdentifier  var rotatingMachineId: UUID? = null)

// single association commands
data class AssignRatedPowerFactorToRotatingMachineCommand(@TargetAggregateIdentifier  val rotatingMachineId: UUID, val assignment: Simple_Float )
data class UnAssignRatedPowerFactorFromRotatingMachineCommand(@TargetAggregateIdentifier  val rotatingMachineId: UUID )
data class AssignRatedSToRotatingMachineCommand(@TargetAggregateIdentifier  val rotatingMachineId: UUID, val assignment: ApparentPower )
data class UnAssignRatedSFromRotatingMachineCommand(@TargetAggregateIdentifier  val rotatingMachineId: UUID )
data class AssignRatedUToRotatingMachineCommand(@TargetAggregateIdentifier  val rotatingMachineId: UUID, val assignment: Voltage )
data class UnAssignRatedUFromRotatingMachineCommand(@TargetAggregateIdentifier  val rotatingMachineId: UUID )

// multiple association commands


// RotatingMachineDynamics Commands
data class CreateRotatingMachineDynamicsCommand(
    @TargetAggregateIdentifier  var rotatingMachineDynamicsId: UUID? = null
)

data class UpdateRotatingMachineDynamicsCommand(
    @TargetAggregateIdentifier var rotatingMachineDynamicsId: UUID? = null,
    var damping: Simple_Float,
    var inertia: Seconds,
    var saturationFactor: Simple_Float,
    var saturationFactor120: Simple_Float,
    var statorLeakageReactance: PU,
    var statorResistance: PU
)

data class DeleteRotatingMachineDynamicsCommand(@TargetAggregateIdentifier  var rotatingMachineDynamicsId: UUID? = null)

// single association commands
data class AssignDampingToRotatingMachineDynamicsCommand(@TargetAggregateIdentifier  val rotatingMachineDynamicsId: UUID, val assignment: Simple_Float )
data class UnAssignDampingFromRotatingMachineDynamicsCommand(@TargetAggregateIdentifier  val rotatingMachineDynamicsId: UUID )
data class AssignInertiaToRotatingMachineDynamicsCommand(@TargetAggregateIdentifier  val rotatingMachineDynamicsId: UUID, val assignment: Seconds )
data class UnAssignInertiaFromRotatingMachineDynamicsCommand(@TargetAggregateIdentifier  val rotatingMachineDynamicsId: UUID )
data class AssignSaturationFactorToRotatingMachineDynamicsCommand(@TargetAggregateIdentifier  val rotatingMachineDynamicsId: UUID, val assignment: Simple_Float )
data class UnAssignSaturationFactorFromRotatingMachineDynamicsCommand(@TargetAggregateIdentifier  val rotatingMachineDynamicsId: UUID )
data class AssignSaturationFactor120ToRotatingMachineDynamicsCommand(@TargetAggregateIdentifier  val rotatingMachineDynamicsId: UUID, val assignment: Simple_Float )
data class UnAssignSaturationFactor120FromRotatingMachineDynamicsCommand(@TargetAggregateIdentifier  val rotatingMachineDynamicsId: UUID )
data class AssignStatorLeakageReactanceToRotatingMachineDynamicsCommand(@TargetAggregateIdentifier  val rotatingMachineDynamicsId: UUID, val assignment: PU )
data class UnAssignStatorLeakageReactanceFromRotatingMachineDynamicsCommand(@TargetAggregateIdentifier  val rotatingMachineDynamicsId: UUID )
data class AssignStatorResistanceToRotatingMachineDynamicsCommand(@TargetAggregateIdentifier  val rotatingMachineDynamicsId: UUID, val assignment: PU )
data class UnAssignStatorResistanceFromRotatingMachineDynamicsCommand(@TargetAggregateIdentifier  val rotatingMachineDynamicsId: UUID )

// multiple association commands


// RotationSpeed Commands
data class CreateRotationSpeedCommand(
    @TargetAggregateIdentifier var rotationSpeedId: UUID? = null,
    @Enumerated(EnumType.STRING) var denominatorMultiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var denominatorUnit: UnitSymbol,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol
)

data class UpdateRotationSpeedCommand(
    @TargetAggregateIdentifier var rotationSpeedId: UUID? = null,
    @Enumerated(EnumType.STRING) var denominatorMultiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var denominatorUnit: UnitSymbol,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol,
    var value: FloatProxy
)

data class DeleteRotationSpeedCommand(@TargetAggregateIdentifier  var rotationSpeedId: UUID? = null)

// single association commands
data class AssignValueToRotationSpeedCommand(@TargetAggregateIdentifier  val rotationSpeedId: UUID, val assignment: FloatProxy )
data class UnAssignValueFromRotationSpeedCommand(@TargetAggregateIdentifier  val rotationSpeedId: UUID )

// multiple association commands


// Season Commands
data class CreateSeasonCommand(
    @TargetAggregateIdentifier  var seasonId: UUID? = null
)

data class UpdateSeasonCommand(
    @TargetAggregateIdentifier var seasonId: UUID? = null,
    var endDate: MonthDay,
    var startDate: MonthDay
)

data class DeleteSeasonCommand(@TargetAggregateIdentifier  var seasonId: UUID? = null)

// single association commands
data class AssignEndDateToSeasonCommand(@TargetAggregateIdentifier  val seasonId: UUID, val assignment: MonthDay )
data class UnAssignEndDateFromSeasonCommand(@TargetAggregateIdentifier  val seasonId: UUID )
data class AssignStartDateToSeasonCommand(@TargetAggregateIdentifier  val seasonId: UUID, val assignment: MonthDay )
data class UnAssignStartDateFromSeasonCommand(@TargetAggregateIdentifier  val seasonId: UUID )

// multiple association commands


// SeasonDayTypeSchedule Commands
data class CreateSeasonDayTypeScheduleCommand(
    @TargetAggregateIdentifier  var seasonDayTypeScheduleId: UUID? = null
)

data class UpdateSeasonDayTypeScheduleCommand(
    @TargetAggregateIdentifier  var seasonDayTypeScheduleId: UUID? = null
)

data class DeleteSeasonDayTypeScheduleCommand(@TargetAggregateIdentifier  var seasonDayTypeScheduleId: UUID? = null)

// single association commands

// multiple association commands


// Seconds Commands
data class CreateSecondsCommand(
    @TargetAggregateIdentifier var secondsId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol
)

data class UpdateSecondsCommand(
    @TargetAggregateIdentifier var secondsId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol,
    var value: FloatProxy
)

data class DeleteSecondsCommand(@TargetAggregateIdentifier  var secondsId: UUID? = null)

// single association commands
data class AssignValueToSecondsCommand(@TargetAggregateIdentifier  val secondsId: UUID, val assignment: FloatProxy )
data class UnAssignValueFromSecondsCommand(@TargetAggregateIdentifier  val secondsId: UUID )

// multiple association commands


// SeriesCompensator Commands
data class CreateSeriesCompensatorCommand(
    @TargetAggregateIdentifier  var seriesCompensatorId: UUID? = null
)

data class UpdateSeriesCompensatorCommand(
    @TargetAggregateIdentifier var seriesCompensatorId: UUID? = null,
    var r: Resistance,
    var r0: Resistance,
    var varistorPresent: BooleanProxy,
    var varistorRatedCurrent: CurrentFlow,
    var varistorVoltageThreshold: Voltage,
    var x: Reactance,
    var x0: Reactance
)

data class DeleteSeriesCompensatorCommand(@TargetAggregateIdentifier  var seriesCompensatorId: UUID? = null)

// single association commands
data class AssignRToSeriesCompensatorCommand(@TargetAggregateIdentifier  val seriesCompensatorId: UUID, val assignment: Resistance )
data class UnAssignRFromSeriesCompensatorCommand(@TargetAggregateIdentifier  val seriesCompensatorId: UUID )
data class AssignR0ToSeriesCompensatorCommand(@TargetAggregateIdentifier  val seriesCompensatorId: UUID, val assignment: Resistance )
data class UnAssignR0FromSeriesCompensatorCommand(@TargetAggregateIdentifier  val seriesCompensatorId: UUID )
data class AssignVaristorPresentToSeriesCompensatorCommand(@TargetAggregateIdentifier  val seriesCompensatorId: UUID, val assignment: BooleanProxy )
data class UnAssignVaristorPresentFromSeriesCompensatorCommand(@TargetAggregateIdentifier  val seriesCompensatorId: UUID )
data class AssignVaristorRatedCurrentToSeriesCompensatorCommand(@TargetAggregateIdentifier  val seriesCompensatorId: UUID, val assignment: CurrentFlow )
data class UnAssignVaristorRatedCurrentFromSeriesCompensatorCommand(@TargetAggregateIdentifier  val seriesCompensatorId: UUID )
data class AssignVaristorVoltageThresholdToSeriesCompensatorCommand(@TargetAggregateIdentifier  val seriesCompensatorId: UUID, val assignment: Voltage )
data class UnAssignVaristorVoltageThresholdFromSeriesCompensatorCommand(@TargetAggregateIdentifier  val seriesCompensatorId: UUID )
data class AssignXToSeriesCompensatorCommand(@TargetAggregateIdentifier  val seriesCompensatorId: UUID, val assignment: Reactance )
data class UnAssignXFromSeriesCompensatorCommand(@TargetAggregateIdentifier  val seriesCompensatorId: UUID )
data class AssignX0ToSeriesCompensatorCommand(@TargetAggregateIdentifier  val seriesCompensatorId: UUID, val assignment: Reactance )
data class UnAssignX0FromSeriesCompensatorCommand(@TargetAggregateIdentifier  val seriesCompensatorId: UUID )

// multiple association commands


// SetPoint Commands
data class CreateSetPointCommand(
    @TargetAggregateIdentifier  var setPointId: UUID? = null
)

data class UpdateSetPointCommand(
    @TargetAggregateIdentifier var setPointId: UUID? = null,
    var normalValue: Simple_Float,
    var value: Simple_Float
)

data class DeleteSetPointCommand(@TargetAggregateIdentifier  var setPointId: UUID? = null)

// single association commands
data class AssignNormalValueToSetPointCommand(@TargetAggregateIdentifier  val setPointId: UUID, val assignment: Simple_Float )
data class UnAssignNormalValueFromSetPointCommand(@TargetAggregateIdentifier  val setPointId: UUID )
data class AssignValueToSetPointCommand(@TargetAggregateIdentifier  val setPointId: UUID, val assignment: Simple_Float )
data class UnAssignValueFromSetPointCommand(@TargetAggregateIdentifier  val setPointId: UUID )

// multiple association commands


// ShuntCompensator Commands
data class CreateShuntCompensatorCommand(
    @TargetAggregateIdentifier  var shuntCompensatorId: UUID? = null
)

data class UpdateShuntCompensatorCommand(
    @TargetAggregateIdentifier var shuntCompensatorId: UUID? = null,
    var aVRDelay: Seconds,
    var grounded: BooleanProxy,
    var maximumSections: IntegerProxy,
    var nomU: Voltage,
    var normalSections: IntegerProxy,
    var switchOnCount: IntegerProxy,
    var switchOnDate: DateTime,
    var voltageSensitivity: VoltagePerReactivePower
)

data class DeleteShuntCompensatorCommand(@TargetAggregateIdentifier  var shuntCompensatorId: UUID? = null)

// single association commands
data class AssignAVRDelayToShuntCompensatorCommand(@TargetAggregateIdentifier  val shuntCompensatorId: UUID, val assignment: Seconds )
data class UnAssignAVRDelayFromShuntCompensatorCommand(@TargetAggregateIdentifier  val shuntCompensatorId: UUID )
data class AssignGroundedToShuntCompensatorCommand(@TargetAggregateIdentifier  val shuntCompensatorId: UUID, val assignment: BooleanProxy )
data class UnAssignGroundedFromShuntCompensatorCommand(@TargetAggregateIdentifier  val shuntCompensatorId: UUID )
data class AssignMaximumSectionsToShuntCompensatorCommand(@TargetAggregateIdentifier  val shuntCompensatorId: UUID, val assignment: IntegerProxy )
data class UnAssignMaximumSectionsFromShuntCompensatorCommand(@TargetAggregateIdentifier  val shuntCompensatorId: UUID )
data class AssignNomUToShuntCompensatorCommand(@TargetAggregateIdentifier  val shuntCompensatorId: UUID, val assignment: Voltage )
data class UnAssignNomUFromShuntCompensatorCommand(@TargetAggregateIdentifier  val shuntCompensatorId: UUID )
data class AssignNormalSectionsToShuntCompensatorCommand(@TargetAggregateIdentifier  val shuntCompensatorId: UUID, val assignment: IntegerProxy )
data class UnAssignNormalSectionsFromShuntCompensatorCommand(@TargetAggregateIdentifier  val shuntCompensatorId: UUID )
data class AssignSwitchOnCountToShuntCompensatorCommand(@TargetAggregateIdentifier  val shuntCompensatorId: UUID, val assignment: IntegerProxy )
data class UnAssignSwitchOnCountFromShuntCompensatorCommand(@TargetAggregateIdentifier  val shuntCompensatorId: UUID )
data class AssignSwitchOnDateToShuntCompensatorCommand(@TargetAggregateIdentifier  val shuntCompensatorId: UUID, val assignment: DateTime )
data class UnAssignSwitchOnDateFromShuntCompensatorCommand(@TargetAggregateIdentifier  val shuntCompensatorId: UUID )
data class AssignVoltageSensitivityToShuntCompensatorCommand(@TargetAggregateIdentifier  val shuntCompensatorId: UUID, val assignment: VoltagePerReactivePower )
data class UnAssignVoltageSensitivityFromShuntCompensatorCommand(@TargetAggregateIdentifier  val shuntCompensatorId: UUID )

// multiple association commands


// Simple_Float Commands
data class CreateSimple_FloatCommand(
    @TargetAggregateIdentifier  var simple_FloatId: UUID? = null
)

data class UpdateSimple_FloatCommand(
    @TargetAggregateIdentifier var simple_FloatId: UUID? = null,
    var value: FloatProxy
)

data class DeleteSimple_FloatCommand(@TargetAggregateIdentifier  var simple_FloatId: UUID? = null)

// single association commands
data class AssignValueToSimple_FloatCommand(@TargetAggregateIdentifier  val simple_FloatId: UUID, val assignment: FloatProxy )
data class UnAssignValueFromSimple_FloatCommand(@TargetAggregateIdentifier  val simple_FloatId: UUID )

// multiple association commands


// SolarGeneratingUnit Commands
data class CreateSolarGeneratingUnitCommand(
    @TargetAggregateIdentifier  var solarGeneratingUnitId: UUID? = null
)

data class UpdateSolarGeneratingUnitCommand(
    @TargetAggregateIdentifier  var solarGeneratingUnitId: UUID? = null
)

data class DeleteSolarGeneratingUnitCommand(@TargetAggregateIdentifier  var solarGeneratingUnitId: UUID? = null)

// single association commands

// multiple association commands


// StateVariablesVersion Commands
data class CreateStateVariablesVersionCommand(
    @TargetAggregateIdentifier  var stateVariablesVersionId: UUID? = null
)

data class UpdateStateVariablesVersionCommand(
    @TargetAggregateIdentifier var stateVariablesVersionId: UUID? = null,
    var baseUML: StringProxy,
    var baseURI: StringProxy,
    var date: DateProxy,
    var differenceModelURI: StringProxy,
    var entsoeUML: StringProxy,
    var entsoeURI: StringProxy,
    var modelDescriptionURI: StringProxy,
    var namespaceRDF: StringProxy,
    var namespaceUML: StringProxy,
    var shortName: StringProxy
)

data class DeleteStateVariablesVersionCommand(@TargetAggregateIdentifier  var stateVariablesVersionId: UUID? = null)

// single association commands
data class AssignBaseUMLToStateVariablesVersionCommand(@TargetAggregateIdentifier  val stateVariablesVersionId: UUID, val assignment: StringProxy )
data class UnAssignBaseUMLFromStateVariablesVersionCommand(@TargetAggregateIdentifier  val stateVariablesVersionId: UUID )
data class AssignBaseURIToStateVariablesVersionCommand(@TargetAggregateIdentifier  val stateVariablesVersionId: UUID, val assignment: StringProxy )
data class UnAssignBaseURIFromStateVariablesVersionCommand(@TargetAggregateIdentifier  val stateVariablesVersionId: UUID )
data class AssignDateToStateVariablesVersionCommand(@TargetAggregateIdentifier  val stateVariablesVersionId: UUID, val assignment: DateProxy )
data class UnAssignDateFromStateVariablesVersionCommand(@TargetAggregateIdentifier  val stateVariablesVersionId: UUID )
data class AssignDifferenceModelURIToStateVariablesVersionCommand(@TargetAggregateIdentifier  val stateVariablesVersionId: UUID, val assignment: StringProxy )
data class UnAssignDifferenceModelURIFromStateVariablesVersionCommand(@TargetAggregateIdentifier  val stateVariablesVersionId: UUID )
data class AssignEntsoeUMLToStateVariablesVersionCommand(@TargetAggregateIdentifier  val stateVariablesVersionId: UUID, val assignment: StringProxy )
data class UnAssignEntsoeUMLFromStateVariablesVersionCommand(@TargetAggregateIdentifier  val stateVariablesVersionId: UUID )
data class AssignEntsoeURIToStateVariablesVersionCommand(@TargetAggregateIdentifier  val stateVariablesVersionId: UUID, val assignment: StringProxy )
data class UnAssignEntsoeURIFromStateVariablesVersionCommand(@TargetAggregateIdentifier  val stateVariablesVersionId: UUID )
data class AssignModelDescriptionURIToStateVariablesVersionCommand(@TargetAggregateIdentifier  val stateVariablesVersionId: UUID, val assignment: StringProxy )
data class UnAssignModelDescriptionURIFromStateVariablesVersionCommand(@TargetAggregateIdentifier  val stateVariablesVersionId: UUID )
data class AssignNamespaceRDFToStateVariablesVersionCommand(@TargetAggregateIdentifier  val stateVariablesVersionId: UUID, val assignment: StringProxy )
data class UnAssignNamespaceRDFFromStateVariablesVersionCommand(@TargetAggregateIdentifier  val stateVariablesVersionId: UUID )
data class AssignNamespaceUMLToStateVariablesVersionCommand(@TargetAggregateIdentifier  val stateVariablesVersionId: UUID, val assignment: StringProxy )
data class UnAssignNamespaceUMLFromStateVariablesVersionCommand(@TargetAggregateIdentifier  val stateVariablesVersionId: UUID )
data class AssignShortNameToStateVariablesVersionCommand(@TargetAggregateIdentifier  val stateVariablesVersionId: UUID, val assignment: StringProxy )
data class UnAssignShortNameFromStateVariablesVersionCommand(@TargetAggregateIdentifier  val stateVariablesVersionId: UUID )

// multiple association commands


// StaticVarCompensator Commands
data class CreateStaticVarCompensatorCommand(
    @TargetAggregateIdentifier var staticVarCompensatorId: UUID? = null,
    @Enumerated(EnumType.STRING) var sVCControlMode: SVCControlMode
)

data class UpdateStaticVarCompensatorCommand(
    @TargetAggregateIdentifier var staticVarCompensatorId: UUID? = null,
    var capacitiveRating: Reactance,
    var inductiveRating: Reactance,
    var slope: VoltagePerReactivePower,
    @Enumerated(EnumType.STRING) var sVCControlMode: SVCControlMode,
    var voltageSetPoint: Voltage
)

data class DeleteStaticVarCompensatorCommand(@TargetAggregateIdentifier  var staticVarCompensatorId: UUID? = null)

// single association commands
data class AssignCapacitiveRatingToStaticVarCompensatorCommand(@TargetAggregateIdentifier  val staticVarCompensatorId: UUID, val assignment: Reactance )
data class UnAssignCapacitiveRatingFromStaticVarCompensatorCommand(@TargetAggregateIdentifier  val staticVarCompensatorId: UUID )
data class AssignInductiveRatingToStaticVarCompensatorCommand(@TargetAggregateIdentifier  val staticVarCompensatorId: UUID, val assignment: Reactance )
data class UnAssignInductiveRatingFromStaticVarCompensatorCommand(@TargetAggregateIdentifier  val staticVarCompensatorId: UUID )
data class AssignSlopeToStaticVarCompensatorCommand(@TargetAggregateIdentifier  val staticVarCompensatorId: UUID, val assignment: VoltagePerReactivePower )
data class UnAssignSlopeFromStaticVarCompensatorCommand(@TargetAggregateIdentifier  val staticVarCompensatorId: UUID )
data class AssignVoltageSetPointToStaticVarCompensatorCommand(@TargetAggregateIdentifier  val staticVarCompensatorId: UUID, val assignment: Voltage )
data class UnAssignVoltageSetPointFromStaticVarCompensatorCommand(@TargetAggregateIdentifier  val staticVarCompensatorId: UUID )

// multiple association commands


// Staticpowersystemmodel Commands
data class CreateStaticpowersystemmodelCommand(
    @TargetAggregateIdentifier  var staticpowersystemmodelId: UUID? = null
)

data class UpdateStaticpowersystemmodelCommand(
    @TargetAggregateIdentifier  var staticpowersystemmodelId: UUID? = null
)

data class DeleteStaticpowersystemmodelCommand(@TargetAggregateIdentifier  var staticpowersystemmodelId: UUID? = null)

// single association commands

// multiple association commands


// StationSupply Commands
data class CreateStationSupplyCommand(
    @TargetAggregateIdentifier  var stationSupplyId: UUID? = null
)

data class UpdateStationSupplyCommand(
    @TargetAggregateIdentifier  var stationSupplyId: UUID? = null
)

data class DeleteStationSupplyCommand(@TargetAggregateIdentifier  var stationSupplyId: UUID? = null)

// single association commands

// multiple association commands


// SteadyStateHypothesisVersion Commands
data class CreateSteadyStateHypothesisVersionCommand(
    @TargetAggregateIdentifier  var steadyStateHypothesisVersionId: UUID? = null
)

data class UpdateSteadyStateHypothesisVersionCommand(
    @TargetAggregateIdentifier var steadyStateHypothesisVersionId: UUID? = null,
    var baseUML: StringProxy,
    var baseURI: StringProxy,
    var date: DateProxy,
    var differenceModelURI: StringProxy,
    var entsoeUML: StringProxy,
    var entsoeURI: StringProxy,
    var modelDescriptionURI: StringProxy,
    var namespaceRDF: StringProxy,
    var namespaceUML: StringProxy,
    var shortName: StringProxy
)

data class DeleteSteadyStateHypothesisVersionCommand(@TargetAggregateIdentifier  var steadyStateHypothesisVersionId: UUID? = null)

// single association commands
data class AssignBaseUMLToSteadyStateHypothesisVersionCommand(@TargetAggregateIdentifier  val steadyStateHypothesisVersionId: UUID, val assignment: StringProxy )
data class UnAssignBaseUMLFromSteadyStateHypothesisVersionCommand(@TargetAggregateIdentifier  val steadyStateHypothesisVersionId: UUID )
data class AssignBaseURIToSteadyStateHypothesisVersionCommand(@TargetAggregateIdentifier  val steadyStateHypothesisVersionId: UUID, val assignment: StringProxy )
data class UnAssignBaseURIFromSteadyStateHypothesisVersionCommand(@TargetAggregateIdentifier  val steadyStateHypothesisVersionId: UUID )
data class AssignDateToSteadyStateHypothesisVersionCommand(@TargetAggregateIdentifier  val steadyStateHypothesisVersionId: UUID, val assignment: DateProxy )
data class UnAssignDateFromSteadyStateHypothesisVersionCommand(@TargetAggregateIdentifier  val steadyStateHypothesisVersionId: UUID )
data class AssignDifferenceModelURIToSteadyStateHypothesisVersionCommand(@TargetAggregateIdentifier  val steadyStateHypothesisVersionId: UUID, val assignment: StringProxy )
data class UnAssignDifferenceModelURIFromSteadyStateHypothesisVersionCommand(@TargetAggregateIdentifier  val steadyStateHypothesisVersionId: UUID )
data class AssignEntsoeUMLToSteadyStateHypothesisVersionCommand(@TargetAggregateIdentifier  val steadyStateHypothesisVersionId: UUID, val assignment: StringProxy )
data class UnAssignEntsoeUMLFromSteadyStateHypothesisVersionCommand(@TargetAggregateIdentifier  val steadyStateHypothesisVersionId: UUID )
data class AssignEntsoeURIToSteadyStateHypothesisVersionCommand(@TargetAggregateIdentifier  val steadyStateHypothesisVersionId: UUID, val assignment: StringProxy )
data class UnAssignEntsoeURIFromSteadyStateHypothesisVersionCommand(@TargetAggregateIdentifier  val steadyStateHypothesisVersionId: UUID )
data class AssignModelDescriptionURIToSteadyStateHypothesisVersionCommand(@TargetAggregateIdentifier  val steadyStateHypothesisVersionId: UUID, val assignment: StringProxy )
data class UnAssignModelDescriptionURIFromSteadyStateHypothesisVersionCommand(@TargetAggregateIdentifier  val steadyStateHypothesisVersionId: UUID )
data class AssignNamespaceRDFToSteadyStateHypothesisVersionCommand(@TargetAggregateIdentifier  val steadyStateHypothesisVersionId: UUID, val assignment: StringProxy )
data class UnAssignNamespaceRDFFromSteadyStateHypothesisVersionCommand(@TargetAggregateIdentifier  val steadyStateHypothesisVersionId: UUID )
data class AssignNamespaceUMLToSteadyStateHypothesisVersionCommand(@TargetAggregateIdentifier  val steadyStateHypothesisVersionId: UUID, val assignment: StringProxy )
data class UnAssignNamespaceUMLFromSteadyStateHypothesisVersionCommand(@TargetAggregateIdentifier  val steadyStateHypothesisVersionId: UUID )
data class AssignShortNameToSteadyStateHypothesisVersionCommand(@TargetAggregateIdentifier  val steadyStateHypothesisVersionId: UUID, val assignment: StringProxy )
data class UnAssignShortNameFromSteadyStateHypothesisVersionCommand(@TargetAggregateIdentifier  val steadyStateHypothesisVersionId: UUID )

// multiple association commands


// StringMeasurement Commands
data class CreateStringMeasurementCommand(
    @TargetAggregateIdentifier  var stringMeasurementId: UUID? = null
)

data class UpdateStringMeasurementCommand(
    @TargetAggregateIdentifier  var stringMeasurementId: UUID? = null
)

data class DeleteStringMeasurementCommand(@TargetAggregateIdentifier  var stringMeasurementId: UUID? = null)

// single association commands

// multiple association commands


// StringMeasurementValue Commands
data class CreateStringMeasurementValueCommand(
    @TargetAggregateIdentifier  var stringMeasurementValueId: UUID? = null
)

data class UpdateStringMeasurementValueCommand(
    @TargetAggregateIdentifier var stringMeasurementValueId: UUID? = null,
    var value: StringProxy
)

data class DeleteStringMeasurementValueCommand(@TargetAggregateIdentifier  var stringMeasurementValueId: UUID? = null)

// single association commands
data class AssignValueToStringMeasurementValueCommand(@TargetAggregateIdentifier  val stringMeasurementValueId: UUID, val assignment: StringProxy )
data class UnAssignValueFromStringMeasurementValueCommand(@TargetAggregateIdentifier  val stringMeasurementValueId: UUID )

// multiple association commands


// StringProxy Commands
data class CreateStringProxyCommand(
    @TargetAggregateIdentifier  var stringProxyId: UUID? = null
)

data class UpdateStringProxyCommand(
    @TargetAggregateIdentifier  var stringProxyId: UUID? = null
)

data class DeleteStringProxyCommand(@TargetAggregateIdentifier  var stringProxyId: UUID? = null)

// single association commands

// multiple association commands


// SubGeographicalRegion Commands
data class CreateSubGeographicalRegionCommand(
    @TargetAggregateIdentifier  var subGeographicalRegionId: UUID? = null
)

data class UpdateSubGeographicalRegionCommand(
    @TargetAggregateIdentifier  var subGeographicalRegionId: UUID? = null
)

data class DeleteSubGeographicalRegionCommand(@TargetAggregateIdentifier  var subGeographicalRegionId: UUID? = null)

// single association commands

// multiple association commands


// SubLoadArea Commands
data class CreateSubLoadAreaCommand(
    @TargetAggregateIdentifier  var subLoadAreaId: UUID? = null
)

data class UpdateSubLoadAreaCommand(
    @TargetAggregateIdentifier  var subLoadAreaId: UUID? = null
)

data class DeleteSubLoadAreaCommand(@TargetAggregateIdentifier  var subLoadAreaId: UUID? = null)

// single association commands

// multiple association commands


// Substation Commands
data class CreateSubstationCommand(
    @TargetAggregateIdentifier  var substationId: UUID? = null
)

data class UpdateSubstationCommand(
    @TargetAggregateIdentifier  var substationId: UUID? = null
)

data class DeleteSubstationCommand(@TargetAggregateIdentifier  var substationId: UUID? = null)

// single association commands

// multiple association commands


// Susceptance Commands
data class CreateSusceptanceCommand(
    @TargetAggregateIdentifier var susceptanceId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol
)

data class UpdateSusceptanceCommand(
    @TargetAggregateIdentifier var susceptanceId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol,
    var value: FloatProxy
)

data class DeleteSusceptanceCommand(@TargetAggregateIdentifier  var susceptanceId: UUID? = null)

// single association commands
data class AssignValueToSusceptanceCommand(@TargetAggregateIdentifier  val susceptanceId: UUID, val assignment: FloatProxy )
data class UnAssignValueFromSusceptanceCommand(@TargetAggregateIdentifier  val susceptanceId: UUID )

// multiple association commands


// SvInjection Commands
data class CreateSvInjectionCommand(
    @TargetAggregateIdentifier  var svInjectionId: UUID? = null
)

data class UpdateSvInjectionCommand(
    @TargetAggregateIdentifier var svInjectionId: UUID? = null,
    var pInjection: ActivePower,
    var qInjection: ReactivePower
)

data class DeleteSvInjectionCommand(@TargetAggregateIdentifier  var svInjectionId: UUID? = null)

// single association commands
data class AssignPInjectionToSvInjectionCommand(@TargetAggregateIdentifier  val svInjectionId: UUID, val assignment: ActivePower )
data class UnAssignPInjectionFromSvInjectionCommand(@TargetAggregateIdentifier  val svInjectionId: UUID )
data class AssignQInjectionToSvInjectionCommand(@TargetAggregateIdentifier  val svInjectionId: UUID, val assignment: ReactivePower )
data class UnAssignQInjectionFromSvInjectionCommand(@TargetAggregateIdentifier  val svInjectionId: UUID )

// multiple association commands


// SvPowerFlow Commands
data class CreateSvPowerFlowCommand(
    @TargetAggregateIdentifier  var svPowerFlowId: UUID? = null
)

data class UpdateSvPowerFlowCommand(
    @TargetAggregateIdentifier var svPowerFlowId: UUID? = null,
    var p: ActivePower,
    var q: ReactivePower
)

data class DeleteSvPowerFlowCommand(@TargetAggregateIdentifier  var svPowerFlowId: UUID? = null)

// single association commands
data class AssignPToSvPowerFlowCommand(@TargetAggregateIdentifier  val svPowerFlowId: UUID, val assignment: ActivePower )
data class UnAssignPFromSvPowerFlowCommand(@TargetAggregateIdentifier  val svPowerFlowId: UUID )
data class AssignQToSvPowerFlowCommand(@TargetAggregateIdentifier  val svPowerFlowId: UUID, val assignment: ReactivePower )
data class UnAssignQFromSvPowerFlowCommand(@TargetAggregateIdentifier  val svPowerFlowId: UUID )

// multiple association commands


// SvShuntCompensatorSections Commands
data class CreateSvShuntCompensatorSectionsCommand(
    @TargetAggregateIdentifier  var svShuntCompensatorSectionsId: UUID? = null
)

data class UpdateSvShuntCompensatorSectionsCommand(
    @TargetAggregateIdentifier var svShuntCompensatorSectionsId: UUID? = null,
    var sections: Simple_Float
)

data class DeleteSvShuntCompensatorSectionsCommand(@TargetAggregateIdentifier  var svShuntCompensatorSectionsId: UUID? = null)

// single association commands
data class AssignSectionsToSvShuntCompensatorSectionsCommand(@TargetAggregateIdentifier  val svShuntCompensatorSectionsId: UUID, val assignment: Simple_Float )
data class UnAssignSectionsFromSvShuntCompensatorSectionsCommand(@TargetAggregateIdentifier  val svShuntCompensatorSectionsId: UUID )

// multiple association commands


// SvStatus Commands
data class CreateSvStatusCommand(
    @TargetAggregateIdentifier  var svStatusId: UUID? = null
)

data class UpdateSvStatusCommand(
    @TargetAggregateIdentifier var svStatusId: UUID? = null,
    var inService: BooleanProxy
)

data class DeleteSvStatusCommand(@TargetAggregateIdentifier  var svStatusId: UUID? = null)

// single association commands
data class AssignInServiceToSvStatusCommand(@TargetAggregateIdentifier  val svStatusId: UUID, val assignment: BooleanProxy )
data class UnAssignInServiceFromSvStatusCommand(@TargetAggregateIdentifier  val svStatusId: UUID )

// multiple association commands


// SvTapStep Commands
data class CreateSvTapStepCommand(
    @TargetAggregateIdentifier  var svTapStepId: UUID? = null
)

data class UpdateSvTapStepCommand(
    @TargetAggregateIdentifier var svTapStepId: UUID? = null,
    var position: Simple_Float
)

data class DeleteSvTapStepCommand(@TargetAggregateIdentifier  var svTapStepId: UUID? = null)

// single association commands
data class AssignPositionToSvTapStepCommand(@TargetAggregateIdentifier  val svTapStepId: UUID, val assignment: Simple_Float )
data class UnAssignPositionFromSvTapStepCommand(@TargetAggregateIdentifier  val svTapStepId: UUID )

// multiple association commands


// SvVoltage Commands
data class CreateSvVoltageCommand(
    @TargetAggregateIdentifier  var svVoltageId: UUID? = null
)

data class UpdateSvVoltageCommand(
    @TargetAggregateIdentifier var svVoltageId: UUID? = null,
    var angle: AngleDegrees,
    var v: Voltage
)

data class DeleteSvVoltageCommand(@TargetAggregateIdentifier  var svVoltageId: UUID? = null)

// single association commands
data class AssignAngleToSvVoltageCommand(@TargetAggregateIdentifier  val svVoltageId: UUID, val assignment: AngleDegrees )
data class UnAssignAngleFromSvVoltageCommand(@TargetAggregateIdentifier  val svVoltageId: UUID )
data class AssignVToSvVoltageCommand(@TargetAggregateIdentifier  val svVoltageId: UUID, val assignment: Voltage )
data class UnAssignVFromSvVoltageCommand(@TargetAggregateIdentifier  val svVoltageId: UUID )

// multiple association commands


// SwitchIt Commands
data class CreateSwitchItCommand(
    @TargetAggregateIdentifier  var switchItId: UUID? = null
)

data class UpdateSwitchItCommand(
    @TargetAggregateIdentifier var switchItId: UUID? = null,
    var open: BooleanProxy
)

data class DeleteSwitchItCommand(@TargetAggregateIdentifier  var switchItId: UUID? = null)

// single association commands
data class AssignOpenToSwitchItCommand(@TargetAggregateIdentifier  val switchItId: UUID, val assignment: BooleanProxy )
data class UnAssignOpenFromSwitchItCommand(@TargetAggregateIdentifier  val switchItId: UUID )

// multiple association commands


// SwitchProxy Commands
data class CreateSwitchProxyCommand(
    @TargetAggregateIdentifier  var switchProxyId: UUID? = null
)

data class UpdateSwitchProxyCommand(
    @TargetAggregateIdentifier var switchProxyId: UUID? = null,
    var normalOpen: BooleanProxy,
    var ratedCurrent: CurrentFlow,
    var retained: BooleanProxy
)

data class DeleteSwitchProxyCommand(@TargetAggregateIdentifier  var switchProxyId: UUID? = null)

// single association commands
data class AssignNormalOpenToSwitchProxyCommand(@TargetAggregateIdentifier  val switchProxyId: UUID, val assignment: BooleanProxy )
data class UnAssignNormalOpenFromSwitchProxyCommand(@TargetAggregateIdentifier  val switchProxyId: UUID )
data class AssignRatedCurrentToSwitchProxyCommand(@TargetAggregateIdentifier  val switchProxyId: UUID, val assignment: CurrentFlow )
data class UnAssignRatedCurrentFromSwitchProxyCommand(@TargetAggregateIdentifier  val switchProxyId: UUID )
data class AssignRetainedToSwitchProxyCommand(@TargetAggregateIdentifier  val switchProxyId: UUID, val assignment: BooleanProxy )
data class UnAssignRetainedFromSwitchProxyCommand(@TargetAggregateIdentifier  val switchProxyId: UUID )

// multiple association commands


// SwitchSchedule Commands
data class CreateSwitchScheduleCommand(
    @TargetAggregateIdentifier  var switchScheduleId: UUID? = null
)

data class UpdateSwitchScheduleCommand(
    @TargetAggregateIdentifier  var switchScheduleId: UUID? = null
)

data class DeleteSwitchScheduleCommand(@TargetAggregateIdentifier  var switchScheduleId: UUID? = null)

// single association commands

// multiple association commands


// SynchronousMachine Commands
data class CreateSynchronousMachineCommand(
    @TargetAggregateIdentifier var synchronousMachineId: UUID? = null,
    @Enumerated(EnumType.STRING) var shortCircuitRotorType: ShortCircuitRotorKind,
    @Enumerated(EnumType.STRING) var type: SynchronousMachineKind
)

data class UpdateSynchronousMachineCommand(
    @TargetAggregateIdentifier var synchronousMachineId: UUID? = null,
    var earthing: BooleanProxy,
    var earthingStarPointR: Resistance,
    var earthingStarPointX: Reactance,
    var ikk: CurrentFlow,
    var maxQ: ReactivePower,
    var minQ: ReactivePower,
    var mu: Simple_Float,
    var qPercent: PerCent,
    var r: Resistance,
    var r0: PU,
    var r2: PU,
    var satDirectSubtransX: PU,
    var satDirectSyncX: PU,
    var satDirectTransX: PU,
    @Enumerated(EnumType.STRING) var shortCircuitRotorType: ShortCircuitRotorKind,
    @Enumerated(EnumType.STRING) var type: SynchronousMachineKind,
    var voltageRegulationRange: PerCent,
    var x0: PU,
    var x2: PU
)

data class DeleteSynchronousMachineCommand(@TargetAggregateIdentifier  var synchronousMachineId: UUID? = null)

// single association commands
data class AssignEarthingToSynchronousMachineCommand(@TargetAggregateIdentifier  val synchronousMachineId: UUID, val assignment: BooleanProxy )
data class UnAssignEarthingFromSynchronousMachineCommand(@TargetAggregateIdentifier  val synchronousMachineId: UUID )
data class AssignEarthingStarPointRToSynchronousMachineCommand(@TargetAggregateIdentifier  val synchronousMachineId: UUID, val assignment: Resistance )
data class UnAssignEarthingStarPointRFromSynchronousMachineCommand(@TargetAggregateIdentifier  val synchronousMachineId: UUID )
data class AssignEarthingStarPointXToSynchronousMachineCommand(@TargetAggregateIdentifier  val synchronousMachineId: UUID, val assignment: Reactance )
data class UnAssignEarthingStarPointXFromSynchronousMachineCommand(@TargetAggregateIdentifier  val synchronousMachineId: UUID )
data class AssignIkkToSynchronousMachineCommand(@TargetAggregateIdentifier  val synchronousMachineId: UUID, val assignment: CurrentFlow )
data class UnAssignIkkFromSynchronousMachineCommand(@TargetAggregateIdentifier  val synchronousMachineId: UUID )
data class AssignMaxQToSynchronousMachineCommand(@TargetAggregateIdentifier  val synchronousMachineId: UUID, val assignment: ReactivePower )
data class UnAssignMaxQFromSynchronousMachineCommand(@TargetAggregateIdentifier  val synchronousMachineId: UUID )
data class AssignMinQToSynchronousMachineCommand(@TargetAggregateIdentifier  val synchronousMachineId: UUID, val assignment: ReactivePower )
data class UnAssignMinQFromSynchronousMachineCommand(@TargetAggregateIdentifier  val synchronousMachineId: UUID )
data class AssignMuToSynchronousMachineCommand(@TargetAggregateIdentifier  val synchronousMachineId: UUID, val assignment: Simple_Float )
data class UnAssignMuFromSynchronousMachineCommand(@TargetAggregateIdentifier  val synchronousMachineId: UUID )
data class AssignQPercentToSynchronousMachineCommand(@TargetAggregateIdentifier  val synchronousMachineId: UUID, val assignment: PerCent )
data class UnAssignQPercentFromSynchronousMachineCommand(@TargetAggregateIdentifier  val synchronousMachineId: UUID )
data class AssignRToSynchronousMachineCommand(@TargetAggregateIdentifier  val synchronousMachineId: UUID, val assignment: Resistance )
data class UnAssignRFromSynchronousMachineCommand(@TargetAggregateIdentifier  val synchronousMachineId: UUID )
data class AssignR0ToSynchronousMachineCommand(@TargetAggregateIdentifier  val synchronousMachineId: UUID, val assignment: PU )
data class UnAssignR0FromSynchronousMachineCommand(@TargetAggregateIdentifier  val synchronousMachineId: UUID )
data class AssignR2ToSynchronousMachineCommand(@TargetAggregateIdentifier  val synchronousMachineId: UUID, val assignment: PU )
data class UnAssignR2FromSynchronousMachineCommand(@TargetAggregateIdentifier  val synchronousMachineId: UUID )
data class AssignSatDirectSubtransXToSynchronousMachineCommand(@TargetAggregateIdentifier  val synchronousMachineId: UUID, val assignment: PU )
data class UnAssignSatDirectSubtransXFromSynchronousMachineCommand(@TargetAggregateIdentifier  val synchronousMachineId: UUID )
data class AssignSatDirectSyncXToSynchronousMachineCommand(@TargetAggregateIdentifier  val synchronousMachineId: UUID, val assignment: PU )
data class UnAssignSatDirectSyncXFromSynchronousMachineCommand(@TargetAggregateIdentifier  val synchronousMachineId: UUID )
data class AssignSatDirectTransXToSynchronousMachineCommand(@TargetAggregateIdentifier  val synchronousMachineId: UUID, val assignment: PU )
data class UnAssignSatDirectTransXFromSynchronousMachineCommand(@TargetAggregateIdentifier  val synchronousMachineId: UUID )
data class AssignVoltageRegulationRangeToSynchronousMachineCommand(@TargetAggregateIdentifier  val synchronousMachineId: UUID, val assignment: PerCent )
data class UnAssignVoltageRegulationRangeFromSynchronousMachineCommand(@TargetAggregateIdentifier  val synchronousMachineId: UUID )
data class AssignX0ToSynchronousMachineCommand(@TargetAggregateIdentifier  val synchronousMachineId: UUID, val assignment: PU )
data class UnAssignX0FromSynchronousMachineCommand(@TargetAggregateIdentifier  val synchronousMachineId: UUID )
data class AssignX2ToSynchronousMachineCommand(@TargetAggregateIdentifier  val synchronousMachineId: UUID, val assignment: PU )
data class UnAssignX2FromSynchronousMachineCommand(@TargetAggregateIdentifier  val synchronousMachineId: UUID )

// multiple association commands


// SynchronousMachineDetailed Commands
data class CreateSynchronousMachineDetailedCommand(
    @TargetAggregateIdentifier var synchronousMachineDetailedId: UUID? = null,
    @Enumerated(EnumType.STRING) var ifdBaseType: IfdBaseKind
)

data class UpdateSynchronousMachineDetailedCommand(
    @TargetAggregateIdentifier var synchronousMachineDetailedId: UUID? = null,
    var efdBaseRatio: Simple_Float,
    @Enumerated(EnumType.STRING) var ifdBaseType: IfdBaseKind,
    var ifdBaseValue: CurrentFlow,
    var saturationFactor120QAxis: Simple_Float,
    var saturationFactorQAxis: Simple_Float
)

data class DeleteSynchronousMachineDetailedCommand(@TargetAggregateIdentifier  var synchronousMachineDetailedId: UUID? = null)

// single association commands
data class AssignEfdBaseRatioToSynchronousMachineDetailedCommand(@TargetAggregateIdentifier  val synchronousMachineDetailedId: UUID, val assignment: Simple_Float )
data class UnAssignEfdBaseRatioFromSynchronousMachineDetailedCommand(@TargetAggregateIdentifier  val synchronousMachineDetailedId: UUID )
data class AssignIfdBaseValueToSynchronousMachineDetailedCommand(@TargetAggregateIdentifier  val synchronousMachineDetailedId: UUID, val assignment: CurrentFlow )
data class UnAssignIfdBaseValueFromSynchronousMachineDetailedCommand(@TargetAggregateIdentifier  val synchronousMachineDetailedId: UUID )
data class AssignSaturationFactor120QAxisToSynchronousMachineDetailedCommand(@TargetAggregateIdentifier  val synchronousMachineDetailedId: UUID, val assignment: Simple_Float )
data class UnAssignSaturationFactor120QAxisFromSynchronousMachineDetailedCommand(@TargetAggregateIdentifier  val synchronousMachineDetailedId: UUID )
data class AssignSaturationFactorQAxisToSynchronousMachineDetailedCommand(@TargetAggregateIdentifier  val synchronousMachineDetailedId: UUID, val assignment: Simple_Float )
data class UnAssignSaturationFactorQAxisFromSynchronousMachineDetailedCommand(@TargetAggregateIdentifier  val synchronousMachineDetailedId: UUID )

// multiple association commands


// SynchronousMachineDynamics Commands
data class CreateSynchronousMachineDynamicsCommand(
    @TargetAggregateIdentifier  var synchronousMachineDynamicsId: UUID? = null
)

data class UpdateSynchronousMachineDynamicsCommand(
    @TargetAggregateIdentifier  var synchronousMachineDynamicsId: UUID? = null
)

data class DeleteSynchronousMachineDynamicsCommand(@TargetAggregateIdentifier  var synchronousMachineDynamicsId: UUID? = null)

// single association commands

// multiple association commands


// SynchronousMachineEquivalentCircuit Commands
data class CreateSynchronousMachineEquivalentCircuitCommand(
    @TargetAggregateIdentifier  var synchronousMachineEquivalentCircuitId: UUID? = null
)

data class UpdateSynchronousMachineEquivalentCircuitCommand(
    @TargetAggregateIdentifier var synchronousMachineEquivalentCircuitId: UUID? = null,
    var r1d: PU,
    var r1q: PU,
    var r2q: PU,
    var rfd: PU,
    var x1d: PU,
    var x1q: PU,
    var x2q: PU,
    var xad: PU,
    var xaq: PU,
    var xf1d: PU,
    var xfd: PU
)

data class DeleteSynchronousMachineEquivalentCircuitCommand(@TargetAggregateIdentifier  var synchronousMachineEquivalentCircuitId: UUID? = null)

// single association commands
data class AssignR1dToSynchronousMachineEquivalentCircuitCommand(@TargetAggregateIdentifier  val synchronousMachineEquivalentCircuitId: UUID, val assignment: PU )
data class UnAssignR1dFromSynchronousMachineEquivalentCircuitCommand(@TargetAggregateIdentifier  val synchronousMachineEquivalentCircuitId: UUID )
data class AssignR1qToSynchronousMachineEquivalentCircuitCommand(@TargetAggregateIdentifier  val synchronousMachineEquivalentCircuitId: UUID, val assignment: PU )
data class UnAssignR1qFromSynchronousMachineEquivalentCircuitCommand(@TargetAggregateIdentifier  val synchronousMachineEquivalentCircuitId: UUID )
data class AssignR2qToSynchronousMachineEquivalentCircuitCommand(@TargetAggregateIdentifier  val synchronousMachineEquivalentCircuitId: UUID, val assignment: PU )
data class UnAssignR2qFromSynchronousMachineEquivalentCircuitCommand(@TargetAggregateIdentifier  val synchronousMachineEquivalentCircuitId: UUID )
data class AssignRfdToSynchronousMachineEquivalentCircuitCommand(@TargetAggregateIdentifier  val synchronousMachineEquivalentCircuitId: UUID, val assignment: PU )
data class UnAssignRfdFromSynchronousMachineEquivalentCircuitCommand(@TargetAggregateIdentifier  val synchronousMachineEquivalentCircuitId: UUID )
data class AssignX1dToSynchronousMachineEquivalentCircuitCommand(@TargetAggregateIdentifier  val synchronousMachineEquivalentCircuitId: UUID, val assignment: PU )
data class UnAssignX1dFromSynchronousMachineEquivalentCircuitCommand(@TargetAggregateIdentifier  val synchronousMachineEquivalentCircuitId: UUID )
data class AssignX1qToSynchronousMachineEquivalentCircuitCommand(@TargetAggregateIdentifier  val synchronousMachineEquivalentCircuitId: UUID, val assignment: PU )
data class UnAssignX1qFromSynchronousMachineEquivalentCircuitCommand(@TargetAggregateIdentifier  val synchronousMachineEquivalentCircuitId: UUID )
data class AssignX2qToSynchronousMachineEquivalentCircuitCommand(@TargetAggregateIdentifier  val synchronousMachineEquivalentCircuitId: UUID, val assignment: PU )
data class UnAssignX2qFromSynchronousMachineEquivalentCircuitCommand(@TargetAggregateIdentifier  val synchronousMachineEquivalentCircuitId: UUID )
data class AssignXadToSynchronousMachineEquivalentCircuitCommand(@TargetAggregateIdentifier  val synchronousMachineEquivalentCircuitId: UUID, val assignment: PU )
data class UnAssignXadFromSynchronousMachineEquivalentCircuitCommand(@TargetAggregateIdentifier  val synchronousMachineEquivalentCircuitId: UUID )
data class AssignXaqToSynchronousMachineEquivalentCircuitCommand(@TargetAggregateIdentifier  val synchronousMachineEquivalentCircuitId: UUID, val assignment: PU )
data class UnAssignXaqFromSynchronousMachineEquivalentCircuitCommand(@TargetAggregateIdentifier  val synchronousMachineEquivalentCircuitId: UUID )
data class AssignXf1dToSynchronousMachineEquivalentCircuitCommand(@TargetAggregateIdentifier  val synchronousMachineEquivalentCircuitId: UUID, val assignment: PU )
data class UnAssignXf1dFromSynchronousMachineEquivalentCircuitCommand(@TargetAggregateIdentifier  val synchronousMachineEquivalentCircuitId: UUID )
data class AssignXfdToSynchronousMachineEquivalentCircuitCommand(@TargetAggregateIdentifier  val synchronousMachineEquivalentCircuitId: UUID, val assignment: PU )
data class UnAssignXfdFromSynchronousMachineEquivalentCircuitCommand(@TargetAggregateIdentifier  val synchronousMachineEquivalentCircuitId: UUID )

// multiple association commands


// SynchronousMachineSimplified Commands
data class CreateSynchronousMachineSimplifiedCommand(
    @TargetAggregateIdentifier  var synchronousMachineSimplifiedId: UUID? = null
)

data class UpdateSynchronousMachineSimplifiedCommand(
    @TargetAggregateIdentifier  var synchronousMachineSimplifiedId: UUID? = null
)

data class DeleteSynchronousMachineSimplifiedCommand(@TargetAggregateIdentifier  var synchronousMachineSimplifiedId: UUID? = null)

// single association commands

// multiple association commands


// SynchronousMachineTimeConstantReactance Commands
data class CreateSynchronousMachineTimeConstantReactanceCommand(
    @TargetAggregateIdentifier var synchronousMachineTimeConstantReactanceId: UUID? = null,
    @Enumerated(EnumType.STRING) var modelType: SynchronousMachineModelKind,
    @Enumerated(EnumType.STRING) var rotorType: RotorKind
)

data class UpdateSynchronousMachineTimeConstantReactanceCommand(
    @TargetAggregateIdentifier var synchronousMachineTimeConstantReactanceId: UUID? = null,
    var ks: Simple_Float,
    @Enumerated(EnumType.STRING) var modelType: SynchronousMachineModelKind,
    @Enumerated(EnumType.STRING) var rotorType: RotorKind,
    var tc: Seconds,
    var tpdo: Seconds,
    var tppdo: Seconds,
    var tppqo: Seconds,
    var tpqo: Seconds,
    var xDirectSubtrans: PU,
    var xDirectSync: PU,
    var xDirectTrans: PU,
    var xQuadSubtrans: PU,
    var xQuadSync: PU,
    var xQuadTrans: PU
)

data class DeleteSynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  var synchronousMachineTimeConstantReactanceId: UUID? = null)

// single association commands
data class AssignKsToSynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  val synchronousMachineTimeConstantReactanceId: UUID, val assignment: Simple_Float )
data class UnAssignKsFromSynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  val synchronousMachineTimeConstantReactanceId: UUID )
data class AssignTcToSynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  val synchronousMachineTimeConstantReactanceId: UUID, val assignment: Seconds )
data class UnAssignTcFromSynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  val synchronousMachineTimeConstantReactanceId: UUID )
data class AssignTpdoToSynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  val synchronousMachineTimeConstantReactanceId: UUID, val assignment: Seconds )
data class UnAssignTpdoFromSynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  val synchronousMachineTimeConstantReactanceId: UUID )
data class AssignTppdoToSynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  val synchronousMachineTimeConstantReactanceId: UUID, val assignment: Seconds )
data class UnAssignTppdoFromSynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  val synchronousMachineTimeConstantReactanceId: UUID )
data class AssignTppqoToSynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  val synchronousMachineTimeConstantReactanceId: UUID, val assignment: Seconds )
data class UnAssignTppqoFromSynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  val synchronousMachineTimeConstantReactanceId: UUID )
data class AssignTpqoToSynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  val synchronousMachineTimeConstantReactanceId: UUID, val assignment: Seconds )
data class UnAssignTpqoFromSynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  val synchronousMachineTimeConstantReactanceId: UUID )
data class AssignXDirectSubtransToSynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  val synchronousMachineTimeConstantReactanceId: UUID, val assignment: PU )
data class UnAssignXDirectSubtransFromSynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  val synchronousMachineTimeConstantReactanceId: UUID )
data class AssignXDirectSyncToSynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  val synchronousMachineTimeConstantReactanceId: UUID, val assignment: PU )
data class UnAssignXDirectSyncFromSynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  val synchronousMachineTimeConstantReactanceId: UUID )
data class AssignXDirectTransToSynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  val synchronousMachineTimeConstantReactanceId: UUID, val assignment: PU )
data class UnAssignXDirectTransFromSynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  val synchronousMachineTimeConstantReactanceId: UUID )
data class AssignXQuadSubtransToSynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  val synchronousMachineTimeConstantReactanceId: UUID, val assignment: PU )
data class UnAssignXQuadSubtransFromSynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  val synchronousMachineTimeConstantReactanceId: UUID )
data class AssignXQuadSyncToSynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  val synchronousMachineTimeConstantReactanceId: UUID, val assignment: PU )
data class UnAssignXQuadSyncFromSynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  val synchronousMachineTimeConstantReactanceId: UUID )
data class AssignXQuadTransToSynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  val synchronousMachineTimeConstantReactanceId: UUID, val assignment: PU )
data class UnAssignXQuadTransFromSynchronousMachineTimeConstantReactanceCommand(@TargetAggregateIdentifier  val synchronousMachineTimeConstantReactanceId: UUID )

// multiple association commands


// SynchronousMachineUserDefined Commands
data class CreateSynchronousMachineUserDefinedCommand(
    @TargetAggregateIdentifier  var synchronousMachineUserDefinedId: UUID? = null
)

data class UpdateSynchronousMachineUserDefinedCommand(
    @TargetAggregateIdentifier var synchronousMachineUserDefinedId: UUID? = null,
    var proprietary: BooleanProxy
)

data class DeleteSynchronousMachineUserDefinedCommand(@TargetAggregateIdentifier  var synchronousMachineUserDefinedId: UUID? = null)

// single association commands
data class AssignProprietaryToSynchronousMachineUserDefinedCommand(@TargetAggregateIdentifier  val synchronousMachineUserDefinedId: UUID, val assignment: BooleanProxy )
data class UnAssignProprietaryFromSynchronousMachineUserDefinedCommand(@TargetAggregateIdentifier  val synchronousMachineUserDefinedId: UUID )

// multiple association commands


// TapChanger Commands
data class CreateTapChangerCommand(
    @TargetAggregateIdentifier  var tapChangerId: UUID? = null
)

data class UpdateTapChangerCommand(
    @TargetAggregateIdentifier var tapChangerId: UUID? = null,
    var highStep: IntegerProxy,
    var lowStep: IntegerProxy,
    var ltcFlag: BooleanProxy,
    var neutralStep: IntegerProxy,
    var neutralU: Voltage,
    var normalStep: IntegerProxy
)

data class DeleteTapChangerCommand(@TargetAggregateIdentifier  var tapChangerId: UUID? = null)

// single association commands
data class AssignHighStepToTapChangerCommand(@TargetAggregateIdentifier  val tapChangerId: UUID, val assignment: IntegerProxy )
data class UnAssignHighStepFromTapChangerCommand(@TargetAggregateIdentifier  val tapChangerId: UUID )
data class AssignLowStepToTapChangerCommand(@TargetAggregateIdentifier  val tapChangerId: UUID, val assignment: IntegerProxy )
data class UnAssignLowStepFromTapChangerCommand(@TargetAggregateIdentifier  val tapChangerId: UUID )
data class AssignLtcFlagToTapChangerCommand(@TargetAggregateIdentifier  val tapChangerId: UUID, val assignment: BooleanProxy )
data class UnAssignLtcFlagFromTapChangerCommand(@TargetAggregateIdentifier  val tapChangerId: UUID )
data class AssignNeutralStepToTapChangerCommand(@TargetAggregateIdentifier  val tapChangerId: UUID, val assignment: IntegerProxy )
data class UnAssignNeutralStepFromTapChangerCommand(@TargetAggregateIdentifier  val tapChangerId: UUID )
data class AssignNeutralUToTapChangerCommand(@TargetAggregateIdentifier  val tapChangerId: UUID, val assignment: Voltage )
data class UnAssignNeutralUFromTapChangerCommand(@TargetAggregateIdentifier  val tapChangerId: UUID )
data class AssignNormalStepToTapChangerCommand(@TargetAggregateIdentifier  val tapChangerId: UUID, val assignment: IntegerProxy )
data class UnAssignNormalStepFromTapChangerCommand(@TargetAggregateIdentifier  val tapChangerId: UUID )

// multiple association commands


// TapChangerControl Commands
data class CreateTapChangerControlCommand(
    @TargetAggregateIdentifier  var tapChangerControlId: UUID? = null
)

data class UpdateTapChangerControlCommand(
    @TargetAggregateIdentifier  var tapChangerControlId: UUID? = null
)

data class DeleteTapChangerControlCommand(@TargetAggregateIdentifier  var tapChangerControlId: UUID? = null)

// single association commands

// multiple association commands


// TapChangerTablePoint Commands
data class CreateTapChangerTablePointCommand(
    @TargetAggregateIdentifier  var tapChangerTablePointId: UUID? = null
)

data class UpdateTapChangerTablePointCommand(
    @TargetAggregateIdentifier var tapChangerTablePointId: UUID? = null,
    var b: PerCent,
    var g: PerCent,
    var r: PerCent,
    var ratio: Simple_Float,
    var step: IntegerProxy,
    var x: PerCent
)

data class DeleteTapChangerTablePointCommand(@TargetAggregateIdentifier  var tapChangerTablePointId: UUID? = null)

// single association commands
data class AssignBToTapChangerTablePointCommand(@TargetAggregateIdentifier  val tapChangerTablePointId: UUID, val assignment: PerCent )
data class UnAssignBFromTapChangerTablePointCommand(@TargetAggregateIdentifier  val tapChangerTablePointId: UUID )
data class AssignGToTapChangerTablePointCommand(@TargetAggregateIdentifier  val tapChangerTablePointId: UUID, val assignment: PerCent )
data class UnAssignGFromTapChangerTablePointCommand(@TargetAggregateIdentifier  val tapChangerTablePointId: UUID )
data class AssignRToTapChangerTablePointCommand(@TargetAggregateIdentifier  val tapChangerTablePointId: UUID, val assignment: PerCent )
data class UnAssignRFromTapChangerTablePointCommand(@TargetAggregateIdentifier  val tapChangerTablePointId: UUID )
data class AssignRatioToTapChangerTablePointCommand(@TargetAggregateIdentifier  val tapChangerTablePointId: UUID, val assignment: Simple_Float )
data class UnAssignRatioFromTapChangerTablePointCommand(@TargetAggregateIdentifier  val tapChangerTablePointId: UUID )
data class AssignStepToTapChangerTablePointCommand(@TargetAggregateIdentifier  val tapChangerTablePointId: UUID, val assignment: IntegerProxy )
data class UnAssignStepFromTapChangerTablePointCommand(@TargetAggregateIdentifier  val tapChangerTablePointId: UUID )
data class AssignXToTapChangerTablePointCommand(@TargetAggregateIdentifier  val tapChangerTablePointId: UUID, val assignment: PerCent )
data class UnAssignXFromTapChangerTablePointCommand(@TargetAggregateIdentifier  val tapChangerTablePointId: UUID )

// multiple association commands


// TapSchedule Commands
data class CreateTapScheduleCommand(
    @TargetAggregateIdentifier  var tapScheduleId: UUID? = null
)

data class UpdateTapScheduleCommand(
    @TargetAggregateIdentifier  var tapScheduleId: UUID? = null
)

data class DeleteTapScheduleCommand(@TargetAggregateIdentifier  var tapScheduleId: UUID? = null)

// single association commands

// multiple association commands


// Temperature Commands
data class CreateTemperatureCommand(
    @TargetAggregateIdentifier var temperatureId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol
)

data class UpdateTemperatureCommand(
    @TargetAggregateIdentifier var temperatureId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol,
    var value: FloatProxy
)

data class DeleteTemperatureCommand(@TargetAggregateIdentifier  var temperatureId: UUID? = null)

// single association commands
data class AssignValueToTemperatureCommand(@TargetAggregateIdentifier  val temperatureId: UUID, val assignment: FloatProxy )
data class UnAssignValueFromTemperatureCommand(@TargetAggregateIdentifier  val temperatureId: UUID )

// multiple association commands


// Terminal Commands
data class CreateTerminalCommand(
    @TargetAggregateIdentifier  var terminalId: UUID? = null
)

data class UpdateTerminalCommand(
    @TargetAggregateIdentifier  var terminalId: UUID? = null
)

data class DeleteTerminalCommand(@TargetAggregateIdentifier  var terminalId: UUID? = null)

// single association commands

// multiple association commands


// TextDiagramObject Commands
data class CreateTextDiagramObjectCommand(
    @TargetAggregateIdentifier  var textDiagramObjectId: UUID? = null
)

data class UpdateTextDiagramObjectCommand(
    @TargetAggregateIdentifier var textDiagramObjectId: UUID? = null,
    var text: StringProxy
)

data class DeleteTextDiagramObjectCommand(@TargetAggregateIdentifier  var textDiagramObjectId: UUID? = null)

// single association commands
data class AssignTextToTextDiagramObjectCommand(@TargetAggregateIdentifier  val textDiagramObjectId: UUID, val assignment: StringProxy )
data class UnAssignTextFromTextDiagramObjectCommand(@TargetAggregateIdentifier  val textDiagramObjectId: UUID )

// multiple association commands


// ThermalGeneratingUnit Commands
data class CreateThermalGeneratingUnitCommand(
    @TargetAggregateIdentifier  var thermalGeneratingUnitId: UUID? = null
)

data class UpdateThermalGeneratingUnitCommand(
    @TargetAggregateIdentifier  var thermalGeneratingUnitId: UUID? = null
)

data class DeleteThermalGeneratingUnitCommand(@TargetAggregateIdentifier  var thermalGeneratingUnitId: UUID? = null)

// single association commands

// multiple association commands


// TieFlow Commands
data class CreateTieFlowCommand(
    @TargetAggregateIdentifier  var tieFlowId: UUID? = null
)

data class UpdateTieFlowCommand(
    @TargetAggregateIdentifier var tieFlowId: UUID? = null,
    var positiveFlowIn: BooleanProxy
)

data class DeleteTieFlowCommand(@TargetAggregateIdentifier  var tieFlowId: UUID? = null)

// single association commands
data class AssignPositiveFlowInToTieFlowCommand(@TargetAggregateIdentifier  val tieFlowId: UUID, val assignment: BooleanProxy )
data class UnAssignPositiveFlowInFromTieFlowCommand(@TargetAggregateIdentifier  val tieFlowId: UUID )

// multiple association commands


// TopologicalIsland Commands
data class CreateTopologicalIslandCommand(
    @TargetAggregateIdentifier  var topologicalIslandId: UUID? = null
)

data class UpdateTopologicalIslandCommand(
    @TargetAggregateIdentifier  var topologicalIslandId: UUID? = null
)

data class DeleteTopologicalIslandCommand(@TargetAggregateIdentifier  var topologicalIslandId: UUID? = null)

// single association commands

// multiple association commands


// TopologicalNode Commands
data class CreateTopologicalNodeCommand(
    @TargetAggregateIdentifier  var topologicalNodeId: UUID? = null
)

data class UpdateTopologicalNodeCommand(
    @TargetAggregateIdentifier var topologicalNodeId: UUID? = null,
    var boundaryPoint: BooleanProxy,
    var fromEndIsoCode: StringProxy,
    var fromEndName: StringProxy,
    var fromEndNameTso: StringProxy,
    var toEndIsoCode: StringProxy,
    var toEndName: StringProxy,
    var toEndNameTso: StringProxy
)

data class DeleteTopologicalNodeCommand(@TargetAggregateIdentifier  var topologicalNodeId: UUID? = null)

// single association commands
data class AssignBoundaryPointToTopologicalNodeCommand(@TargetAggregateIdentifier  val topologicalNodeId: UUID, val assignment: BooleanProxy )
data class UnAssignBoundaryPointFromTopologicalNodeCommand(@TargetAggregateIdentifier  val topologicalNodeId: UUID )
data class AssignFromEndIsoCodeToTopologicalNodeCommand(@TargetAggregateIdentifier  val topologicalNodeId: UUID, val assignment: StringProxy )
data class UnAssignFromEndIsoCodeFromTopologicalNodeCommand(@TargetAggregateIdentifier  val topologicalNodeId: UUID )
data class AssignFromEndNameToTopologicalNodeCommand(@TargetAggregateIdentifier  val topologicalNodeId: UUID, val assignment: StringProxy )
data class UnAssignFromEndNameFromTopologicalNodeCommand(@TargetAggregateIdentifier  val topologicalNodeId: UUID )
data class AssignFromEndNameTsoToTopologicalNodeCommand(@TargetAggregateIdentifier  val topologicalNodeId: UUID, val assignment: StringProxy )
data class UnAssignFromEndNameTsoFromTopologicalNodeCommand(@TargetAggregateIdentifier  val topologicalNodeId: UUID )
data class AssignToEndIsoCodeToTopologicalNodeCommand(@TargetAggregateIdentifier  val topologicalNodeId: UUID, val assignment: StringProxy )
data class UnAssignToEndIsoCodeFromTopologicalNodeCommand(@TargetAggregateIdentifier  val topologicalNodeId: UUID )
data class AssignToEndNameToTopologicalNodeCommand(@TargetAggregateIdentifier  val topologicalNodeId: UUID, val assignment: StringProxy )
data class UnAssignToEndNameFromTopologicalNodeCommand(@TargetAggregateIdentifier  val topologicalNodeId: UUID )
data class AssignToEndNameTsoToTopologicalNodeCommand(@TargetAggregateIdentifier  val topologicalNodeId: UUID, val assignment: StringProxy )
data class UnAssignToEndNameTsoFromTopologicalNodeCommand(@TargetAggregateIdentifier  val topologicalNodeId: UUID )

// multiple association commands


// TopologyBoundaryVersion Commands
data class CreateTopologyBoundaryVersionCommand(
    @TargetAggregateIdentifier  var topologyBoundaryVersionId: UUID? = null
)

data class UpdateTopologyBoundaryVersionCommand(
    @TargetAggregateIdentifier var topologyBoundaryVersionId: UUID? = null,
    var baseUML: StringProxy,
    var baseURI: StringProxy,
    var date: DateProxy,
    var differenceModelURI: StringProxy,
    var entsoeUML: StringProxy,
    var entsoeURI: StringProxy,
    var modelDescriptionURI: StringProxy,
    var namespaceRDF: StringProxy,
    var namespaceUML: StringProxy,
    var shortName: StringProxy
)

data class DeleteTopologyBoundaryVersionCommand(@TargetAggregateIdentifier  var topologyBoundaryVersionId: UUID? = null)

// single association commands
data class AssignBaseUMLToTopologyBoundaryVersionCommand(@TargetAggregateIdentifier  val topologyBoundaryVersionId: UUID, val assignment: StringProxy )
data class UnAssignBaseUMLFromTopologyBoundaryVersionCommand(@TargetAggregateIdentifier  val topologyBoundaryVersionId: UUID )
data class AssignBaseURIToTopologyBoundaryVersionCommand(@TargetAggregateIdentifier  val topologyBoundaryVersionId: UUID, val assignment: StringProxy )
data class UnAssignBaseURIFromTopologyBoundaryVersionCommand(@TargetAggregateIdentifier  val topologyBoundaryVersionId: UUID )
data class AssignDateToTopologyBoundaryVersionCommand(@TargetAggregateIdentifier  val topologyBoundaryVersionId: UUID, val assignment: DateProxy )
data class UnAssignDateFromTopologyBoundaryVersionCommand(@TargetAggregateIdentifier  val topologyBoundaryVersionId: UUID )
data class AssignDifferenceModelURIToTopologyBoundaryVersionCommand(@TargetAggregateIdentifier  val topologyBoundaryVersionId: UUID, val assignment: StringProxy )
data class UnAssignDifferenceModelURIFromTopologyBoundaryVersionCommand(@TargetAggregateIdentifier  val topologyBoundaryVersionId: UUID )
data class AssignEntsoeUMLToTopologyBoundaryVersionCommand(@TargetAggregateIdentifier  val topologyBoundaryVersionId: UUID, val assignment: StringProxy )
data class UnAssignEntsoeUMLFromTopologyBoundaryVersionCommand(@TargetAggregateIdentifier  val topologyBoundaryVersionId: UUID )
data class AssignEntsoeURIToTopologyBoundaryVersionCommand(@TargetAggregateIdentifier  val topologyBoundaryVersionId: UUID, val assignment: StringProxy )
data class UnAssignEntsoeURIFromTopologyBoundaryVersionCommand(@TargetAggregateIdentifier  val topologyBoundaryVersionId: UUID )
data class AssignModelDescriptionURIToTopologyBoundaryVersionCommand(@TargetAggregateIdentifier  val topologyBoundaryVersionId: UUID, val assignment: StringProxy )
data class UnAssignModelDescriptionURIFromTopologyBoundaryVersionCommand(@TargetAggregateIdentifier  val topologyBoundaryVersionId: UUID )
data class AssignNamespaceRDFToTopologyBoundaryVersionCommand(@TargetAggregateIdentifier  val topologyBoundaryVersionId: UUID, val assignment: StringProxy )
data class UnAssignNamespaceRDFFromTopologyBoundaryVersionCommand(@TargetAggregateIdentifier  val topologyBoundaryVersionId: UUID )
data class AssignNamespaceUMLToTopologyBoundaryVersionCommand(@TargetAggregateIdentifier  val topologyBoundaryVersionId: UUID, val assignment: StringProxy )
data class UnAssignNamespaceUMLFromTopologyBoundaryVersionCommand(@TargetAggregateIdentifier  val topologyBoundaryVersionId: UUID )
data class AssignShortNameToTopologyBoundaryVersionCommand(@TargetAggregateIdentifier  val topologyBoundaryVersionId: UUID, val assignment: StringProxy )
data class UnAssignShortNameFromTopologyBoundaryVersionCommand(@TargetAggregateIdentifier  val topologyBoundaryVersionId: UUID )

// multiple association commands


// TopologyVersion Commands
data class CreateTopologyVersionCommand(
    @TargetAggregateIdentifier  var topologyVersionId: UUID? = null
)

data class UpdateTopologyVersionCommand(
    @TargetAggregateIdentifier var topologyVersionId: UUID? = null,
    var baseUML: StringProxy,
    var baseURI: StringProxy,
    var date: DateProxy,
    var differenceModelURI: StringProxy,
    var entsoeUML: StringProxy,
    var entsoeURI: StringProxy,
    var modelDescriptionURI: StringProxy,
    var namespaceRDF: StringProxy,
    var namespaceUML: StringProxy,
    var shortName: StringProxy
)

data class DeleteTopologyVersionCommand(@TargetAggregateIdentifier  var topologyVersionId: UUID? = null)

// single association commands
data class AssignBaseUMLToTopologyVersionCommand(@TargetAggregateIdentifier  val topologyVersionId: UUID, val assignment: StringProxy )
data class UnAssignBaseUMLFromTopologyVersionCommand(@TargetAggregateIdentifier  val topologyVersionId: UUID )
data class AssignBaseURIToTopologyVersionCommand(@TargetAggregateIdentifier  val topologyVersionId: UUID, val assignment: StringProxy )
data class UnAssignBaseURIFromTopologyVersionCommand(@TargetAggregateIdentifier  val topologyVersionId: UUID )
data class AssignDateToTopologyVersionCommand(@TargetAggregateIdentifier  val topologyVersionId: UUID, val assignment: DateProxy )
data class UnAssignDateFromTopologyVersionCommand(@TargetAggregateIdentifier  val topologyVersionId: UUID )
data class AssignDifferenceModelURIToTopologyVersionCommand(@TargetAggregateIdentifier  val topologyVersionId: UUID, val assignment: StringProxy )
data class UnAssignDifferenceModelURIFromTopologyVersionCommand(@TargetAggregateIdentifier  val topologyVersionId: UUID )
data class AssignEntsoeUMLToTopologyVersionCommand(@TargetAggregateIdentifier  val topologyVersionId: UUID, val assignment: StringProxy )
data class UnAssignEntsoeUMLFromTopologyVersionCommand(@TargetAggregateIdentifier  val topologyVersionId: UUID )
data class AssignEntsoeURIToTopologyVersionCommand(@TargetAggregateIdentifier  val topologyVersionId: UUID, val assignment: StringProxy )
data class UnAssignEntsoeURIFromTopologyVersionCommand(@TargetAggregateIdentifier  val topologyVersionId: UUID )
data class AssignModelDescriptionURIToTopologyVersionCommand(@TargetAggregateIdentifier  val topologyVersionId: UUID, val assignment: StringProxy )
data class UnAssignModelDescriptionURIFromTopologyVersionCommand(@TargetAggregateIdentifier  val topologyVersionId: UUID )
data class AssignNamespaceRDFToTopologyVersionCommand(@TargetAggregateIdentifier  val topologyVersionId: UUID, val assignment: StringProxy )
data class UnAssignNamespaceRDFFromTopologyVersionCommand(@TargetAggregateIdentifier  val topologyVersionId: UUID )
data class AssignNamespaceUMLToTopologyVersionCommand(@TargetAggregateIdentifier  val topologyVersionId: UUID, val assignment: StringProxy )
data class UnAssignNamespaceUMLFromTopologyVersionCommand(@TargetAggregateIdentifier  val topologyVersionId: UUID )
data class AssignShortNameToTopologyVersionCommand(@TargetAggregateIdentifier  val topologyVersionId: UUID, val assignment: StringProxy )
data class UnAssignShortNameFromTopologyVersionCommand(@TargetAggregateIdentifier  val topologyVersionId: UUID )

// multiple association commands


// TransformerEnd Commands
data class CreateTransformerEndCommand(
    @TargetAggregateIdentifier  var transformerEndId: UUID? = null
)

data class UpdateTransformerEndCommand(
    @TargetAggregateIdentifier var transformerEndId: UUID? = null,
    var endNumber: IntegerProxy,
    var grounded: BooleanProxy,
    var rground: Resistance,
    var xground: Reactance
)

data class DeleteTransformerEndCommand(@TargetAggregateIdentifier  var transformerEndId: UUID? = null)

// single association commands
data class AssignEndNumberToTransformerEndCommand(@TargetAggregateIdentifier  val transformerEndId: UUID, val assignment: IntegerProxy )
data class UnAssignEndNumberFromTransformerEndCommand(@TargetAggregateIdentifier  val transformerEndId: UUID )
data class AssignGroundedToTransformerEndCommand(@TargetAggregateIdentifier  val transformerEndId: UUID, val assignment: BooleanProxy )
data class UnAssignGroundedFromTransformerEndCommand(@TargetAggregateIdentifier  val transformerEndId: UUID )
data class AssignRgroundToTransformerEndCommand(@TargetAggregateIdentifier  val transformerEndId: UUID, val assignment: Resistance )
data class UnAssignRgroundFromTransformerEndCommand(@TargetAggregateIdentifier  val transformerEndId: UUID )
data class AssignXgroundToTransformerEndCommand(@TargetAggregateIdentifier  val transformerEndId: UUID, val assignment: Reactance )
data class UnAssignXgroundFromTransformerEndCommand(@TargetAggregateIdentifier  val transformerEndId: UUID )

// multiple association commands


// TurbLCFB1 Commands
data class CreateTurbLCFB1Command(
    @TargetAggregateIdentifier  var turbLCFB1Id: UUID? = null
)

data class UpdateTurbLCFB1Command(
    @TargetAggregateIdentifier var turbLCFB1Id: UUID? = null,
    var db: PU,
    var emax: PU,
    var fb: PU,
    var fbf: BooleanProxy,
    var irmax: PU,
    var ki: PU,
    var kp: PU,
    var mwbase: ActivePower,
    var pbf: BooleanProxy,
    var pmwset: ActivePower,
    var speedReferenceGovernor: BooleanProxy,
    var tpelec: Seconds
)

data class DeleteTurbLCFB1Command(@TargetAggregateIdentifier  var turbLCFB1Id: UUID? = null)

// single association commands
data class AssignDbToTurbLCFB1Command(@TargetAggregateIdentifier  val turbLCFB1Id: UUID, val assignment: PU )
data class UnAssignDbFromTurbLCFB1Command(@TargetAggregateIdentifier  val turbLCFB1Id: UUID )
data class AssignEmaxToTurbLCFB1Command(@TargetAggregateIdentifier  val turbLCFB1Id: UUID, val assignment: PU )
data class UnAssignEmaxFromTurbLCFB1Command(@TargetAggregateIdentifier  val turbLCFB1Id: UUID )
data class AssignFbToTurbLCFB1Command(@TargetAggregateIdentifier  val turbLCFB1Id: UUID, val assignment: PU )
data class UnAssignFbFromTurbLCFB1Command(@TargetAggregateIdentifier  val turbLCFB1Id: UUID )
data class AssignFbfToTurbLCFB1Command(@TargetAggregateIdentifier  val turbLCFB1Id: UUID, val assignment: BooleanProxy )
data class UnAssignFbfFromTurbLCFB1Command(@TargetAggregateIdentifier  val turbLCFB1Id: UUID )
data class AssignIrmaxToTurbLCFB1Command(@TargetAggregateIdentifier  val turbLCFB1Id: UUID, val assignment: PU )
data class UnAssignIrmaxFromTurbLCFB1Command(@TargetAggregateIdentifier  val turbLCFB1Id: UUID )
data class AssignKiToTurbLCFB1Command(@TargetAggregateIdentifier  val turbLCFB1Id: UUID, val assignment: PU )
data class UnAssignKiFromTurbLCFB1Command(@TargetAggregateIdentifier  val turbLCFB1Id: UUID )
data class AssignKpToTurbLCFB1Command(@TargetAggregateIdentifier  val turbLCFB1Id: UUID, val assignment: PU )
data class UnAssignKpFromTurbLCFB1Command(@TargetAggregateIdentifier  val turbLCFB1Id: UUID )
data class AssignMwbaseToTurbLCFB1Command(@TargetAggregateIdentifier  val turbLCFB1Id: UUID, val assignment: ActivePower )
data class UnAssignMwbaseFromTurbLCFB1Command(@TargetAggregateIdentifier  val turbLCFB1Id: UUID )
data class AssignPbfToTurbLCFB1Command(@TargetAggregateIdentifier  val turbLCFB1Id: UUID, val assignment: BooleanProxy )
data class UnAssignPbfFromTurbLCFB1Command(@TargetAggregateIdentifier  val turbLCFB1Id: UUID )
data class AssignPmwsetToTurbLCFB1Command(@TargetAggregateIdentifier  val turbLCFB1Id: UUID, val assignment: ActivePower )
data class UnAssignPmwsetFromTurbLCFB1Command(@TargetAggregateIdentifier  val turbLCFB1Id: UUID )
data class AssignSpeedReferenceGovernorToTurbLCFB1Command(@TargetAggregateIdentifier  val turbLCFB1Id: UUID, val assignment: BooleanProxy )
data class UnAssignSpeedReferenceGovernorFromTurbLCFB1Command(@TargetAggregateIdentifier  val turbLCFB1Id: UUID )
data class AssignTpelecToTurbLCFB1Command(@TargetAggregateIdentifier  val turbLCFB1Id: UUID, val assignment: Seconds )
data class UnAssignTpelecFromTurbLCFB1Command(@TargetAggregateIdentifier  val turbLCFB1Id: UUID )

// multiple association commands


// TurbineGovernorDynamics Commands
data class CreateTurbineGovernorDynamicsCommand(
    @TargetAggregateIdentifier  var turbineGovernorDynamicsId: UUID? = null
)

data class UpdateTurbineGovernorDynamicsCommand(
    @TargetAggregateIdentifier  var turbineGovernorDynamicsId: UUID? = null
)

data class DeleteTurbineGovernorDynamicsCommand(@TargetAggregateIdentifier  var turbineGovernorDynamicsId: UUID? = null)

// single association commands

// multiple association commands


// TurbineGovernorUserDefined Commands
data class CreateTurbineGovernorUserDefinedCommand(
    @TargetAggregateIdentifier  var turbineGovernorUserDefinedId: UUID? = null
)

data class UpdateTurbineGovernorUserDefinedCommand(
    @TargetAggregateIdentifier var turbineGovernorUserDefinedId: UUID? = null,
    var proprietary: BooleanProxy
)

data class DeleteTurbineGovernorUserDefinedCommand(@TargetAggregateIdentifier  var turbineGovernorUserDefinedId: UUID? = null)

// single association commands
data class AssignProprietaryToTurbineGovernorUserDefinedCommand(@TargetAggregateIdentifier  val turbineGovernorUserDefinedId: UUID, val assignment: BooleanProxy )
data class UnAssignProprietaryFromTurbineGovernorUserDefinedCommand(@TargetAggregateIdentifier  val turbineGovernorUserDefinedId: UUID )

// multiple association commands


// TurbineLoadControllerDynamics Commands
data class CreateTurbineLoadControllerDynamicsCommand(
    @TargetAggregateIdentifier  var turbineLoadControllerDynamicsId: UUID? = null
)

data class UpdateTurbineLoadControllerDynamicsCommand(
    @TargetAggregateIdentifier  var turbineLoadControllerDynamicsId: UUID? = null
)

data class DeleteTurbineLoadControllerDynamicsCommand(@TargetAggregateIdentifier  var turbineLoadControllerDynamicsId: UUID? = null)

// single association commands

// multiple association commands


// TurbineLoadControllerUserDefined Commands
data class CreateTurbineLoadControllerUserDefinedCommand(
    @TargetAggregateIdentifier  var turbineLoadControllerUserDefinedId: UUID? = null
)

data class UpdateTurbineLoadControllerUserDefinedCommand(
    @TargetAggregateIdentifier var turbineLoadControllerUserDefinedId: UUID? = null,
    var proprietary: BooleanProxy
)

data class DeleteTurbineLoadControllerUserDefinedCommand(@TargetAggregateIdentifier  var turbineLoadControllerUserDefinedId: UUID? = null)

// single association commands
data class AssignProprietaryToTurbineLoadControllerUserDefinedCommand(@TargetAggregateIdentifier  val turbineLoadControllerUserDefinedId: UUID, val assignment: BooleanProxy )
data class UnAssignProprietaryFromTurbineLoadControllerUserDefinedCommand(@TargetAggregateIdentifier  val turbineLoadControllerUserDefinedId: UUID )

// multiple association commands


// UnderexcLim2Simplified Commands
data class CreateUnderexcLim2SimplifiedCommand(
    @TargetAggregateIdentifier  var underexcLim2SimplifiedId: UUID? = null
)

data class UpdateUnderexcLim2SimplifiedCommand(
    @TargetAggregateIdentifier var underexcLim2SimplifiedId: UUID? = null,
    var kui: PU,
    var p0: PU,
    var p1: PU,
    var q0: PU,
    var q1: PU,
    var vuimax: PU,
    var vuimin: PU
)

data class DeleteUnderexcLim2SimplifiedCommand(@TargetAggregateIdentifier  var underexcLim2SimplifiedId: UUID? = null)

// single association commands
data class AssignKuiToUnderexcLim2SimplifiedCommand(@TargetAggregateIdentifier  val underexcLim2SimplifiedId: UUID, val assignment: PU )
data class UnAssignKuiFromUnderexcLim2SimplifiedCommand(@TargetAggregateIdentifier  val underexcLim2SimplifiedId: UUID )
data class AssignP0ToUnderexcLim2SimplifiedCommand(@TargetAggregateIdentifier  val underexcLim2SimplifiedId: UUID, val assignment: PU )
data class UnAssignP0FromUnderexcLim2SimplifiedCommand(@TargetAggregateIdentifier  val underexcLim2SimplifiedId: UUID )
data class AssignP1ToUnderexcLim2SimplifiedCommand(@TargetAggregateIdentifier  val underexcLim2SimplifiedId: UUID, val assignment: PU )
data class UnAssignP1FromUnderexcLim2SimplifiedCommand(@TargetAggregateIdentifier  val underexcLim2SimplifiedId: UUID )
data class AssignQ0ToUnderexcLim2SimplifiedCommand(@TargetAggregateIdentifier  val underexcLim2SimplifiedId: UUID, val assignment: PU )
data class UnAssignQ0FromUnderexcLim2SimplifiedCommand(@TargetAggregateIdentifier  val underexcLim2SimplifiedId: UUID )
data class AssignQ1ToUnderexcLim2SimplifiedCommand(@TargetAggregateIdentifier  val underexcLim2SimplifiedId: UUID, val assignment: PU )
data class UnAssignQ1FromUnderexcLim2SimplifiedCommand(@TargetAggregateIdentifier  val underexcLim2SimplifiedId: UUID )
data class AssignVuimaxToUnderexcLim2SimplifiedCommand(@TargetAggregateIdentifier  val underexcLim2SimplifiedId: UUID, val assignment: PU )
data class UnAssignVuimaxFromUnderexcLim2SimplifiedCommand(@TargetAggregateIdentifier  val underexcLim2SimplifiedId: UUID )
data class AssignVuiminToUnderexcLim2SimplifiedCommand(@TargetAggregateIdentifier  val underexcLim2SimplifiedId: UUID, val assignment: PU )
data class UnAssignVuiminFromUnderexcLim2SimplifiedCommand(@TargetAggregateIdentifier  val underexcLim2SimplifiedId: UUID )

// multiple association commands


// UnderexcLimIEEE1 Commands
data class CreateUnderexcLimIEEE1Command(
    @TargetAggregateIdentifier  var underexcLimIEEE1Id: UUID? = null
)

data class UpdateUnderexcLimIEEE1Command(
    @TargetAggregateIdentifier var underexcLimIEEE1Id: UUID? = null,
    var kuc: PU,
    var kuf: PU,
    var kui: PU,
    var kul: PU,
    var kur: PU,
    var tu1: Seconds,
    var tu2: Seconds,
    var tu3: Seconds,
    var tu4: Seconds,
    var vucmax: PU,
    var vuimax: PU,
    var vuimin: PU,
    var vulmax: PU,
    var vulmin: PU,
    var vurmax: PU
)

data class DeleteUnderexcLimIEEE1Command(@TargetAggregateIdentifier  var underexcLimIEEE1Id: UUID? = null)

// single association commands
data class AssignKucToUnderexcLimIEEE1Command(@TargetAggregateIdentifier  val underexcLimIEEE1Id: UUID, val assignment: PU )
data class UnAssignKucFromUnderexcLimIEEE1Command(@TargetAggregateIdentifier  val underexcLimIEEE1Id: UUID )
data class AssignKufToUnderexcLimIEEE1Command(@TargetAggregateIdentifier  val underexcLimIEEE1Id: UUID, val assignment: PU )
data class UnAssignKufFromUnderexcLimIEEE1Command(@TargetAggregateIdentifier  val underexcLimIEEE1Id: UUID )
data class AssignKuiToUnderexcLimIEEE1Command(@TargetAggregateIdentifier  val underexcLimIEEE1Id: UUID, val assignment: PU )
data class UnAssignKuiFromUnderexcLimIEEE1Command(@TargetAggregateIdentifier  val underexcLimIEEE1Id: UUID )
data class AssignKulToUnderexcLimIEEE1Command(@TargetAggregateIdentifier  val underexcLimIEEE1Id: UUID, val assignment: PU )
data class UnAssignKulFromUnderexcLimIEEE1Command(@TargetAggregateIdentifier  val underexcLimIEEE1Id: UUID )
data class AssignKurToUnderexcLimIEEE1Command(@TargetAggregateIdentifier  val underexcLimIEEE1Id: UUID, val assignment: PU )
data class UnAssignKurFromUnderexcLimIEEE1Command(@TargetAggregateIdentifier  val underexcLimIEEE1Id: UUID )
data class AssignTu1ToUnderexcLimIEEE1Command(@TargetAggregateIdentifier  val underexcLimIEEE1Id: UUID, val assignment: Seconds )
data class UnAssignTu1FromUnderexcLimIEEE1Command(@TargetAggregateIdentifier  val underexcLimIEEE1Id: UUID )
data class AssignTu2ToUnderexcLimIEEE1Command(@TargetAggregateIdentifier  val underexcLimIEEE1Id: UUID, val assignment: Seconds )
data class UnAssignTu2FromUnderexcLimIEEE1Command(@TargetAggregateIdentifier  val underexcLimIEEE1Id: UUID )
data class AssignTu3ToUnderexcLimIEEE1Command(@TargetAggregateIdentifier  val underexcLimIEEE1Id: UUID, val assignment: Seconds )
data class UnAssignTu3FromUnderexcLimIEEE1Command(@TargetAggregateIdentifier  val underexcLimIEEE1Id: UUID )
data class AssignTu4ToUnderexcLimIEEE1Command(@TargetAggregateIdentifier  val underexcLimIEEE1Id: UUID, val assignment: Seconds )
data class UnAssignTu4FromUnderexcLimIEEE1Command(@TargetAggregateIdentifier  val underexcLimIEEE1Id: UUID )
data class AssignVucmaxToUnderexcLimIEEE1Command(@TargetAggregateIdentifier  val underexcLimIEEE1Id: UUID, val assignment: PU )
data class UnAssignVucmaxFromUnderexcLimIEEE1Command(@TargetAggregateIdentifier  val underexcLimIEEE1Id: UUID )
data class AssignVuimaxToUnderexcLimIEEE1Command(@TargetAggregateIdentifier  val underexcLimIEEE1Id: UUID, val assignment: PU )
data class UnAssignVuimaxFromUnderexcLimIEEE1Command(@TargetAggregateIdentifier  val underexcLimIEEE1Id: UUID )
data class AssignVuiminToUnderexcLimIEEE1Command(@TargetAggregateIdentifier  val underexcLimIEEE1Id: UUID, val assignment: PU )
data class UnAssignVuiminFromUnderexcLimIEEE1Command(@TargetAggregateIdentifier  val underexcLimIEEE1Id: UUID )
data class AssignVulmaxToUnderexcLimIEEE1Command(@TargetAggregateIdentifier  val underexcLimIEEE1Id: UUID, val assignment: PU )
data class UnAssignVulmaxFromUnderexcLimIEEE1Command(@TargetAggregateIdentifier  val underexcLimIEEE1Id: UUID )
data class AssignVulminToUnderexcLimIEEE1Command(@TargetAggregateIdentifier  val underexcLimIEEE1Id: UUID, val assignment: PU )
data class UnAssignVulminFromUnderexcLimIEEE1Command(@TargetAggregateIdentifier  val underexcLimIEEE1Id: UUID )
data class AssignVurmaxToUnderexcLimIEEE1Command(@TargetAggregateIdentifier  val underexcLimIEEE1Id: UUID, val assignment: PU )
data class UnAssignVurmaxFromUnderexcLimIEEE1Command(@TargetAggregateIdentifier  val underexcLimIEEE1Id: UUID )

// multiple association commands


// UnderexcLimIEEE2 Commands
data class CreateUnderexcLimIEEE2Command(
    @TargetAggregateIdentifier  var underexcLimIEEE2Id: UUID? = null
)

data class UpdateUnderexcLimIEEE2Command(
    @TargetAggregateIdentifier var underexcLimIEEE2Id: UUID? = null,
    var k1: Simple_Float,
    var k2: Simple_Float,
    var kfb: PU,
    var kuf: PU,
    var kui: PU,
    var kul: PU,
    var p0: PU,
    var p1: PU,
    var p10: PU,
    var p2: PU,
    var p3: PU,
    var p4: PU,
    var p5: PU,
    var p6: PU,
    var p7: PU,
    var p8: PU,
    var p9: PU,
    var q0: PU,
    var q1: PU,
    var q10: PU,
    var q2: PU,
    var q3: PU,
    var q4: PU,
    var q5: PU,
    var q6: PU,
    var q7: PU,
    var q8: PU,
    var q9: PU,
    var tu1: Seconds,
    var tu2: Seconds,
    var tu3: Seconds,
    var tu4: Seconds,
    var tul: Seconds,
    var tup: Seconds,
    var tuq: Seconds,
    var tuv: Seconds,
    var vuimax: PU,
    var vuimin: PU,
    var vulmax: PU,
    var vulmin: PU
)

data class DeleteUnderexcLimIEEE2Command(@TargetAggregateIdentifier  var underexcLimIEEE2Id: UUID? = null)

// single association commands
data class AssignK1ToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: Simple_Float )
data class UnAssignK1FromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignK2ToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: Simple_Float )
data class UnAssignK2FromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignKfbToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: PU )
data class UnAssignKfbFromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignKufToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: PU )
data class UnAssignKufFromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignKuiToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: PU )
data class UnAssignKuiFromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignKulToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: PU )
data class UnAssignKulFromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignP0ToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: PU )
data class UnAssignP0FromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignP1ToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: PU )
data class UnAssignP1FromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignP10ToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: PU )
data class UnAssignP10FromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignP2ToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: PU )
data class UnAssignP2FromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignP3ToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: PU )
data class UnAssignP3FromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignP4ToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: PU )
data class UnAssignP4FromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignP5ToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: PU )
data class UnAssignP5FromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignP6ToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: PU )
data class UnAssignP6FromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignP7ToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: PU )
data class UnAssignP7FromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignP8ToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: PU )
data class UnAssignP8FromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignP9ToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: PU )
data class UnAssignP9FromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignQ0ToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: PU )
data class UnAssignQ0FromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignQ1ToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: PU )
data class UnAssignQ1FromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignQ10ToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: PU )
data class UnAssignQ10FromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignQ2ToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: PU )
data class UnAssignQ2FromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignQ3ToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: PU )
data class UnAssignQ3FromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignQ4ToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: PU )
data class UnAssignQ4FromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignQ5ToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: PU )
data class UnAssignQ5FromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignQ6ToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: PU )
data class UnAssignQ6FromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignQ7ToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: PU )
data class UnAssignQ7FromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignQ8ToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: PU )
data class UnAssignQ8FromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignQ9ToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: PU )
data class UnAssignQ9FromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignTu1ToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: Seconds )
data class UnAssignTu1FromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignTu2ToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: Seconds )
data class UnAssignTu2FromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignTu3ToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: Seconds )
data class UnAssignTu3FromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignTu4ToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: Seconds )
data class UnAssignTu4FromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignTulToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: Seconds )
data class UnAssignTulFromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignTupToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: Seconds )
data class UnAssignTupFromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignTuqToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: Seconds )
data class UnAssignTuqFromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignTuvToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: Seconds )
data class UnAssignTuvFromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignVuimaxToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: PU )
data class UnAssignVuimaxFromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignVuiminToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: PU )
data class UnAssignVuiminFromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignVulmaxToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: PU )
data class UnAssignVulmaxFromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )
data class AssignVulminToUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID, val assignment: PU )
data class UnAssignVulminFromUnderexcLimIEEE2Command(@TargetAggregateIdentifier  val underexcLimIEEE2Id: UUID )

// multiple association commands


// UnderexcLimX1 Commands
data class CreateUnderexcLimX1Command(
    @TargetAggregateIdentifier  var underexcLimX1Id: UUID? = null
)

data class UpdateUnderexcLimX1Command(
    @TargetAggregateIdentifier var underexcLimX1Id: UUID? = null,
    var k: PU,
    var kf2: PU,
    var km: PU,
    var melmax: PU,
    var tf2: Seconds,
    var tm: Seconds
)

data class DeleteUnderexcLimX1Command(@TargetAggregateIdentifier  var underexcLimX1Id: UUID? = null)

// single association commands
data class AssignKToUnderexcLimX1Command(@TargetAggregateIdentifier  val underexcLimX1Id: UUID, val assignment: PU )
data class UnAssignKFromUnderexcLimX1Command(@TargetAggregateIdentifier  val underexcLimX1Id: UUID )
data class AssignKf2ToUnderexcLimX1Command(@TargetAggregateIdentifier  val underexcLimX1Id: UUID, val assignment: PU )
data class UnAssignKf2FromUnderexcLimX1Command(@TargetAggregateIdentifier  val underexcLimX1Id: UUID )
data class AssignKmToUnderexcLimX1Command(@TargetAggregateIdentifier  val underexcLimX1Id: UUID, val assignment: PU )
data class UnAssignKmFromUnderexcLimX1Command(@TargetAggregateIdentifier  val underexcLimX1Id: UUID )
data class AssignMelmaxToUnderexcLimX1Command(@TargetAggregateIdentifier  val underexcLimX1Id: UUID, val assignment: PU )
data class UnAssignMelmaxFromUnderexcLimX1Command(@TargetAggregateIdentifier  val underexcLimX1Id: UUID )
data class AssignTf2ToUnderexcLimX1Command(@TargetAggregateIdentifier  val underexcLimX1Id: UUID, val assignment: Seconds )
data class UnAssignTf2FromUnderexcLimX1Command(@TargetAggregateIdentifier  val underexcLimX1Id: UUID )
data class AssignTmToUnderexcLimX1Command(@TargetAggregateIdentifier  val underexcLimX1Id: UUID, val assignment: Seconds )
data class UnAssignTmFromUnderexcLimX1Command(@TargetAggregateIdentifier  val underexcLimX1Id: UUID )

// multiple association commands


// UnderexcLimX2 Commands
data class CreateUnderexcLimX2Command(
    @TargetAggregateIdentifier  var underexcLimX2Id: UUID? = null
)

data class UpdateUnderexcLimX2Command(
    @TargetAggregateIdentifier var underexcLimX2Id: UUID? = null,
    var kf2: PU,
    var km: PU,
    var melmax: PU,
    var qo: PU,
    var r: PU,
    var tf2: Seconds,
    var tm: Seconds
)

data class DeleteUnderexcLimX2Command(@TargetAggregateIdentifier  var underexcLimX2Id: UUID? = null)

// single association commands
data class AssignKf2ToUnderexcLimX2Command(@TargetAggregateIdentifier  val underexcLimX2Id: UUID, val assignment: PU )
data class UnAssignKf2FromUnderexcLimX2Command(@TargetAggregateIdentifier  val underexcLimX2Id: UUID )
data class AssignKmToUnderexcLimX2Command(@TargetAggregateIdentifier  val underexcLimX2Id: UUID, val assignment: PU )
data class UnAssignKmFromUnderexcLimX2Command(@TargetAggregateIdentifier  val underexcLimX2Id: UUID )
data class AssignMelmaxToUnderexcLimX2Command(@TargetAggregateIdentifier  val underexcLimX2Id: UUID, val assignment: PU )
data class UnAssignMelmaxFromUnderexcLimX2Command(@TargetAggregateIdentifier  val underexcLimX2Id: UUID )
data class AssignQoToUnderexcLimX2Command(@TargetAggregateIdentifier  val underexcLimX2Id: UUID, val assignment: PU )
data class UnAssignQoFromUnderexcLimX2Command(@TargetAggregateIdentifier  val underexcLimX2Id: UUID )
data class AssignRToUnderexcLimX2Command(@TargetAggregateIdentifier  val underexcLimX2Id: UUID, val assignment: PU )
data class UnAssignRFromUnderexcLimX2Command(@TargetAggregateIdentifier  val underexcLimX2Id: UUID )
data class AssignTf2ToUnderexcLimX2Command(@TargetAggregateIdentifier  val underexcLimX2Id: UUID, val assignment: Seconds )
data class UnAssignTf2FromUnderexcLimX2Command(@TargetAggregateIdentifier  val underexcLimX2Id: UUID )
data class AssignTmToUnderexcLimX2Command(@TargetAggregateIdentifier  val underexcLimX2Id: UUID, val assignment: Seconds )
data class UnAssignTmFromUnderexcLimX2Command(@TargetAggregateIdentifier  val underexcLimX2Id: UUID )

// multiple association commands


// UnderexcitationLimiterDynamics Commands
data class CreateUnderexcitationLimiterDynamicsCommand(
    @TargetAggregateIdentifier  var underexcitationLimiterDynamicsId: UUID? = null
)

data class UpdateUnderexcitationLimiterDynamicsCommand(
    @TargetAggregateIdentifier  var underexcitationLimiterDynamicsId: UUID? = null
)

data class DeleteUnderexcitationLimiterDynamicsCommand(@TargetAggregateIdentifier  var underexcitationLimiterDynamicsId: UUID? = null)

// single association commands

// multiple association commands


// UnderexcitationLimiterUserDefined Commands
data class CreateUnderexcitationLimiterUserDefinedCommand(
    @TargetAggregateIdentifier  var underexcitationLimiterUserDefinedId: UUID? = null
)

data class UpdateUnderexcitationLimiterUserDefinedCommand(
    @TargetAggregateIdentifier var underexcitationLimiterUserDefinedId: UUID? = null,
    var proprietary: BooleanProxy
)

data class DeleteUnderexcitationLimiterUserDefinedCommand(@TargetAggregateIdentifier  var underexcitationLimiterUserDefinedId: UUID? = null)

// single association commands
data class AssignProprietaryToUnderexcitationLimiterUserDefinedCommand(@TargetAggregateIdentifier  val underexcitationLimiterUserDefinedId: UUID, val assignment: BooleanProxy )
data class UnAssignProprietaryFromUnderexcitationLimiterUserDefinedCommand(@TargetAggregateIdentifier  val underexcitationLimiterUserDefinedId: UUID )

// multiple association commands


// Unresolvedname Commands
data class CreateUnresolvednameCommand(
    @TargetAggregateIdentifier  var unresolvednameId: UUID? = null
)

data class UpdateUnresolvednameCommand(
    @TargetAggregateIdentifier  var unresolvednameId: UUID? = null
)

data class DeleteUnresolvednameCommand(@TargetAggregateIdentifier  var unresolvednameId: UUID? = null)

// single association commands

// multiple association commands


// VAdjIEEE Commands
data class CreateVAdjIEEECommand(
    @TargetAggregateIdentifier  var vAdjIEEEId: UUID? = null
)

data class UpdateVAdjIEEECommand(
    @TargetAggregateIdentifier var vAdjIEEEId: UUID? = null,
    var adjslew: Simple_Float,
    var taoff: Seconds,
    var taon: Seconds,
    var vadjf: Simple_Float,
    var vadjmax: PU,
    var vadjmin: PU
)

data class DeleteVAdjIEEECommand(@TargetAggregateIdentifier  var vAdjIEEEId: UUID? = null)

// single association commands
data class AssignAdjslewToVAdjIEEECommand(@TargetAggregateIdentifier  val vAdjIEEEId: UUID, val assignment: Simple_Float )
data class UnAssignAdjslewFromVAdjIEEECommand(@TargetAggregateIdentifier  val vAdjIEEEId: UUID )
data class AssignTaoffToVAdjIEEECommand(@TargetAggregateIdentifier  val vAdjIEEEId: UUID, val assignment: Seconds )
data class UnAssignTaoffFromVAdjIEEECommand(@TargetAggregateIdentifier  val vAdjIEEEId: UUID )
data class AssignTaonToVAdjIEEECommand(@TargetAggregateIdentifier  val vAdjIEEEId: UUID, val assignment: Seconds )
data class UnAssignTaonFromVAdjIEEECommand(@TargetAggregateIdentifier  val vAdjIEEEId: UUID )
data class AssignVadjfToVAdjIEEECommand(@TargetAggregateIdentifier  val vAdjIEEEId: UUID, val assignment: Simple_Float )
data class UnAssignVadjfFromVAdjIEEECommand(@TargetAggregateIdentifier  val vAdjIEEEId: UUID )
data class AssignVadjmaxToVAdjIEEECommand(@TargetAggregateIdentifier  val vAdjIEEEId: UUID, val assignment: PU )
data class UnAssignVadjmaxFromVAdjIEEECommand(@TargetAggregateIdentifier  val vAdjIEEEId: UUID )
data class AssignVadjminToVAdjIEEECommand(@TargetAggregateIdentifier  val vAdjIEEEId: UUID, val assignment: PU )
data class UnAssignVadjminFromVAdjIEEECommand(@TargetAggregateIdentifier  val vAdjIEEEId: UUID )

// multiple association commands


// VCompIEEEType1 Commands
data class CreateVCompIEEEType1Command(
    @TargetAggregateIdentifier  var vCompIEEEType1Id: UUID? = null
)

data class UpdateVCompIEEEType1Command(
    @TargetAggregateIdentifier var vCompIEEEType1Id: UUID? = null,
    var rc: PU,
    var tr: Seconds,
    var xc: PU
)

data class DeleteVCompIEEEType1Command(@TargetAggregateIdentifier  var vCompIEEEType1Id: UUID? = null)

// single association commands
data class AssignRcToVCompIEEEType1Command(@TargetAggregateIdentifier  val vCompIEEEType1Id: UUID, val assignment: PU )
data class UnAssignRcFromVCompIEEEType1Command(@TargetAggregateIdentifier  val vCompIEEEType1Id: UUID )
data class AssignTrToVCompIEEEType1Command(@TargetAggregateIdentifier  val vCompIEEEType1Id: UUID, val assignment: Seconds )
data class UnAssignTrFromVCompIEEEType1Command(@TargetAggregateIdentifier  val vCompIEEEType1Id: UUID )
data class AssignXcToVCompIEEEType1Command(@TargetAggregateIdentifier  val vCompIEEEType1Id: UUID, val assignment: PU )
data class UnAssignXcFromVCompIEEEType1Command(@TargetAggregateIdentifier  val vCompIEEEType1Id: UUID )

// multiple association commands


// VCompIEEEType2 Commands
data class CreateVCompIEEEType2Command(
    @TargetAggregateIdentifier  var vCompIEEEType2Id: UUID? = null
)

data class UpdateVCompIEEEType2Command(
    @TargetAggregateIdentifier var vCompIEEEType2Id: UUID? = null,
    var tr: Seconds
)

data class DeleteVCompIEEEType2Command(@TargetAggregateIdentifier  var vCompIEEEType2Id: UUID? = null)

// single association commands
data class AssignTrToVCompIEEEType2Command(@TargetAggregateIdentifier  val vCompIEEEType2Id: UUID, val assignment: Seconds )
data class UnAssignTrFromVCompIEEEType2Command(@TargetAggregateIdentifier  val vCompIEEEType2Id: UUID )

// multiple association commands


// ValueAliasSet Commands
data class CreateValueAliasSetCommand(
    @TargetAggregateIdentifier  var valueAliasSetId: UUID? = null
)

data class UpdateValueAliasSetCommand(
    @TargetAggregateIdentifier  var valueAliasSetId: UUID? = null
)

data class DeleteValueAliasSetCommand(@TargetAggregateIdentifier  var valueAliasSetId: UUID? = null)

// single association commands

// multiple association commands


// ValueToAlias Commands
data class CreateValueToAliasCommand(
    @TargetAggregateIdentifier  var valueToAliasId: UUID? = null
)

data class UpdateValueToAliasCommand(
    @TargetAggregateIdentifier var valueToAliasId: UUID? = null,
    var value: IntegerProxy
)

data class DeleteValueToAliasCommand(@TargetAggregateIdentifier  var valueToAliasId: UUID? = null)

// single association commands
data class AssignValueToValueToAliasCommand(@TargetAggregateIdentifier  val valueToAliasId: UUID, val assignment: IntegerProxy )
data class UnAssignValueFromValueToAliasCommand(@TargetAggregateIdentifier  val valueToAliasId: UUID )

// multiple association commands


// VisibilityLayer Commands
data class CreateVisibilityLayerCommand(
    @TargetAggregateIdentifier  var visibilityLayerId: UUID? = null
)

data class UpdateVisibilityLayerCommand(
    @TargetAggregateIdentifier var visibilityLayerId: UUID? = null,
    var drawingOrder: IntegerProxy
)

data class DeleteVisibilityLayerCommand(@TargetAggregateIdentifier  var visibilityLayerId: UUID? = null)

// single association commands
data class AssignDrawingOrderToVisibilityLayerCommand(@TargetAggregateIdentifier  val visibilityLayerId: UUID, val assignment: IntegerProxy )
data class UnAssignDrawingOrderFromVisibilityLayerCommand(@TargetAggregateIdentifier  val visibilityLayerId: UUID )

// multiple association commands


// Voltage Commands
data class CreateVoltageCommand(
    @TargetAggregateIdentifier var voltageId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol
)

data class UpdateVoltageCommand(
    @TargetAggregateIdentifier var voltageId: UUID? = null,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol,
    var value: FloatProxy
)

data class DeleteVoltageCommand(@TargetAggregateIdentifier  var voltageId: UUID? = null)

// single association commands
data class AssignValueToVoltageCommand(@TargetAggregateIdentifier  val voltageId: UUID, val assignment: FloatProxy )
data class UnAssignValueFromVoltageCommand(@TargetAggregateIdentifier  val voltageId: UUID )

// multiple association commands


// VoltageAdjusterDynamics Commands
data class CreateVoltageAdjusterDynamicsCommand(
    @TargetAggregateIdentifier  var voltageAdjusterDynamicsId: UUID? = null
)

data class UpdateVoltageAdjusterDynamicsCommand(
    @TargetAggregateIdentifier  var voltageAdjusterDynamicsId: UUID? = null
)

data class DeleteVoltageAdjusterDynamicsCommand(@TargetAggregateIdentifier  var voltageAdjusterDynamicsId: UUID? = null)

// single association commands

// multiple association commands


// VoltageAdjusterUserDefined Commands
data class CreateVoltageAdjusterUserDefinedCommand(
    @TargetAggregateIdentifier  var voltageAdjusterUserDefinedId: UUID? = null
)

data class UpdateVoltageAdjusterUserDefinedCommand(
    @TargetAggregateIdentifier var voltageAdjusterUserDefinedId: UUID? = null,
    var proprietary: BooleanProxy
)

data class DeleteVoltageAdjusterUserDefinedCommand(@TargetAggregateIdentifier  var voltageAdjusterUserDefinedId: UUID? = null)

// single association commands
data class AssignProprietaryToVoltageAdjusterUserDefinedCommand(@TargetAggregateIdentifier  val voltageAdjusterUserDefinedId: UUID, val assignment: BooleanProxy )
data class UnAssignProprietaryFromVoltageAdjusterUserDefinedCommand(@TargetAggregateIdentifier  val voltageAdjusterUserDefinedId: UUID )

// multiple association commands


// VoltageCompensatorDynamics Commands
data class CreateVoltageCompensatorDynamicsCommand(
    @TargetAggregateIdentifier  var voltageCompensatorDynamicsId: UUID? = null
)

data class UpdateVoltageCompensatorDynamicsCommand(
    @TargetAggregateIdentifier  var voltageCompensatorDynamicsId: UUID? = null
)

data class DeleteVoltageCompensatorDynamicsCommand(@TargetAggregateIdentifier  var voltageCompensatorDynamicsId: UUID? = null)

// single association commands

// multiple association commands


// VoltageCompensatorUserDefined Commands
data class CreateVoltageCompensatorUserDefinedCommand(
    @TargetAggregateIdentifier  var voltageCompensatorUserDefinedId: UUID? = null
)

data class UpdateVoltageCompensatorUserDefinedCommand(
    @TargetAggregateIdentifier var voltageCompensatorUserDefinedId: UUID? = null,
    var proprietary: BooleanProxy
)

data class DeleteVoltageCompensatorUserDefinedCommand(@TargetAggregateIdentifier  var voltageCompensatorUserDefinedId: UUID? = null)

// single association commands
data class AssignProprietaryToVoltageCompensatorUserDefinedCommand(@TargetAggregateIdentifier  val voltageCompensatorUserDefinedId: UUID, val assignment: BooleanProxy )
data class UnAssignProprietaryFromVoltageCompensatorUserDefinedCommand(@TargetAggregateIdentifier  val voltageCompensatorUserDefinedId: UUID )

// multiple association commands


// VoltageLevel Commands
data class CreateVoltageLevelCommand(
    @TargetAggregateIdentifier  var voltageLevelId: UUID? = null
)

data class UpdateVoltageLevelCommand(
    @TargetAggregateIdentifier var voltageLevelId: UUID? = null,
    var highVoltageLimit: Voltage,
    var lowVoltageLimit: Voltage
)

data class DeleteVoltageLevelCommand(@TargetAggregateIdentifier  var voltageLevelId: UUID? = null)

// single association commands
data class AssignHighVoltageLimitToVoltageLevelCommand(@TargetAggregateIdentifier  val voltageLevelId: UUID, val assignment: Voltage )
data class UnAssignHighVoltageLimitFromVoltageLevelCommand(@TargetAggregateIdentifier  val voltageLevelId: UUID )
data class AssignLowVoltageLimitToVoltageLevelCommand(@TargetAggregateIdentifier  val voltageLevelId: UUID, val assignment: Voltage )
data class UnAssignLowVoltageLimitFromVoltageLevelCommand(@TargetAggregateIdentifier  val voltageLevelId: UUID )

// multiple association commands


// VoltageLimit Commands
data class CreateVoltageLimitCommand(
    @TargetAggregateIdentifier  var voltageLimitId: UUID? = null
)

data class UpdateVoltageLimitCommand(
    @TargetAggregateIdentifier var voltageLimitId: UUID? = null,
    var value: Voltage
)

data class DeleteVoltageLimitCommand(@TargetAggregateIdentifier  var voltageLimitId: UUID? = null)

// single association commands
data class AssignValueToVoltageLimitCommand(@TargetAggregateIdentifier  val voltageLimitId: UUID, val assignment: Voltage )
data class UnAssignValueFromVoltageLimitCommand(@TargetAggregateIdentifier  val voltageLimitId: UUID )

// multiple association commands


// VoltagePerReactivePower Commands
data class CreateVoltagePerReactivePowerCommand(
    @TargetAggregateIdentifier var voltagePerReactivePowerId: UUID? = null,
    @Enumerated(EnumType.STRING) var denominatorMultiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var denominatorUnit: UnitSymbol,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol
)

data class UpdateVoltagePerReactivePowerCommand(
    @TargetAggregateIdentifier var voltagePerReactivePowerId: UUID? = null,
    @Enumerated(EnumType.STRING) var denominatorMultiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var denominatorUnit: UnitSymbol,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol,
    var value: FloatProxy
)

data class DeleteVoltagePerReactivePowerCommand(@TargetAggregateIdentifier  var voltagePerReactivePowerId: UUID? = null)

// single association commands
data class AssignValueToVoltagePerReactivePowerCommand(@TargetAggregateIdentifier  val voltagePerReactivePowerId: UUID, val assignment: FloatProxy )
data class UnAssignValueFromVoltagePerReactivePowerCommand(@TargetAggregateIdentifier  val voltagePerReactivePowerId: UUID )

// multiple association commands


// VolumeFlowRate Commands
data class CreateVolumeFlowRateCommand(
    @TargetAggregateIdentifier var volumeFlowRateId: UUID? = null,
    @Enumerated(EnumType.STRING) var denominatorMultiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var denominatorUnit: UnitSymbol,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol
)

data class UpdateVolumeFlowRateCommand(
    @TargetAggregateIdentifier var volumeFlowRateId: UUID? = null,
    @Enumerated(EnumType.STRING) var denominatorMultiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var denominatorUnit: UnitSymbol,
    @Enumerated(EnumType.STRING) var multiplier: UnitMultiplier,
    @Enumerated(EnumType.STRING) var unit: UnitSymbol,
    var value: FloatProxy
)

data class DeleteVolumeFlowRateCommand(@TargetAggregateIdentifier  var volumeFlowRateId: UUID? = null)

// single association commands
data class AssignValueToVolumeFlowRateCommand(@TargetAggregateIdentifier  val volumeFlowRateId: UUID, val assignment: FloatProxy )
data class UnAssignValueFromVolumeFlowRateCommand(@TargetAggregateIdentifier  val volumeFlowRateId: UUID )

// multiple association commands


// VsCapabilityCurve Commands
data class CreateVsCapabilityCurveCommand(
    @TargetAggregateIdentifier  var vsCapabilityCurveId: UUID? = null
)

data class UpdateVsCapabilityCurveCommand(
    @TargetAggregateIdentifier  var vsCapabilityCurveId: UUID? = null
)

data class DeleteVsCapabilityCurveCommand(@TargetAggregateIdentifier  var vsCapabilityCurveId: UUID? = null)

// single association commands

// multiple association commands


// VsConverter Commands
data class CreateVsConverterCommand(
    @TargetAggregateIdentifier  var vsConverterId: UUID? = null
)

data class UpdateVsConverterCommand(
    @TargetAggregateIdentifier var vsConverterId: UUID? = null,
    var maxModulationIndex: Simple_Float,
    var maxValveCurrent: CurrentFlow
)

data class DeleteVsConverterCommand(@TargetAggregateIdentifier  var vsConverterId: UUID? = null)

// single association commands
data class AssignMaxModulationIndexToVsConverterCommand(@TargetAggregateIdentifier  val vsConverterId: UUID, val assignment: Simple_Float )
data class UnAssignMaxModulationIndexFromVsConverterCommand(@TargetAggregateIdentifier  val vsConverterId: UUID )
data class AssignMaxValveCurrentToVsConverterCommand(@TargetAggregateIdentifier  val vsConverterId: UUID, val assignment: CurrentFlow )
data class UnAssignMaxValveCurrentFromVsConverterCommand(@TargetAggregateIdentifier  val vsConverterId: UUID )

// multiple association commands


// WindAeroConstIEC Commands
data class CreateWindAeroConstIECCommand(
    @TargetAggregateIdentifier  var windAeroConstIECId: UUID? = null
)

data class UpdateWindAeroConstIECCommand(
    @TargetAggregateIdentifier  var windAeroConstIECId: UUID? = null
)

data class DeleteWindAeroConstIECCommand(@TargetAggregateIdentifier  var windAeroConstIECId: UUID? = null)

// single association commands

// multiple association commands


// WindAeroLinearIEC Commands
data class CreateWindAeroLinearIECCommand(
    @TargetAggregateIdentifier  var windAeroLinearIECId: UUID? = null
)

data class UpdateWindAeroLinearIECCommand(
    @TargetAggregateIdentifier var windAeroLinearIECId: UUID? = null,
    var dpomega: PU,
    var dptheta: PU,
    var omegazero: PU,
    var pavail: PU,
    var thetazero: AngleDegrees
)

data class DeleteWindAeroLinearIECCommand(@TargetAggregateIdentifier  var windAeroLinearIECId: UUID? = null)

// single association commands
data class AssignDpomegaToWindAeroLinearIECCommand(@TargetAggregateIdentifier  val windAeroLinearIECId: UUID, val assignment: PU )
data class UnAssignDpomegaFromWindAeroLinearIECCommand(@TargetAggregateIdentifier  val windAeroLinearIECId: UUID )
data class AssignDpthetaToWindAeroLinearIECCommand(@TargetAggregateIdentifier  val windAeroLinearIECId: UUID, val assignment: PU )
data class UnAssignDpthetaFromWindAeroLinearIECCommand(@TargetAggregateIdentifier  val windAeroLinearIECId: UUID )
data class AssignOmegazeroToWindAeroLinearIECCommand(@TargetAggregateIdentifier  val windAeroLinearIECId: UUID, val assignment: PU )
data class UnAssignOmegazeroFromWindAeroLinearIECCommand(@TargetAggregateIdentifier  val windAeroLinearIECId: UUID )
data class AssignPavailToWindAeroLinearIECCommand(@TargetAggregateIdentifier  val windAeroLinearIECId: UUID, val assignment: PU )
data class UnAssignPavailFromWindAeroLinearIECCommand(@TargetAggregateIdentifier  val windAeroLinearIECId: UUID )
data class AssignThetazeroToWindAeroLinearIECCommand(@TargetAggregateIdentifier  val windAeroLinearIECId: UUID, val assignment: AngleDegrees )
data class UnAssignThetazeroFromWindAeroLinearIECCommand(@TargetAggregateIdentifier  val windAeroLinearIECId: UUID )

// multiple association commands


// WindContCurrLimIEC Commands
data class CreateWindContCurrLimIECCommand(
    @TargetAggregateIdentifier  var windContCurrLimIECId: UUID? = null
)

data class UpdateWindContCurrLimIECCommand(
    @TargetAggregateIdentifier var windContCurrLimIECId: UUID? = null,
    var imax: PU,
    var imaxdip: PU,
    var mdfslim: BooleanProxy,
    var mqpri: BooleanProxy,
    var tufilt: Seconds
)

data class DeleteWindContCurrLimIECCommand(@TargetAggregateIdentifier  var windContCurrLimIECId: UUID? = null)

// single association commands
data class AssignImaxToWindContCurrLimIECCommand(@TargetAggregateIdentifier  val windContCurrLimIECId: UUID, val assignment: PU )
data class UnAssignImaxFromWindContCurrLimIECCommand(@TargetAggregateIdentifier  val windContCurrLimIECId: UUID )
data class AssignImaxdipToWindContCurrLimIECCommand(@TargetAggregateIdentifier  val windContCurrLimIECId: UUID, val assignment: PU )
data class UnAssignImaxdipFromWindContCurrLimIECCommand(@TargetAggregateIdentifier  val windContCurrLimIECId: UUID )
data class AssignMdfslimToWindContCurrLimIECCommand(@TargetAggregateIdentifier  val windContCurrLimIECId: UUID, val assignment: BooleanProxy )
data class UnAssignMdfslimFromWindContCurrLimIECCommand(@TargetAggregateIdentifier  val windContCurrLimIECId: UUID )
data class AssignMqpriToWindContCurrLimIECCommand(@TargetAggregateIdentifier  val windContCurrLimIECId: UUID, val assignment: BooleanProxy )
data class UnAssignMqpriFromWindContCurrLimIECCommand(@TargetAggregateIdentifier  val windContCurrLimIECId: UUID )
data class AssignTufiltToWindContCurrLimIECCommand(@TargetAggregateIdentifier  val windContCurrLimIECId: UUID, val assignment: Seconds )
data class UnAssignTufiltFromWindContCurrLimIECCommand(@TargetAggregateIdentifier  val windContCurrLimIECId: UUID )

// multiple association commands


// WindContPType3IEC Commands
data class CreateWindContPType3IECCommand(
    @TargetAggregateIdentifier  var windContPType3IECId: UUID? = null
)

data class UpdateWindContPType3IECCommand(
    @TargetAggregateIdentifier var windContPType3IECId: UUID? = null,
    var dpmax: PU,
    var dtrisemaxlvrt: PU,
    var kdtd: PU,
    var kip: PU,
    var kpp: PU,
    var mplvrt: BooleanProxy,
    var omegaoffset: PU,
    var pdtdmax: PU,
    var rramp: PU,
    var tdvs: Seconds,
    var temin: PU,
    var tomegafilt: Seconds,
    var tpfilt: Seconds,
    var tpord: PU,
    var tufilt: Seconds,
    var tuscale: PU,
    var twref: Seconds,
    var udvs: PU,
    var updip: PU,
    var wdtd: PU,
    var zeta: Simple_Float
)

data class DeleteWindContPType3IECCommand(@TargetAggregateIdentifier  var windContPType3IECId: UUID? = null)

// single association commands
data class AssignDpmaxToWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID, val assignment: PU )
data class UnAssignDpmaxFromWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID )
data class AssignDtrisemaxlvrtToWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID, val assignment: PU )
data class UnAssignDtrisemaxlvrtFromWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID )
data class AssignKdtdToWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID, val assignment: PU )
data class UnAssignKdtdFromWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID )
data class AssignKipToWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID, val assignment: PU )
data class UnAssignKipFromWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID )
data class AssignKppToWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID, val assignment: PU )
data class UnAssignKppFromWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID )
data class AssignMplvrtToWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID, val assignment: BooleanProxy )
data class UnAssignMplvrtFromWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID )
data class AssignOmegaoffsetToWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID, val assignment: PU )
data class UnAssignOmegaoffsetFromWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID )
data class AssignPdtdmaxToWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID, val assignment: PU )
data class UnAssignPdtdmaxFromWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID )
data class AssignRrampToWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID, val assignment: PU )
data class UnAssignRrampFromWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID )
data class AssignTdvsToWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID, val assignment: Seconds )
data class UnAssignTdvsFromWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID )
data class AssignTeminToWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID, val assignment: PU )
data class UnAssignTeminFromWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID )
data class AssignTomegafiltToWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID, val assignment: Seconds )
data class UnAssignTomegafiltFromWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID )
data class AssignTpfiltToWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID, val assignment: Seconds )
data class UnAssignTpfiltFromWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID )
data class AssignTpordToWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID, val assignment: PU )
data class UnAssignTpordFromWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID )
data class AssignTufiltToWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID, val assignment: Seconds )
data class UnAssignTufiltFromWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID )
data class AssignTuscaleToWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID, val assignment: PU )
data class UnAssignTuscaleFromWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID )
data class AssignTwrefToWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID, val assignment: Seconds )
data class UnAssignTwrefFromWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID )
data class AssignUdvsToWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID, val assignment: PU )
data class UnAssignUdvsFromWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID )
data class AssignUpdipToWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID, val assignment: PU )
data class UnAssignUpdipFromWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID )
data class AssignWdtdToWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID, val assignment: PU )
data class UnAssignWdtdFromWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID )
data class AssignZetaToWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID, val assignment: Simple_Float )
data class UnAssignZetaFromWindContPType3IECCommand(@TargetAggregateIdentifier  val windContPType3IECId: UUID )

// multiple association commands


// WindContPType4aIEC Commands
data class CreateWindContPType4aIECCommand(
    @TargetAggregateIdentifier  var windContPType4aIECId: UUID? = null
)

data class UpdateWindContPType4aIECCommand(
    @TargetAggregateIdentifier var windContPType4aIECId: UUID? = null,
    var dpmax: PU,
    var tpord: Seconds,
    var tufilt: Seconds
)

data class DeleteWindContPType4aIECCommand(@TargetAggregateIdentifier  var windContPType4aIECId: UUID? = null)

// single association commands
data class AssignDpmaxToWindContPType4aIECCommand(@TargetAggregateIdentifier  val windContPType4aIECId: UUID, val assignment: PU )
data class UnAssignDpmaxFromWindContPType4aIECCommand(@TargetAggregateIdentifier  val windContPType4aIECId: UUID )
data class AssignTpordToWindContPType4aIECCommand(@TargetAggregateIdentifier  val windContPType4aIECId: UUID, val assignment: Seconds )
data class UnAssignTpordFromWindContPType4aIECCommand(@TargetAggregateIdentifier  val windContPType4aIECId: UUID )
data class AssignTufiltToWindContPType4aIECCommand(@TargetAggregateIdentifier  val windContPType4aIECId: UUID, val assignment: Seconds )
data class UnAssignTufiltFromWindContPType4aIECCommand(@TargetAggregateIdentifier  val windContPType4aIECId: UUID )

// multiple association commands


// WindContPType4bIEC Commands
data class CreateWindContPType4bIECCommand(
    @TargetAggregateIdentifier  var windContPType4bIECId: UUID? = null
)

data class UpdateWindContPType4bIECCommand(
    @TargetAggregateIdentifier var windContPType4bIECId: UUID? = null,
    var dpmax: PU,
    var tpaero: Seconds,
    var tpord: Seconds,
    var tufilt: Seconds
)

data class DeleteWindContPType4bIECCommand(@TargetAggregateIdentifier  var windContPType4bIECId: UUID? = null)

// single association commands
data class AssignDpmaxToWindContPType4bIECCommand(@TargetAggregateIdentifier  val windContPType4bIECId: UUID, val assignment: PU )
data class UnAssignDpmaxFromWindContPType4bIECCommand(@TargetAggregateIdentifier  val windContPType4bIECId: UUID )
data class AssignTpaeroToWindContPType4bIECCommand(@TargetAggregateIdentifier  val windContPType4bIECId: UUID, val assignment: Seconds )
data class UnAssignTpaeroFromWindContPType4bIECCommand(@TargetAggregateIdentifier  val windContPType4bIECId: UUID )
data class AssignTpordToWindContPType4bIECCommand(@TargetAggregateIdentifier  val windContPType4bIECId: UUID, val assignment: Seconds )
data class UnAssignTpordFromWindContPType4bIECCommand(@TargetAggregateIdentifier  val windContPType4bIECId: UUID )
data class AssignTufiltToWindContPType4bIECCommand(@TargetAggregateIdentifier  val windContPType4bIECId: UUID, val assignment: Seconds )
data class UnAssignTufiltFromWindContPType4bIECCommand(@TargetAggregateIdentifier  val windContPType4bIECId: UUID )

// multiple association commands


// WindContPitchAngleIEC Commands
data class CreateWindContPitchAngleIECCommand(
    @TargetAggregateIdentifier  var windContPitchAngleIECId: UUID? = null
)

data class UpdateWindContPitchAngleIECCommand(
    @TargetAggregateIdentifier var windContPitchAngleIECId: UUID? = null,
    var dthetamax: Simple_Float,
    var dthetamin: Simple_Float,
    var kic: PU,
    var kiomega: PU,
    var kpc: PU,
    var kpomega: PU,
    var kpx: PU,
    var thetamax: AngleDegrees,
    var thetamin: AngleDegrees,
    var ttheta: Seconds
)

data class DeleteWindContPitchAngleIECCommand(@TargetAggregateIdentifier  var windContPitchAngleIECId: UUID? = null)

// single association commands
data class AssignDthetamaxToWindContPitchAngleIECCommand(@TargetAggregateIdentifier  val windContPitchAngleIECId: UUID, val assignment: Simple_Float )
data class UnAssignDthetamaxFromWindContPitchAngleIECCommand(@TargetAggregateIdentifier  val windContPitchAngleIECId: UUID )
data class AssignDthetaminToWindContPitchAngleIECCommand(@TargetAggregateIdentifier  val windContPitchAngleIECId: UUID, val assignment: Simple_Float )
data class UnAssignDthetaminFromWindContPitchAngleIECCommand(@TargetAggregateIdentifier  val windContPitchAngleIECId: UUID )
data class AssignKicToWindContPitchAngleIECCommand(@TargetAggregateIdentifier  val windContPitchAngleIECId: UUID, val assignment: PU )
data class UnAssignKicFromWindContPitchAngleIECCommand(@TargetAggregateIdentifier  val windContPitchAngleIECId: UUID )
data class AssignKiomegaToWindContPitchAngleIECCommand(@TargetAggregateIdentifier  val windContPitchAngleIECId: UUID, val assignment: PU )
data class UnAssignKiomegaFromWindContPitchAngleIECCommand(@TargetAggregateIdentifier  val windContPitchAngleIECId: UUID )
data class AssignKpcToWindContPitchAngleIECCommand(@TargetAggregateIdentifier  val windContPitchAngleIECId: UUID, val assignment: PU )
data class UnAssignKpcFromWindContPitchAngleIECCommand(@TargetAggregateIdentifier  val windContPitchAngleIECId: UUID )
data class AssignKpomegaToWindContPitchAngleIECCommand(@TargetAggregateIdentifier  val windContPitchAngleIECId: UUID, val assignment: PU )
data class UnAssignKpomegaFromWindContPitchAngleIECCommand(@TargetAggregateIdentifier  val windContPitchAngleIECId: UUID )
data class AssignKpxToWindContPitchAngleIECCommand(@TargetAggregateIdentifier  val windContPitchAngleIECId: UUID, val assignment: PU )
data class UnAssignKpxFromWindContPitchAngleIECCommand(@TargetAggregateIdentifier  val windContPitchAngleIECId: UUID )
data class AssignThetamaxToWindContPitchAngleIECCommand(@TargetAggregateIdentifier  val windContPitchAngleIECId: UUID, val assignment: AngleDegrees )
data class UnAssignThetamaxFromWindContPitchAngleIECCommand(@TargetAggregateIdentifier  val windContPitchAngleIECId: UUID )
data class AssignThetaminToWindContPitchAngleIECCommand(@TargetAggregateIdentifier  val windContPitchAngleIECId: UUID, val assignment: AngleDegrees )
data class UnAssignThetaminFromWindContPitchAngleIECCommand(@TargetAggregateIdentifier  val windContPitchAngleIECId: UUID )
data class AssignTthetaToWindContPitchAngleIECCommand(@TargetAggregateIdentifier  val windContPitchAngleIECId: UUID, val assignment: Seconds )
data class UnAssignTthetaFromWindContPitchAngleIECCommand(@TargetAggregateIdentifier  val windContPitchAngleIECId: UUID )

// multiple association commands


// WindContQIEC Commands
data class CreateWindContQIECCommand(
    @TargetAggregateIdentifier var windContQIECId: UUID? = null,
    @Enumerated(EnumType.STRING) var windLVRTQcontrolModesType: WindLVRTQcontrolModesKind,
    @Enumerated(EnumType.STRING) var windQcontrolModesType: WindQcontrolModesKind
)

data class UpdateWindContQIECCommand(
    @TargetAggregateIdentifier var windContQIECId: UUID? = null,
    var iqh1: PU,
    var iqmax: PU,
    var iqmin: PU,
    var iqpost: PU,
    var kiq: PU,
    var kiu: PU,
    var kpq: PU,
    var kpu: PU,
    var kqv: PU,
    var qmax: PU,
    var qmin: PU,
    var rdroop: PU,
    var tiq: Seconds,
    var tpfilt: Seconds,
    var tpost: Seconds,
    var tqord: Seconds,
    var tufilt: Seconds,
    var udb1: PU,
    var udb2: PU,
    var umax: PU,
    var umin: PU,
    var uqdip: PU,
    var uref0: PU,
    @Enumerated(EnumType.STRING) var windLVRTQcontrolModesType: WindLVRTQcontrolModesKind,
    @Enumerated(EnumType.STRING) var windQcontrolModesType: WindQcontrolModesKind,
    var xdroop: PU
)

data class DeleteWindContQIECCommand(@TargetAggregateIdentifier  var windContQIECId: UUID? = null)

// single association commands
data class AssignIqh1ToWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID, val assignment: PU )
data class UnAssignIqh1FromWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID )
data class AssignIqmaxToWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID, val assignment: PU )
data class UnAssignIqmaxFromWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID )
data class AssignIqminToWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID, val assignment: PU )
data class UnAssignIqminFromWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID )
data class AssignIqpostToWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID, val assignment: PU )
data class UnAssignIqpostFromWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID )
data class AssignKiqToWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID, val assignment: PU )
data class UnAssignKiqFromWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID )
data class AssignKiuToWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID, val assignment: PU )
data class UnAssignKiuFromWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID )
data class AssignKpqToWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID, val assignment: PU )
data class UnAssignKpqFromWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID )
data class AssignKpuToWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID, val assignment: PU )
data class UnAssignKpuFromWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID )
data class AssignKqvToWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID, val assignment: PU )
data class UnAssignKqvFromWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID )
data class AssignQmaxToWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID, val assignment: PU )
data class UnAssignQmaxFromWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID )
data class AssignQminToWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID, val assignment: PU )
data class UnAssignQminFromWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID )
data class AssignRdroopToWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID, val assignment: PU )
data class UnAssignRdroopFromWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID )
data class AssignTiqToWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID, val assignment: Seconds )
data class UnAssignTiqFromWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID )
data class AssignTpfiltToWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID, val assignment: Seconds )
data class UnAssignTpfiltFromWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID )
data class AssignTpostToWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID, val assignment: Seconds )
data class UnAssignTpostFromWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID )
data class AssignTqordToWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID, val assignment: Seconds )
data class UnAssignTqordFromWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID )
data class AssignTufiltToWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID, val assignment: Seconds )
data class UnAssignTufiltFromWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID )
data class AssignUdb1ToWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID, val assignment: PU )
data class UnAssignUdb1FromWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID )
data class AssignUdb2ToWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID, val assignment: PU )
data class UnAssignUdb2FromWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID )
data class AssignUmaxToWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID, val assignment: PU )
data class UnAssignUmaxFromWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID )
data class AssignUminToWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID, val assignment: PU )
data class UnAssignUminFromWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID )
data class AssignUqdipToWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID, val assignment: PU )
data class UnAssignUqdipFromWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID )
data class AssignUref0ToWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID, val assignment: PU )
data class UnAssignUref0FromWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID )
data class AssignXdroopToWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID, val assignment: PU )
data class UnAssignXdroopFromWindContQIECCommand(@TargetAggregateIdentifier  val windContQIECId: UUID )

// multiple association commands


// WindContRotorRIEC Commands
data class CreateWindContRotorRIECCommand(
    @TargetAggregateIdentifier  var windContRotorRIECId: UUID? = null
)

data class UpdateWindContRotorRIECCommand(
    @TargetAggregateIdentifier var windContRotorRIECId: UUID? = null,
    var kirr: PU,
    var komegafilt: Simple_Float,
    var kpfilt: Simple_Float,
    var kprr: PU,
    var rmax: PU,
    var rmin: PU,
    var tomegafilt: Seconds,
    var tpfilt: Seconds
)

data class DeleteWindContRotorRIECCommand(@TargetAggregateIdentifier  var windContRotorRIECId: UUID? = null)

// single association commands
data class AssignKirrToWindContRotorRIECCommand(@TargetAggregateIdentifier  val windContRotorRIECId: UUID, val assignment: PU )
data class UnAssignKirrFromWindContRotorRIECCommand(@TargetAggregateIdentifier  val windContRotorRIECId: UUID )
data class AssignKomegafiltToWindContRotorRIECCommand(@TargetAggregateIdentifier  val windContRotorRIECId: UUID, val assignment: Simple_Float )
data class UnAssignKomegafiltFromWindContRotorRIECCommand(@TargetAggregateIdentifier  val windContRotorRIECId: UUID )
data class AssignKpfiltToWindContRotorRIECCommand(@TargetAggregateIdentifier  val windContRotorRIECId: UUID, val assignment: Simple_Float )
data class UnAssignKpfiltFromWindContRotorRIECCommand(@TargetAggregateIdentifier  val windContRotorRIECId: UUID )
data class AssignKprrToWindContRotorRIECCommand(@TargetAggregateIdentifier  val windContRotorRIECId: UUID, val assignment: PU )
data class UnAssignKprrFromWindContRotorRIECCommand(@TargetAggregateIdentifier  val windContRotorRIECId: UUID )
data class AssignRmaxToWindContRotorRIECCommand(@TargetAggregateIdentifier  val windContRotorRIECId: UUID, val assignment: PU )
data class UnAssignRmaxFromWindContRotorRIECCommand(@TargetAggregateIdentifier  val windContRotorRIECId: UUID )
data class AssignRminToWindContRotorRIECCommand(@TargetAggregateIdentifier  val windContRotorRIECId: UUID, val assignment: PU )
data class UnAssignRminFromWindContRotorRIECCommand(@TargetAggregateIdentifier  val windContRotorRIECId: UUID )
data class AssignTomegafiltToWindContRotorRIECCommand(@TargetAggregateIdentifier  val windContRotorRIECId: UUID, val assignment: Seconds )
data class UnAssignTomegafiltFromWindContRotorRIECCommand(@TargetAggregateIdentifier  val windContRotorRIECId: UUID )
data class AssignTpfiltToWindContRotorRIECCommand(@TargetAggregateIdentifier  val windContRotorRIECId: UUID, val assignment: Seconds )
data class UnAssignTpfiltFromWindContRotorRIECCommand(@TargetAggregateIdentifier  val windContRotorRIECId: UUID )

// multiple association commands


// WindDynamicsLookupTable Commands
data class CreateWindDynamicsLookupTableCommand(
    @TargetAggregateIdentifier var windDynamicsLookupTableId: UUID? = null,
    @Enumerated(EnumType.STRING) var lookupTableFunctionType: WindLookupTableFunctionKind
)

data class UpdateWindDynamicsLookupTableCommand(
    @TargetAggregateIdentifier var windDynamicsLookupTableId: UUID? = null,
    var input: Simple_Float,
    @Enumerated(EnumType.STRING) var lookupTableFunctionType: WindLookupTableFunctionKind,
    var output: Simple_Float,
    var sequence: IntegerProxy
)

data class DeleteWindDynamicsLookupTableCommand(@TargetAggregateIdentifier  var windDynamicsLookupTableId: UUID? = null)

// single association commands
data class AssignInputToWindDynamicsLookupTableCommand(@TargetAggregateIdentifier  val windDynamicsLookupTableId: UUID, val assignment: Simple_Float )
data class UnAssignInputFromWindDynamicsLookupTableCommand(@TargetAggregateIdentifier  val windDynamicsLookupTableId: UUID )
data class AssignOutputToWindDynamicsLookupTableCommand(@TargetAggregateIdentifier  val windDynamicsLookupTableId: UUID, val assignment: Simple_Float )
data class UnAssignOutputFromWindDynamicsLookupTableCommand(@TargetAggregateIdentifier  val windDynamicsLookupTableId: UUID )
data class AssignSequenceToWindDynamicsLookupTableCommand(@TargetAggregateIdentifier  val windDynamicsLookupTableId: UUID, val assignment: IntegerProxy )
data class UnAssignSequenceFromWindDynamicsLookupTableCommand(@TargetAggregateIdentifier  val windDynamicsLookupTableId: UUID )

// multiple association commands


// WindGenTurbineType1IEC Commands
data class CreateWindGenTurbineType1IECCommand(
    @TargetAggregateIdentifier  var windGenTurbineType1IECId: UUID? = null
)

data class UpdateWindGenTurbineType1IECCommand(
    @TargetAggregateIdentifier  var windGenTurbineType1IECId: UUID? = null
)

data class DeleteWindGenTurbineType1IECCommand(@TargetAggregateIdentifier  var windGenTurbineType1IECId: UUID? = null)

// single association commands

// multiple association commands


// WindGenTurbineType2IEC Commands
data class CreateWindGenTurbineType2IECCommand(
    @TargetAggregateIdentifier  var windGenTurbineType2IECId: UUID? = null
)

data class UpdateWindGenTurbineType2IECCommand(
    @TargetAggregateIdentifier  var windGenTurbineType2IECId: UUID? = null
)

data class DeleteWindGenTurbineType2IECCommand(@TargetAggregateIdentifier  var windGenTurbineType2IECId: UUID? = null)

// single association commands

// multiple association commands


// WindGenTurbineType3IEC Commands
data class CreateWindGenTurbineType3IECCommand(
    @TargetAggregateIdentifier  var windGenTurbineType3IECId: UUID? = null
)

data class UpdateWindGenTurbineType3IECCommand(
    @TargetAggregateIdentifier var windGenTurbineType3IECId: UUID? = null,
    var dipmax: PU,
    var diqmax: PU
)

data class DeleteWindGenTurbineType3IECCommand(@TargetAggregateIdentifier  var windGenTurbineType3IECId: UUID? = null)

// single association commands
data class AssignDipmaxToWindGenTurbineType3IECCommand(@TargetAggregateIdentifier  val windGenTurbineType3IECId: UUID, val assignment: PU )
data class UnAssignDipmaxFromWindGenTurbineType3IECCommand(@TargetAggregateIdentifier  val windGenTurbineType3IECId: UUID )
data class AssignDiqmaxToWindGenTurbineType3IECCommand(@TargetAggregateIdentifier  val windGenTurbineType3IECId: UUID, val assignment: PU )
data class UnAssignDiqmaxFromWindGenTurbineType3IECCommand(@TargetAggregateIdentifier  val windGenTurbineType3IECId: UUID )

// multiple association commands


// WindGenTurbineType3aIEC Commands
data class CreateWindGenTurbineType3aIECCommand(
    @TargetAggregateIdentifier  var windGenTurbineType3aIECId: UUID? = null
)

data class UpdateWindGenTurbineType3aIECCommand(
    @TargetAggregateIdentifier var windGenTurbineType3aIECId: UUID? = null,
    var kpc: Simple_Float,
    var tic: Seconds,
    var xs: PU
)

data class DeleteWindGenTurbineType3aIECCommand(@TargetAggregateIdentifier  var windGenTurbineType3aIECId: UUID? = null)

// single association commands
data class AssignKpcToWindGenTurbineType3aIECCommand(@TargetAggregateIdentifier  val windGenTurbineType3aIECId: UUID, val assignment: Simple_Float )
data class UnAssignKpcFromWindGenTurbineType3aIECCommand(@TargetAggregateIdentifier  val windGenTurbineType3aIECId: UUID )
data class AssignTicToWindGenTurbineType3aIECCommand(@TargetAggregateIdentifier  val windGenTurbineType3aIECId: UUID, val assignment: Seconds )
data class UnAssignTicFromWindGenTurbineType3aIECCommand(@TargetAggregateIdentifier  val windGenTurbineType3aIECId: UUID )
data class AssignXsToWindGenTurbineType3aIECCommand(@TargetAggregateIdentifier  val windGenTurbineType3aIECId: UUID, val assignment: PU )
data class UnAssignXsFromWindGenTurbineType3aIECCommand(@TargetAggregateIdentifier  val windGenTurbineType3aIECId: UUID )

// multiple association commands


// WindGenTurbineType3bIEC Commands
data class CreateWindGenTurbineType3bIECCommand(
    @TargetAggregateIdentifier  var windGenTurbineType3bIECId: UUID? = null
)

data class UpdateWindGenTurbineType3bIECCommand(
    @TargetAggregateIdentifier var windGenTurbineType3bIECId: UUID? = null,
    var fducw: Simple_Float,
    var mwtcwp: BooleanProxy,
    var tg: Seconds,
    var two: Seconds,
    var xs: PU
)

data class DeleteWindGenTurbineType3bIECCommand(@TargetAggregateIdentifier  var windGenTurbineType3bIECId: UUID? = null)

// single association commands
data class AssignFducwToWindGenTurbineType3bIECCommand(@TargetAggregateIdentifier  val windGenTurbineType3bIECId: UUID, val assignment: Simple_Float )
data class UnAssignFducwFromWindGenTurbineType3bIECCommand(@TargetAggregateIdentifier  val windGenTurbineType3bIECId: UUID )
data class AssignMwtcwpToWindGenTurbineType3bIECCommand(@TargetAggregateIdentifier  val windGenTurbineType3bIECId: UUID, val assignment: BooleanProxy )
data class UnAssignMwtcwpFromWindGenTurbineType3bIECCommand(@TargetAggregateIdentifier  val windGenTurbineType3bIECId: UUID )
data class AssignTgToWindGenTurbineType3bIECCommand(@TargetAggregateIdentifier  val windGenTurbineType3bIECId: UUID, val assignment: Seconds )
data class UnAssignTgFromWindGenTurbineType3bIECCommand(@TargetAggregateIdentifier  val windGenTurbineType3bIECId: UUID )
data class AssignTwoToWindGenTurbineType3bIECCommand(@TargetAggregateIdentifier  val windGenTurbineType3bIECId: UUID, val assignment: Seconds )
data class UnAssignTwoFromWindGenTurbineType3bIECCommand(@TargetAggregateIdentifier  val windGenTurbineType3bIECId: UUID )
data class AssignXsToWindGenTurbineType3bIECCommand(@TargetAggregateIdentifier  val windGenTurbineType3bIECId: UUID, val assignment: PU )
data class UnAssignXsFromWindGenTurbineType3bIECCommand(@TargetAggregateIdentifier  val windGenTurbineType3bIECId: UUID )

// multiple association commands


// WindGenType4IEC Commands
data class CreateWindGenType4IECCommand(
    @TargetAggregateIdentifier  var windGenType4IECId: UUID? = null
)

data class UpdateWindGenType4IECCommand(
    @TargetAggregateIdentifier var windGenType4IECId: UUID? = null,
    var dipmax: PU,
    var diqmax: PU,
    var diqmin: PU,
    var tg: Seconds
)

data class DeleteWindGenType4IECCommand(@TargetAggregateIdentifier  var windGenType4IECId: UUID? = null)

// single association commands
data class AssignDipmaxToWindGenType4IECCommand(@TargetAggregateIdentifier  val windGenType4IECId: UUID, val assignment: PU )
data class UnAssignDipmaxFromWindGenType4IECCommand(@TargetAggregateIdentifier  val windGenType4IECId: UUID )
data class AssignDiqmaxToWindGenType4IECCommand(@TargetAggregateIdentifier  val windGenType4IECId: UUID, val assignment: PU )
data class UnAssignDiqmaxFromWindGenType4IECCommand(@TargetAggregateIdentifier  val windGenType4IECId: UUID )
data class AssignDiqminToWindGenType4IECCommand(@TargetAggregateIdentifier  val windGenType4IECId: UUID, val assignment: PU )
data class UnAssignDiqminFromWindGenType4IECCommand(@TargetAggregateIdentifier  val windGenType4IECId: UUID )
data class AssignTgToWindGenType4IECCommand(@TargetAggregateIdentifier  val windGenType4IECId: UUID, val assignment: Seconds )
data class UnAssignTgFromWindGenType4IECCommand(@TargetAggregateIdentifier  val windGenType4IECId: UUID )

// multiple association commands


// WindGeneratingUnit Commands
data class CreateWindGeneratingUnitCommand(
    @TargetAggregateIdentifier var windGeneratingUnitId: UUID? = null,
    @Enumerated(EnumType.STRING) var windGenUnitType: WindGenUnitKind
)

data class UpdateWindGeneratingUnitCommand(
    @TargetAggregateIdentifier var windGeneratingUnitId: UUID? = null,
    @Enumerated(EnumType.STRING) var windGenUnitType: WindGenUnitKind
)

data class DeleteWindGeneratingUnitCommand(@TargetAggregateIdentifier  var windGeneratingUnitId: UUID? = null)

// single association commands

// multiple association commands


// WindMechIEC Commands
data class CreateWindMechIECCommand(
    @TargetAggregateIdentifier  var windMechIECId: UUID? = null
)

data class UpdateWindMechIECCommand(
    @TargetAggregateIdentifier var windMechIECId: UUID? = null,
    var cdrt: PU,
    var hgen: Seconds,
    var hwtr: Seconds,
    var kdrt: PU
)

data class DeleteWindMechIECCommand(@TargetAggregateIdentifier  var windMechIECId: UUID? = null)

// single association commands
data class AssignCdrtToWindMechIECCommand(@TargetAggregateIdentifier  val windMechIECId: UUID, val assignment: PU )
data class UnAssignCdrtFromWindMechIECCommand(@TargetAggregateIdentifier  val windMechIECId: UUID )
data class AssignHgenToWindMechIECCommand(@TargetAggregateIdentifier  val windMechIECId: UUID, val assignment: Seconds )
data class UnAssignHgenFromWindMechIECCommand(@TargetAggregateIdentifier  val windMechIECId: UUID )
data class AssignHwtrToWindMechIECCommand(@TargetAggregateIdentifier  val windMechIECId: UUID, val assignment: Seconds )
data class UnAssignHwtrFromWindMechIECCommand(@TargetAggregateIdentifier  val windMechIECId: UUID )
data class AssignKdrtToWindMechIECCommand(@TargetAggregateIdentifier  val windMechIECId: UUID, val assignment: PU )
data class UnAssignKdrtFromWindMechIECCommand(@TargetAggregateIdentifier  val windMechIECId: UUID )

// multiple association commands


// WindPitchContEmulIEC Commands
data class CreateWindPitchContEmulIECCommand(
    @TargetAggregateIdentifier  var windPitchContEmulIECId: UUID? = null
)

data class UpdateWindPitchContEmulIECCommand(
    @TargetAggregateIdentifier var windPitchContEmulIECId: UUID? = null,
    var kdroop: Simple_Float,
    var kipce: Simple_Float,
    var komegaaero: PU,
    var kppce: Simple_Float,
    var omegaref: PU,
    var pimax: PU,
    var pimin: PU,
    var t1: Seconds,
    var t2: Seconds,
    var tpe: Seconds
)

data class DeleteWindPitchContEmulIECCommand(@TargetAggregateIdentifier  var windPitchContEmulIECId: UUID? = null)

// single association commands
data class AssignKdroopToWindPitchContEmulIECCommand(@TargetAggregateIdentifier  val windPitchContEmulIECId: UUID, val assignment: Simple_Float )
data class UnAssignKdroopFromWindPitchContEmulIECCommand(@TargetAggregateIdentifier  val windPitchContEmulIECId: UUID )
data class AssignKipceToWindPitchContEmulIECCommand(@TargetAggregateIdentifier  val windPitchContEmulIECId: UUID, val assignment: Simple_Float )
data class UnAssignKipceFromWindPitchContEmulIECCommand(@TargetAggregateIdentifier  val windPitchContEmulIECId: UUID )
data class AssignKomegaaeroToWindPitchContEmulIECCommand(@TargetAggregateIdentifier  val windPitchContEmulIECId: UUID, val assignment: PU )
data class UnAssignKomegaaeroFromWindPitchContEmulIECCommand(@TargetAggregateIdentifier  val windPitchContEmulIECId: UUID )
data class AssignKppceToWindPitchContEmulIECCommand(@TargetAggregateIdentifier  val windPitchContEmulIECId: UUID, val assignment: Simple_Float )
data class UnAssignKppceFromWindPitchContEmulIECCommand(@TargetAggregateIdentifier  val windPitchContEmulIECId: UUID )
data class AssignOmegarefToWindPitchContEmulIECCommand(@TargetAggregateIdentifier  val windPitchContEmulIECId: UUID, val assignment: PU )
data class UnAssignOmegarefFromWindPitchContEmulIECCommand(@TargetAggregateIdentifier  val windPitchContEmulIECId: UUID )
data class AssignPimaxToWindPitchContEmulIECCommand(@TargetAggregateIdentifier  val windPitchContEmulIECId: UUID, val assignment: PU )
data class UnAssignPimaxFromWindPitchContEmulIECCommand(@TargetAggregateIdentifier  val windPitchContEmulIECId: UUID )
data class AssignPiminToWindPitchContEmulIECCommand(@TargetAggregateIdentifier  val windPitchContEmulIECId: UUID, val assignment: PU )
data class UnAssignPiminFromWindPitchContEmulIECCommand(@TargetAggregateIdentifier  val windPitchContEmulIECId: UUID )
data class AssignT1ToWindPitchContEmulIECCommand(@TargetAggregateIdentifier  val windPitchContEmulIECId: UUID, val assignment: Seconds )
data class UnAssignT1FromWindPitchContEmulIECCommand(@TargetAggregateIdentifier  val windPitchContEmulIECId: UUID )
data class AssignT2ToWindPitchContEmulIECCommand(@TargetAggregateIdentifier  val windPitchContEmulIECId: UUID, val assignment: Seconds )
data class UnAssignT2FromWindPitchContEmulIECCommand(@TargetAggregateIdentifier  val windPitchContEmulIECId: UUID )
data class AssignTpeToWindPitchContEmulIECCommand(@TargetAggregateIdentifier  val windPitchContEmulIECId: UUID, val assignment: Seconds )
data class UnAssignTpeFromWindPitchContEmulIECCommand(@TargetAggregateIdentifier  val windPitchContEmulIECId: UUID )

// multiple association commands


// WindPlantDynamics Commands
data class CreateWindPlantDynamicsCommand(
    @TargetAggregateIdentifier  var windPlantDynamicsId: UUID? = null
)

data class UpdateWindPlantDynamicsCommand(
    @TargetAggregateIdentifier  var windPlantDynamicsId: UUID? = null
)

data class DeleteWindPlantDynamicsCommand(@TargetAggregateIdentifier  var windPlantDynamicsId: UUID? = null)

// single association commands

// multiple association commands


// WindPlantFreqPcontrolIEC Commands
data class CreateWindPlantFreqPcontrolIECCommand(
    @TargetAggregateIdentifier  var windPlantFreqPcontrolIECId: UUID? = null
)

data class UpdateWindPlantFreqPcontrolIECCommand(
    @TargetAggregateIdentifier var windPlantFreqPcontrolIECId: UUID? = null,
    var dprefmax: PU,
    var dprefmin: PU,
    var kiwpp: Simple_Float,
    var kpwpp: Simple_Float,
    var prefmax: PU,
    var prefmin: PU,
    var tpft: Seconds,
    var tpfv: Seconds,
    var twpffilt: Seconds,
    var twppfilt: Seconds
)

data class DeleteWindPlantFreqPcontrolIECCommand(@TargetAggregateIdentifier  var windPlantFreqPcontrolIECId: UUID? = null)

// single association commands
data class AssignDprefmaxToWindPlantFreqPcontrolIECCommand(@TargetAggregateIdentifier  val windPlantFreqPcontrolIECId: UUID, val assignment: PU )
data class UnAssignDprefmaxFromWindPlantFreqPcontrolIECCommand(@TargetAggregateIdentifier  val windPlantFreqPcontrolIECId: UUID )
data class AssignDprefminToWindPlantFreqPcontrolIECCommand(@TargetAggregateIdentifier  val windPlantFreqPcontrolIECId: UUID, val assignment: PU )
data class UnAssignDprefminFromWindPlantFreqPcontrolIECCommand(@TargetAggregateIdentifier  val windPlantFreqPcontrolIECId: UUID )
data class AssignKiwppToWindPlantFreqPcontrolIECCommand(@TargetAggregateIdentifier  val windPlantFreqPcontrolIECId: UUID, val assignment: Simple_Float )
data class UnAssignKiwppFromWindPlantFreqPcontrolIECCommand(@TargetAggregateIdentifier  val windPlantFreqPcontrolIECId: UUID )
data class AssignKpwppToWindPlantFreqPcontrolIECCommand(@TargetAggregateIdentifier  val windPlantFreqPcontrolIECId: UUID, val assignment: Simple_Float )
data class UnAssignKpwppFromWindPlantFreqPcontrolIECCommand(@TargetAggregateIdentifier  val windPlantFreqPcontrolIECId: UUID )
data class AssignPrefmaxToWindPlantFreqPcontrolIECCommand(@TargetAggregateIdentifier  val windPlantFreqPcontrolIECId: UUID, val assignment: PU )
data class UnAssignPrefmaxFromWindPlantFreqPcontrolIECCommand(@TargetAggregateIdentifier  val windPlantFreqPcontrolIECId: UUID )
data class AssignPrefminToWindPlantFreqPcontrolIECCommand(@TargetAggregateIdentifier  val windPlantFreqPcontrolIECId: UUID, val assignment: PU )
data class UnAssignPrefminFromWindPlantFreqPcontrolIECCommand(@TargetAggregateIdentifier  val windPlantFreqPcontrolIECId: UUID )
data class AssignTpftToWindPlantFreqPcontrolIECCommand(@TargetAggregateIdentifier  val windPlantFreqPcontrolIECId: UUID, val assignment: Seconds )
data class UnAssignTpftFromWindPlantFreqPcontrolIECCommand(@TargetAggregateIdentifier  val windPlantFreqPcontrolIECId: UUID )
data class AssignTpfvToWindPlantFreqPcontrolIECCommand(@TargetAggregateIdentifier  val windPlantFreqPcontrolIECId: UUID, val assignment: Seconds )
data class UnAssignTpfvFromWindPlantFreqPcontrolIECCommand(@TargetAggregateIdentifier  val windPlantFreqPcontrolIECId: UUID )
data class AssignTwpffiltToWindPlantFreqPcontrolIECCommand(@TargetAggregateIdentifier  val windPlantFreqPcontrolIECId: UUID, val assignment: Seconds )
data class UnAssignTwpffiltFromWindPlantFreqPcontrolIECCommand(@TargetAggregateIdentifier  val windPlantFreqPcontrolIECId: UUID )
data class AssignTwppfiltToWindPlantFreqPcontrolIECCommand(@TargetAggregateIdentifier  val windPlantFreqPcontrolIECId: UUID, val assignment: Seconds )
data class UnAssignTwppfiltFromWindPlantFreqPcontrolIECCommand(@TargetAggregateIdentifier  val windPlantFreqPcontrolIECId: UUID )

// multiple association commands


// WindPlantIEC Commands
data class CreateWindPlantIECCommand(
    @TargetAggregateIdentifier  var windPlantIECId: UUID? = null
)

data class UpdateWindPlantIECCommand(
    @TargetAggregateIdentifier  var windPlantIECId: UUID? = null
)

data class DeleteWindPlantIECCommand(@TargetAggregateIdentifier  var windPlantIECId: UUID? = null)

// single association commands

// multiple association commands


// WindPlantReactiveControlIEC Commands
data class CreateWindPlantReactiveControlIECCommand(
    @TargetAggregateIdentifier  var windPlantReactiveControlIECId: UUID? = null
)

data class UpdateWindPlantReactiveControlIECCommand(
    @TargetAggregateIdentifier var windPlantReactiveControlIECId: UUID? = null,
    var kiwpx: Simple_Float,
    var kpwpx: Simple_Float,
    var kwpqu: PU,
    var mwppf: BooleanProxy,
    var mwpu: BooleanProxy,
    var twppfilt: Seconds,
    var twpqfilt: Seconds,
    var twpufilt: Seconds,
    var txft: Seconds,
    var txfv: Seconds,
    var uwpqdip: PU,
    var xrefmax: PU,
    var xrefmin: PU
)

data class DeleteWindPlantReactiveControlIECCommand(@TargetAggregateIdentifier  var windPlantReactiveControlIECId: UUID? = null)

// single association commands
data class AssignKiwpxToWindPlantReactiveControlIECCommand(@TargetAggregateIdentifier  val windPlantReactiveControlIECId: UUID, val assignment: Simple_Float )
data class UnAssignKiwpxFromWindPlantReactiveControlIECCommand(@TargetAggregateIdentifier  val windPlantReactiveControlIECId: UUID )
data class AssignKpwpxToWindPlantReactiveControlIECCommand(@TargetAggregateIdentifier  val windPlantReactiveControlIECId: UUID, val assignment: Simple_Float )
data class UnAssignKpwpxFromWindPlantReactiveControlIECCommand(@TargetAggregateIdentifier  val windPlantReactiveControlIECId: UUID )
data class AssignKwpquToWindPlantReactiveControlIECCommand(@TargetAggregateIdentifier  val windPlantReactiveControlIECId: UUID, val assignment: PU )
data class UnAssignKwpquFromWindPlantReactiveControlIECCommand(@TargetAggregateIdentifier  val windPlantReactiveControlIECId: UUID )
data class AssignMwppfToWindPlantReactiveControlIECCommand(@TargetAggregateIdentifier  val windPlantReactiveControlIECId: UUID, val assignment: BooleanProxy )
data class UnAssignMwppfFromWindPlantReactiveControlIECCommand(@TargetAggregateIdentifier  val windPlantReactiveControlIECId: UUID )
data class AssignMwpuToWindPlantReactiveControlIECCommand(@TargetAggregateIdentifier  val windPlantReactiveControlIECId: UUID, val assignment: BooleanProxy )
data class UnAssignMwpuFromWindPlantReactiveControlIECCommand(@TargetAggregateIdentifier  val windPlantReactiveControlIECId: UUID )
data class AssignTwppfiltToWindPlantReactiveControlIECCommand(@TargetAggregateIdentifier  val windPlantReactiveControlIECId: UUID, val assignment: Seconds )
data class UnAssignTwppfiltFromWindPlantReactiveControlIECCommand(@TargetAggregateIdentifier  val windPlantReactiveControlIECId: UUID )
data class AssignTwpqfiltToWindPlantReactiveControlIECCommand(@TargetAggregateIdentifier  val windPlantReactiveControlIECId: UUID, val assignment: Seconds )
data class UnAssignTwpqfiltFromWindPlantReactiveControlIECCommand(@TargetAggregateIdentifier  val windPlantReactiveControlIECId: UUID )
data class AssignTwpufiltToWindPlantReactiveControlIECCommand(@TargetAggregateIdentifier  val windPlantReactiveControlIECId: UUID, val assignment: Seconds )
data class UnAssignTwpufiltFromWindPlantReactiveControlIECCommand(@TargetAggregateIdentifier  val windPlantReactiveControlIECId: UUID )
data class AssignTxftToWindPlantReactiveControlIECCommand(@TargetAggregateIdentifier  val windPlantReactiveControlIECId: UUID, val assignment: Seconds )
data class UnAssignTxftFromWindPlantReactiveControlIECCommand(@TargetAggregateIdentifier  val windPlantReactiveControlIECId: UUID )
data class AssignTxfvToWindPlantReactiveControlIECCommand(@TargetAggregateIdentifier  val windPlantReactiveControlIECId: UUID, val assignment: Seconds )
data class UnAssignTxfvFromWindPlantReactiveControlIECCommand(@TargetAggregateIdentifier  val windPlantReactiveControlIECId: UUID )
data class AssignUwpqdipToWindPlantReactiveControlIECCommand(@TargetAggregateIdentifier  val windPlantReactiveControlIECId: UUID, val assignment: PU )
data class UnAssignUwpqdipFromWindPlantReactiveControlIECCommand(@TargetAggregateIdentifier  val windPlantReactiveControlIECId: UUID )
data class AssignXrefmaxToWindPlantReactiveControlIECCommand(@TargetAggregateIdentifier  val windPlantReactiveControlIECId: UUID, val assignment: PU )
data class UnAssignXrefmaxFromWindPlantReactiveControlIECCommand(@TargetAggregateIdentifier  val windPlantReactiveControlIECId: UUID )
data class AssignXrefminToWindPlantReactiveControlIECCommand(@TargetAggregateIdentifier  val windPlantReactiveControlIECId: UUID, val assignment: PU )
data class UnAssignXrefminFromWindPlantReactiveControlIECCommand(@TargetAggregateIdentifier  val windPlantReactiveControlIECId: UUID )

// multiple association commands


// WindPlantUserDefined Commands
data class CreateWindPlantUserDefinedCommand(
    @TargetAggregateIdentifier  var windPlantUserDefinedId: UUID? = null
)

data class UpdateWindPlantUserDefinedCommand(
    @TargetAggregateIdentifier var windPlantUserDefinedId: UUID? = null,
    var proprietary: BooleanProxy
)

data class DeleteWindPlantUserDefinedCommand(@TargetAggregateIdentifier  var windPlantUserDefinedId: UUID? = null)

// single association commands
data class AssignProprietaryToWindPlantUserDefinedCommand(@TargetAggregateIdentifier  val windPlantUserDefinedId: UUID, val assignment: BooleanProxy )
data class UnAssignProprietaryFromWindPlantUserDefinedCommand(@TargetAggregateIdentifier  val windPlantUserDefinedId: UUID )

// multiple association commands


// WindProtectionIEC Commands
data class CreateWindProtectionIECCommand(
    @TargetAggregateIdentifier  var windProtectionIECId: UUID? = null
)

data class UpdateWindProtectionIECCommand(
    @TargetAggregateIdentifier var windProtectionIECId: UUID? = null,
    var fover: PU,
    var funder: PU,
    var tfover: Seconds,
    var tfunder: Seconds,
    var tuover: Seconds,
    var tuunder: Seconds,
    var uover: PU,
    var uunder: PU
)

data class DeleteWindProtectionIECCommand(@TargetAggregateIdentifier  var windProtectionIECId: UUID? = null)

// single association commands
data class AssignFoverToWindProtectionIECCommand(@TargetAggregateIdentifier  val windProtectionIECId: UUID, val assignment: PU )
data class UnAssignFoverFromWindProtectionIECCommand(@TargetAggregateIdentifier  val windProtectionIECId: UUID )
data class AssignFunderToWindProtectionIECCommand(@TargetAggregateIdentifier  val windProtectionIECId: UUID, val assignment: PU )
data class UnAssignFunderFromWindProtectionIECCommand(@TargetAggregateIdentifier  val windProtectionIECId: UUID )
data class AssignTfoverToWindProtectionIECCommand(@TargetAggregateIdentifier  val windProtectionIECId: UUID, val assignment: Seconds )
data class UnAssignTfoverFromWindProtectionIECCommand(@TargetAggregateIdentifier  val windProtectionIECId: UUID )
data class AssignTfunderToWindProtectionIECCommand(@TargetAggregateIdentifier  val windProtectionIECId: UUID, val assignment: Seconds )
data class UnAssignTfunderFromWindProtectionIECCommand(@TargetAggregateIdentifier  val windProtectionIECId: UUID )
data class AssignTuoverToWindProtectionIECCommand(@TargetAggregateIdentifier  val windProtectionIECId: UUID, val assignment: Seconds )
data class UnAssignTuoverFromWindProtectionIECCommand(@TargetAggregateIdentifier  val windProtectionIECId: UUID )
data class AssignTuunderToWindProtectionIECCommand(@TargetAggregateIdentifier  val windProtectionIECId: UUID, val assignment: Seconds )
data class UnAssignTuunderFromWindProtectionIECCommand(@TargetAggregateIdentifier  val windProtectionIECId: UUID )
data class AssignUoverToWindProtectionIECCommand(@TargetAggregateIdentifier  val windProtectionIECId: UUID, val assignment: PU )
data class UnAssignUoverFromWindProtectionIECCommand(@TargetAggregateIdentifier  val windProtectionIECId: UUID )
data class AssignUunderToWindProtectionIECCommand(@TargetAggregateIdentifier  val windProtectionIECId: UUID, val assignment: PU )
data class UnAssignUunderFromWindProtectionIECCommand(@TargetAggregateIdentifier  val windProtectionIECId: UUID )

// multiple association commands


// WindTurbineType1or2Dynamics Commands
data class CreateWindTurbineType1or2DynamicsCommand(
    @TargetAggregateIdentifier  var windTurbineType1or2DynamicsId: UUID? = null
)

data class UpdateWindTurbineType1or2DynamicsCommand(
    @TargetAggregateIdentifier  var windTurbineType1or2DynamicsId: UUID? = null
)

data class DeleteWindTurbineType1or2DynamicsCommand(@TargetAggregateIdentifier  var windTurbineType1or2DynamicsId: UUID? = null)

// single association commands

// multiple association commands


// WindTurbineType1or2IEC Commands
data class CreateWindTurbineType1or2IECCommand(
    @TargetAggregateIdentifier  var windTurbineType1or2IECId: UUID? = null
)

data class UpdateWindTurbineType1or2IECCommand(
    @TargetAggregateIdentifier  var windTurbineType1or2IECId: UUID? = null
)

data class DeleteWindTurbineType1or2IECCommand(@TargetAggregateIdentifier  var windTurbineType1or2IECId: UUID? = null)

// single association commands

// multiple association commands


// WindTurbineType3or4Dynamics Commands
data class CreateWindTurbineType3or4DynamicsCommand(
    @TargetAggregateIdentifier  var windTurbineType3or4DynamicsId: UUID? = null
)

data class UpdateWindTurbineType3or4DynamicsCommand(
    @TargetAggregateIdentifier  var windTurbineType3or4DynamicsId: UUID? = null
)

data class DeleteWindTurbineType3or4DynamicsCommand(@TargetAggregateIdentifier  var windTurbineType3or4DynamicsId: UUID? = null)

// single association commands

// multiple association commands


// WindTurbineType3or4IEC Commands
data class CreateWindTurbineType3or4IECCommand(
    @TargetAggregateIdentifier  var windTurbineType3or4IECId: UUID? = null
)

data class UpdateWindTurbineType3or4IECCommand(
    @TargetAggregateIdentifier  var windTurbineType3or4IECId: UUID? = null
)

data class DeleteWindTurbineType3or4IECCommand(@TargetAggregateIdentifier  var windTurbineType3or4IECId: UUID? = null)

// single association commands

// multiple association commands


// WindTurbineType4aIEC Commands
data class CreateWindTurbineType4aIECCommand(
    @TargetAggregateIdentifier  var windTurbineType4aIECId: UUID? = null
)

data class UpdateWindTurbineType4aIECCommand(
    @TargetAggregateIdentifier  var windTurbineType4aIECId: UUID? = null
)

data class DeleteWindTurbineType4aIECCommand(@TargetAggregateIdentifier  var windTurbineType4aIECId: UUID? = null)

// single association commands

// multiple association commands


// WindTurbineType4bIEC Commands
data class CreateWindTurbineType4bIECCommand(
    @TargetAggregateIdentifier  var windTurbineType4bIECId: UUID? = null
)

data class UpdateWindTurbineType4bIECCommand(
    @TargetAggregateIdentifier  var windTurbineType4bIECId: UUID? = null
)

data class DeleteWindTurbineType4bIECCommand(@TargetAggregateIdentifier  var windTurbineType4bIECId: UUID? = null)

// single association commands

// multiple association commands


// WindType1or2UserDefined Commands
data class CreateWindType1or2UserDefinedCommand(
    @TargetAggregateIdentifier  var windType1or2UserDefinedId: UUID? = null
)

data class UpdateWindType1or2UserDefinedCommand(
    @TargetAggregateIdentifier var windType1or2UserDefinedId: UUID? = null,
    var proprietary: BooleanProxy
)

data class DeleteWindType1or2UserDefinedCommand(@TargetAggregateIdentifier  var windType1or2UserDefinedId: UUID? = null)

// single association commands
data class AssignProprietaryToWindType1or2UserDefinedCommand(@TargetAggregateIdentifier  val windType1or2UserDefinedId: UUID, val assignment: BooleanProxy )
data class UnAssignProprietaryFromWindType1or2UserDefinedCommand(@TargetAggregateIdentifier  val windType1or2UserDefinedId: UUID )

// multiple association commands


// WindType3or4UserDefined Commands
data class CreateWindType3or4UserDefinedCommand(
    @TargetAggregateIdentifier  var windType3or4UserDefinedId: UUID? = null
)

data class UpdateWindType3or4UserDefinedCommand(
    @TargetAggregateIdentifier var windType3or4UserDefinedId: UUID? = null,
    var proprietary: BooleanProxy
)

data class DeleteWindType3or4UserDefinedCommand(@TargetAggregateIdentifier  var windType3or4UserDefinedId: UUID? = null)

// single association commands
data class AssignProprietaryToWindType3or4UserDefinedCommand(@TargetAggregateIdentifier  val windType3or4UserDefinedId: UUID, val assignment: BooleanProxy )
data class UnAssignProprietaryFromWindType3or4UserDefinedCommand(@TargetAggregateIdentifier  val windType3or4UserDefinedId: UUID )

// multiple association commands



