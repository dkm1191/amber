/*
 * Copyright (c) 2018, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package java.lang.constant;

import java.lang.Enum.EnumDesc;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantBootstraps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.invoke.MethodType;
import java.lang.invoke.VarHandle;
import java.lang.invoke.VarHandle.VarHandleDesc;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.lang.constant.DirectMethodHandleDesc.Kind.STATIC;

/**
 * Predefined values of <a href="package-summary.html#nominal">nominal descriptor</a>
 * for common constants, including descriptors for primitive class types and
 * other common platform types, and descriptors for method handles for standard
 * bootstrap methods.
 *
 * @see ConstantDesc
 */
public final class ConstantDescs {
    // No instances
    private ConstantDescs() { }

    /** Invocation name to use when no name is needed, such as the name of a
     * constructor, or the invocation name of a dynamic constant or dynamic
     * callsite when the bootstrap is known to ignore the invocation name.
     */
    public static final String DEFAULT_NAME = "_";

    // Don't change the order of these declarations!

    /** {@link ClassDesc} representing {@link Object} */
    public static final ClassDesc CR_Object = ClassDesc.of("java.lang.Object");

    /** {@link ClassDesc} representing {@link String} */
    public static final ClassDesc CR_String = ClassDesc.of("java.lang.String");

    /** {@link ClassDesc} representing {@link Class} */
    public static final ClassDesc CR_Class = ClassDesc.of("java.lang.Class");

    /** {@link ClassDesc} representing {@link Number} */
    public static final ClassDesc CR_Number = ClassDesc.of("java.lang.Number");

    /** {@link ClassDesc} representing {@link Integer} */
    public static final ClassDesc CR_Integer = ClassDesc.of("java.lang.Integer");

    /** {@link ClassDesc} representing {@link Long} */
    public static final ClassDesc CR_Long = ClassDesc.of("java.lang.Long");

    /** {@link ClassDesc} representing {@link Float} */
    public static final ClassDesc CR_Float = ClassDesc.of("java.lang.Float");

    /** {@link ClassDesc} representing {@link Double} */
    public static final ClassDesc CR_Double = ClassDesc.of("java.lang.Double");

    /** {@link ClassDesc} representing {@link Short} */
    public static final ClassDesc CR_Short = ClassDesc.of("java.lang.Short");

    /** {@link ClassDesc} representing {@link Byte} */
    public static final ClassDesc CR_Byte = ClassDesc.of("java.lang.Byte");

    /** {@link ClassDesc} representing {@link Character} */
    public static final ClassDesc CR_Character = ClassDesc.of("java.lang.Character");

    /** {@link ClassDesc} representing {@link Boolean} */
    public static final ClassDesc CR_Boolean = ClassDesc.of("java.lang.Boolean");

    /** {@link ClassDesc} representing {@link Void} */
    public static final ClassDesc CR_Void = ClassDesc.of("java.lang.Void");

    /** {@link ClassDesc} representing {@link Throwable} */
    public static final ClassDesc CR_Throwable = ClassDesc.of("java.lang.Throwable");

    /** {@link ClassDesc} representing {@link Exception} */
    public static final ClassDesc CR_Exception = ClassDesc.of("java.lang.Exception");

    /** {@link ClassDesc} representing {@link Enum} */
    public static final ClassDesc CR_Enum = ClassDesc.of("java.lang.Enum");

    /** {@link ClassDesc} representing {@link VarHandle} */
    public static final ClassDesc CR_VarHandle = ClassDesc.of("java.lang.invoke.VarHandle");

    /** {@link ClassDesc} representing {@link MethodHandles} */
    public static final ClassDesc CR_MethodHandles = ClassDesc.of("java.lang.invoke.MethodHandles");

    /** {@link ClassDesc} representing {@link MethodHandles.Lookup} */
    public static final ClassDesc CR_MethodHandles_Lookup = CR_MethodHandles.inner("Lookup");

