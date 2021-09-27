/**
 * Copyright 2020 Google LLC. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.acar.sample.cast.carreceiver;

import android.content.Context;
import com.google.android.gms.cast.tv.CastReceiverOptions;
import com.google.android.gms.cast.tv.ReceiverOptionsProvider;

public class CastReceiverOptionsProvider implements ReceiverOptionsProvider {
    @Override
    public CastReceiverOptions getOptions(Context context) {
        return new CastReceiverOptions.Builder(context)
                .setVersionCode(1)
                .setStatusText("Cast ATV Sample Receiver")
                .build();
    }
}
