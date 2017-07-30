/*
 * (C) Copyright 2017 Kyle F. Downey.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package cloudwall.graph;

/**
 * An opaque data model containing graph data; its structure can be visited with a {@link GraphVisitor} but to
 * get at the native format details you need to cast to a specific implementation.
 *
 * @author <a href="mailto:kyle.downey@gmail.com">Kyle F. Downey</a>
 */
public interface GraphModel extends GraphMetadata {
    /**
     * Visits this graph if supported. Default implementation
     */
    default void visit(GraphVisitor visitor) {
        visitor.start(this);
    }
}
