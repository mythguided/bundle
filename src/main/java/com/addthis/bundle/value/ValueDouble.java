/*
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
package com.addthis.bundle.value;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = DefaultDouble.class)
public interface ValueDouble extends ValueNumber {

    @Override public Double asNative();

    @Override ValueDouble sum(Numeric val);

    @Override ValueDouble diff(Numeric val);

    @Override ValueDouble prod(Numeric val);

    @Override ValueDouble divide(Numeric val);

    @Override ValueDouble avg(int count);

    @Override ValueDouble min(Numeric val);

    @Override ValueDouble max(Numeric val);

    public double getDouble();
}