    /** {@link ClassDesc} representing {@link MethodHandle} */
    public static final ClassDesc CR_MethodHandle = ClassDesc.of("java.lang.invoke.MethodHandle");

    /** {@link ClassDesc} representing {@link MethodType} */
    public static final ClassDesc CR_MethodType = ClassDesc.of("java.lang.invoke.MethodType");

    /** {@link ClassDesc} representing {@link CallSite} */
    public static final ClassDesc CR_CallSite = ClassDesc.of("java.lang.invoke.CallSite");

    /** {@link ClassDesc} representing {@link Collection} */
    public static final ClassDesc CR_Collection = ClassDesc.of("java.util.Collection");

    /** {@link ClassDesc} representing {@link List} */
    public static final ClassDesc CR_List = ClassDesc.of("java.util.List");

    /** {@link ClassDesc} representing {@link Set} */
    public static final ClassDesc CR_Set = ClassDesc.of("java.util.Set");

    /** {@link ClassDesc} representing {@link Map} */
    public static final ClassDesc CR_Map = ClassDesc.of("java.util.Map");

    /** {@link ClassDesc} representing {@link ConstantDesc} */
    public static final ClassDesc CR_ConstantDesc = ClassDesc.of("java.lang.constant.ConstantDesc");

    /** {@link ClassDesc} representing {@link ClassDesc} */
    public static final ClassDesc CR_ClassDesc = ClassDesc.of("java.lang.constant.ClassDesc");

    /** {@link ClassDesc} representing {@link EnumDesc} */
    public static final ClassDesc CR_EnumDesc = CR_Enum.inner("EnumDesc");

    /** {@link ClassDesc} representing {@link MethodTypeDesc} */
    public static final ClassDesc CR_MethodTypeDesc = ClassDesc.of("java.lang.constant.MethodTypeDesc");

    /** {@link ClassDesc} representing {@link MethodHandleDesc} */
    public static final ClassDesc CR_MethodHandleDesc = ClassDesc.of("java.lang.constant.MethodHandleDesc");

    /** {@link ClassDesc} representing {@link DirectMethodHandleDescImpl} */
    public static final ClassDesc CR_DirectMethodHandleDesc = ClassDesc.of("java.lang.constant.DirectMethodHandleDesc");

    /** {@link ClassDesc} representing {@link VarHandleDesc} */
    public static final ClassDesc CR_VarHandleDesc = CR_VarHandle.inner("VarHandleDesc");

    /** {@link ClassDesc} representing {@link DirectMethodHandleDesc.Kind} */
    public static final ClassDesc CR_MethodHandleDesc_Kind = CR_DirectMethodHandleDesc.inner("Kind");

    /** {@link ClassDesc} representing {@link DynamicConstantDesc} */
    public static final ClassDesc CR_DynamicConstantDesc = ClassDesc.of("java.lang.constant.DynamicConstantDesc");

    /** {@link ClassDesc} representing {@link DynamicCallSiteDesc} */
    public static final ClassDesc CR_DynamicCallSiteDesc = ClassDesc.of("java.lang.constant.DynamicCallSiteDesc");

    /** {@link ClassDesc} representing {@link ConstantBootstraps} */
    public static final ClassDesc CR_ConstantBootstraps = ClassDesc.of("java.lang.invoke.ConstantBootstraps");

    // Used by MethodHandleDesc, but initialized here before reference to
    // MethodHandleDesc to avoid static initalization circularities
    /* non-public */ static final ClassDesc[] INDY_BOOTSTRAP_ARGS = {
            ConstantDescs.CR_MethodHandles_Lookup,
            ConstantDescs.CR_String,
            ConstantDescs.CR_MethodType };

    /* non-public */ static final ClassDesc[] CONDY_BOOTSTRAP_ARGS = {
            ConstantDescs.CR_MethodHandles_Lookup,
            ConstantDescs.CR_String,
            ConstantDescs.CR_Class };

