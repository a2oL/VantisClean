package mx.org.vantisclean.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class RickModel
    (
    @SerializedName("id") val id: String,
    @SerializedName("name") val name: String,
    @SerializedName("status") val status: String,
    @SerializedName("species") val species: String,
    @SerializedName("type") val type: String,
    @SerializedName("gender") val gender: String,
    @SerializedName("image") val image: String
    )
