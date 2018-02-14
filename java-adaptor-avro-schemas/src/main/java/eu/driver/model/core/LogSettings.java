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
@org.apache.avro.specific.AvroGenerated
public class LogSettings extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 9088712664429935396L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"LogSettings\",\"namespace\":\"eu.driver.model.core\",\"fields\":[{\"name\":\"logToFile\",\"type\":[\"null\",\"int\"],\"doc\":\"If set [0..5], log to file as specified in logFile\",\"default\":null},{\"name\":\"logFile\",\"type\":[\"null\",\"string\"],\"doc\":\"Name of the log file\",\"default\":null},{\"name\":\"logToConsole\",\"type\":[\"null\",\"int\"],\"doc\":\"If set [0..5], log to console. Number indicates logging level\",\"default\":null},{\"name\":\"logToKafka\",\"type\":[\"null\",\"int\"],\"doc\":\"If set [0..5], log to Kafka\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<LogSettings> ENCODER =
      new BinaryMessageEncoder<LogSettings>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<LogSettings> DECODER =
      new BinaryMessageDecoder<LogSettings>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<LogSettings> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<LogSettings> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<LogSettings>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this LogSettings to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a LogSettings from a ByteBuffer. */
  public static LogSettings fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** If set [0..5], log to file as specified in logFile */
  @Deprecated public java.lang.Integer logToFile;
  /** Name of the log file */
  @Deprecated public java.lang.CharSequence logFile;
  /** If set [0..5], log to console. Number indicates logging level */
  @Deprecated public java.lang.Integer logToConsole;
  /** If set [0..5], log to Kafka */
  @Deprecated public java.lang.Integer logToKafka;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public LogSettings() {}

  /**
   * All-args constructor.
   * @param logToFile If set [0..5], log to file as specified in logFile
   * @param logFile Name of the log file
   * @param logToConsole If set [0..5], log to console. Number indicates logging level
   * @param logToKafka If set [0..5], log to Kafka
   */
  public LogSettings(java.lang.Integer logToFile, java.lang.CharSequence logFile, java.lang.Integer logToConsole, java.lang.Integer logToKafka) {
    this.logToFile = logToFile;
    this.logFile = logFile;
    this.logToConsole = logToConsole;
    this.logToKafka = logToKafka;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return logToFile;
    case 1: return logFile;
    case 2: return logToConsole;
    case 3: return logToKafka;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: logToFile = (java.lang.Integer)value$; break;
    case 1: logFile = (java.lang.CharSequence)value$; break;
    case 2: logToConsole = (java.lang.Integer)value$; break;
    case 3: logToKafka = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'logToFile' field.
   * @return If set [0..5], log to file as specified in logFile
   */
  public java.lang.Integer getLogToFile() {
    return logToFile;
  }

  /**
   * Sets the value of the 'logToFile' field.
   * If set [0..5], log to file as specified in logFile
   * @param value the value to set.
   */
  public void setLogToFile(java.lang.Integer value) {
    this.logToFile = value;
  }

  /**
   * Gets the value of the 'logFile' field.
   * @return Name of the log file
   */
  public java.lang.CharSequence getLogFile() {
    return logFile;
  }

  /**
   * Sets the value of the 'logFile' field.
   * Name of the log file
   * @param value the value to set.
   */
  public void setLogFile(java.lang.CharSequence value) {
    this.logFile = value;
  }

  /**
   * Gets the value of the 'logToConsole' field.
   * @return If set [0..5], log to console. Number indicates logging level
   */
  public java.lang.Integer getLogToConsole() {
    return logToConsole;
  }

  /**
   * Sets the value of the 'logToConsole' field.
   * If set [0..5], log to console. Number indicates logging level
   * @param value the value to set.
   */
  public void setLogToConsole(java.lang.Integer value) {
    this.logToConsole = value;
  }

  /**
   * Gets the value of the 'logToKafka' field.
   * @return If set [0..5], log to Kafka
   */
  public java.lang.Integer getLogToKafka() {
    return logToKafka;
  }

  /**
   * Sets the value of the 'logToKafka' field.
   * If set [0..5], log to Kafka
   * @param value the value to set.
   */
  public void setLogToKafka(java.lang.Integer value) {
    this.logToKafka = value;
  }

  /**
   * Creates a new LogSettings RecordBuilder.
   * @return A new LogSettings RecordBuilder
   */
  public static eu.driver.model.core.LogSettings.Builder newBuilder() {
    return new eu.driver.model.core.LogSettings.Builder();
  }

  /**
   * Creates a new LogSettings RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new LogSettings RecordBuilder
   */
  public static eu.driver.model.core.LogSettings.Builder newBuilder(eu.driver.model.core.LogSettings.Builder other) {
    return new eu.driver.model.core.LogSettings.Builder(other);
  }

  /**
   * Creates a new LogSettings RecordBuilder by copying an existing LogSettings instance.
   * @param other The existing instance to copy.
   * @return A new LogSettings RecordBuilder
   */
  public static eu.driver.model.core.LogSettings.Builder newBuilder(eu.driver.model.core.LogSettings other) {
    return new eu.driver.model.core.LogSettings.Builder(other);
  }

  /**
   * RecordBuilder for LogSettings instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<LogSettings>
    implements org.apache.avro.data.RecordBuilder<LogSettings> {

    /** If set [0..5], log to file as specified in logFile */
    private java.lang.Integer logToFile;
    /** Name of the log file */
    private java.lang.CharSequence logFile;
    /** If set [0..5], log to console. Number indicates logging level */
    private java.lang.Integer logToConsole;
    /** If set [0..5], log to Kafka */
    private java.lang.Integer logToKafka;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(eu.driver.model.core.LogSettings.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.logToFile)) {
        this.logToFile = data().deepCopy(fields()[0].schema(), other.logToFile);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.logFile)) {
        this.logFile = data().deepCopy(fields()[1].schema(), other.logFile);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.logToConsole)) {
        this.logToConsole = data().deepCopy(fields()[2].schema(), other.logToConsole);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.logToKafka)) {
        this.logToKafka = data().deepCopy(fields()[3].schema(), other.logToKafka);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing LogSettings instance
     * @param other The existing instance to copy.
     */
    private Builder(eu.driver.model.core.LogSettings other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.logToFile)) {
        this.logToFile = data().deepCopy(fields()[0].schema(), other.logToFile);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.logFile)) {
        this.logFile = data().deepCopy(fields()[1].schema(), other.logFile);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.logToConsole)) {
        this.logToConsole = data().deepCopy(fields()[2].schema(), other.logToConsole);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.logToKafka)) {
        this.logToKafka = data().deepCopy(fields()[3].schema(), other.logToKafka);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'logToFile' field.
      * If set [0..5], log to file as specified in logFile
      * @return The value.
      */
    public java.lang.Integer getLogToFile() {
      return logToFile;
    }

    /**
      * Sets the value of the 'logToFile' field.
      * If set [0..5], log to file as specified in logFile
      * @param value The value of 'logToFile'.
      * @return This builder.
      */
    public eu.driver.model.core.LogSettings.Builder setLogToFile(java.lang.Integer value) {
      validate(fields()[0], value);
      this.logToFile = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'logToFile' field has been set.
      * If set [0..5], log to file as specified in logFile
      * @return True if the 'logToFile' field has been set, false otherwise.
      */
    public boolean hasLogToFile() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'logToFile' field.
      * If set [0..5], log to file as specified in logFile
      * @return This builder.
      */
    public eu.driver.model.core.LogSettings.Builder clearLogToFile() {
      logToFile = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'logFile' field.
      * Name of the log file
      * @return The value.
      */
    public java.lang.CharSequence getLogFile() {
      return logFile;
    }

    /**
      * Sets the value of the 'logFile' field.
      * Name of the log file
      * @param value The value of 'logFile'.
      * @return This builder.
      */
    public eu.driver.model.core.LogSettings.Builder setLogFile(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.logFile = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'logFile' field has been set.
      * Name of the log file
      * @return True if the 'logFile' field has been set, false otherwise.
      */
    public boolean hasLogFile() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'logFile' field.
      * Name of the log file
      * @return This builder.
      */
    public eu.driver.model.core.LogSettings.Builder clearLogFile() {
      logFile = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'logToConsole' field.
      * If set [0..5], log to console. Number indicates logging level
      * @return The value.
      */
    public java.lang.Integer getLogToConsole() {
      return logToConsole;
    }

    /**
      * Sets the value of the 'logToConsole' field.
      * If set [0..5], log to console. Number indicates logging level
      * @param value The value of 'logToConsole'.
      * @return This builder.
      */
    public eu.driver.model.core.LogSettings.Builder setLogToConsole(java.lang.Integer value) {
      validate(fields()[2], value);
      this.logToConsole = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'logToConsole' field has been set.
      * If set [0..5], log to console. Number indicates logging level
      * @return True if the 'logToConsole' field has been set, false otherwise.
      */
    public boolean hasLogToConsole() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'logToConsole' field.
      * If set [0..5], log to console. Number indicates logging level
      * @return This builder.
      */
    public eu.driver.model.core.LogSettings.Builder clearLogToConsole() {
      logToConsole = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'logToKafka' field.
      * If set [0..5], log to Kafka
      * @return The value.
      */
    public java.lang.Integer getLogToKafka() {
      return logToKafka;
    }

    /**
      * Sets the value of the 'logToKafka' field.
      * If set [0..5], log to Kafka
      * @param value The value of 'logToKafka'.
      * @return This builder.
      */
    public eu.driver.model.core.LogSettings.Builder setLogToKafka(java.lang.Integer value) {
      validate(fields()[3], value);
      this.logToKafka = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'logToKafka' field has been set.
      * If set [0..5], log to Kafka
      * @return True if the 'logToKafka' field has been set, false otherwise.
      */
    public boolean hasLogToKafka() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'logToKafka' field.
      * If set [0..5], log to Kafka
      * @return This builder.
      */
    public eu.driver.model.core.LogSettings.Builder clearLogToKafka() {
      logToKafka = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public LogSettings build() {
      try {
        LogSettings record = new LogSettings();
        record.logToFile = fieldSetFlags()[0] ? this.logToFile : (java.lang.Integer) defaultValue(fields()[0]);
        record.logFile = fieldSetFlags()[1] ? this.logFile : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.logToConsole = fieldSetFlags()[2] ? this.logToConsole : (java.lang.Integer) defaultValue(fields()[2]);
        record.logToKafka = fieldSetFlags()[3] ? this.logToKafka : (java.lang.Integer) defaultValue(fields()[3]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<LogSettings>
    WRITER$ = (org.apache.avro.io.DatumWriter<LogSettings>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<LogSettings>
    READER$ = (org.apache.avro.io.DatumReader<LogSettings>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}