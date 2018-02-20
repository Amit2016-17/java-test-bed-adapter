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
/** information if the item is an object */
@org.apache.avro.specific.AvroGenerated
public class ObjectType extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2386827267304700158L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ObjectType\",\"namespace\":\"com.xvrsim.model.entity.item\",\"doc\":\"information if the item is an object\",\"fields\":[{\"name\":\"subType\",\"type\":{\"type\":\"enum\",\"name\":\"ObjectSubType\",\"symbols\":[\"PROP\",\"TOOL\"]},\"doc\":\"sub type of objects that this item is\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ObjectType> ENCODER =
      new BinaryMessageEncoder<ObjectType>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ObjectType> DECODER =
      new BinaryMessageDecoder<ObjectType>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<ObjectType> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<ObjectType> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ObjectType>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this ObjectType to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a ObjectType from a ByteBuffer. */
  public static ObjectType fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** sub type of objects that this item is */
  @Deprecated public com.xvrsim.model.entity.item.ObjectSubType subType;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ObjectType() {}

  /**
   * All-args constructor.
   * @param subType sub type of objects that this item is
   */
  public ObjectType(com.xvrsim.model.entity.item.ObjectSubType subType) {
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
    case 0: subType = (com.xvrsim.model.entity.item.ObjectSubType)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'subType' field.
   * @return sub type of objects that this item is
   */
  public com.xvrsim.model.entity.item.ObjectSubType getSubType() {
    return subType;
  }

  /**
   * Sets the value of the 'subType' field.
   * sub type of objects that this item is
   * @param value the value to set.
   */
  public void setSubType(com.xvrsim.model.entity.item.ObjectSubType value) {
    this.subType = value;
  }

  /**
   * Creates a new ObjectType RecordBuilder.
   * @return A new ObjectType RecordBuilder
   */
  public static com.xvrsim.model.entity.item.ObjectType.Builder newBuilder() {
    return new com.xvrsim.model.entity.item.ObjectType.Builder();
  }

  /**
   * Creates a new ObjectType RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ObjectType RecordBuilder
   */
  public static com.xvrsim.model.entity.item.ObjectType.Builder newBuilder(com.xvrsim.model.entity.item.ObjectType.Builder other) {
    return new com.xvrsim.model.entity.item.ObjectType.Builder(other);
  }

  /**
   * Creates a new ObjectType RecordBuilder by copying an existing ObjectType instance.
   * @param other The existing instance to copy.
   * @return A new ObjectType RecordBuilder
   */
  public static com.xvrsim.model.entity.item.ObjectType.Builder newBuilder(com.xvrsim.model.entity.item.ObjectType other) {
    return new com.xvrsim.model.entity.item.ObjectType.Builder(other);
  }

  /**
   * RecordBuilder for ObjectType instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ObjectType>
    implements org.apache.avro.data.RecordBuilder<ObjectType> {

    /** sub type of objects that this item is */
    private com.xvrsim.model.entity.item.ObjectSubType subType;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.xvrsim.model.entity.item.ObjectType.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.subType)) {
        this.subType = data().deepCopy(fields()[0].schema(), other.subType);
        fieldSetFlags()[0] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing ObjectType instance
     * @param other The existing instance to copy.
     */
    private Builder(com.xvrsim.model.entity.item.ObjectType other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.subType)) {
        this.subType = data().deepCopy(fields()[0].schema(), other.subType);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'subType' field.
      * sub type of objects that this item is
      * @return The value.
      */
    public com.xvrsim.model.entity.item.ObjectSubType getSubType() {
      return subType;
    }

    /**
      * Sets the value of the 'subType' field.
      * sub type of objects that this item is
      * @param value The value of 'subType'.
      * @return This builder.
      */
    public com.xvrsim.model.entity.item.ObjectType.Builder setSubType(com.xvrsim.model.entity.item.ObjectSubType value) {
      validate(fields()[0], value);
      this.subType = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'subType' field has been set.
      * sub type of objects that this item is
      * @return True if the 'subType' field has been set, false otherwise.
      */
    public boolean hasSubType() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'subType' field.
      * sub type of objects that this item is
      * @return This builder.
      */
    public com.xvrsim.model.entity.item.ObjectType.Builder clearSubType() {
      subType = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ObjectType build() {
      try {
        ObjectType record = new ObjectType();
        record.subType = fieldSetFlags()[0] ? this.subType : (com.xvrsim.model.entity.item.ObjectSubType) defaultValue(fields()[0]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ObjectType>
    WRITER$ = (org.apache.avro.io.DatumWriter<ObjectType>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ObjectType>
    READER$ = (org.apache.avro.io.DatumReader<ObjectType>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}