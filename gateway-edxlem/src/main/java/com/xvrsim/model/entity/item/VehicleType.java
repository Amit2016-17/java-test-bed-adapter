/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.xvrsim.model.entity.item;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
/** information if the item is a vehicle */
@org.apache.avro.specific.AvroGenerated
public class VehicleType extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 921458663282656238L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"VehicleType\",\"namespace\":\"com.xvrsim.model.entity.item\",\"doc\":\"information if the item is a vehicle\",\"fields\":[{\"name\":\"subType\",\"type\":{\"type\":\"enum\",\"name\":\"VehicleSubType\",\"symbols\":[\"CAR\",\"VAN\",\"TRUCK\",\"BOAT\",\"PLANE\",\"HELICOPTER\",\"MOTORCYCLE\"]},\"doc\":\"sub type of vehicles that this item is\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<VehicleType> ENCODER =
      new BinaryMessageEncoder<VehicleType>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<VehicleType> DECODER =
      new BinaryMessageDecoder<VehicleType>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<VehicleType> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<VehicleType> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<VehicleType>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this VehicleType to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a VehicleType from a ByteBuffer. */
  public static VehicleType fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** sub type of vehicles that this item is */
  @Deprecated public com.xvrsim.model.entity.item.VehicleSubType subType;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public VehicleType() {}

  /**
   * All-args constructor.
   * @param subType sub type of vehicles that this item is
   */
  public VehicleType(com.xvrsim.model.entity.item.VehicleSubType subType) {
    this.subType = subType;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return subType;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: subType = (com.xvrsim.model.entity.item.VehicleSubType)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'subType' field.
   * @return sub type of vehicles that this item is
   */
  public com.xvrsim.model.entity.item.VehicleSubType getSubType() {
    return subType;
  }

  /**
   * Sets the value of the 'subType' field.
   * sub type of vehicles that this item is
   * @param value the value to set.
   */
  public void setSubType(com.xvrsim.model.entity.item.VehicleSubType value) {
    this.subType = value;
  }

  /**
   * Creates a new VehicleType RecordBuilder.
   * @return A new VehicleType RecordBuilder
   */
  public static com.xvrsim.model.entity.item.VehicleType.Builder newBuilder() {
    return new com.xvrsim.model.entity.item.VehicleType.Builder();
  }

  /**
   * Creates a new VehicleType RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new VehicleType RecordBuilder
   */
  public static com.xvrsim.model.entity.item.VehicleType.Builder newBuilder(com.xvrsim.model.entity.item.VehicleType.Builder other) {
    return new com.xvrsim.model.entity.item.VehicleType.Builder(other);
  }

  /**
   * Creates a new VehicleType RecordBuilder by copying an existing VehicleType instance.
   * @param other The existing instance to copy.
   * @return A new VehicleType RecordBuilder
   */
  public static com.xvrsim.model.entity.item.VehicleType.Builder newBuilder(com.xvrsim.model.entity.item.VehicleType other) {
    return new com.xvrsim.model.entity.item.VehicleType.Builder(other);
  }

  /**
   * RecordBuilder for VehicleType instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<VehicleType>
    implements org.apache.avro.data.RecordBuilder<VehicleType> {

    /** sub type of vehicles that this item is */
    private com.xvrsim.model.entity.item.VehicleSubType subType;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.xvrsim.model.entity.item.VehicleType.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.subType)) {
        this.subType = data().deepCopy(fields()[0].schema(), other.subType);
        fieldSetFlags()[0] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing VehicleType instance
     * @param other The existing instance to copy.
     */
    private Builder(com.xvrsim.model.entity.item.VehicleType other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.subType)) {
        this.subType = data().deepCopy(fields()[0].schema(), other.subType);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'subType' field.
      * sub type of vehicles that this item is
      * @return The value.
      */
    public com.xvrsim.model.entity.item.VehicleSubType getSubType() {
      return subType;
    }

    /**
      * Sets the value of the 'subType' field.
      * sub type of vehicles that this item is
      * @param value The value of 'subType'.
      * @return This builder.
      */
    public com.xvrsim.model.entity.item.VehicleType.Builder setSubType(com.xvrsim.model.entity.item.VehicleSubType value) {
      validate(fields()[0], value);
      this.subType = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'subType' field has been set.
      * sub type of vehicles that this item is
      * @return True if the 'subType' field has been set, false otherwise.
      */
    public boolean hasSubType() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'subType' field.
      * sub type of vehicles that this item is
      * @return This builder.
      */
    public com.xvrsim.model.entity.item.VehicleType.Builder clearSubType() {
      subType = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public VehicleType build() {
      try {
        VehicleType record = new VehicleType();
        record.subType = fieldSetFlags()[0] ? this.subType : (com.xvrsim.model.entity.item.VehicleSubType) defaultValue(fields()[0]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<VehicleType>
    WRITER$ = (org.apache.avro.io.DatumWriter<VehicleType>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<VehicleType>
    READER$ = (org.apache.avro.io.DatumReader<VehicleType>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
