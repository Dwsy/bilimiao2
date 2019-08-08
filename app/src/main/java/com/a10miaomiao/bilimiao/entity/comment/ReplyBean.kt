package com.a10miaomiao.bilimiao.entity.comment

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ReplyBean(
        val action: Int,
        val assist: Int,
        val attr: Int,
        val content: Content,
        val count: Int,
        val ctime: Long,
        val dialog: Int,
        val dialog_str: String,
        val fansgrade: Int,
        val floor: Int,
        val like: Int,
        val member: Member,
        val mid: Int,
        val oid: String, //--
        val parent: Int,
        val parent_str: String,
        val rcount: Int,
        val replies: ArrayList<ReplyBean>,
        val root: Int,
        val root_str: String,
        val rpid: Int,
        val rpid_str: String, //--
        val state: Int,
        val type: Int
): Parcelable