package com.example.aiethervault.ViewModel

import android.graphics.Bitmap

fun compareImages(givenImagePath: String, profileBitmap: Bitmap): Boolean {
    val givenImage = Imgcodecs.imread(givenImagePath)
    val profileMat = BitmapToMatConverter.convert(profileBitmap)

    val result = Mat()
    Core.absdiff(givenImage, profileMat, result)

    val diff = Core.sumElems(result)
    return diff.`val`[0] < 50000 // Threshold for similarity
}
