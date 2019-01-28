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
public class question extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5304007894862479124L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"question\",\"namespace\":\"eu.driver.model.core\",\"fields\":[{\"name\":\"id\",\"type\":\"int\",\"doc\":\"The id of the question in OST database.\"},{\"name\":\"name\",\"type\":\"string\",\"doc\":\"The question.\"},{\"name\":\"description\",\"type\":\"string\",\"doc\":\"The additional clarifications shown below the question.\"},{\"name\":\"answer\",\"type\":\"string\",\"doc\":\"The answer marked by the user (names of radio buttons, names of checkboxes, value of slider or text).\"},{\"name\":\"comment\",\"type\":\"string\",\"doc\":\"The comment provided by the user below the question.\"},{\"name\":\"typeOfQuestion\",\"type\":{\"type\":\"enum\",\"name\":\"TypeOfQuestion\",\"symbols\":[\"slider\",\"checkbox\",\"radiobutton\",\"text\"]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<question> ENCODER =
      new BinaryMessageEncoder<question>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<question> DECODER =
      new BinaryMessageDecoder<question>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<question> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<question> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<question>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this question to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a question from a ByteBuffer. */
  public static question fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** The id of the question in OST database. */
  @Deprecated public int id;
  /** The question. */
  @Deprecated public java.lang.CharSequence name;
  /** The additional clarifications shown below the question. */
  @Deprecated public java.lang.CharSequence description;
  /** The answer marked by the user (names of radio buttons, names of checkboxes, value of slider or text). */
  @Deprecated public java.lang.CharSequence answer;
  /** The comment provided by the user below the question. */
  @Deprecated public java.lang.CharSequence comment;
  @Deprecated public eu.driver.model.core.TypeOfQuestion typeOfQuestion;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public question() {}

  /**
   * All-args constructor.
   * @param id The id of the question in OST database.
   * @param name The question.
   * @param description The additional clarifications shown below the question.
   * @param answer The answer marked by the user (names of radio buttons, names of checkboxes, value of slider or text).
   * @param comment The comment provided by the user below the question.
   * @param typeOfQuestion The new value for typeOfQuestion
   */
  public question(java.lang.Integer id, java.lang.CharSequence name, java.lang.CharSequence description, java.lang.CharSequence answer, java.lang.CharSequence comment, eu.driver.model.core.TypeOfQuestion typeOfQuestion) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.answer = answer;
    this.comment = comment;
    this.typeOfQuestion = typeOfQuestion;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return description;
    case 3: return answer;
    case 4: return comment;
    case 5: return typeOfQuestion;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Integer)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: description = (java.lang.CharSequence)value$; break;
    case 3: answer = (java.lang.CharSequence)value$; break;
    case 4: comment = (java.lang.CharSequence)value$; break;
    case 5: typeOfQuestion = (eu.driver.model.core.TypeOfQuestion)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The id of the question in OST database.
   */
  public java.lang.Integer getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * The id of the question in OST database.
   * @param value the value to set.
   */
  public void setId(java.lang.Integer value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return The question.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * The question.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'description' field.
   * @return The additional clarifications shown below the question.
   */
  public java.lang.CharSequence getDescription() {
    return description;
  }

  /**
   * Sets the value of the 'description' field.
   * The additional clarifications shown below the question.
   * @param value the value to set.
   */
  public void setDescription(java.lang.CharSequence value) {
    this.description = value;
  }

  /**
   * Gets the value of the 'answer' field.
   * @return The answer marked by the user (names of radio buttons, names of checkboxes, value of slider or text).
   */
  public java.lang.CharSequence getAnswer() {
    return answer;
  }

  /**
   * Sets the value of the 'answer' field.
   * The answer marked by the user (names of radio buttons, names of checkboxes, value of slider or text).
   * @param value the value to set.
   */
  public void setAnswer(java.lang.CharSequence value) {
    this.answer = value;
  }

  /**
   * Gets the value of the 'comment' field.
   * @return The comment provided by the user below the question.
   */
  public java.lang.CharSequence getComment() {
    return comment;
  }

  /**
   * Sets the value of the 'comment' field.
   * The comment provided by the user below the question.
   * @param value the value to set.
   */
  public void setComment(java.lang.CharSequence value) {
    this.comment = value;
  }

  /**
   * Gets the value of the 'typeOfQuestion' field.
   * @return The value of the 'typeOfQuestion' field.
   */
  public eu.driver.model.core.TypeOfQuestion getTypeOfQuestion() {
    return typeOfQuestion;
  }

  /**
   * Sets the value of the 'typeOfQuestion' field.
   * @param value the value to set.
   */
  public void setTypeOfQuestion(eu.driver.model.core.TypeOfQuestion value) {
    this.typeOfQuestion = value;
  }

  /**
   * Creates a new question RecordBuilder.
   * @return A new question RecordBuilder
   */
  public static eu.driver.model.core.question.Builder newBuilder() {
    return new eu.driver.model.core.question.Builder();
  }

  /**
   * Creates a new question RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new question RecordBuilder
   */
  public static eu.driver.model.core.question.Builder newBuilder(eu.driver.model.core.question.Builder other) {
    return new eu.driver.model.core.question.Builder(other);
  }

  /**
   * Creates a new question RecordBuilder by copying an existing question instance.
   * @param other The existing instance to copy.
   * @return A new question RecordBuilder
   */
  public static eu.driver.model.core.question.Builder newBuilder(eu.driver.model.core.question other) {
    return new eu.driver.model.core.question.Builder(other);
  }

  /**
   * RecordBuilder for question instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<question>
    implements org.apache.avro.data.RecordBuilder<question> {

    /** The id of the question in OST database. */
    private int id;
    /** The question. */
    private java.lang.CharSequence name;
    /** The additional clarifications shown below the question. */
    private java.lang.CharSequence description;
    /** The answer marked by the user (names of radio buttons, names of checkboxes, value of slider or text). */
    private java.lang.CharSequence answer;
    /** The comment provided by the user below the question. */
    private java.lang.CharSequence comment;
    private eu.driver.model.core.TypeOfQuestion typeOfQuestion;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(eu.driver.model.core.question.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.description)) {
        this.description = data().deepCopy(fields()[2].schema(), other.description);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.answer)) {
        this.answer = data().deepCopy(fields()[3].schema(), other.answer);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.comment)) {
        this.comment = data().deepCopy(fields()[4].schema(), other.comment);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.typeOfQuestion)) {
        this.typeOfQuestion = data().deepCopy(fields()[5].schema(), other.typeOfQuestion);
        fieldSetFlags()[5] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing question instance
     * @param other The existing instance to copy.
     */
    private Builder(eu.driver.model.core.question other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.description)) {
        this.description = data().deepCopy(fields()[2].schema(), other.description);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.answer)) {
        this.answer = data().deepCopy(fields()[3].schema(), other.answer);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.comment)) {
        this.comment = data().deepCopy(fields()[4].schema(), other.comment);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.typeOfQuestion)) {
        this.typeOfQuestion = data().deepCopy(fields()[5].schema(), other.typeOfQuestion);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * The id of the question in OST database.
      * @return The value.
      */
    public java.lang.Integer getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * The id of the question in OST database.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public eu.driver.model.core.question.Builder setId(int value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * The id of the question in OST database.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * The id of the question in OST database.
      * @return This builder.
      */
    public eu.driver.model.core.question.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * The question.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * The question.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public eu.driver.model.core.question.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * The question.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'name' field.
      * The question.
      * @return This builder.
      */
    public eu.driver.model.core.question.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'description' field.
      * The additional clarifications shown below the question.
      * @return The value.
      */
    public java.lang.CharSequence getDescription() {
      return description;
    }

    /**
      * Sets the value of the 'description' field.
      * The additional clarifications shown below the question.
      * @param value The value of 'description'.
      * @return This builder.
      */
    public eu.driver.model.core.question.Builder setDescription(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.description = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'description' field has been set.
      * The additional clarifications shown below the question.
      * @return True if the 'description' field has been set, false otherwise.
      */
    public boolean hasDescription() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'description' field.
      * The additional clarifications shown below the question.
      * @return This builder.
      */
    public eu.driver.model.core.question.Builder clearDescription() {
      description = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'answer' field.
      * The answer marked by the user (names of radio buttons, names of checkboxes, value of slider or text).
      * @return The value.
      */
    public java.lang.CharSequence getAnswer() {
      return answer;
    }

    /**
      * Sets the value of the 'answer' field.
      * The answer marked by the user (names of radio buttons, names of checkboxes, value of slider or text).
      * @param value The value of 'answer'.
      * @return This builder.
      */
    public eu.driver.model.core.question.Builder setAnswer(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.answer = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'answer' field has been set.
      * The answer marked by the user (names of radio buttons, names of checkboxes, value of slider or text).
      * @return True if the 'answer' field has been set, false otherwise.
      */
    public boolean hasAnswer() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'answer' field.
      * The answer marked by the user (names of radio buttons, names of checkboxes, value of slider or text).
      * @return This builder.
      */
    public eu.driver.model.core.question.Builder clearAnswer() {
      answer = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'comment' field.
      * The comment provided by the user below the question.
      * @return The value.
      */
    public java.lang.CharSequence getComment() {
      return comment;
    }

    /**
      * Sets the value of the 'comment' field.
      * The comment provided by the user below the question.
      * @param value The value of 'comment'.
      * @return This builder.
      */
    public eu.driver.model.core.question.Builder setComment(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.comment = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'comment' field has been set.
      * The comment provided by the user below the question.
      * @return True if the 'comment' field has been set, false otherwise.
      */
    public boolean hasComment() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'comment' field.
      * The comment provided by the user below the question.
      * @return This builder.
      */
    public eu.driver.model.core.question.Builder clearComment() {
      comment = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'typeOfQuestion' field.
      * @return The value.
      */
    public eu.driver.model.core.TypeOfQuestion getTypeOfQuestion() {
      return typeOfQuestion;
    }

    /**
      * Sets the value of the 'typeOfQuestion' field.
      * @param value The value of 'typeOfQuestion'.
      * @return This builder.
      */
    public eu.driver.model.core.question.Builder setTypeOfQuestion(eu.driver.model.core.TypeOfQuestion value) {
      validate(fields()[5], value);
      this.typeOfQuestion = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'typeOfQuestion' field has been set.
      * @return True if the 'typeOfQuestion' field has been set, false otherwise.
      */
    public boolean hasTypeOfQuestion() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'typeOfQuestion' field.
      * @return This builder.
      */
    public eu.driver.model.core.question.Builder clearTypeOfQuestion() {
      typeOfQuestion = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public question build() {
      try {
        question record = new question();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Integer) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.description = fieldSetFlags()[2] ? this.description : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.answer = fieldSetFlags()[3] ? this.answer : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.comment = fieldSetFlags()[4] ? this.comment : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.typeOfQuestion = fieldSetFlags()[5] ? this.typeOfQuestion : (eu.driver.model.core.TypeOfQuestion) defaultValue(fields()[5]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<question>
    WRITER$ = (org.apache.avro.io.DatumWriter<question>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<question>
    READER$ = (org.apache.avro.io.DatumReader<question>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