    /** {@link MethodHandleDesc} representing {@link ConstantBootstraps#primitiveClass(Lookup, String, Class)} */
    public static final DirectMethodHandleDesc BSM_PRIMITIVE_CLASS
            = ofConstantBootstrap(CR_ConstantBootstraps, "primitiveClass",
                                  CR_Class);

    /** {@link MethodHandleDesc} representing {@link ConstantBootstraps#enumConstant(Lookup, String, Class)} */
    public static final DirectMethodHandleDesc BSM_ENUM_CONSTANT
            = ofConstantBootstrap(CR_ConstantBootstraps, "enumConstant",
                                  CR_Enum);

    /** {@link MethodHandleDesc} representing {@link ConstantBootstraps#nullConstant(Lookup, String, Class)} */
    public static final DirectMethodHandleDesc BSM_NULL_CONSTANT
            = ofConstantBootstrap(CR_ConstantBootstraps, "nullConstant",
                                  ConstantDescs.CR_Object);

    /** {@link MethodHandleDesc} representing {@link ConstantBootstraps#fieldVarHandle(Lookup, String, Class, Class, Class)} */
    public static final DirectMethodHandleDesc BSM_VARHANDLE_FIELD
            = ofConstantBootstrap(CR_ConstantBootstraps, "fieldVarHandle",
                                  CR_VarHandle, CR_Class, CR_Class);

    /** {@link MethodHandleDesc} representing {@link ConstantBootstraps#staticFieldVarHandle(Lookup, String, Class, Class, Class)} */
    public static final DirectMethodHandleDesc BSM_VARHANDLE_STATIC_FIELD
            = ofConstantBootstrap(CR_ConstantBootstraps, "staticFieldVarHandle",
                                  CR_VarHandle, CR_Class, CR_Class);

    /** {@link MethodHandleDesc} representing {@link ConstantBootstraps#arrayVarHandle(Lookup, String, Class, Class)} */
    public static final DirectMethodHandleDesc BSM_VARHANDLE_ARRAY
            = ofConstantBootstrap(CR_ConstantBootstraps, "arrayVarHandle",
                                  CR_VarHandle, CR_Class);

    /** {@link MethodHandleDesc} representing {@link ConstantBootstraps#invoke(Lookup, String, Class, MethodHandle, Object...)} */
    public static final DirectMethodHandleDesc BSM_INVOKE
            = ofConstantBootstrap(CR_ConstantBootstraps, "invoke",
                                  CR_Object, CR_MethodHandle, CR_Object.arrayType());

    /** {@link ClassDesc} representing the primitive type {@code int} */
    public static final ClassDesc CR_int = ClassDesc.ofDescriptor("I");

    /** {@link ClassDesc} representing the primitive type {@code long} */
    public static final ClassDesc CR_long = ClassDesc.ofDescriptor("J");

    /** {@link ClassDesc} representing the primitive type {@code float} */
    public static final ClassDesc CR_float = ClassDesc.ofDescriptor("F");

    /** {@link ClassDesc} representing the primitive type {@code double} */
    public static final ClassDesc CR_double = ClassDesc.ofDescriptor("D");

    /** {@link ClassDesc} representing the primitive type {@code short} */
    public static final ClassDesc CR_short = ClassDesc.ofDescriptor("S");

    /** {@link ClassDesc} representing the primitive type {@code byte} */
    public static final ClassDesc CR_byte = ClassDesc.ofDescriptor("B");

    /** {@link ClassDesc} representing the primitive type {@code char} */
    public static final ClassDesc CR_char = ClassDesc.ofDescriptor("C");

    /** {@link ClassDesc} representing the primitive type {@code boolean} */
    public static final ClassDesc CR_boolean = ClassDesc.ofDescriptor("Z");

    /** {@link ClassDesc} representing the primitive type {@code void} */
    public static final ClassDesc CR_void = ClassDesc.ofDescriptor("V");

