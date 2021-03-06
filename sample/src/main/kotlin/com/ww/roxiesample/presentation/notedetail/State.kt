/*
* Copyright (C) 2019. WW International, Inc.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.ww.roxiesample.presentation.notedetail

import com.ww.roxie.BaseState
import com.ww.roxiesample.domain.Note

data class State(
    val note: Note? = null,
    val isIdle: Boolean = false,
    val isLoading: Boolean = false,
    val isLoadError: Boolean = false,
    val isNoteDeleted: Boolean = false,
    val isDeleteError: Boolean = false
) : BaseState