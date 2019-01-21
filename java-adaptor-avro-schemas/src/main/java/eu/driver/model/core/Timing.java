/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package eu.driver.model.core;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
/** Timing message to distribute the trial time. */
@org.apache.avro.specific.AvroGenerated
public class Timing extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6653542271961315190L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Timing\",\"namespace\":\"eu.driver.model.core\",\"doc\":\"Timing message to distribute the trial time.\",\"fields\":[{\"name\":\"updatedAt\",\"type\":\"long\",\"doc\":\"The date and time the trialTime was updated as the number of milliseconds from the unix epoch, 1 January 1970 00:00:00.000 UTC.\",\"logicalType\":\"timestamp-millis\"},{\"name\":\"trialTime\",\"type\":\"long\",\"doc\":\"The fictive date and time of the simulation / trial as the number of milliseconds from the unix epoch, 1 January 1970 00:00:00.000 UTC.\",\"logicalType\":\"timestamp-millis\"},{\"name\":\"timeElapsed\",\"type\":\"long\",\"doc\":\"The number of milliseconds from the start of the trial.\",\"logicalType\":\"timestamp-millis\"},{\"name\":\"trialTimeSpeed\",\"type\":\"float\",\"doc\":\"Positive number, indicating how fast the simulation / trial time moves with respect to the actual time. A value of 0 means a pause, 1 is as fast as real-time.\"},{\"name\":\"state\",\"type\":{\"type\":\"enum\",\"name\":\"State\",\"symbols\":[\"Idle\",\"Initialized\",\"Started\",\"Paused\",\"Stopped\"]},\"doc\":\"The State of the Test-Bed Time Service.\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Timing> ENCODER =
      new BinaryMessageEncoder<Timing>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Timing> DECODER =
      new BinaryMessageDecoder<Timing>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Timing> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Timing> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Timing>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Timing to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Timing from a ByteBuffer. */
  public static Timing fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** The date and time the trialTime was updated as the number of milliseconds from the unix epoch, 1 January 1970 00:00:00.000 UTC. */
  @Deprecated public long updatedAt;
  /** The fictive date and time of the simulation / trial as the number of milliseconds from the unix epoch, 1 January 1970 00:00:00.000 UTC. */
  @Deprecated public long trialTime;
  /** The number of milliseconds from the start of the trial. */
  @Deprecated public long timeElapsed;
  /** Positive number, indicating how fast the simulation / trial time moves with respect to the actual time. A value of 0 means a pause, 1 is as fast as real-time. */
  @Deprecated public float trialTimeSpeed;
  /** The State of the Test-Bed Time Service. */
  @Deprecated public eu.driver.model.core.State state;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Timing() {}

  /**
   * All-args constructor.
   * @param updatedAt The date and time the trialTime was updated as the number of milliseconds from the unix epoch, 1 January 1970 00:00:00.000 UTC.
   * @param trialTime The fictive date and time of the simulation / trial as the number of milliseconds from the unix epoch, 1 January 1970 00:00:00.000 UTC.
   * @param timeElapsed The number of milliseconds from the start of the trial.
   * @param trialTimeSpeed Positive number, indicating how fast the simulation / trial time moves with respect to the actual time. A value of 0 means a pause, 1 is as fast as real-time.
   * @param state The State of the Test-Bed Time Service.
   */
  public Timing(java.lang.Long updatedAt, java.lang.Long trialTime, java.lang.Long timeElapsed, java.lang.Float trialTimeSpeed, eu.driver.model.core.State state) {
    this.updatedAt = updatedAt;
    this.trialTime = trialTime;
    this.timeElapsed = timeElapsed;
    this.trialTimeSpeed = trialTimeSpeed;
    this.state = state;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return updatedAt;
    case 1: return trialTime;
    case 2: return timeElapsed;
    case 3: return trialTimeSpeed;
    case 4: return state;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: updatedAt = (java.lang.Long)value$; break;
    case 1: trialTime = (java.lang.Long)value$; break;
    case 2: timeElapsed = (java.lang.Long)value$; break;
    case 3: trialTimeSpeed = (java.lang.Float)value$; break;
    case 4: state = (eu.driver.model.core.State)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'updatedAt' field.
   * @return The date and time the trialTime was updated as the number of milliseconds from the unix epoch, 1 January 1970 00:00:00.000 UTC.
   */
  public java.lang.Long getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Sets the value of the 'updatedAt' field.
   * The date and time the trialTime was updated as the number of milliseconds from the unix epoch, 1 January 1970 00:00:00.000 UTC.
   * @param value the value to set.
   */
  public void setUpdatedAt(java.lang.Long value) {
    this.updatedAt = value;
  }

  /**
   * Gets the value of the 'trialTime' field.
   * @return The fictive date and time of the simulation / trial as the number of milliseconds from the unix epoch, 1 January 1970 00:00:00.000 UTC.
   */
  public java.lang.Long getTrialTime() {
    return trialTime;
  }

  /**
   * Sets the value of the 'trialTime' field.
   * The fictive date and time of the simulation / trial as the number of milliseconds from the unix epoch, 1 January 1970 00:00:00.000 UTC.
   * @param value the value to set.
   */
  public void setTrialTime(java.lang.Long value) {
    this.trialTime = value;
  }

  /**
   * Gets the value of the 'timeElapsed' field.
   * @return The number of milliseconds from the start of the trial.
   */
  public java.lang.Long getTimeElapsed() {
    return timeElapsed;
  }

  /**
   * Sets the value of the 'timeElapsed' field.
   * The number of milliseconds from the start of the trial.
   * @param value the value to set.
   */
  public void setTimeElapsed(java.lang.Long value) {
    this.timeElapsed = value;
  }

  /**
   * Gets the value of the 'trialTimeSpeed' field.
   * @return Positive number, indicating how fast the simulation / trial time moves with respect to the actual time. A value of 0 means a pause, 1 is as fast as real-time.
   */
  public java.lang.Float getTrialTimeSpeed() {
    return trialTimeSpeed;
  }

  /**
   * Sets the value of the 'trialTimeSpeed' field.
   * Positive number, indicating how fast the simulation / trial time moves with respect to the actual time. A value of 0 means a pause, 1 is as fast as real-time.
   * @param value the value to set.
   */
  public void setTrialTimeSpeed(java.lang.Float value) {
    this.trialTimeSpeed = value;
  }

  /**
   * Gets the value of the 'state' field.
   * @return The State of the Test-Bed Time Service.
   */
  public eu.driver.model.core.State getState() {
    return state;
  }

  /**
   * Sets the value of the 'state' field.
   * The State of the Test-Bed Time Service.
   * @param value the value to set.
   */
  public void setState(eu.driver.model.core.State value) {
    this.state = value;
  }

  /**
   * Creates a new Timing RecordBuilder.
   * @return A new Timing RecordBuilder
   */
  public static eu.driver.model.core.Timing.Builder newBuilder() {
    return new eu.driver.model.core.Timing.Builder();
  }

  /**
   * Creates a new Timing RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Timing RecordBuilder
   */
  public static eu.driver.model.core.Timing.Builder newBuilder(eu.driver.model.core.Timing.Builder other) {
    return new eu.driver.model.core.Timing.Builder(other);
  }

  /**
   * Creates a new Timing RecordBuilder by copying an existing Timing instance.
   * @param other The existing instance to copy.
   * @return A new Timing RecordBuilder
   */
  public static eu.driver.model.core.Timing.Builder newBuilder(eu.driver.model.core.Timing other) {
    return new eu.driver.model.core.Timing.Builder(other);
  }

  /**
   * RecordBuilder for Timing instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Timing>
    implements org.apache.avro.data.RecordBuilder<Timing> {

    /** The date and time the trialTime was updated as the number of milliseconds from the unix epoch, 1 January 1970 00:00:00.000 UTC. */
    private long updatedAt;
    /** The fictive date and time of the simulation / trial as the number of milliseconds from the unix epoch, 1 January 1970 00:00:00.000 UTC. */
    private long trialTime;
    /** The number of milliseconds from the start of the trial. */
    private long timeElapsed;
    /** Positive number, indicating how fast the simulation / trial time moves with respect to the actual time. A value of 0 means a pause, 1 is as fast as real-time. */
    private float trialTimeSpeed;
    /** The State of the Test-Bed Time Service. */
    private eu.driver.model.core.State state;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(eu.driver.model.core.Timing.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.updatedAt)) {
        this.updatedAt = data().deepCopy(fields()[0].schema(), other.updatedAt);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.trialTime)) {
        this.trialTime = data().deepCopy(fields()[1].schema(), other.trialTime);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timeElapsed)) {
        this.timeElapsed = data().deepCopy(fields()[2].schema(), other.timeElapsed);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.trialTimeSpeed)) {
        this.trialTimeSpeed = data().deepCopy(fields()[3].schema(), other.trialTimeSpeed);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.state)) {
        this.state = data().deepCopy(fields()[4].schema(), other.state);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Timing instance
     * @param other The existing instance to copy.
     */
    private Builder(eu.driver.model.core.Timing other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.updatedAt)) {
        this.updatedAt = data().deepCopy(fields()[0].schema(), other.updatedAt);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.trialTime)) {
        this.trialTime = data().deepCopy(fields()[1].schema(), other.trialTime);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timeElapsed)) {
        this.timeElapsed = data().deepCopy(fields()[2].schema(), other.timeElapsed);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.trialTimeSpeed)) {
        this.trialTimeSpeed = data().deepCopy(fields()[3].schema(), other.trialTimeSpeed);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.state)) {
        this.state = data().deepCopy(fields()[4].schema(), other.state);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'updatedAt' field.
      * The date and time the trialTime was updated as the number of milliseconds from the unix epoch, 1 January 1970 00:00:00.000 UTC.
      * @return The value.
      */
    public java.lang.Long getUpdatedAt() {
      return updatedAt;
    }

    /**
      * Sets the value of the 'updatedAt' field.
      * The date and time the trialTime was updated as the number of milliseconds from the unix epoch, 1 January 1970 00:00:00.000 UTC.
      * @param value The value of 'updatedAt'.
      * @return This builder.
      */
    public eu.driver.model.core.Timing.Builder setUpdatedAt(long value) {
      validate(fields()[0], value);
      this.updatedAt = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'updatedAt' field has been set.
      * The date and time the trialTime was updated as the number of milliseconds from the unix epoch, 1 January 1970 00:00:00.000 UTC.
      * @return True if the 'updatedAt' field has been set, false otherwise.
      */
    public boolean hasUpdatedAt() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'updatedAt' field.
      * The date and time the trialTime was updated as the number of milliseconds from the unix epoch, 1 January 1970 00:00:00.000 UTC.
      * @return This builder.
      */
    public eu.driver.model.core.Timing.Builder clearUpdatedAt() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'trialTime' field.
      * The fictive date and time of the simulation / trial as the number of milliseconds from the unix epoch, 1 January 1970 00:00:00.000 UTC.
      * @return The value.
      */
    public java.lang.Long getTrialTime() {
      return trialTime;
    }

    /**
      * Sets the value of the 'trialTime' field.
      * The fictive date and time of the simulation / trial as the number of milliseconds from the unix epoch, 1 January 1970 00:00:00.000 UTC.
      * @param value The value of 'trialTime'.
      * @return This builder.
      */
    public eu.driver.model.core.Timing.Builder setTrialTime(long value) {
      validate(fields()[1], value);
      this.trialTime = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'trialTime' field has been set.
      * The fictive date and time of the simulation / trial as the number of milliseconds from the unix epoch, 1 January 1970 00:00:00.000 UTC.
      * @return True if the 'trialTime' field has been set, false otherwise.
      */
    public boolean hasTrialTime() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'trialTime' field.
      * The fictive date and time of the simulation / trial as the number of milliseconds from the unix epoch, 1 January 1970 00:00:00.000 UTC.
      * @return This builder.
      */
    public eu.driver.model.core.Timing.Builder clearTrialTime() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'timeElapsed' field.
      * The number of milliseconds from the start of the trial.
      * @return The value.
      */
    public java.lang.Long getTimeElapsed() {
      return timeElapsed;
    }

    /**
      * Sets the value of the 'timeElapsed' field.
      * The number of milliseconds from the start of the trial.
      * @param value The value of 'timeElapsed'.
      * @return This builder.
      */
    public eu.driver.model.core.Timing.Builder setTimeElapsed(long value) {
      validate(fields()[2], value);
      this.timeElapsed = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'timeElapsed' field has been set.
      * The number of milliseconds from the start of the trial.
      * @return True if the 'timeElapsed' field has been set, false otherwise.
      */
    public boolean hasTimeElapsed() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'timeElapsed' field.
      * The number of milliseconds from the start of the trial.
      * @return This builder.
      */
    public eu.driver.model.core.Timing.Builder clearTimeElapsed() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'trialTimeSpeed' field.
      * Positive number, indicating how fast the simulation / trial time moves with respect to the actual time. A value of 0 means a pause, 1 is as fast as real-time.
      * @return The value.
      */
    public java.lang.Float getTrialTimeSpeed() {
      return trialTimeSpeed;
    }

    /**
      * Sets the value of the 'trialTimeSpeed' field.
      * Positive number, indicating how fast the simulation / trial time moves with respect to the actual time. A value of 0 means a pause, 1 is as fast as real-time.
      * @param value The value of 'trialTimeSpeed'.
      * @return This builder.
      */
    public eu.driver.model.core.Timing.Builder setTrialTimeSpeed(float value) {
      validate(fields()[3], value);
      this.trialTimeSpeed = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'trialTimeSpeed' field has been set.
      * Positive number, indicating how fast the simulation / trial time moves with respect to the actual time. A value of 0 means a pause, 1 is as fast as real-time.
      * @return True if the 'trialTimeSpeed' field has been set, false otherwise.
      */
    public boolean hasTrialTimeSpeed() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'trialTimeSpeed' field.
      * Positive number, indicating how fast the simulation / trial time moves with respect to the actual time. A value of 0 means a pause, 1 is as fast as real-time.
      * @return This builder.
      */
    public eu.driver.model.core.Timing.Builder clearTrialTimeSpeed() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'state' field.
      * The State of the Test-Bed Time Service.
      * @return The value.
      */
    public eu.driver.model.core.State getState() {
      return state;
    }

    /**
      * Sets the value of the 'state' field.
      * The State of the Test-Bed Time Service.
      * @param value The value of 'state'.
      * @return This builder.
      */
    public eu.driver.model.core.Timing.Builder setState(eu.driver.model.core.State value) {
      validate(fields()[4], value);
      this.state = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'state' field has been set.
      * The State of the Test-Bed Time Service.
      * @return True if the 'state' field has been set, false otherwise.
      */
    public boolean hasState() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'state' field.
      * The State of the Test-Bed Time Service.
      * @return This builder.
      */
    public eu.driver.model.core.Timing.Builder clearState() {
      state = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Timing build() {
      try {
        Timing record = new Timing();
        record.updatedAt = fieldSetFlags()[0] ? this.updatedAt : (java.lang.Long) defaultValue(fields()[0]);
        record.trialTime = fieldSetFlags()[1] ? this.trialTime : (java.lang.Long) defaultValue(fields()[1]);
        record.timeElapsed = fieldSetFlags()[2] ? this.timeElapsed : (java.lang.Long) defaultValue(fields()[2]);
        record.trialTimeSpeed = fieldSetFlags()[3] ? this.trialTimeSpeed : (java.lang.Float) defaultValue(fields()[3]);
        record.state = fieldSetFlags()[4] ? this.state : (eu.driver.model.core.State) defaultValue(fields()[4]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Timing>
    WRITER$ = (org.apache.avro.io.DatumWriter<Timing>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Timing>
    READER$ = (org.apache.avro.io.DatumReader<Timing>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
