package com.aas.base

import java.time.LocalDate
import java.time.Period

class Treatment(var title: String,
                var doctor: String,
                var clinic: String,
                var startDate: LocalDate,
                var period: Period,
                val prescriptions: MutableList<MedicalPrescription> = mutableListOf()
)