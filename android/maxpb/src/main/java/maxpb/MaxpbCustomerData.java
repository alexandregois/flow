// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: maxpb_customer_data.proto

package maxpb;

public final class MaxpbCustomerData {
  private MaxpbCustomerData() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface CustomerDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:maxpb.CustomerData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional uint64 customerId = 1;</code>
     */
    boolean hasCustomerId();
    /**
     * <code>optional uint64 customerId = 1;</code>
     */
    long getCustomerId();

    /**
     * <code>optional uint64 agreementId = 2;</code>
     */
    boolean hasAgreementId();
    /**
     * <code>optional uint64 agreementId = 2;</code>
     */
    long getAgreementId();

    /**
     * <code>optional uint64 localId = 3;</code>
     */
    boolean hasLocalId();
    /**
     * <code>optional uint64 localId = 3;</code>
     */
    long getLocalId();

    /**
     * <code>optional uint64 localEquipmentId = 4;</code>
     */
    boolean hasLocalEquipmentId();
    /**
     * <code>optional uint64 localEquipmentId = 4;</code>
     */
    long getLocalEquipmentId();

    /**
     * <code>optional uint64 equipmentItemId = 5;</code>
     */
    boolean hasEquipmentItemId();
    /**
     * <code>optional uint64 equipmentItemId = 5;</code>
     */
    long getEquipmentItemId();

    /**
     * <code>optional uint64 equipmentId = 6;</code>
     */
    boolean hasEquipmentId();
    /**
     * <code>optional uint64 equipmentId = 6;</code>
     */
    long getEquipmentId();

    /**
     * <code>optional uint64 groupId = 7;</code>
     */
    boolean hasGroupId();
    /**
     * <code>optional uint64 groupId = 7;</code>
     */
    long getGroupId();

    /**
     * <code>optional uint64 companyId = 8;</code>
     */
    boolean hasCompanyId();
    /**
     * <code>optional uint64 companyId = 8;</code>
     */
    long getCompanyId();

