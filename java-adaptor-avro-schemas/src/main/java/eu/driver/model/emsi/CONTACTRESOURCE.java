/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package eu.driver.model.emsi;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class CONTACTRESOURCE extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6294235508695964104L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CONTACTRESOURCE\",\"namespace\":\"eu.driver.model.emsi\",\"fields\":[{\"name\":\"TYPE\",\"type\":\"string\",\"source\":\"element TYPE\"},{\"name\":\"DETAIL\",\"type\":\"string\",\"source\":\"element DETAIL\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<CONTACTRESOURCE> ENCODER =
      new BinaryMessageEncoder<CONTACTRESOURCE>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CONTACTRESOURCE> DECODER =
      new BinaryMessageDecoder<CONTACTRESOURCE>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<CONTACTRESOURCE> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<CONTACTRESOURCE> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<CONTACTRESOURCE>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this CONTACTRESOURCE to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a CONTACTRESOURCE from a ByteBuffer. */
  public static CONTACTRESOURCE fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence TYPE;
  @Deprecated public java.lang.CharSequence DETAIL;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CONTACTRESOURCE() {}

  /**
   * All-args constructor.
   * @param TYPE The new value for TYPE
   * @param DETAIL The new value for DETAIL
   */
  public CONTACTRESOURCE(java.lang.CharSequence TYPE, java.lang.CharSequence DETAIL) {
    this.TYPE = TYPE;
    this.DETAIL = DETAIL;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return TYPE;
    case 1: return DETAIL;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: TYPE = (java.lang.CharSequence)value$; break;
    case 1: DETAIL = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'TYPE' field.
   * @return The value of the 'TYPE' field.
   */
  public java.lang.CharSequence getTYPE() {
    return TYPE;
  }

  /**
   * Sets the value of the 'TYPE' field.
   * @param value the value to set.
   */
  public void setTYPE(java.lang.CharSequence value) {
    this.TYPE = value;
  }

  /**
   * Gets the value of the 'DETAIL' field.
   * @return The value of the 'DETAIL' field.
   */
  public java.lang.CharSequence getDETAIL() {
    return DETAIL;
  }

  /**
   * Sets the value of the 'DETAIL' field.
   * @param value the value to set.
   */
  public void setDETAIL(java.lang.CharSequence value) {
    this.DETAIL = value;
  }

  /**
   * Creates a new CONTACTRESOURCE RecordBuilder.
   * @return A new CONTACTRESOURCE RecordBuilder
   */
  public static eu.driver.model.emsi.CONTACTRESOURCE.Builder newBuilder() {
    return new eu.driver.model.emsi.CONTACTRESOURCE.Builder();
  }

  /**
   * Creates a new CONTACTRESOURCE RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CONTACTRESOURCE RecordBuilder
   */
  public static eu.driver.model.emsi.CONTACTRESOURCE.Builder newBuilder(eu.driver.model.emsi.CONTACTRESOURCE.Builder other) {
    return new eu.driver.model.emsi.CONTACTRESOURCE.Builder(other);
  }

  /**
   * Creates a new CONTACTRESOURCE RecordBuilder by copying an existing CONTACTRESOURCE instance.
   * @param other The existing instance to copy.
   * @return A new CONTACTRESOURCE RecordBuilder
   */
  public static eu.driver.model.emsi.CONTACTRESOURCE.Builder newBuilder(eu.driver.model.emsi.CONTACTRESOURCE other) {
    return new eu.driver.model.emsi.CONTACTRESOURCE.Builder(other);
  }

  /**
   * RecordBuilder for CONTACTRESOURCE instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CONTACTRESOURCE>
    implements org.apache.avro.data.RecordBuilder<CONTACTRESOURCE> {

    private java.lang.CharSequence TYPE;
    private java.lang.CharSequence DETAIL;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(eu.driver.model.emsi.CONTACTRESOURCE.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.TYPE)) {
        this.TYPE = data().deepCopy(fields()[0].schema(), other.TYPE);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.DETAIL)) {
        this.DETAIL = data().deepCopy(fields()[1].schema(), other.DETAIL);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing CONTACTRESOURCE instance
     * @param other The existing instance to copy.
     */
    private Builder(eu.driver.model.emsi.CONTACTRESOURCE other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.TYPE)) {
        this.TYPE = data().deepCopy(fields()[0].schema(), other.TYPE);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.DETAIL)) {
        this.DETAIL = data().deepCopy(fields()[1].schema(), other.DETAIL);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'TYPE' field.
      * @return The value.
      */
    public java.lang.CharSequence getTYPE() {
      return TYPE;
    }

    /**
      * Sets the value of the 'TYPE' field.
      * @param value The value of 'TYPE'.
      * @return This builder.
      */
    public eu.driver.model.emsi.CONTACTRESOURCE.Builder setTYPE(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.TYPE = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'TYPE' field has been set.
      * @return True if the 'TYPE' field has been set, false otherwise.
      */
    public boolean hasTYPE() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'TYPE' field.
      * @return This builder.
      */
    public eu.driver.model.emsi.CONTACTRESOURCE.Builder clearTYPE() {
      TYPE = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'DETAIL' field.
      * @return The value.
      */
    public java.lang.CharSequence getDETAIL() {
      return DETAIL;
    }

    /**
      * Sets the value of the 'DETAIL' field.
      * @param value The value of 'DETAIL'.
      * @return This builder.
      */
    public eu.driver.model.emsi.CONTACTRESOURCE.Builder setDETAIL(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.DETAIL = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'DETAIL' field has been set.
      * @return True if the 'DETAIL' field has been set, false otherwise.
      */
    public boolean hasDETAIL() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'DETAIL' field.
      * @return This builder.
      */
    public eu.driver.model.emsi.CONTACTRESOURCE.Builder clearDETAIL() {
      DETAIL = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CONTACTRESOURCE build() {
      try {
        CONTACTRESOURCE record = new CONTACTRESOURCE();
        record.TYPE = fieldSetFlags()[0] ? this.TYPE : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.DETAIL = fieldSetFlags()[1] ? this.DETAIL : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CONTACTRESOURCE>
    WRITER$ = (org.apache.avro.io.DatumWriter<CONTACTRESOURCE>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CONTACTRESOURCE>
    READER$ = (org.apache.avro.io.DatumReader<CONTACTRESOURCE>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
