/* Copyright 2013 Tim Stratton

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package ni3po42.android.amvvmdemo.models;

import amvvm.implementations.observables.ObservableObject;
import amvvm.implementations.observables.PropertyStore;


public class EntryItem
    extends ObservableObject
{
    private PropertyStore store = new PropertyStore();

    @Override
    public PropertyStore getPropertyStore()
    {
        return store;
    }

    public EntryItem(int id, String content, boolean active)
    {
        this.id = id;
        this.content = content;
        this.active = active;
    }

    private String content;
    private int id;
    private boolean active;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
        notifyListener("Id");
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
        notifyListener("Content");
    }

    public boolean isActive()
    {
        return active;
    }

    public void setActive(boolean active)
    {
        this.active = active;
        notifyListener("Active");
    }
}
