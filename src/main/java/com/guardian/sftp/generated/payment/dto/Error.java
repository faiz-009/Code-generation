/*---------------------------------------------------------------------------------------------
EVERESTEK
Herndon, VA

EVERESTEK
Herndon, VA

(c) Copyright EVERESTEK Corporation.
ALL RIGHTS RESERVED

The software and information contained herein are proprietary to, and comprise valuable
trade secrets of, EVERESTEK Corporation, which intends to preserve as trade secrets such
software and information. This software should only be furnished subject to a written
license agreement and may only be used, copied, transmitted, and stored in accordance
with the terms of such license and with the inclusion of the above copyright notice.
If there is no written License Agreement between you and EVERESTEK Corporation, then you
have received this software in error and should be returned to EVERESTEK Corporation or
destroyed immediately, and you should also notify EVERESTEK Corporation. This software and
information or any other copies thereof may not be provided or otherwise made available
to any person who is not authorized to receive it pursuant to a written license Agreement
executed with EVERESTEK Corporation.
---------------------------------------------------------------------------------------------*/
package com.guardian.sftp.generated.payment.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.Objects;

/** Error. */
@JacksonXmlRootElement(localName = "Error")
@Generated("EVERESTEK Code Generator v1.0.0")
@lombok.ToString
@SuppressWarnings("all")
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class Error {

    /**
     * No description provided.
     *
     * <p>This field is required.
     */
    @NotNull
    @Schema(name = "code", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("code")
    @lombok.Getter
    @lombok.Setter
    @JacksonXmlProperty(localName = "code")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Integer code;

    /**
     * No description provided.
     *
     * <p>This field is required.
     */
    @NotNull
    @Schema(name = "message", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("message")
    @lombok.Getter
    @lombok.Setter
    @JacksonXmlProperty(localName = "message")
    @JacksonXmlElementWrapper(useWrapping = false)
    private String message;

    /**
     * Default constructor for the {@code Error } class.
     *
     * <p>This constructor calls the superclass's default constructor to ensure proper initialization of the object.
     */
    public Error() {
        super();
    }

    /** Constructor with only required parameters */
    public Error(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * Compares this object to the specified object for equality.
     *
     * <p>This method returns {@code true} if and only if:
     *
     * <ul>
     *   <li>The specified object is the same instance as this object
     *   <li>The specified object is not null and is of the same class as this object
     *   <li>All member variables of this object and the specified object are equal
     *   <li>For variables marked as Jackson optional nullable, {@link #equalsNullable(JsonNullable, JsonNullable)} is
     *       used to compare the variables
     *   <li>For other variables, {@link Objects#equals} is used to compare the variables
     *   <li>If this object has additional properties, they are compared using {@link Objects#equals}
     *   <li>If this object has a parent class, the parent class's {@code equals} method is also called for comparison
     * </ul>
     *
     * @param o The object to be compared for equality with this object
     * @return {@code true} if the specified object is equal to this object, {@code false} otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Error error = (Error) o;
        return Objects.equals(this.code, error.code) && Objects.equals(this.message, error.message);
    }

    /**
     * Generates a hash code for the object using its member variables. The hash code is computed based on the following
     * criteria:
     *
     * <p>- For variables marked as Jackson optional nullable, the hash code is computed using the `hashCodeNullable`
     * method. - For other variables, the hash code is computed using their default `hashCode` implementation. - If the
     * object has a parent class, the parent class's `hashCode` is included. - If the object has additional properties,
     * their hash code is also included.
     *
     * @return The computed hash code.
     */
    @Override
    public int hashCode() {
        return Objects.hash(code, message);
    }
}