    /**
     * <code>optional string deviceModel = 9;</code>
     */
    boolean hasDeviceModel();
    /**
     * <code>optional string deviceModel = 9;</code>
     */
    java.lang.String getDeviceModel();
    /**
     * <code>optional string deviceModel = 9;</code>
     */
    com.google.protobuf.ByteString
        getDeviceModelBytes();
  }
  /**
   * Protobuf type {@code maxpb.CustomerData}
   */
  public static final class CustomerData extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:maxpb.CustomerData)
      CustomerDataOrBuilder {
    // Use CustomerData.newBuilder() to construct.
    private CustomerData(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private CustomerData(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final CustomerData defaultInstance;
    public static CustomerData getDefaultInstance() {
      return defaultInstance;
    }

    public CustomerData getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private CustomerData(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              customerId_ = input.readUInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              agreementId_ = input.readUInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              localId_ = input.readUInt64();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              localEquipmentId_ = input.readUInt64();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              equipmentItemId_ = input.readUInt64();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              equipmentId_ = input.readUInt64();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              groupId_ = input.readUInt64();
              break;
            }
            case 64: {
              bitField0_ |= 0x00000080;
              companyId_ = input.readUInt64();
              break;
            }
            case 74: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000100;
              deviceModel_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return maxpb.MaxpbCustomerData.internal_static_maxpb_CustomerData_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return maxpb.MaxpbCustomerData.internal_static_maxpb_CustomerData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              maxpb.MaxpbCustomerData.CustomerData.class, maxpb.MaxpbCustomerData.CustomerData.Builder.class);
    }

    public static com.google.protobuf.Parser<CustomerData> PARSER =
        new com.google.protobuf.AbstractParser<CustomerData>() {
      public CustomerData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CustomerData(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<CustomerData> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int CUSTOMERID_FIELD_NUMBER = 1;
    private long customerId_;
    /**
     * <code>optional uint64 customerId = 1;</code>
     */
    public boolean hasCustomerId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint64 customerId = 1;</code>
     */
    public long getCustomerId() {
      return customerId_;
    }

    public static final int AGREEMENTID_FIELD_NUMBER = 2;
    private long agreementId_;
    /**
     * <code>optional uint64 agreementId = 2;</code>
     */
    public boolean hasAgreementId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional uint64 agreementId = 2;</code>
     */
    public long getAgreementId() {
      return agreementId_;
    }

    public static final int LOCALID_FIELD_NUMBER = 3;
    private long localId_;
    /**
     * <code>optional uint64 localId = 3;</code>
     */
    public boolean hasLocalId() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional uint64 localId = 3;</code>
     */
    public long getLocalId() {
      return localId_;
    }

    public static final int LOCALEQUIPMENTID_FIELD_NUMBER = 4;
    private long localEquipmentId_;
    /**
     * <code>optional uint64 localEquipmentId = 4;</code>
     */
    public boolean hasLocalEquipmentId() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional uint64 localEquipmentId = 4;</code>
     */
    public long getLocalEquipmentId() {
      return localEquipmentId_;
    }

    public static final int EQUIPMENTITEMID_FIELD_NUMBER = 5;
    private long equipmentItemId_;
    /**
     * <code>optional uint64 equipmentItemId = 5;</code>
     */
    public boolean hasEquipmentItemId() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional uint64 equipmentItemId = 5;</code>
     */
    public long getEquipmentItemId() {
      return equipmentItemId_;
    }

    public static final int EQUIPMENTID_FIELD_NUMBER = 6;
    private long equipmentId_;
    /**
     * <code>optional uint64 equipmentId = 6;</code>
     */
    public boolean hasEquipmentId() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional uint64 equipmentId = 6;</code>
     */
    public long getEquipmentId() {
      return equipmentId_;
    }

    public static final int GROUPID_FIELD_NUMBER = 7;
    private long groupId_;
    /**
     * <code>optional uint64 groupId = 7;</code>
     */
    public boolean hasGroupId() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional uint64 groupId = 7;</code>
     */
    public long getGroupId() {
      return groupId_;
    }

    public static final int COMPANYID_FIELD_NUMBER = 8;
    private long companyId_;
    /**
     * <code>optional uint64 companyId = 8;</code>
     */
    public boolean hasCompanyId() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>optional uint64 companyId = 8;</code>
     */
    public long getCompanyId() {
      return companyId_;
    }

    public static final int DEVICEMODEL_FIELD_NUMBER = 9;
    private java.lang.Object deviceModel_;
    /**
     * <code>optional string deviceModel = 9;</code>
     */
    public boolean hasDeviceModel() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    /**
     * <code>optional string deviceModel = 9;</code>
     */
    public java.lang.String getDeviceModel() {
      java.lang.Object ref = deviceModel_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          deviceModel_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string deviceModel = 9;</code>
     */
    public com.google.protobuf.ByteString
        getDeviceModelBytes() {
      java.lang.Object ref = deviceModel_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deviceModel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      customerId_ = 0L;
      agreementId_ = 0L;
      localId_ = 0L;
      localEquipmentId_ = 0L;
      equipmentItemId_ = 0L;
      equipmentId_ = 0L;
      groupId_ = 0L;
      companyId_ = 0L;
      deviceModel_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt64(1, customerId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt64(2, agreementId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt64(3, localId_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeUInt64(4, localEquipmentId_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeUInt64(5, equipmentItemId_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeUInt64(6, equipmentId_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeUInt64(7, groupId_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeUInt64(8, companyId_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeBytes(9, getDeviceModelBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, customerId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, agreementId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, localId_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, localEquipmentId_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, equipmentItemId_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(6, equipmentId_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(7, groupId_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(8, companyId_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(9, getDeviceModelBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static maxpb.MaxpbCustomerData.CustomerData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static maxpb.MaxpbCustomerData.CustomerData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static maxpb.MaxpbCustomerData.CustomerData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static maxpb.MaxpbCustomerData.CustomerData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static maxpb.MaxpbCustomerData.CustomerData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static maxpb.MaxpbCustomerData.CustomerData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static maxpb.MaxpbCustomerData.CustomerData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static maxpb.MaxpbCustomerData.CustomerData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static maxpb.MaxpbCustomerData.CustomerData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static maxpb.MaxpbCustomerData.CustomerData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(maxpb.MaxpbCustomerData.CustomerData prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code maxpb.CustomerData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:maxpb.CustomerData)
        maxpb.MaxpbCustomerData.CustomerDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return maxpb.MaxpbCustomerData.internal_static_maxpb_CustomerData_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return maxpb.MaxpbCustomerData.internal_static_maxpb_CustomerData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                maxpb.MaxpbCustomerData.CustomerData.class, maxpb.MaxpbCustomerData.CustomerData.Builder.class);
      }

      // Construct using maxpb.MaxpbCustomerData.CustomerData.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        customerId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        agreementId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        localId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        localEquipmentId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000008);
        equipmentItemId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000010);
        equipmentId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000020);
        groupId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000040);
        companyId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000080);
        deviceModel_ = "";
        bitField0_ = (bitField0_ & ~0x00000100);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return maxpb.MaxpbCustomerData.internal_static_maxpb_CustomerData_descriptor;
      }

      public maxpb.MaxpbCustomerData.CustomerData getDefaultInstanceForType() {
        return maxpb.MaxpbCustomerData.CustomerData.getDefaultInstance();
      }

      public maxpb.MaxpbCustomerData.CustomerData build() {
        maxpb.MaxpbCustomerData.CustomerData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public maxpb.MaxpbCustomerData.CustomerData buildPartial() {
        maxpb.MaxpbCustomerData.CustomerData result = new maxpb.MaxpbCustomerData.CustomerData(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.customerId_ = customerId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.agreementId_ = agreementId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.localId_ = localId_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.localEquipmentId_ = localEquipmentId_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.equipmentItemId_ = equipmentItemId_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.equipmentId_ = equipmentId_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.groupId_ = groupId_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.companyId_ = companyId_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.deviceModel_ = deviceModel_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof maxpb.MaxpbCustomerData.CustomerData) {
          return mergeFrom((maxpb.MaxpbCustomerData.CustomerData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(maxpb.MaxpbCustomerData.CustomerData other) {
        if (other == maxpb.MaxpbCustomerData.CustomerData.getDefaultInstance()) return this;
        if (other.hasCustomerId()) {
          setCustomerId(other.getCustomerId());
        }
        if (other.hasAgreementId()) {
          setAgreementId(other.getAgreementId());
        }
        if (other.hasLocalId()) {
          setLocalId(other.getLocalId());
        }
        if (other.hasLocalEquipmentId()) {
          setLocalEquipmentId(other.getLocalEquipmentId());
        }
        if (other.hasEquipmentItemId()) {
          setEquipmentItemId(other.getEquipmentItemId());
        }
        if (other.hasEquipmentId()) {
          setEquipmentId(other.getEquipmentId());
        }
        if (other.hasGroupId()) {
          setGroupId(other.getGroupId());
        }
        if (other.hasCompanyId()) {
          setCompanyId(other.getCompanyId());
        }
        if (other.hasDeviceModel()) {
          bitField0_ |= 0x00000100;
          deviceModel_ = other.deviceModel_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        maxpb.MaxpbCustomerData.CustomerData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (maxpb.MaxpbCustomerData.CustomerData) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long customerId_ ;
      /**
       * <code>optional uint64 customerId = 1;</code>
       */
      public boolean hasCustomerId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional uint64 customerId = 1;</code>
       */
      public long getCustomerId() {
        return customerId_;
      }
      /**
       * <code>optional uint64 customerId = 1;</code>
       */
      public Builder setCustomerId(long value) {
        bitField0_ |= 0x00000001;
        customerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 customerId = 1;</code>
       */
      public Builder clearCustomerId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        customerId_ = 0L;
        onChanged();
        return this;
      }

      private long agreementId_ ;
      /**
       * <code>optional uint64 agreementId = 2;</code>
       */
      public boolean hasAgreementId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional uint64 agreementId = 2;</code>
       */
      public long getAgreementId() {
        return agreementId_;
      }
      /**
       * <code>optional uint64 agreementId = 2;</code>
       */
      public Builder setAgreementId(long value) {
        bitField0_ |= 0x00000002;
        agreementId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 agreementId = 2;</code>
       */
      public Builder clearAgreementId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        agreementId_ = 0L;
        onChanged();
        return this;
      }

      private long localId_ ;
      /**
       * <code>optional uint64 localId = 3;</code>
       */
      public boolean hasLocalId() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional uint64 localId = 3;</code>
       */
      public long getLocalId() {
        return localId_;
      }
      /**
       * <code>optional uint64 localId = 3;</code>
       */
      public Builder setLocalId(long value) {
        bitField0_ |= 0x00000004;
        localId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 localId = 3;</code>
       */
      public Builder clearLocalId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        localId_ = 0L;
        onChanged();
        return this;
      }

      private long localEquipmentId_ ;
      /**
       * <code>optional uint64 localEquipmentId = 4;</code>
       */
      public boolean hasLocalEquipmentId() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional uint64 localEquipmentId = 4;</code>
       */
      public long getLocalEquipmentId() {
        return localEquipmentId_;
      }
      /**
       * <code>optional uint64 localEquipmentId = 4;</code>
       */
      public Builder setLocalEquipmentId(long value) {
        bitField0_ |= 0x00000008;
        localEquipmentId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 localEquipmentId = 4;</code>
       */
      public Builder clearLocalEquipmentId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        localEquipmentId_ = 0L;
        onChanged();
        return this;
      }

      private long equipmentItemId_ ;
      /**
       * <code>optional uint64 equipmentItemId = 5;</code>
       */
      public boolean hasEquipmentItemId() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional uint64 equipmentItemId = 5;</code>
       */
      public long getEquipmentItemId() {
        return equipmentItemId_;
      }
      /**
       * <code>optional uint64 equipmentItemId = 5;</code>
       */
      public Builder setEquipmentItemId(long value) {
        bitField0_ |= 0x00000010;
        equipmentItemId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 equipmentItemId = 5;</code>
       */
      public Builder clearEquipmentItemId() {
        bitField0_ = (bitField0_ & ~0x00000010);
        equipmentItemId_ = 0L;
        onChanged();
        return this;
      }

      private long equipmentId_ ;
      /**
       * <code>optional uint64 equipmentId = 6;</code>
       */
      public boolean hasEquipmentId() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional uint64 equipmentId = 6;</code>
       */
      public long getEquipmentId() {
        return equipmentId_;
      }
      /**
       * <code>optional uint64 equipmentId = 6;</code>
       */
      public Builder setEquipmentId(long value) {
        bitField0_ |= 0x00000020;
        equipmentId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 equipmentId = 6;</code>
       */
      public Builder clearEquipmentId() {
        bitField0_ = (bitField0_ & ~0x00000020);
        equipmentId_ = 0L;
        onChanged();
        return this;
      }

      private long groupId_ ;
      /**
       * <code>optional uint64 groupId = 7;</code>
       */
      public boolean hasGroupId() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional uint64 groupId = 7;</code>
       */
      public long getGroupId() {
        return groupId_;
      }
      /**
       * <code>optional uint64 groupId = 7;</code>
       */
      public Builder setGroupId(long value) {
        bitField0_ |= 0x00000040;
        groupId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 groupId = 7;</code>
       */
      public Builder clearGroupId() {
        bitField0_ = (bitField0_ & ~0x00000040);
        groupId_ = 0L;
        onChanged();
        return this;
      }

      private long companyId_ ;
      /**
       * <code>optional uint64 companyId = 8;</code>
       */
      public boolean hasCompanyId() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>optional uint64 companyId = 8;</code>
       */
      public long getCompanyId() {
        return companyId_;
      }
      /**
       * <code>optional uint64 companyId = 8;</code>
       */
      public Builder setCompanyId(long value) {
        bitField0_ |= 0x00000080;
        companyId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 companyId = 8;</code>
       */
      public Builder clearCompanyId() {
        bitField0_ = (bitField0_ & ~0x00000080);
        companyId_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object deviceModel_ = "";
      /**
       * <code>optional string deviceModel = 9;</code>
       */
      public boolean hasDeviceModel() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      /**
       * <code>optional string deviceModel = 9;</code>
       */
      public java.lang.String getDeviceModel() {
        java.lang.Object ref = deviceModel_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            deviceModel_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string deviceModel = 9;</code>
       */
      public com.google.protobuf.ByteString
          getDeviceModelBytes() {
        java.lang.Object ref = deviceModel_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          deviceModel_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string deviceModel = 9;</code>
       */
      public Builder setDeviceModel(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000100;
        deviceModel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string deviceModel = 9;</code>
       */
      public Builder clearDeviceModel() {
        bitField0_ = (bitField0_ & ~0x00000100);
        deviceModel_ = getDefaultInstance().getDeviceModel();
        onChanged();
        return this;
      }
      /**
       * <code>optional string deviceModel = 9;</code>
       */
      public Builder setDeviceModelBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000100;
        deviceModel_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:maxpb.CustomerData)
    }

    static {
      defaultInstance = new CustomerData(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:maxpb.CustomerData)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_maxpb_CustomerData_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_maxpb_CustomerData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031maxpb_customer_data.proto\022\005maxpb\"\311\001\n\014C" +
      "ustomerData\022\022\n\ncustomerId\030\001 \001(\004\022\023\n\013agree" +
      "mentId\030\002 \001(\004\022\017\n\007localId\030\003 \001(\004\022\030\n\020localEq" +
      "uipmentId\030\004 \001(\004\022\027\n\017equipmentItemId\030\005 \001(\004" +
      "\022\023\n\013equipmentId\030\006 \001(\004\022\017\n\007groupId\030\007 \001(\004\022\021" +
      "\n\tcompanyId\030\010 \001(\004\022\023\n\013deviceModel\030\t \001(\t"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_maxpb_CustomerData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_maxpb_CustomerData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_maxpb_CustomerData_descriptor,
        new java.lang.String[] { "CustomerId", "AgreementId", "LocalId", "LocalEquipmentId", "EquipmentItemId", "EquipmentId", "GroupId", "CompanyId", "DeviceModel", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
