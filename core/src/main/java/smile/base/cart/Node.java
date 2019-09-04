/*******************************************************************************
 * Copyright (c) 2010-2019 Haifeng Li
 *
 * Smile is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 *
 * Smile is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Smile.  If not, see <https://www.gnu.org/licenses/>.
 *******************************************************************************/

package smile.base.cart;

import java.io.Serializable;
import smile.data.Tuple;
import smile.data.type.StructType;

/**
 * CART tree node.
 */
public interface Node extends Serializable {
    /**
     * Evaluate the tree over an instance.
     */
    LeafNode predict(Tuple x);

    /**
     * Returns a dot representation for visualization.
     */
    String toDot(StructType schema, int id);

    /**
     * Returns the maximum depth of the tree -- the number of
     * nodes along the longest path from this node
     * down to the farthest leaf node.
     */
    int depth();

    /**
     * Try to merge the children nodes and return a leaf node.
     * If not able to merge, return this node itself.
     */
    Node toLeaf();
}

