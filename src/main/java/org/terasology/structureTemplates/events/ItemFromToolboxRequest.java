/*
 * Copyright 2016 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.structureTemplates.events;

import org.terasology.entitySystem.event.Event;
import org.terasology.entitySystem.prefab.Prefab;
import org.terasology.network.ServerEvent;

/**
 * Gets sent to the server to inform it that the user wants to have a structure template from the toolbox.
 */
@ServerEvent
public class ItemFromToolboxRequest implements Event {
    private Prefab itemPrefab;

    public ItemFromToolboxRequest(Prefab itemPrefab) {
        this.itemPrefab = itemPrefab;
    }

    public ItemFromToolboxRequest() {
    }

    public Prefab getItemPrefab() {
        return itemPrefab;
    }
}
