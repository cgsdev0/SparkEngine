package com.sparkengine;

import com.sparkengine.utils.Vector;

/**
 *
 * @author Aaron Barber
 * @author Shane Schulte
 */
public interface Movement{
    public Vector getVelocity();
    public Vector getAcceleration();

    public void move();
}
