package com.fyndev.moto.data

import android.net.Uri

object DataMotor {
    fun getDataMotor(): List<Motor> {
        val listMotor = mutableListOf<Motor>()

        listMotor.add(
            Motor(
                "Honda Beat",
                "Rp 16,6 - Rp 17,65 Juta",
                "Beat ditenagai oleh Pendingin udara PGM-FI 110 cc 1 Cylinder engine yang menghasilkan Tenaga 8.89 hp pada 7500 rpm and Torsi 9.3 Nm pada 5500 rpm. Beat memilik ketinggian kursi 740 mm. Ukuran ban depan adalah (front-tyre-size} sedangkan belakang 90/90 R14.",
                "${Uri.parse("android.resource://com.fyndev.moto/drawable/honda_beat")}"
            )
        )
        listMotor.add(
            Motor(
                "Honda Vario",
                "Rp 25,07 Juta",
                "Vario 150 ditenagai oleh Pendingin Cairan PGM-FI 150 cc 1 Cylinder engine yang menghasilkan Tenaga 13 hp pada 8500 rpm and Torsi 13.4 Nm pada 5000 rpm. Vario 150 memilik ketinggian kursi 769 mm. Ukuran ban depan adalah (front-tyre-size} sedangkan belakang 100/80 R14.",
                "${Uri.parse("android.resource://com.fyndev.moto/drawable/honda_vario")}"
            )
        )
        listMotor.add(
            Motor(
                "Honda PCX160",
                "Rp 30,35 - Rp 33,95 Juta",
                "PCX160 ditenagai oleh Pendingin Cairan PGM-FI 156.9 cc 1 Cylinder engine yang menghasilkan Tenaga 15.8 hp pada 8500 rpm and Torsi 14.7 Nm pada 6500 rpm. PCX160 memilik ketinggian kursi 764 mm. Ukuran ban depan adalah (front-tyre-size} sedangkan belakang 130/70 R13.",
                "${Uri.parse("android.resource://com.fyndev.moto/drawable/honda_pcx")}"
            )
        )
        listMotor.add(
            Motor(
                "Honda Scoopy",
                "Rp 20,52 - Rp 21,32 Juta",
                "Scoopy ditenagai oleh Pendingin udara PGM-FI 109.5 cc 1 Cylinder engine yang menghasilkan Tenaga 9 hp pada 7500 rpm and Torsi 9.3 Nm pada 5500 rpm. Scoopy memilik ketinggian kursi 746 mm. Ukuran ban depan adalah (front-tyre-size} sedangkan belakang 110/90 R12.",
                "${Uri.parse("android.resource://com.fyndev.moto/drawable/honda_scoopy")}"
            )
        )
        listMotor.add(
            Motor(
                "Vespa GTV",
                "Rp 155,5 Juta",
                "GTV ditenagai oleh Pendingin Cairan EFI 278 cc 1 Cylinder engine yang menghasilkan Tenaga 22.7 hp pada 8500 rpm and Torsi 25.5 Nm pada 5500 rpm. GTV memilik ketinggian kursi 790 mm. Ukuran ban depan adalah (front-tyre-size} sedangkan belakang 130/70 R12.",
                "${Uri.parse("android.resource://com.fyndev.moto/drawable/vespa_gt")}"
            )
        )
        listMotor.add(
            Motor(
                "Suzuki NEX Crossover",
                "Rp 17,99 Juta",
                "NEX Crossover ditenagai oleh Pendingin udara 113 cc 1 Cylinder engine yang menghasilkan Tenaga 9 hp. Ukuran ban depan adalah (front-tyre-size} sedangkan belakang 90/90 R14.",
                "${Uri.parse("android.resource://com.fyndev.moto/drawable/suzuki_nex")}"
            )
        )
        listMotor.add(
            Motor(
                "Yamaha Aerox Connected",
                "Rp 25,5 - Rp 29 Juta",
                "Aerox Connected ditenagai oleh Pendingin Cairan 155 cc 1 Cylinder engine yang menghasilkan Tenaga 15 hp pada 8000 rpm and Torsi 13.9 Nm pada 6500 rpm. Aerox Connected memilik ketinggian kursi 790 mm. Ukuran ban depan adalah (front-tyre-size} sedangkan belakang 140/70 R14.",
                "${Uri.parse("android.resource://com.fyndev.moto/drawable/yamaha_aerox")}"
            )
        )
        listMotor.add(
            Motor(
                "Honda Genio",
                "Rp 17,97 - Rp 18,44 Juta",
                "Genio ditenagai oleh Pendingin udara PGM-FI 110 cc 1 Cylinder engine yang menghasilkan Tenaga 8.87 hp pada 7500 rpm and Torsi 9.3 Nm pada 5500 rpm. Genio memilik ketinggian kursi 740 mm. Ukuran ban depan adalah (front-tyre-size} sedangkan belakang 90/90 R14.",
                "${Uri.parse("android.resource://com.fyndev.moto/drawable/honda_genio")}"
            )
        )
        listMotor.add(
            Motor(
                "Vespa Sprint",
                "Rp 47,6 - Rp 50,1 Juta",
                "Sprint ditenagai oleh Pendingin udara 154.8 cc 1 Cylinder engine yang menghasilkan Tenaga 11.66 hp pada 7500 rpm and Torsi 12 Nm pada 5000 rpm. Sprint memilik ketinggian kursi 790 mm. Ukuran ban depan adalah (front-tyre-size} sedangkan belakang 120/70 R12.",
                "${Uri.parse("android.resource://com.fyndev.moto/drawable/vespa_sprint")}"
            )
        )
        listMotor.add(
            Motor(
                "Yamaha Nmax",
                "Rp 29,75 - Rp 32,26 Juta",
                "Nmax ditenagai oleh Pendingin Cairan Fuel Injection 155 cc 1 Cylinder engine yang menghasilkan Tenaga 15.1 hp pada 8000 rpm and Torsi 13.9 Nm pada 6500 rpm. Nmax memilik ketinggian kursi 124 mm. Ukuran ban depan adalah (front-tyre-size} sedangkan belakang 130/70 R13.",
                "${Uri.parse("android.resource://com.fyndev.moto/drawable/yamaha_nmax")}"
            )
        )

        return listMotor
    }
}