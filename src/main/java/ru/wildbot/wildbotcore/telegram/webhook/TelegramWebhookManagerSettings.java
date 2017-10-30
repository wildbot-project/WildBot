/*
 * Copyright 2017 Peter P. (JARvis PROgrammer)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ru.wildbot.wildbotcore.telegram.webhook;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import ru.wildbot.wildbotcore.data.json.AbstractJsonData;

import java.util.Arrays;

@NoArgsConstructor
@AllArgsConstructor
public class TelegramWebhookManagerSettings extends AbstractJsonData {
    @NonNull @Getter private String host = "http://example.com/vk-webhook-netty";
    @Getter private int port = 12424;
    @Getter private int maxConnections = 40;
    @NonNull private String[] updates = {"*"};

    public String[] getUpdates() {
        return Arrays.copyOf(updates, updates.length);
    }
}