    /** Nominal descriptor representing the constant {@code null} */
    public static final ConstantDesc<?> NULL
            = DynamicConstantDesc.ofNamed(ConstantDescs.BSM_NULL_CONSTANT,
                                          DEFAULT_NAME, ConstantDescs.CR_Object);

    // Used by XxxDesc classes, but need to be here to avoid bootstrap cycles
    static final DirectMethodHandleDesc MHR_METHODTYPEDESC_FACTORY
            = MethodHandleDesc.of(DirectMethodHandleDesc.Kind.STATIC, CR_MethodTypeDesc, "ofDescriptor",
                                  CR_MethodTypeDesc, CR_String);

    static final DirectMethodHandleDesc MHR_CLASSDESC_FACTORY
            = MethodHandleDesc.of(DirectMethodHandleDesc.Kind.STATIC, CR_ClassDesc, "ofDescriptor",
                                  CR_ClassDesc, CR_String);

    static final DirectMethodHandleDesc MHR_METHODHANDLEDESC_FACTORY
            = MethodHandleDesc.of(DirectMethodHandleDesc.Kind.STATIC, CR_MethodHandleDesc, "of",
                                  CR_MethodHandleDesc, CR_MethodHandleDesc_Kind, CR_ClassDesc, CR_String, CR_MethodTypeDesc);

    static final DirectMethodHandleDesc MHR_METHODHANDLE_ASTYPE
            = MethodHandleDesc.of(DirectMethodHandleDesc.Kind.VIRTUAL, CR_MethodHandle, "asType",
                                  CR_MethodHandle, CR_MethodType);

    static final DirectMethodHandleDesc MHR_METHODHANDLEDESC_ASTYPE
            = MethodHandleDesc.of(DirectMethodHandleDesc.Kind.VIRTUAL, CR_MethodHandleDesc, "asType",
                                  CR_MethodHandleDesc, CR_MethodTypeDesc);

    static final DirectMethodHandleDesc MHR_DYNAMICCONSTANTDESC_FACTORY
            = MethodHandleDesc.of(DirectMethodHandleDesc.Kind.STATIC, CR_DynamicConstantDesc, "of",
                                  CR_DynamicConstantDesc, CR_MethodHandleDesc, CR_String, CR_ClassDesc);

    static final DirectMethodHandleDesc MHR_DYNAMICCONSTANTDESC_WITHARGS
            = MethodHandleDesc.of(DirectMethodHandleDesc.Kind.VIRTUAL, CR_DynamicConstantDesc, "withArgs",
                                  CR_DynamicConstantDesc, CR_ConstantDesc.arrayType());

    static final DirectMethodHandleDesc MHR_ENUMDESC_FACTORY
            = MethodHandleDesc.of(DirectMethodHandleDesc.Kind.STATIC, CR_EnumDesc, "of",
                                  CR_EnumDesc, CR_ClassDesc, CR_String);

    /** {@link MethodHandleDesc} representing {@link VarHandleDesc#ofField(ClassDesc, String, ClassDesc)} */
    public static final DirectMethodHandleDesc MHR_VARHANDLEDESC_OFFIELD
            = MethodHandleDesc.of(DirectMethodHandleDesc.Kind.STATIC, CR_VarHandleDesc, "ofField",
                                  CR_VarHandleDesc, CR_ClassDesc, CR_String, CR_ClassDesc);
    /** {@link MethodHandleDesc} representing {@link VarHandleDesc#ofStaticField(ClassDesc, String, ClassDesc)} */
    public static final DirectMethodHandleDesc MHR_VARHANDLEDESC_OFSTATIC
            = MethodHandleDesc.of(DirectMethodHandleDesc.Kind.STATIC, CR_VarHandleDesc, "ofStaticField",
                                  CR_VarHandleDesc, CR_ClassDesc, CR_String, CR_ClassDesc);

