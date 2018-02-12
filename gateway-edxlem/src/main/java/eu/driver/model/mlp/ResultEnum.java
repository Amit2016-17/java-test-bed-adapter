/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package eu.driver.model.mlp;
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public enum ResultEnum {
  OK, SYSTEM_FAILURE, UNSPECIFIED_ERROR, UNAUTHORIZED_APPLICATION, UNKNOWN_SUBSCRIBER, ABSENT_SUBSCRIBER, POSITION_METHOD_FAILURE, CONGESTION_IN_LOCATION_SERVER, CONGESTION_IN_MOBILE_NETWORK, UNSUPPORTED_VERSION, TOO_MANY_POSITION_ITEMS, FORMAT_ERROR, SYNTAX_ERROR, PROTOCOL_ELEMENT_NOT_SUPPORTED, SERVICE_NOT_SUPPORTED, PROTOCOL_ELEMENT_ATTRIBUTE_NOT_SUPPORTED, INVALID_PROTOCOL_ELEMENT_VALUE, INVALID_PROTOCOL_ELEMENT_ATTRIBUTE_VALUE, PROTOCOL_ELEMENT_VALUE_NOT_SUPPORTED, PROTOCOL_ELEMENT_ATTRIBUTE_VALUE_NOT_SUPPORTED, QOP_NOT_ATTAINABLE, POSITIONING_NOT_ALLOWED, DISALLOWED_BY_LOCAL_REGULATIONS, MISCONFIGURATION_OF_LOCATION_SERVER  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"ResultEnum\",\"namespace\":\"eu.driver.model.mlp\",\"symbols\":[\"OK\",\"SYSTEM_FAILURE\",\"UNSPECIFIED_ERROR\",\"UNAUTHORIZED_APPLICATION\",\"UNKNOWN_SUBSCRIBER\",\"ABSENT_SUBSCRIBER\",\"POSITION_METHOD_FAILURE\",\"CONGESTION_IN_LOCATION_SERVER\",\"CONGESTION_IN_MOBILE_NETWORK\",\"UNSUPPORTED_VERSION\",\"TOO_MANY_POSITION_ITEMS\",\"FORMAT_ERROR\",\"SYNTAX_ERROR\",\"PROTOCOL_ELEMENT_NOT_SUPPORTED\",\"SERVICE_NOT_SUPPORTED\",\"PROTOCOL_ELEMENT_ATTRIBUTE_NOT_SUPPORTED\",\"INVALID_PROTOCOL_ELEMENT_VALUE\",\"INVALID_PROTOCOL_ELEMENT_ATTRIBUTE_VALUE\",\"PROTOCOL_ELEMENT_VALUE_NOT_SUPPORTED\",\"PROTOCOL_ELEMENT_ATTRIBUTE_VALUE_NOT_SUPPORTED\",\"QOP_NOT_ATTAINABLE\",\"POSITIONING_NOT_ALLOWED\",\"DISALLOWED_BY_LOCAL_REGULATIONS\",\"MISCONFIGURATION_OF_LOCATION_SERVER\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
}
