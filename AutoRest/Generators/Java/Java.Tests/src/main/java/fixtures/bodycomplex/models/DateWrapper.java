/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex.models;

import org.joda.time.LocalDate;

/**
 * The DateWrapper model.
 */
public class DateWrapper {
    /**
     * The field property.
     */
    private LocalDate field;

    /**
     * The leap property.
     */
    private LocalDate leap;

    /**
     * Get the field value.
     *
     * @return the field value
     */ 
    public LocalDate getField() {
        return this.field;
    }

    /**
     * Set the field value.
     *
     * @param field the field value to set
     */
    public void setField(LocalDate field) {
        this.field = field;
    }

    /**
     * Get the leap value.
     *
     * @return the leap value
     */ 
    public LocalDate getLeap() {
        return this.leap;
    }

    /**
     * Set the leap value.
     *
     * @param leap the leap value to set
     */
    public void setLeap(LocalDate leap) {
        this.leap = leap;
    }

}