/*
 * Copyright (C) 2016 IRA-Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.irateam.vkplayer.util.extension

import android.support.annotation.IdRes
import android.support.annotation.StringRes
import android.support.v4.app.Fragment
import android.view.View
import com.irateam.vkplayer.util.Permission

fun Fragment.showLongToast(@StringRes resId: Int) {
	context.showLongToast(resId)
}

fun Fragment.showLongToast(text: String) {
	context.showLongToast(text)
}

fun Fragment.isPermissionsGranted(vararg permissions: Permission): Boolean {
	return context.isPermissionsGranted(*permissions)
}

fun Fragment.requestPermissions(requestCode: Int, vararg permissions: Permission) {
	val rawPermissions = permissions
			.map { it.value }
			.toTypedArray()

	requestPermissions(rawPermissions, requestCode)
}

@Suppress("unchecked_cast")
fun <V : View> Fragment.getViewById(@IdRes id: Int): V {
	return view?.findViewById(id) as V
}