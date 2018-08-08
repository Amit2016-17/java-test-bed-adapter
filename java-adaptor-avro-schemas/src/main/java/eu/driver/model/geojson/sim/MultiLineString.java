/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package eu.driver.model.geojson.sim;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
/** Describes a MultiLineString geometry */
@org.apache.avro.specific.AvroGenerated
public class MultiLineString extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 441766699526226840L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MultiLineString\",\"namespace\":\"eu.driver.model.geojson.sim\",\"doc\":\"Describes a MultiLineString geometry\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"MultiLineStringType\",\"symbols\":[\"MultiLineString\"]},\"default\":\"MultiLineString\"},{\"name\":\"coordinates\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":\"double\"}}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<MultiLineString> ENCODER =
      new BinaryMessageEncoder<MultiLineString>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<MultiLineString> DECODER =
      new BinaryMessageDecoder<MultiLineString>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<MultiLineString> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<MultiLineString> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<MultiLineString>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this MultiLineString to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a MultiLineString from a ByteBuffer. */
  public static MultiLineString fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public eu.driver.model.geojson.sim.MultiLineStringType type;
  @Deprecated public java.util.List<java.util.List<java.util.List<java.lang.Double>>> coordinates;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public MultiLineString() {}

  /**
   * All-args constructor.
   * @param type The new value for type
   * @param coordinates The new value for coordinates
   */
  public MultiLineString(eu.driver.model.geojson.sim.MultiLineStringType type, java.util.List<java.util.List<java.util.List<java.lang.Double>>> coordinates) {
    this.type = type;
    this.coordinates = coordinates;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return coordinates;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: type = (eu.driver.model.geojson.sim.MultiLineStringType)value$; break;
    case 1: coordinates = (java.util.List<java.util.List<java.util.List<java.lang.Double>>>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'type' field.
   * @return The value of the 'type' field.
   */
  public eu.driver.model.geojson.sim.MultiLineStringType getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(eu.driver.model.geojson.sim.MultiLineStringType value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'coordinates' field.
   * @return The value of the 'coordinates' field.
   */
  public java.util.List<java.util.List<java.util.List<java.lang.Double>>> getCoordinates() {
    return coordinates;
  }

  /**
   * Sets the value of the 'coordinates' field.
   * @param value the value to set.
   */
  public void setCoordinates(java.util.List<java.util.List<java.util.List<java.lang.Double>>> value) {
    this.coordinates = value;
  }

  /**
   * Creates a new MultiLineString RecordBuilder.
   * @return A new MultiLineString RecordBuilder
   */
  public static eu.driver.model.geojson.sim.MultiLineString.Builder newBuilder() {
    return new eu.driver.model.geojson.sim.MultiLineString.Builder();
  }

  /**
   * Creates a new MultiLineString RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new MultiLineString RecordBuilder
   */
  public static eu.driver.model.geojson.sim.MultiLineString.Builder newBuilder(eu.driver.model.geojson.sim.MultiLineString.Builder other) {
    return new eu.driver.model.geojson.sim.MultiLineString.Builder(other);
  }

  /**
   * Creates a new MultiLineString RecordBuilder by copying an existing MultiLineString instance.
   * @param other The existing instance to copy.
   * @return A new MultiLineString RecordBuilder
   */
  public static eu.driver.model.geojson.sim.MultiLineString.Builder newBuilder(eu.driver.model.geojson.sim.MultiLineString other) {
    return new eu.driver.model.geojson.sim.MultiLineString.Builder(other);
  }

  /**
   * RecordBuilder for MultiLineString instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MultiLineString>
    implements org.apache.avro.data.RecordBuilder<MultiLineString> {

    private eu.driver.model.geojson.sim.MultiLineStringType type;
    private java.util.List<java.util.List<java.util.List<java.lang.Double>>> coordinates;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(eu.driver.model.geojson.sim.MultiLineString.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.coordinates)) {
        this.coordinates = data().deepCopy(fields()[1].schema(), other.coordinates);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing MultiLineString instance
     * @param other The existing instance to copy.
     */
    private Builder(eu.driver.model.geojson.sim.MultiLineString other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.coordinates)) {
        this.coordinates = data().deepCopy(fields()[1].schema(), other.coordinates);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'type' field.
      * @return The value.
      */
    public eu.driver.model.geojson.sim.MultiLineStringType getType() {
      return type;
    }

    /**
      * Sets the value of the 'type' field.
      * @param value The value of 'type'.
      * @return This builder.
      */
    public eu.driver.model.geojson.sim.MultiLineString.Builder setType(eu.driver.model.geojson.sim.MultiLineStringType value) {
      validate(fields()[0], value);
      this.type = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'type' field.
      * @return This builder.
      */
    public eu.driver.model.geojson.sim.MultiLineString.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'coordinates' field.
      * @return The value.
      */
    public java.util.List<java.util.List<java.util.List<java.lang.Double>>> getCoordinates() {
      return coordinates;
    }

    /**
      * Sets the value of the 'coordinates' field.
      * @param value The value of 'coordinates'.
      * @return This builder.
      */
    public eu.driver.model.geojson.sim.MultiLineString.Builder setCoordinates(java.util.List<java.util.List<java.util.List<java.lang.Double>>> value) {
      validate(fields()[1], value);
      this.coordinates = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'coordinates' field has been set.
      * @return True if the 'coordinates' field has been set, false otherwise.
      */
    public boolean hasCoordinates() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'coordinates' field.
      * @return This builder.
      */
    public eu.driver.model.geojson.sim.MultiLineString.Builder clearCoordinates() {
      coordinates = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public MultiLineString build() {
      try {
        MultiLineString record = new MultiLineString();
        record.type = fieldSetFlags()[0] ? this.type : (eu.driver.model.geojson.sim.MultiLineStringType) defaultValue(fields()[0]);
        record.coordinates = fieldSetFlags()[1] ? this.coordinates : (java.util.List<java.util.List<java.util.List<java.lang.Double>>>) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<MultiLineString>
    WRITER$ = (org.apache.avro.io.DatumWriter<MultiLineString>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<MultiLineString>
    READER$ = (org.apache.avro.io.DatumReader<MultiLineString>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
