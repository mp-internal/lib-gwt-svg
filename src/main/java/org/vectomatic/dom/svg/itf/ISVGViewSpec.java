/**********************************************
 * Copyright (C) 2010 Lukas Laag
 * This file is part of lib-gwt-svg.
 * 
 * libgwtsvg is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * libgwtsvg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with libgwtsvg.  If not, see http://www.gnu.org/licenses/
 **********************************************/
/*
 * Copyright (c) 2004 World Wide Web Consortium,
 *
 * (Massachusetts Institute of Technology, European Research Consortium for
 * Informatics and Mathematics, Keio University). All Rights Reserved. This
 * work is distributed under the W3C(r) Software License [1] in the hope that
 * it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 * [1] http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231
 */

package org.vectomatic.dom.svg.itf;

import org.vectomatic.dom.svg.OMSVGElement;
import org.vectomatic.dom.svg.OMSVGTransformList;

  /**
   * The interface corresponds to an SVG View Specification.
   */
public interface ISVGViewSpec extends ISVGZoomAndPan, ISVGFitToViewBox {
  /**
   * Corresponds to the transform setting on the SVG View Specification.
   */
  public OMSVGTransformList getTransform();
  /**
   * Corresponds to the viewTarget setting on the SVG View Specification.
   */
  public OMSVGElement getViewTarget();
  /**
   * Corresponds to the viewBox setting on the SVG View Specification.
   */
  public String getViewBoxString();
  /**
   * Corresponds to the preserveAspectRatio setting on the SVG View Specification.
   */
  public String getPreserveAspectRatioString();
  /**
   * Corresponds to the transform setting on the SVG View Specification.
   */
  public String getTransformString();
  /**
   * Corresponds to the viewTarget setting on the SVG View Specification.
   */
  public String getViewTargetString();
}
