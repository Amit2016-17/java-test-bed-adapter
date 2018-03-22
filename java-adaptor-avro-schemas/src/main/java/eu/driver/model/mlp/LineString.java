/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package eu.driver.model.mlp;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class LineString extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4129427200766100855L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"LineString\",\"namespace\":\"eu.driver.model.mlp\",\"fields\":[{\"name\":\"coord\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Coord\",\"fields\":[{\"name\":\"X\",\"type\":\"string\",\"doc\":\"The first coordinate in a coordinate system (30 27 45.3N)\"},{\"name\":\"Y\",\"type\":[\"null\",\"string\"],\"doc\":\"Second ordinate in a coordinate.system (45 25 52.9E). This is optional if it is a linear coordinate system.\",\"default\":null},{\"name\":\"Z\",\"type\":[\"null\",\"string\"],\"doc\":\"Third ordinate in a coordinate system which has at least three ordinates.\",\"default\":null}]}},\"doc\":\"Must contain at least 2 coordinates\"},{\"name\":\"attr_gid\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"attr_srsName\",\"type\":[\"null\",\"string\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<LineString> ENCODER =
      new BinaryMessageEncoder<LineString>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<LineString> DECODER =
      new BinaryMessageDecoder<LineString>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<LineString> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<LineString> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<LineString>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this LineString to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a LineString from a ByteBuffer. */
  public static LineString fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Must contain at least 2 coordinates */
  @Deprecated public java.util.List<eu.driver.model.mlp.Coord> coord;
  @Deprecated public java.lang.CharSequence attr_gid;
  @Deprecated public java.lang.CharSequence attr_srsName;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public LineString() {}

  /**
   * All-args constructor.
   * @param coord Must contain at least 2 coordinates
   * @param attr_gid The new value for attr_gid
   * @param attr_srsName The new value for attr_srsName
   */
  public LineString(java.util.List<eu.driver.model.mlp.Coord> coord, java.lang.CharSequence attr_gid, java.lang.CharSequence attr_srsName) {
    this.coord = coord;
    this.attr_gid = attr_gid;
    this.attr_srsName = attr_srsName;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return coord;
    case 1: return attr_gid;
    case 2: return attr_srsName;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: coord = (java.util.List<eu.driver.model.mlp.Coord>)value$; break;
    case 1: attr_gid = (java.lang.CharSequence)value$; break;
    case 2: attr_srsName = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'coord' field.
   * @return Must contain at least 2 coordinates
   */
  public java.util.List<eu.driver.model.mlp.Coord> getCoord() {
    return coord;
  }

  /**
   * Sets the value of the 'coord' field.
   * Must contain at least 2 coordinates
   * @param value the value to set.
   */
  public void setCoord(java.util.List<eu.driver.model.mlp.Coord> value) {
    this.coord = value;
  }

  /**
   * Gets the value of the 'attr_gid' field.
   * @return The value of the 'attr_gid' field.
   */
  public java.lang.CharSequence getAttrGid() {
    return attr_gid;
  }

  /**
   * Sets the value of the 'attr_gid' field.
   * @param value the value to set.
   */
  public void setAttrGid(java.lang.CharSequence value) {
    this.attr_gid = value;
  }

  /**
   * Gets the value of the 'attr_srsName' field.
   * @return The value of the 'attr_srsName' field.
   */
  public java.lang.CharSequence getAttrSrsName() {
    return attr_srsName;
  }

  /**
   * Sets the value of the 'attr_srsName' field.
   * @param value the value to set.
   */
  public void setAttrSrsName(java.lang.CharSequence value) {
    this.attr_srsName = value;
  }

  /**
   * Creates a new LineString RecordBuilder.
   * @return A new LineString RecordBuilder
   */
  public static eu.driver.model.mlp.LineString.Builder newBuilder() {
    return new eu.driver.model.mlp.LineString.Builder();
  }

  /**
   * Creates a new LineString RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new LineString RecordBuilder
   */
  public static eu.driver.model.mlp.LineString.Builder newBuilder(eu.driver.model.mlp.LineString.Builder other) {
    return new eu.driver.model.mlp.LineString.Builder(other);
  }

  /**
   * Creates a new LineString RecordBuilder by copying an existing LineString instance.
   * @param other The existing instance to copy.
   * @return A new LineString RecordBuilder
   */
  public static eu.driver.model.mlp.LineString.Builder newBuilder(eu.driver.model.mlp.LineString other) {
    return new eu.driver.model.mlp.LineString.Builder(other);
  }

  /**
   * RecordBuilder for LineString instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<LineString>
    implements org.apache.avro.data.RecordBuilder<LineString> {

    /** Must contain at least 2 coordinates */
    private java.util.List<eu.driver.model.mlp.Coord> coord;
    private java.lang.CharSequence attr_gid;
    private java.lang.CharSequence attr_srsName;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(eu.driver.model.mlp.LineString.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.coord)) {
        this.coord = data().deepCopy(fields()[0].schema(), other.coord);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.attr_gid)) {
        this.attr_gid = data().deepCopy(fields()[1].schema(), other.attr_gid);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.attr_srsName)) {
        this.attr_srsName = data().deepCopy(fields()[2].schema(), other.attr_srsName);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing LineString instance
     * @param other The existing instance to copy.
     */
    private Builder(eu.driver.model.mlp.LineString other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.coord)) {
        this.coord = data().deepCopy(fields()[0].schema(), other.coord);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.attr_gid)) {
        this.attr_gid = data().deepCopy(fields()[1].schema(), other.attr_gid);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.attr_srsName)) {
        this.attr_srsName = data().deepCopy(fields()[2].schema(), other.attr_srsName);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'coord' field.
      * Must contain at least 2 coordinates
      * @return The value.
      */
    public java.util.List<eu.driver.model.mlp.Coord> getCoord() {
      return coord;
    }

    /**
      * Sets the value of the 'coord' field.
      * Must contain at least 2 coordinates
      * @param value The value of 'coord'.
      * @return This builder.
      */
    public eu.driver.model.mlp.LineString.Builder setCoord(java.util.List<eu.driver.model.mlp.Coord> value) {
      validate(fields()[0], value);
      this.coord = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'coord' field has been set.
      * Must contain at least 2 coordinates
      * @return True if the 'coord' field has been set, false otherwise.
      */
    public boolean hasCoord() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'coord' field.
      * Must contain at least 2 coordinates
      * @return This builder.
      */
    public eu.driver.model.mlp.LineString.Builder clearCoord() {
      coord = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'attr_gid' field.
      * @return The value.
      */
    public java.lang.CharSequence getAttrGid() {
      return attr_gid;
    }

    /**
      * Sets the value of the 'attr_gid' field.
      * @param value The value of 'attr_gid'.
      * @return This builder.
      */
    public eu.driver.model.mlp.LineString.Builder setAttrGid(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.attr_gid = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'attr_gid' field has been set.
      * @return True if the 'attr_gid' field has been set, false otherwise.
      */
    public boolean hasAttrGid() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'attr_gid' field.
      * @return This builder.
      */
    public eu.driver.model.mlp.LineString.Builder clearAttrGid() {
      attr_gid = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'attr_srsName' field.
      * @return The value.
      */
    public java.lang.CharSequence getAttrSrsName() {
      return attr_srsName;
    }

    /**
      * Sets the value of the 'attr_srsName' field.
      * @param value The value of 'attr_srsName'.
      * @return This builder.
      */
    public eu.driver.model.mlp.LineString.Builder setAttrSrsName(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.attr_srsName = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'attr_srsName' field has been set.
      * @return True if the 'attr_srsName' field has been set, false otherwise.
      */
    public boolean hasAttrSrsName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'attr_srsName' field.
      * @return This builder.
      */
    public eu.driver.model.mlp.LineString.Builder clearAttrSrsName() {
      attr_srsName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public LineString build() {
      try {
        LineString record = new LineString();
        record.coord = fieldSetFlags()[0] ? this.coord : (java.util.List<eu.driver.model.mlp.Coord>) defaultValue(fields()[0]);
        record.attr_gid = fieldSetFlags()[1] ? this.attr_gid : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.attr_srsName = fieldSetFlags()[2] ? this.attr_srsName : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<LineString>
    WRITER$ = (org.apache.avro.io.DatumWriter<LineString>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<LineString>
    READER$ = (org.apache.avro.io.DatumReader<LineString>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}