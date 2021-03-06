/**
 * collectd - bindings/java/org/collectd/api/CollectdTargetInterface.java
 * Copyright (C) 2009       Florian octo Forster
 *
 * Permission is hereby granted, free of charge, to any person obtaining a
 * copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 *
 * Authors:
 *   Florian octo Forster <octo at collectd.org>
 */

package org.collectd.api;

/**
 * Interface for objects implementing a target method.
 *
 * These objects are instantiated using objects which implement the
 * CollectdTargetFactoryInterface interface. They are not instantiated by the
 * daemon directly!
 *
 * @author Florian Forster &lt;octo at collectd.org&gt;
 * @see CollectdTargetFactoryInterface
 * @see Collectd#registerTarget
 */
public interface CollectdTargetInterface
{
	/**
	 * Callback method for targets.
	 *
	 * This method is called to perform some action on the given ValueList.
	 * What precisely is done depends entirely on the implementing class.
	 *
	 * @return One of: {@link Collectd#FC_TARGET_CONTINUE},
	 * {@link Collectd#FC_TARGET_STOP}, {@link Collectd#FC_TARGET_RETURN}
	 * @see CollectdTargetFactoryInterface
	 */
	public int invoke (DataSet ds, ValueList vl);
} /* public interface CollectdTargetInterface */