    /** {@link MethodHandleDesc} representing {@link VarHandleDesc#ofArray(ClassDesc)} */
    public static final DirectMethodHandleDesc MHR_VARHANDLEDESC_OFARRAY
            = MethodHandleDesc.of(DirectMethodHandleDesc.Kind.STATIC, CR_VarHandleDesc, "ofArray",
                                  CR_VarHandleDesc, CR_ClassDesc);

    static final DirectMethodHandleDesc BSM_CLASSDESC
            = ConstantDescs.ofConstantBootstrap(CR_ClassDesc,
                                                "constantBootstrap", CR_ClassDesc, CR_String);

    static final DirectMethodHandleDesc BSM_METHODTYPEDESC
            = ConstantDescs.ofConstantBootstrap(CR_MethodTypeDesc,
                                                "constantBootstrap", CR_MethodTypeDesc, CR_String);

    static final DirectMethodHandleDesc BSM_METHODHANDLEDESC
            = ConstantDescs.ofConstantBootstrap(CR_DirectMethodHandleDesc,
                                                "constantBootstrap", CR_DirectMethodHandleDesc,
                                                CR_String, CR_String, CR_String, CR_String);

    /** {@link MethodHandleDesc} representing {@link EnumDesc#constantBootstrap(Lookup, String, Class, String, String)} */
    public static final DirectMethodHandleDesc BSM_ENUMDESC
            = ConstantDescs.ofConstantBootstrap(CR_EnumDesc, "constantBootstrap", CR_EnumDesc, CR_String, CR_String);

    static final DirectMethodHandleDesc BSM_DYNAMICCONSTANTDESC
            = ConstantDescs.ofConstantBootstrap(CR_DynamicConstantDesc,
                                                "constantBootstrap",
                                                CR_DynamicConstantDesc,
                                                CR_String, CR_String, CR_String, CR_String, CR_String, CR_ConstantDesc.arrayType());


    /**
     * Return a {@link MethodHandleDesc} corresponding to a bootstrap method for
     * an {@code invokedynamic} callsite, which is a static method whose leading
     * parameter types are {@code Lookup}, {@code String}, and {@code MethodType}.
     *
     * @param clazz the class declaring the method
     * @param name the name of the method, as per JVMS 4.2.2
     * @param returnType the return type of the method
     * @param paramTypes the types of the static bootstrap arguments, if any
     * @return the {@link MethodHandleDesc}
     * @throws NullPointerException if any of the arguments are null
     * @jvms 4.2.2 Unqualified Names
     */
    public static DirectMethodHandleDesc ofCallsiteBootstrap(ClassDesc clazz,
                                                             String name,
                                                             ClassDesc returnType,
                                                             ClassDesc... paramTypes) {
        return MethodHandleDesc.of(STATIC, clazz, name, MethodTypeDesc.of(returnType, paramTypes).insertParameterTypes(0, INDY_BOOTSTRAP_ARGS));
    }

    /**
     * Return a {@link MethodHandleDesc} corresponding to a bootstrap method for a
     * dynamic constant, which is a static method whose leading arguments are
     * {@code Lookup}, {@code String}, and {@code Class}.
     *
     * @param clazz the class declaring the method
     * @param name the name of the method, as per JVMS 4.2.2
     * @param returnType the return type of the method
     * @param paramTypes the types of the static bootstrap arguments, if any
     * @return the {@link MethodHandleDesc}
     * @throws NullPointerException if any of the arguments are null
     * @jvms 4.2.2 Unqualified Names
     */
    public static DirectMethodHandleDesc ofConstantBootstrap(ClassDesc clazz,
                                                             String name,
                                                             ClassDesc returnType,
                                                             ClassDesc... paramTypes) {
        return MethodHandleDesc.of(STATIC, clazz, name, MethodTypeDesc.of(returnType, paramTypes).insertParameterTypes(0, CONDY_BOOTSTRAP_ARGS));
    }
}
