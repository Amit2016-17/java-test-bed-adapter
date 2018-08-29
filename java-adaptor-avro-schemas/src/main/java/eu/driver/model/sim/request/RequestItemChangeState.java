/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package eu.driver.model.sim.request;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
/** Request for changing an items state. *Copyright (C) 2017-2018 XVR Simulation B.V., Delft, The Netherlands, Martijn Hendriks <hendriks @ xvrsim.com>. This file is part of DRIVER+ WP923 Test-bed infrastructure project. This file is licensed under the MIT license : https://github.com/DRIVER-EU/avro-schemas/blob/master/LICENSE* */
@org.apache.avro.specific.AvroGenerated
public class RequestItemChangeState extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4222342913224484567L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RequestItemChangeState\",\"namespace\":\"eu.driver.model.sim.request\",\"doc\":\"Request for changing an items state. *Copyright (C) 2017-2018 XVR Simulation B.V., Delft, The Netherlands, Martijn Hendriks <hendriks @ xvrsim.com>. This file is part of DRIVER+ WP923 Test-bed infrastructure project. This file is licensed under the MIT license : https://github.com/DRIVER-EU/avro-schemas/blob/master/LICENSE*\",\"fields\":[{\"name\":\"guid\",\"type\":\"string\",\"doc\":\"Globally unique identifier for this request\"},{\"name\":\"owner\",\"type\":\"string\",\"doc\":\"Identifier of the simulator currently responsible for this request\"},{\"name\":\"item\",\"type\":\"string\",\"doc\":\"Globally unique identifier for the item that should change its state\"},{\"name\":\"state\",\"type\":{\"type\":\"enum\",\"name\":\"States\",\"symbols\":[\"IDLE\",\"FRIGHTENED\"]},\"doc\":\"Name of the state to change to\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<RequestItemChangeState> ENCODER =
      new BinaryMessageEncoder<RequestItemChangeState>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<RequestItemChangeState> DECODER =
      new BinaryMessageDecoder<RequestItemChangeState>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<RequestItemChangeState> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<RequestItemChangeState> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<RequestItemChangeState>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this RequestItemChangeState to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a RequestItemChangeState from a ByteBuffer. */
  public static RequestItemChangeState fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Globally unique identifier for this request */
  @Deprecated public java.lang.CharSequence guid;
  /** Identifier of the simulator currently responsible for this request */
  @Deprecated public java.lang.CharSequence owner;
  /** Globally unique identifier for the item that should change its state */
  @Deprecated public java.lang.CharSequence item;
  /** Name of the state to change to */
  @Deprecated public eu.driver.model.sim.request.States state;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public RequestItemChangeState() {}

  /**
   * All-args constructor.
   * @param guid Globally unique identifier for this request
   * @param owner Identifier of the simulator currently responsible for this request
   * @param item Globally unique identifier for the item that should change its state
   * @param state Name of the state to change to
   */
  public RequestItemChangeState(java.lang.CharSequence guid, java.lang.CharSequence owner, java.lang.CharSequence item, eu.driver.model.sim.request.States state) {
    this.guid = guid;
    this.owner = owner;
    this.item = item;
    this.state = state;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return guid;
    case 1: return owner;
    case 2: return item;
    case 3: return state;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: guid = (java.lang.CharSequence)value$; break;
    case 1: owner = (java.lang.CharSequence)value$; break;
    case 2: item = (java.lang.CharSequence)value$; break;
    case 3: state = (eu.driver.model.sim.request.States)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'guid' field.
   * @return Globally unique identifier for this request
   */
  public java.lang.CharSequence getGuid() {
    return guid;
  }

  /**
   * Sets the value of the 'guid' field.
   * Globally unique identifier for this request
   * @param value the value to set.
   */
  public void setGuid(java.lang.CharSequence value) {
    this.guid = value;
  }

  /**
   * Gets the value of the 'owner' field.
   * @return Identifier of the simulator currently responsible for this request
   */
  public java.lang.CharSequence getOwner() {
    return owner;
  }

  /**
   * Sets the value of the 'owner' field.
   * Identifier of the simulator currently responsible for this request
   * @param value the value to set.
   */
  public void setOwner(java.lang.CharSequence value) {
    this.owner = value;
  }

  /**
   * Gets the value of the 'item' field.
   * @return Globally unique identifier for the item that should change its state
   */
  public java.lang.CharSequence getItem() {
    return item;
  }

  /**
   * Sets the value of the 'item' field.
   * Globally unique identifier for the item that should change its state
   * @param value the value to set.
   */
  public void setItem(java.lang.CharSequence value) {
    this.item = value;
  }

  /**
   * Gets the value of the 'state' field.
   * @return Name of the state to change to
   */
  public eu.driver.model.sim.request.States getState() {
    return state;
  }

  /**
   * Sets the value of the 'state' field.
   * Name of the state to change to
   * @param value the value to set.
   */
  public void setState(eu.driver.model.sim.request.States value) {
    this.state = value;
  }

  /**
   * Creates a new RequestItemChangeState RecordBuilder.
   * @return A new RequestItemChangeState RecordBuilder
   */
  public static eu.driver.model.sim.request.RequestItemChangeState.Builder newBuilder() {
    return new eu.driver.model.sim.request.RequestItemChangeState.Builder();
  }

  /**
   * Creates a new RequestItemChangeState RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new RequestItemChangeState RecordBuilder
   */
  public static eu.driver.model.sim.request.RequestItemChangeState.Builder newBuilder(eu.driver.model.sim.request.RequestItemChangeState.Builder other) {
    return new eu.driver.model.sim.request.RequestItemChangeState.Builder(other);
  }

  /**
   * Creates a new RequestItemChangeState RecordBuilder by copying an existing RequestItemChangeState instance.
   * @param other The existing instance to copy.
   * @return A new RequestItemChangeState RecordBuilder
   */
  public static eu.driver.model.sim.request.RequestItemChangeState.Builder newBuilder(eu.driver.model.sim.request.RequestItemChangeState other) {
    return new eu.driver.model.sim.request.RequestItemChangeState.Builder(other);
  }

  /**
   * RecordBuilder for RequestItemChangeState instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RequestItemChangeState>
    implements org.apache.avro.data.RecordBuilder<RequestItemChangeState> {

    /** Globally unique identifier for this request */
    private java.lang.CharSequence guid;
    /** Identifier of the simulator currently responsible for this request */
    private java.lang.CharSequence owner;
    /** Globally unique identifier for the item that should change its state */
    private java.lang.CharSequence item;
    /** Name of the state to change to */
    private eu.driver.model.sim.request.States state;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(eu.driver.model.sim.request.RequestItemChangeState.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.guid)) {
        this.guid = data().deepCopy(fields()[0].schema(), other.guid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.owner)) {
        this.owner = data().deepCopy(fields()[1].schema(), other.owner);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.item)) {
        this.item = data().deepCopy(fields()[2].schema(), other.item);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.state)) {
        this.state = data().deepCopy(fields()[3].schema(), other.state);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing RequestItemChangeState instance
     * @param other The existing instance to copy.
     */
    private Builder(eu.driver.model.sim.request.RequestItemChangeState other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.guid)) {
        this.guid = data().deepCopy(fields()[0].schema(), other.guid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.owner)) {
        this.owner = data().deepCopy(fields()[1].schema(), other.owner);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.item)) {
        this.item = data().deepCopy(fields()[2].schema(), other.item);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.state)) {
        this.state = data().deepCopy(fields()[3].schema(), other.state);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'guid' field.
      * Globally unique identifier for this request
      * @return The value.
      */
    public java.lang.CharSequence getGuid() {
      return guid;
    }

    /**
      * Sets the value of the 'guid' field.
      * Globally unique identifier for this request
      * @param value The value of 'guid'.
      * @return This builder.
      */
    public eu.driver.model.sim.request.RequestItemChangeState.Builder setGuid(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.guid = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'guid' field has been set.
      * Globally unique identifier for this request
      * @return True if the 'guid' field has been set, false otherwise.
      */
    public boolean hasGuid() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'guid' field.
      * Globally unique identifier for this request
      * @return This builder.
      */
    public eu.driver.model.sim.request.RequestItemChangeState.Builder clearGuid() {
      guid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'owner' field.
      * Identifier of the simulator currently responsible for this request
      * @return The value.
      */
    public java.lang.CharSequence getOwner() {
      return owner;
    }

    /**
      * Sets the value of the 'owner' field.
      * Identifier of the simulator currently responsible for this request
      * @param value The value of 'owner'.
      * @return This builder.
      */
    public eu.driver.model.sim.request.RequestItemChangeState.Builder setOwner(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.owner = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'owner' field has been set.
      * Identifier of the simulator currently responsible for this request
      * @return True if the 'owner' field has been set, false otherwise.
      */
    public boolean hasOwner() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'owner' field.
      * Identifier of the simulator currently responsible for this request
      * @return This builder.
      */
    public eu.driver.model.sim.request.RequestItemChangeState.Builder clearOwner() {
      owner = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'item' field.
      * Globally unique identifier for the item that should change its state
      * @return The value.
      */
    public java.lang.CharSequence getItem() {
      return item;
    }

    /**
      * Sets the value of the 'item' field.
      * Globally unique identifier for the item that should change its state
      * @param value The value of 'item'.
      * @return This builder.
      */
    public eu.driver.model.sim.request.RequestItemChangeState.Builder setItem(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.item = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'item' field has been set.
      * Globally unique identifier for the item that should change its state
      * @return True if the 'item' field has been set, false otherwise.
      */
    public boolean hasItem() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'item' field.
      * Globally unique identifier for the item that should change its state
      * @return This builder.
      */
    public eu.driver.model.sim.request.RequestItemChangeState.Builder clearItem() {
      item = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'state' field.
      * Name of the state to change to
      * @return The value.
      */
    public eu.driver.model.sim.request.States getState() {
      return state;
    }

    /**
      * Sets the value of the 'state' field.
      * Name of the state to change to
      * @param value The value of 'state'.
      * @return This builder.
      */
    public eu.driver.model.sim.request.RequestItemChangeState.Builder setState(eu.driver.model.sim.request.States value) {
      validate(fields()[3], value);
      this.state = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'state' field has been set.
      * Name of the state to change to
      * @return True if the 'state' field has been set, false otherwise.
      */
    public boolean hasState() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'state' field.
      * Name of the state to change to
      * @return This builder.
      */
    public eu.driver.model.sim.request.RequestItemChangeState.Builder clearState() {
      state = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public RequestItemChangeState build() {
      try {
        RequestItemChangeState record = new RequestItemChangeState();
        record.guid = fieldSetFlags()[0] ? this.guid : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.owner = fieldSetFlags()[1] ? this.owner : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.item = fieldSetFlags()[2] ? this.item : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.state = fieldSetFlags()[3] ? this.state : (eu.driver.model.sim.request.States) defaultValue(fields()[3]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<RequestItemChangeState>
    WRITER$ = (org.apache.avro.io.DatumWriter<RequestItemChangeState>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<RequestItemChangeState>
    READER$ = (org.apache.avro.io.DatumReader<RequestItemChangeState>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}