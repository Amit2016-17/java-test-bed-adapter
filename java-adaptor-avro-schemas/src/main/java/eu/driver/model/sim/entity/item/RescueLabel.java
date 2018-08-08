/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package eu.driver.model.sim.entity.item;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
/** Information if the item is labeled as rescue */
@org.apache.avro.specific.AvroGenerated
public class RescueLabel extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3258024331444933044L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RescueLabel\",\"namespace\":\"eu.driver.model.sim.entity.item\",\"doc\":\"Information if the item is labeled as rescue\",\"fields\":[{\"name\":\"subLabel\",\"type\":{\"type\":\"enum\",\"name\":\"RescueSubLabel\",\"symbols\":[\"POLICE\",\"MEDICAL\",\"FIRE\",\"SECURITY\",\"MILITARY\"]},\"doc\":\"Sub label of rescue that this item has\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<RescueLabel> ENCODER =
      new BinaryMessageEncoder<RescueLabel>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<RescueLabel> DECODER =
      new BinaryMessageDecoder<RescueLabel>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<RescueLabel> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<RescueLabel> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<RescueLabel>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this RescueLabel to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a RescueLabel from a ByteBuffer. */
  public static RescueLabel fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Sub label of rescue that this item has */
  @Deprecated public eu.driver.model.sim.entity.item.RescueSubLabel subLabel;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public RescueLabel() {}

  /**
   * All-args constructor.
   * @param subLabel Sub label of rescue that this item has
   */
  public RescueLabel(eu.driver.model.sim.entity.item.RescueSubLabel subLabel) {
    this.subLabel = subLabel;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return subLabel;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: subLabel = (eu.driver.model.sim.entity.item.RescueSubLabel)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'subLabel' field.
   * @return Sub label of rescue that this item has
   */
  public eu.driver.model.sim.entity.item.RescueSubLabel getSubLabel() {
    return subLabel;
  }

  /**
   * Sets the value of the 'subLabel' field.
   * Sub label of rescue that this item has
   * @param value the value to set.
   */
  public void setSubLabel(eu.driver.model.sim.entity.item.RescueSubLabel value) {
    this.subLabel = value;
  }

  /**
   * Creates a new RescueLabel RecordBuilder.
   * @return A new RescueLabel RecordBuilder
   */
  public static eu.driver.model.sim.entity.item.RescueLabel.Builder newBuilder() {
    return new eu.driver.model.sim.entity.item.RescueLabel.Builder();
  }

  /**
   * Creates a new RescueLabel RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new RescueLabel RecordBuilder
   */
  public static eu.driver.model.sim.entity.item.RescueLabel.Builder newBuilder(eu.driver.model.sim.entity.item.RescueLabel.Builder other) {
    return new eu.driver.model.sim.entity.item.RescueLabel.Builder(other);
  }

  /**
   * Creates a new RescueLabel RecordBuilder by copying an existing RescueLabel instance.
   * @param other The existing instance to copy.
   * @return A new RescueLabel RecordBuilder
   */
  public static eu.driver.model.sim.entity.item.RescueLabel.Builder newBuilder(eu.driver.model.sim.entity.item.RescueLabel other) {
    return new eu.driver.model.sim.entity.item.RescueLabel.Builder(other);
  }

  /**
   * RecordBuilder for RescueLabel instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RescueLabel>
    implements org.apache.avro.data.RecordBuilder<RescueLabel> {

    /** Sub label of rescue that this item has */
    private eu.driver.model.sim.entity.item.RescueSubLabel subLabel;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(eu.driver.model.sim.entity.item.RescueLabel.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.subLabel)) {
        this.subLabel = data().deepCopy(fields()[0].schema(), other.subLabel);
        fieldSetFlags()[0] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing RescueLabel instance
     * @param other The existing instance to copy.
     */
    private Builder(eu.driver.model.sim.entity.item.RescueLabel other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.subLabel)) {
        this.subLabel = data().deepCopy(fields()[0].schema(), other.subLabel);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'subLabel' field.
      * Sub label of rescue that this item has
      * @return The value.
      */
    public eu.driver.model.sim.entity.item.RescueSubLabel getSubLabel() {
      return subLabel;
    }

    /**
      * Sets the value of the 'subLabel' field.
      * Sub label of rescue that this item has
      * @param value The value of 'subLabel'.
      * @return This builder.
      */
    public eu.driver.model.sim.entity.item.RescueLabel.Builder setSubLabel(eu.driver.model.sim.entity.item.RescueSubLabel value) {
      validate(fields()[0], value);
      this.subLabel = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'subLabel' field has been set.
      * Sub label of rescue that this item has
      * @return True if the 'subLabel' field has been set, false otherwise.
      */
    public boolean hasSubLabel() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'subLabel' field.
      * Sub label of rescue that this item has
      * @return This builder.
      */
    public eu.driver.model.sim.entity.item.RescueLabel.Builder clearSubLabel() {
      subLabel = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public RescueLabel build() {
      try {
        RescueLabel record = new RescueLabel();
        record.subLabel = fieldSetFlags()[0] ? this.subLabel : (eu.driver.model.sim.entity.item.RescueSubLabel) defaultValue(fields()[0]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<RescueLabel>
    WRITER$ = (org.apache.avro.io.DatumWriter<RescueLabel>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<RescueLabel>
    READER$ = (org.apache.avro.io.DatumReader<RescueLabel>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
