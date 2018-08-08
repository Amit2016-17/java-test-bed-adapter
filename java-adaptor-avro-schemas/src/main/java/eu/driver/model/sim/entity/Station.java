/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package eu.driver.model.sim.entity;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
/** Common Simulation Space Location, representing a visual location (building or area) inside the simulation world. *Copyright (C) 2017-2018 XVR Simulation B.V., Delft, The Netherlands, Martijn Hendriks <hendriks @ xvrsim.com>. This file is part of DRIVER+ WP923 Test-bed infrastructure project. This file is licensed under the MIT license : https://github.com/DRIVER-EU/avro-schemas/blob/master/LICENSE* */
@org.apache.avro.specific.AvroGenerated
public class Station extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8944268004931812622L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Station\",\"namespace\":\"eu.driver.model.sim.entity\",\"doc\":\"Common Simulation Space Location, representing a visual location (building or area) inside the simulation world. *Copyright (C) 2017-2018 XVR Simulation B.V., Delft, The Netherlands, Martijn Hendriks <hendriks @ xvrsim.com>. This file is part of DRIVER+ WP923 Test-bed infrastructure project. This file is licensed under the MIT license : https://github.com/DRIVER-EU/avro-schemas/blob/master/LICENSE*\",\"fields\":[{\"name\":\"guid\",\"type\":\"string\",\"doc\":\"Globally unique identifier for this entity\"},{\"name\":\"name\",\"type\":\"string\",\"doc\":\"Name of this entity\"},{\"name\":\"owner\",\"type\":\"string\",\"doc\":\"Identifier of the simulator currently responsible for this entity\"},{\"name\":\"location\",\"type\":{\"type\":\"record\",\"name\":\"Location\",\"namespace\":\"eu.driver.model.sim.geo\",\"doc\":\"WGS84-based standard representation of a location on earth\",\"fields\":[{\"name\":\"latitude\",\"type\":\"double\",\"doc\":\"Latitude in degrees (-90, 90] - 0 is equator\"},{\"name\":\"longitude\",\"type\":\"double\",\"doc\":\"Longitude in degrees (-180, 180] - 0 is line [geographic north - Greenwich - geographic south]\"},{\"name\":\"altitude\",\"type\":\"double\",\"doc\":\"Altitude in meters - 0 is surface of WGS84-based ellipsoid\"}]},\"doc\":\"Geo-referenced location of this station\"},{\"name\":\"address\",\"type\":{\"type\":\"record\",\"name\":\"Address\",\"namespace\":\"eu.driver.model.sim.geo\",\"doc\":\"Postal address information\",\"fields\":[{\"name\":\"street\",\"type\":\"string\",\"doc\":\"The street name\"},{\"name\":\"postalCode\",\"type\":\"string\",\"doc\":\"The postal code\"},{\"name\":\"city\",\"type\":\"string\",\"doc\":\"The city name\"},{\"name\":\"state\",\"type\":\"string\",\"doc\":\"The state or province name\"},{\"name\":\"country\",\"type\":\"string\",\"doc\":\"The country name\"}]},\"doc\":\"Address information regarding the station\"},{\"name\":\"visibleForParticipant\",\"type\":\"boolean\",\"doc\":\"Indication whether or not this station is visible for all participants\"},{\"name\":\"movable\",\"type\":\"boolean\",\"doc\":\"Indication whether or not this station is movable in the simulation world\"},{\"name\":\"scenarioLabel\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"ScenarioLabel\",\"namespace\":\"eu.driver.model.sim.entity.station\",\"symbols\":[\"GENERIC\",\"POLICE\",\"AMBULANCE\",\"FIRE\",\"HOSPITAL\",\"MILITARY\",\"INCIDENT\",\"INCIDENT_MANAGEMENT\"]}],\"doc\":\"Scenario category of this station\",\"default\":null},{\"name\":\"userTags\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"List of all tags the user provided associated with this station\",\"default\":null},{\"name\":\"items\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"List of physical item references (represented by their GUIDs) that are currently at the station\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Station> ENCODER =
      new BinaryMessageEncoder<Station>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Station> DECODER =
      new BinaryMessageDecoder<Station>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Station> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Station> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Station>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Station to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Station from a ByteBuffer. */
  public static Station fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Globally unique identifier for this entity */
  @Deprecated public java.lang.CharSequence guid;
  /** Name of this entity */
  @Deprecated public java.lang.CharSequence name;
  /** Identifier of the simulator currently responsible for this entity */
  @Deprecated public java.lang.CharSequence owner;
  /** Geo-referenced location of this station */
  @Deprecated public eu.driver.model.sim.geo.Location location;
  /** Address information regarding the station */
  @Deprecated public eu.driver.model.sim.geo.Address address;
  /** Indication whether or not this station is visible for all participants */
  @Deprecated public boolean visibleForParticipant;
  /** Indication whether or not this station is movable in the simulation world */
  @Deprecated public boolean movable;
  /** Scenario category of this station */
  @Deprecated public eu.driver.model.sim.entity.station.ScenarioLabel scenarioLabel;
  /** List of all tags the user provided associated with this station */
  @Deprecated public java.util.List<java.lang.CharSequence> userTags;
  /** List of physical item references (represented by their GUIDs) that are currently at the station */
  @Deprecated public java.util.List<java.lang.CharSequence> items;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Station() {}

  /**
   * All-args constructor.
   * @param guid Globally unique identifier for this entity
   * @param name Name of this entity
   * @param owner Identifier of the simulator currently responsible for this entity
   * @param location Geo-referenced location of this station
   * @param address Address information regarding the station
   * @param visibleForParticipant Indication whether or not this station is visible for all participants
   * @param movable Indication whether or not this station is movable in the simulation world
   * @param scenarioLabel Scenario category of this station
   * @param userTags List of all tags the user provided associated with this station
   * @param items List of physical item references (represented by their GUIDs) that are currently at the station
   */
  public Station(java.lang.CharSequence guid, java.lang.CharSequence name, java.lang.CharSequence owner, eu.driver.model.sim.geo.Location location, eu.driver.model.sim.geo.Address address, java.lang.Boolean visibleForParticipant, java.lang.Boolean movable, eu.driver.model.sim.entity.station.ScenarioLabel scenarioLabel, java.util.List<java.lang.CharSequence> userTags, java.util.List<java.lang.CharSequence> items) {
    this.guid = guid;
    this.name = name;
    this.owner = owner;
    this.location = location;
    this.address = address;
    this.visibleForParticipant = visibleForParticipant;
    this.movable = movable;
    this.scenarioLabel = scenarioLabel;
    this.userTags = userTags;
    this.items = items;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return guid;
    case 1: return name;
    case 2: return owner;
    case 3: return location;
    case 4: return address;
    case 5: return visibleForParticipant;
    case 6: return movable;
    case 7: return scenarioLabel;
    case 8: return userTags;
    case 9: return items;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: guid = (java.lang.CharSequence)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: owner = (java.lang.CharSequence)value$; break;
    case 3: location = (eu.driver.model.sim.geo.Location)value$; break;
    case 4: address = (eu.driver.model.sim.geo.Address)value$; break;
    case 5: visibleForParticipant = (java.lang.Boolean)value$; break;
    case 6: movable = (java.lang.Boolean)value$; break;
    case 7: scenarioLabel = (eu.driver.model.sim.entity.station.ScenarioLabel)value$; break;
    case 8: userTags = (java.util.List<java.lang.CharSequence>)value$; break;
    case 9: items = (java.util.List<java.lang.CharSequence>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'guid' field.
   * @return Globally unique identifier for this entity
   */
  public java.lang.CharSequence getGuid() {
    return guid;
  }

  /**
   * Sets the value of the 'guid' field.
   * Globally unique identifier for this entity
   * @param value the value to set.
   */
  public void setGuid(java.lang.CharSequence value) {
    this.guid = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return Name of this entity
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * Name of this entity
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'owner' field.
   * @return Identifier of the simulator currently responsible for this entity
   */
  public java.lang.CharSequence getOwner() {
    return owner;
  }

  /**
   * Sets the value of the 'owner' field.
   * Identifier of the simulator currently responsible for this entity
   * @param value the value to set.
   */
  public void setOwner(java.lang.CharSequence value) {
    this.owner = value;
  }

  /**
   * Gets the value of the 'location' field.
   * @return Geo-referenced location of this station
   */
  public eu.driver.model.sim.geo.Location getLocation() {
    return location;
  }

  /**
   * Sets the value of the 'location' field.
   * Geo-referenced location of this station
   * @param value the value to set.
   */
  public void setLocation(eu.driver.model.sim.geo.Location value) {
    this.location = value;
  }

  /**
   * Gets the value of the 'address' field.
   * @return Address information regarding the station
   */
  public eu.driver.model.sim.geo.Address getAddress() {
    return address;
  }

  /**
   * Sets the value of the 'address' field.
   * Address information regarding the station
   * @param value the value to set.
   */
  public void setAddress(eu.driver.model.sim.geo.Address value) {
    this.address = value;
  }

  /**
   * Gets the value of the 'visibleForParticipant' field.
   * @return Indication whether or not this station is visible for all participants
   */
  public java.lang.Boolean getVisibleForParticipant() {
    return visibleForParticipant;
  }

  /**
   * Sets the value of the 'visibleForParticipant' field.
   * Indication whether or not this station is visible for all participants
   * @param value the value to set.
   */
  public void setVisibleForParticipant(java.lang.Boolean value) {
    this.visibleForParticipant = value;
  }

  /**
   * Gets the value of the 'movable' field.
   * @return Indication whether or not this station is movable in the simulation world
   */
  public java.lang.Boolean getMovable() {
    return movable;
  }

  /**
   * Sets the value of the 'movable' field.
   * Indication whether or not this station is movable in the simulation world
   * @param value the value to set.
   */
  public void setMovable(java.lang.Boolean value) {
    this.movable = value;
  }

  /**
   * Gets the value of the 'scenarioLabel' field.
   * @return Scenario category of this station
   */
  public eu.driver.model.sim.entity.station.ScenarioLabel getScenarioLabel() {
    return scenarioLabel;
  }

  /**
   * Sets the value of the 'scenarioLabel' field.
   * Scenario category of this station
   * @param value the value to set.
   */
  public void setScenarioLabel(eu.driver.model.sim.entity.station.ScenarioLabel value) {
    this.scenarioLabel = value;
  }

  /**
   * Gets the value of the 'userTags' field.
   * @return List of all tags the user provided associated with this station
   */
  public java.util.List<java.lang.CharSequence> getUserTags() {
    return userTags;
  }

  /**
   * Sets the value of the 'userTags' field.
   * List of all tags the user provided associated with this station
   * @param value the value to set.
   */
  public void setUserTags(java.util.List<java.lang.CharSequence> value) {
    this.userTags = value;
  }

  /**
   * Gets the value of the 'items' field.
   * @return List of physical item references (represented by their GUIDs) that are currently at the station
   */
  public java.util.List<java.lang.CharSequence> getItems() {
    return items;
  }

  /**
   * Sets the value of the 'items' field.
   * List of physical item references (represented by their GUIDs) that are currently at the station
   * @param value the value to set.
   */
  public void setItems(java.util.List<java.lang.CharSequence> value) {
    this.items = value;
  }

  /**
   * Creates a new Station RecordBuilder.
   * @return A new Station RecordBuilder
   */
  public static eu.driver.model.sim.entity.Station.Builder newBuilder() {
    return new eu.driver.model.sim.entity.Station.Builder();
  }

  /**
   * Creates a new Station RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Station RecordBuilder
   */
  public static eu.driver.model.sim.entity.Station.Builder newBuilder(eu.driver.model.sim.entity.Station.Builder other) {
    return new eu.driver.model.sim.entity.Station.Builder(other);
  }

  /**
   * Creates a new Station RecordBuilder by copying an existing Station instance.
   * @param other The existing instance to copy.
   * @return A new Station RecordBuilder
   */
  public static eu.driver.model.sim.entity.Station.Builder newBuilder(eu.driver.model.sim.entity.Station other) {
    return new eu.driver.model.sim.entity.Station.Builder(other);
  }

  /**
   * RecordBuilder for Station instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Station>
    implements org.apache.avro.data.RecordBuilder<Station> {

    /** Globally unique identifier for this entity */
    private java.lang.CharSequence guid;
    /** Name of this entity */
    private java.lang.CharSequence name;
    /** Identifier of the simulator currently responsible for this entity */
    private java.lang.CharSequence owner;
    /** Geo-referenced location of this station */
    private eu.driver.model.sim.geo.Location location;
    private eu.driver.model.sim.geo.Location.Builder locationBuilder;
    /** Address information regarding the station */
    private eu.driver.model.sim.geo.Address address;
    private eu.driver.model.sim.geo.Address.Builder addressBuilder;
    /** Indication whether or not this station is visible for all participants */
    private boolean visibleForParticipant;
    /** Indication whether or not this station is movable in the simulation world */
    private boolean movable;
    /** Scenario category of this station */
    private eu.driver.model.sim.entity.station.ScenarioLabel scenarioLabel;
    /** List of all tags the user provided associated with this station */
    private java.util.List<java.lang.CharSequence> userTags;
    /** List of physical item references (represented by their GUIDs) that are currently at the station */
    private java.util.List<java.lang.CharSequence> items;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(eu.driver.model.sim.entity.Station.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.guid)) {
        this.guid = data().deepCopy(fields()[0].schema(), other.guid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.owner)) {
        this.owner = data().deepCopy(fields()[2].schema(), other.owner);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.location)) {
        this.location = data().deepCopy(fields()[3].schema(), other.location);
        fieldSetFlags()[3] = true;
      }
      if (other.hasLocationBuilder()) {
        this.locationBuilder = eu.driver.model.sim.geo.Location.newBuilder(other.getLocationBuilder());
      }
      if (isValidValue(fields()[4], other.address)) {
        this.address = data().deepCopy(fields()[4].schema(), other.address);
        fieldSetFlags()[4] = true;
      }
      if (other.hasAddressBuilder()) {
        this.addressBuilder = eu.driver.model.sim.geo.Address.newBuilder(other.getAddressBuilder());
      }
      if (isValidValue(fields()[5], other.visibleForParticipant)) {
        this.visibleForParticipant = data().deepCopy(fields()[5].schema(), other.visibleForParticipant);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.movable)) {
        this.movable = data().deepCopy(fields()[6].schema(), other.movable);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.scenarioLabel)) {
        this.scenarioLabel = data().deepCopy(fields()[7].schema(), other.scenarioLabel);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.userTags)) {
        this.userTags = data().deepCopy(fields()[8].schema(), other.userTags);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.items)) {
        this.items = data().deepCopy(fields()[9].schema(), other.items);
        fieldSetFlags()[9] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Station instance
     * @param other The existing instance to copy.
     */
    private Builder(eu.driver.model.sim.entity.Station other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.guid)) {
        this.guid = data().deepCopy(fields()[0].schema(), other.guid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.owner)) {
        this.owner = data().deepCopy(fields()[2].schema(), other.owner);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.location)) {
        this.location = data().deepCopy(fields()[3].schema(), other.location);
        fieldSetFlags()[3] = true;
      }
      this.locationBuilder = null;
      if (isValidValue(fields()[4], other.address)) {
        this.address = data().deepCopy(fields()[4].schema(), other.address);
        fieldSetFlags()[4] = true;
      }
      this.addressBuilder = null;
      if (isValidValue(fields()[5], other.visibleForParticipant)) {
        this.visibleForParticipant = data().deepCopy(fields()[5].schema(), other.visibleForParticipant);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.movable)) {
        this.movable = data().deepCopy(fields()[6].schema(), other.movable);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.scenarioLabel)) {
        this.scenarioLabel = data().deepCopy(fields()[7].schema(), other.scenarioLabel);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.userTags)) {
        this.userTags = data().deepCopy(fields()[8].schema(), other.userTags);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.items)) {
        this.items = data().deepCopy(fields()[9].schema(), other.items);
        fieldSetFlags()[9] = true;
      }
    }

    /**
      * Gets the value of the 'guid' field.
      * Globally unique identifier for this entity
      * @return The value.
      */
    public java.lang.CharSequence getGuid() {
      return guid;
    }

    /**
      * Sets the value of the 'guid' field.
      * Globally unique identifier for this entity
      * @param value The value of 'guid'.
      * @return This builder.
      */
    public eu.driver.model.sim.entity.Station.Builder setGuid(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.guid = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'guid' field has been set.
      * Globally unique identifier for this entity
      * @return True if the 'guid' field has been set, false otherwise.
      */
    public boolean hasGuid() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'guid' field.
      * Globally unique identifier for this entity
      * @return This builder.
      */
    public eu.driver.model.sim.entity.Station.Builder clearGuid() {
      guid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * Name of this entity
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * Name of this entity
      * @param value The value of 'name'.
      * @return This builder.
      */
    public eu.driver.model.sim.entity.Station.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * Name of this entity
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'name' field.
      * Name of this entity
      * @return This builder.
      */
    public eu.driver.model.sim.entity.Station.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'owner' field.
      * Identifier of the simulator currently responsible for this entity
      * @return The value.
      */
    public java.lang.CharSequence getOwner() {
      return owner;
    }

    /**
      * Sets the value of the 'owner' field.
      * Identifier of the simulator currently responsible for this entity
      * @param value The value of 'owner'.
      * @return This builder.
      */
    public eu.driver.model.sim.entity.Station.Builder setOwner(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.owner = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'owner' field has been set.
      * Identifier of the simulator currently responsible for this entity
      * @return True if the 'owner' field has been set, false otherwise.
      */
    public boolean hasOwner() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'owner' field.
      * Identifier of the simulator currently responsible for this entity
      * @return This builder.
      */
    public eu.driver.model.sim.entity.Station.Builder clearOwner() {
      owner = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'location' field.
      * Geo-referenced location of this station
      * @return The value.
      */
    public eu.driver.model.sim.geo.Location getLocation() {
      return location;
    }

    /**
      * Sets the value of the 'location' field.
      * Geo-referenced location of this station
      * @param value The value of 'location'.
      * @return This builder.
      */
    public eu.driver.model.sim.entity.Station.Builder setLocation(eu.driver.model.sim.geo.Location value) {
      validate(fields()[3], value);
      this.locationBuilder = null;
      this.location = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'location' field has been set.
      * Geo-referenced location of this station
      * @return True if the 'location' field has been set, false otherwise.
      */
    public boolean hasLocation() {
      return fieldSetFlags()[3];
    }

    /**
     * Gets the Builder instance for the 'location' field and creates one if it doesn't exist yet.
     * Geo-referenced location of this station
     * @return This builder.
     */
    public eu.driver.model.sim.geo.Location.Builder getLocationBuilder() {
      if (locationBuilder == null) {
        if (hasLocation()) {
          setLocationBuilder(eu.driver.model.sim.geo.Location.newBuilder(location));
        } else {
          setLocationBuilder(eu.driver.model.sim.geo.Location.newBuilder());
        }
      }
      return locationBuilder;
    }

    /**
     * Sets the Builder instance for the 'location' field
     * Geo-referenced location of this station
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public eu.driver.model.sim.entity.Station.Builder setLocationBuilder(eu.driver.model.sim.geo.Location.Builder value) {
      clearLocation();
      locationBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'location' field has an active Builder instance
     * Geo-referenced location of this station
     * @return True if the 'location' field has an active Builder instance
     */
    public boolean hasLocationBuilder() {
      return locationBuilder != null;
    }

    /**
      * Clears the value of the 'location' field.
      * Geo-referenced location of this station
      * @return This builder.
      */
    public eu.driver.model.sim.entity.Station.Builder clearLocation() {
      location = null;
      locationBuilder = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'address' field.
      * Address information regarding the station
      * @return The value.
      */
    public eu.driver.model.sim.geo.Address getAddress() {
      return address;
    }

    /**
      * Sets the value of the 'address' field.
      * Address information regarding the station
      * @param value The value of 'address'.
      * @return This builder.
      */
    public eu.driver.model.sim.entity.Station.Builder setAddress(eu.driver.model.sim.geo.Address value) {
      validate(fields()[4], value);
      this.addressBuilder = null;
      this.address = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'address' field has been set.
      * Address information regarding the station
      * @return True if the 'address' field has been set, false otherwise.
      */
    public boolean hasAddress() {
      return fieldSetFlags()[4];
    }

    /**
     * Gets the Builder instance for the 'address' field and creates one if it doesn't exist yet.
     * Address information regarding the station
     * @return This builder.
     */
    public eu.driver.model.sim.geo.Address.Builder getAddressBuilder() {
      if (addressBuilder == null) {
        if (hasAddress()) {
          setAddressBuilder(eu.driver.model.sim.geo.Address.newBuilder(address));
        } else {
          setAddressBuilder(eu.driver.model.sim.geo.Address.newBuilder());
        }
      }
      return addressBuilder;
    }

    /**
     * Sets the Builder instance for the 'address' field
     * Address information regarding the station
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public eu.driver.model.sim.entity.Station.Builder setAddressBuilder(eu.driver.model.sim.geo.Address.Builder value) {
      clearAddress();
      addressBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'address' field has an active Builder instance
     * Address information regarding the station
     * @return True if the 'address' field has an active Builder instance
     */
    public boolean hasAddressBuilder() {
      return addressBuilder != null;
    }

    /**
      * Clears the value of the 'address' field.
      * Address information regarding the station
      * @return This builder.
      */
    public eu.driver.model.sim.entity.Station.Builder clearAddress() {
      address = null;
      addressBuilder = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'visibleForParticipant' field.
      * Indication whether or not this station is visible for all participants
      * @return The value.
      */
    public java.lang.Boolean getVisibleForParticipant() {
      return visibleForParticipant;
    }

    /**
      * Sets the value of the 'visibleForParticipant' field.
      * Indication whether or not this station is visible for all participants
      * @param value The value of 'visibleForParticipant'.
      * @return This builder.
      */
    public eu.driver.model.sim.entity.Station.Builder setVisibleForParticipant(boolean value) {
      validate(fields()[5], value);
      this.visibleForParticipant = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'visibleForParticipant' field has been set.
      * Indication whether or not this station is visible for all participants
      * @return True if the 'visibleForParticipant' field has been set, false otherwise.
      */
    public boolean hasVisibleForParticipant() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'visibleForParticipant' field.
      * Indication whether or not this station is visible for all participants
      * @return This builder.
      */
    public eu.driver.model.sim.entity.Station.Builder clearVisibleForParticipant() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'movable' field.
      * Indication whether or not this station is movable in the simulation world
      * @return The value.
      */
    public java.lang.Boolean getMovable() {
      return movable;
    }

    /**
      * Sets the value of the 'movable' field.
      * Indication whether or not this station is movable in the simulation world
      * @param value The value of 'movable'.
      * @return This builder.
      */
    public eu.driver.model.sim.entity.Station.Builder setMovable(boolean value) {
      validate(fields()[6], value);
      this.movable = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'movable' field has been set.
      * Indication whether or not this station is movable in the simulation world
      * @return True if the 'movable' field has been set, false otherwise.
      */
    public boolean hasMovable() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'movable' field.
      * Indication whether or not this station is movable in the simulation world
      * @return This builder.
      */
    public eu.driver.model.sim.entity.Station.Builder clearMovable() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'scenarioLabel' field.
      * Scenario category of this station
      * @return The value.
      */
    public eu.driver.model.sim.entity.station.ScenarioLabel getScenarioLabel() {
      return scenarioLabel;
    }

    /**
      * Sets the value of the 'scenarioLabel' field.
      * Scenario category of this station
      * @param value The value of 'scenarioLabel'.
      * @return This builder.
      */
    public eu.driver.model.sim.entity.Station.Builder setScenarioLabel(eu.driver.model.sim.entity.station.ScenarioLabel value) {
      validate(fields()[7], value);
      this.scenarioLabel = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'scenarioLabel' field has been set.
      * Scenario category of this station
      * @return True if the 'scenarioLabel' field has been set, false otherwise.
      */
    public boolean hasScenarioLabel() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'scenarioLabel' field.
      * Scenario category of this station
      * @return This builder.
      */
    public eu.driver.model.sim.entity.Station.Builder clearScenarioLabel() {
      scenarioLabel = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'userTags' field.
      * List of all tags the user provided associated with this station
      * @return The value.
      */
    public java.util.List<java.lang.CharSequence> getUserTags() {
      return userTags;
    }

    /**
      * Sets the value of the 'userTags' field.
      * List of all tags the user provided associated with this station
      * @param value The value of 'userTags'.
      * @return This builder.
      */
    public eu.driver.model.sim.entity.Station.Builder setUserTags(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[8], value);
      this.userTags = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'userTags' field has been set.
      * List of all tags the user provided associated with this station
      * @return True if the 'userTags' field has been set, false otherwise.
      */
    public boolean hasUserTags() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'userTags' field.
      * List of all tags the user provided associated with this station
      * @return This builder.
      */
    public eu.driver.model.sim.entity.Station.Builder clearUserTags() {
      userTags = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'items' field.
      * List of physical item references (represented by their GUIDs) that are currently at the station
      * @return The value.
      */
    public java.util.List<java.lang.CharSequence> getItems() {
      return items;
    }

    /**
      * Sets the value of the 'items' field.
      * List of physical item references (represented by their GUIDs) that are currently at the station
      * @param value The value of 'items'.
      * @return This builder.
      */
    public eu.driver.model.sim.entity.Station.Builder setItems(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[9], value);
      this.items = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'items' field has been set.
      * List of physical item references (represented by their GUIDs) that are currently at the station
      * @return True if the 'items' field has been set, false otherwise.
      */
    public boolean hasItems() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'items' field.
      * List of physical item references (represented by their GUIDs) that are currently at the station
      * @return This builder.
      */
    public eu.driver.model.sim.entity.Station.Builder clearItems() {
      items = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Station build() {
      try {
        Station record = new Station();
        record.guid = fieldSetFlags()[0] ? this.guid : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.owner = fieldSetFlags()[2] ? this.owner : (java.lang.CharSequence) defaultValue(fields()[2]);
        if (locationBuilder != null) {
          record.location = this.locationBuilder.build();
        } else {
          record.location = fieldSetFlags()[3] ? this.location : (eu.driver.model.sim.geo.Location) defaultValue(fields()[3]);
        }
        if (addressBuilder != null) {
          record.address = this.addressBuilder.build();
        } else {
          record.address = fieldSetFlags()[4] ? this.address : (eu.driver.model.sim.geo.Address) defaultValue(fields()[4]);
        }
        record.visibleForParticipant = fieldSetFlags()[5] ? this.visibleForParticipant : (java.lang.Boolean) defaultValue(fields()[5]);
        record.movable = fieldSetFlags()[6] ? this.movable : (java.lang.Boolean) defaultValue(fields()[6]);
        record.scenarioLabel = fieldSetFlags()[7] ? this.scenarioLabel : (eu.driver.model.sim.entity.station.ScenarioLabel) defaultValue(fields()[7]);
        record.userTags = fieldSetFlags()[8] ? this.userTags : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[8]);
        record.items = fieldSetFlags()[9] ? this.items : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[9]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Station>
    WRITER$ = (org.apache.avro.io.DatumWriter<Station>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Station>
    READER$ = (org.apache.avro.io.DatumReader<Station>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
