package com.tubagus0100.resepku.model

data class Resep(
    val id: String,
    val nama: String,
    val deskripsi: String,
    val gambarResep: Int,
    val bahan: List<String>,
    val langkah: List<String>,
    var isSelected: Boolean = false
)
