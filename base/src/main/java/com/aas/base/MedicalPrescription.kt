package com.aas.base

import java.time.LocalDate

class MedicalPrescription(
    val issueDate: LocalDate,
    val drugPrescriptions: MutableList<DrugPrescription> = mutableListOf()
)
