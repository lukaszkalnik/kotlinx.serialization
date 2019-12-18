/*
 * Copyright 2017-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license.
 */

package kotlinx.serialization

import kotlinx.serialization.internal.*

/**
 * Built-in serializer for [Unit] type.
 */
public object UnitSerializer : KSerializer<Unit> {
    override val descriptor: SerialDescriptor = PrimitiveDescriptor("kotlin.Unit", PrimitiveKind.UNIT)
    override fun serialize(encoder: Encoder, obj: Unit) = encoder.encodeUnit()
    override fun deserialize(decoder: Decoder): Unit = decoder.decodeUnit()
}

/**
 * Built-in serializer for [Boolean] type.
 */
public object BooleanSerializer : KSerializer<Boolean> {
    override val descriptor: SerialDescriptor = PrimitiveDescriptor("kotlin.Boolean", PrimitiveKind.BOOLEAN)
    override fun serialize(encoder: Encoder, obj: Boolean) = encoder.encodeBoolean(obj)
    override fun deserialize(decoder: Decoder): Boolean = decoder.decodeBoolean()
}

/**
 * Built-in serializer for [Byte] type.
 */
public object ByteSerializer : KSerializer<Byte> {
    override val descriptor: SerialDescriptor = PrimitiveDescriptor("kotlin.Byte", PrimitiveKind.BYTE)
    override fun serialize(encoder: Encoder, obj: Byte) = encoder.encodeByte(obj)
    override fun deserialize(decoder: Decoder): Byte = decoder.decodeByte()
}

/**
 * Built-in serializer for [Short] type.
 */
public object ShortSerializer : KSerializer<Short> {
    override val descriptor: SerialDescriptor = PrimitiveDescriptor("kotlin.Short", PrimitiveKind.SHORT)
    override fun serialize(encoder: Encoder, obj: Short) = encoder.encodeShort(obj)
    override fun deserialize(decoder: Decoder): Short = decoder.decodeShort()
}

/**
 * Built-in serializer for [Int] type.
 */
public object IntSerializer : KSerializer<Int> {
    override val descriptor: SerialDescriptor = PrimitiveDescriptor("kotlin.Int", PrimitiveKind.INT)
    override fun serialize(encoder: Encoder, obj: Int) = encoder.encodeInt(obj)
    override fun deserialize(decoder: Decoder): Int = decoder.decodeInt()
}

/**
 * Built-in serializer for [Long] type.
 */
public object LongSerializer : KSerializer<Long> {
    override val descriptor: SerialDescriptor = PrimitiveDescriptor("kotlin.Long", PrimitiveKind.LONG)
    override fun serialize(encoder: Encoder, obj: Long) = encoder.encodeLong(obj)
    override fun deserialize(decoder: Decoder): Long = decoder.decodeLong()
}

/**
 * Built-in serializer for [Float] type.
 */
public object FloatSerializer : KSerializer<Float> {
    override val descriptor: SerialDescriptor = PrimitiveDescriptor("kotlin.Float", PrimitiveKind.FLOAT)
    override fun serialize(encoder: Encoder, obj: Float) = encoder.encodeFloat(obj)
    override fun deserialize(decoder: Decoder): Float = decoder.decodeFloat()
}

/**
 * Built-in serializer for [Double] type.
 */
public object DoubleSerializer : KSerializer<Double> {
    override val descriptor: SerialDescriptor = PrimitiveDescriptor("kotlin.Double", PrimitiveKind.DOUBLE)
    override fun serialize(encoder: Encoder, obj: Double) = encoder.encodeDouble(obj)
    override fun deserialize(decoder: Decoder): Double = decoder.decodeDouble()
}

/**
 * Built-in serializer for [Char] type.
 */
public object CharSerializer : KSerializer<Char> {
    override val descriptor: SerialDescriptor = PrimitiveDescriptor("kotlin.Char", PrimitiveKind.CHAR)
    override fun serialize(encoder: Encoder, obj: Char) = encoder.encodeChar(obj)
    override fun deserialize(decoder: Decoder): Char = decoder.decodeChar()
}

/**
 * Built-in serializer for [String] type.
 */
public object StringSerializer : KSerializer<String> {
    override val descriptor: SerialDescriptor = PrimitiveDescriptor("kotlin.String", PrimitiveKind.STRING)
    override fun serialize(encoder: Encoder, obj: String) = encoder.encodeString(obj)
    override fun deserialize(decoder: Decoder): String = decoder.decodeString()
}

public fun String.Companion.serializer(): KSerializer<String> = StringSerializer
public fun Char.Companion.serializer(): KSerializer<Char> = CharSerializer
public fun Byte.Companion.serializer(): KSerializer<Byte> = ByteSerializer
public fun Short.Companion.serializer(): KSerializer<Short> = ShortSerializer
public fun Int.Companion.serializer(): KSerializer<Int> = IntSerializer
public fun Long.Companion.serializer(): KSerializer<Long> = LongSerializer
public fun Float.Companion.serializer(): KSerializer<Float> = FloatSerializer
public fun Double.Companion.serializer(): KSerializer<Double> = DoubleSerializer
public fun Boolean.Companion.serializer(): KSerializer<Boolean> = BooleanSerializer