package com.kodmay.ThaiPublicAssemblyLaw.ui.procedurelaw

import com.kodmay.ThaiPublicAssemblyLaw.repository.model.CatData

data class LawListData(val title: String, val isCat: Boolean, val catData: CatData?, val lawId: Int
)