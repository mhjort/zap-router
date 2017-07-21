// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: connection.proto

package zaprouter;

public final class Connection {
  private Connection() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface RegisterRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:zaprouter.RegisterRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string clientId = 1;</code>
     */
    java.lang.String getClientId();
    /**
     * <code>optional string clientId = 1;</code>
     */
    com.google.protobuf.ByteString
        getClientIdBytes();
  }
  /**
   * Protobuf type {@code zaprouter.RegisterRequest}
   */
  public  static final class RegisterRequest extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:zaprouter.RegisterRequest)
      RegisterRequestOrBuilder {
    // Use RegisterRequest.newBuilder() to construct.
    private RegisterRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private RegisterRequest() {
      clientId_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private RegisterRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              clientId_ = s;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw new RuntimeException(e.setUnfinishedMessage(this));
      } catch (java.io.IOException e) {
        throw new RuntimeException(
            new com.google.protobuf.InvalidProtocolBufferException(
                e.getMessage()).setUnfinishedMessage(this));
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return zaprouter.Connection.internal_static_zaprouter_RegisterRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return zaprouter.Connection.internal_static_zaprouter_RegisterRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              zaprouter.Connection.RegisterRequest.class, zaprouter.Connection.RegisterRequest.Builder.class);
    }

    public static final int CLIENTID_FIELD_NUMBER = 1;
    private volatile java.lang.Object clientId_;
    /**
     * <code>optional string clientId = 1;</code>
     */
    public java.lang.String getClientId() {
      java.lang.Object ref = clientId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientId_ = s;
        return s;
      }
    }
    /**
     * <code>optional string clientId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getClientIdBytes() {
      java.lang.Object ref = clientId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!getClientIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessage.writeString(output, 1, clientId_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getClientIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(1, clientId_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static zaprouter.Connection.RegisterRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static zaprouter.Connection.RegisterRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static zaprouter.Connection.RegisterRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static zaprouter.Connection.RegisterRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static zaprouter.Connection.RegisterRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static zaprouter.Connection.RegisterRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static zaprouter.Connection.RegisterRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static zaprouter.Connection.RegisterRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static zaprouter.Connection.RegisterRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static zaprouter.Connection.RegisterRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(zaprouter.Connection.RegisterRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code zaprouter.RegisterRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:zaprouter.RegisterRequest)
        zaprouter.Connection.RegisterRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return zaprouter.Connection.internal_static_zaprouter_RegisterRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return zaprouter.Connection.internal_static_zaprouter_RegisterRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                zaprouter.Connection.RegisterRequest.class, zaprouter.Connection.RegisterRequest.Builder.class);
      }

      // Construct using zaprouter.Connection.RegisterRequest.newBuilder()
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
      public Builder clear() {
        super.clear();
        clientId_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return zaprouter.Connection.internal_static_zaprouter_RegisterRequest_descriptor;
      }

      public zaprouter.Connection.RegisterRequest getDefaultInstanceForType() {
        return zaprouter.Connection.RegisterRequest.getDefaultInstance();
      }

      public zaprouter.Connection.RegisterRequest build() {
        zaprouter.Connection.RegisterRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public zaprouter.Connection.RegisterRequest buildPartial() {
        zaprouter.Connection.RegisterRequest result = new zaprouter.Connection.RegisterRequest(this);
        result.clientId_ = clientId_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof zaprouter.Connection.RegisterRequest) {
          return mergeFrom((zaprouter.Connection.RegisterRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(zaprouter.Connection.RegisterRequest other) {
        if (other == zaprouter.Connection.RegisterRequest.getDefaultInstance()) return this;
        if (!other.getClientId().isEmpty()) {
          clientId_ = other.clientId_;
          onChanged();
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        zaprouter.Connection.RegisterRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (zaprouter.Connection.RegisterRequest) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object clientId_ = "";
      /**
       * <code>optional string clientId = 1;</code>
       */
      public java.lang.String getClientId() {
        java.lang.Object ref = clientId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          clientId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string clientId = 1;</code>
       */
      public com.google.protobuf.ByteString
          getClientIdBytes() {
        java.lang.Object ref = clientId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          clientId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string clientId = 1;</code>
       */
      public Builder setClientId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        clientId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string clientId = 1;</code>
       */
      public Builder clearClientId() {
        
        clientId_ = getDefaultInstance().getClientId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string clientId = 1;</code>
       */
      public Builder setClientIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        clientId_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:zaprouter.RegisterRequest)
    }

    // @@protoc_insertion_point(class_scope:zaprouter.RegisterRequest)
    private static final zaprouter.Connection.RegisterRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new zaprouter.Connection.RegisterRequest();
    }

    public static zaprouter.Connection.RegisterRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RegisterRequest>
        PARSER = new com.google.protobuf.AbstractParser<RegisterRequest>() {
      public RegisterRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new RegisterRequest(input, extensionRegistry);
        } catch (RuntimeException e) {
          if (e.getCause() instanceof
              com.google.protobuf.InvalidProtocolBufferException) {
            throw (com.google.protobuf.InvalidProtocolBufferException)
                e.getCause();
          }
          throw e;
        }
      }
    };

    public static com.google.protobuf.Parser<RegisterRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RegisterRequest> getParserForType() {
      return PARSER;
    }

    public zaprouter.Connection.RegisterRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RegisterResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:zaprouter.RegisterResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string clientId = 1;</code>
     */
    java.lang.String getClientId();
    /**
     * <code>optional string clientId = 1;</code>
     */
    com.google.protobuf.ByteString
        getClientIdBytes();

    /**
     * <code>optional bool success = 2;</code>
     */
    boolean getSuccess();
  }
  /**
   * Protobuf type {@code zaprouter.RegisterResponse}
   */
  public  static final class RegisterResponse extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:zaprouter.RegisterResponse)
      RegisterResponseOrBuilder {
    // Use RegisterResponse.newBuilder() to construct.
    private RegisterResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private RegisterResponse() {
      clientId_ = "";
      success_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private RegisterResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              clientId_ = s;
              break;
            }
            case 16: {

              success_ = input.readBool();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw new RuntimeException(e.setUnfinishedMessage(this));
      } catch (java.io.IOException e) {
        throw new RuntimeException(
            new com.google.protobuf.InvalidProtocolBufferException(
                e.getMessage()).setUnfinishedMessage(this));
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return zaprouter.Connection.internal_static_zaprouter_RegisterResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return zaprouter.Connection.internal_static_zaprouter_RegisterResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              zaprouter.Connection.RegisterResponse.class, zaprouter.Connection.RegisterResponse.Builder.class);
    }

    public static final int CLIENTID_FIELD_NUMBER = 1;
    private volatile java.lang.Object clientId_;
    /**
     * <code>optional string clientId = 1;</code>
     */
    public java.lang.String getClientId() {
      java.lang.Object ref = clientId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientId_ = s;
        return s;
      }
    }
    /**
     * <code>optional string clientId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getClientIdBytes() {
      java.lang.Object ref = clientId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SUCCESS_FIELD_NUMBER = 2;
    private boolean success_;
    /**
     * <code>optional bool success = 2;</code>
     */
    public boolean getSuccess() {
      return success_;
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
      if (!getClientIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessage.writeString(output, 1, clientId_);
      }
      if (success_ != false) {
        output.writeBool(2, success_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getClientIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(1, clientId_);
      }
      if (success_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, success_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static zaprouter.Connection.RegisterResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static zaprouter.Connection.RegisterResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static zaprouter.Connection.RegisterResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static zaprouter.Connection.RegisterResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static zaprouter.Connection.RegisterResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static zaprouter.Connection.RegisterResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static zaprouter.Connection.RegisterResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static zaprouter.Connection.RegisterResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static zaprouter.Connection.RegisterResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static zaprouter.Connection.RegisterResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(zaprouter.Connection.RegisterResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code zaprouter.RegisterResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:zaprouter.RegisterResponse)
        zaprouter.Connection.RegisterResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return zaprouter.Connection.internal_static_zaprouter_RegisterResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return zaprouter.Connection.internal_static_zaprouter_RegisterResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                zaprouter.Connection.RegisterResponse.class, zaprouter.Connection.RegisterResponse.Builder.class);
      }

      // Construct using zaprouter.Connection.RegisterResponse.newBuilder()
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
      public Builder clear() {
        super.clear();
        clientId_ = "";

        success_ = false;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return zaprouter.Connection.internal_static_zaprouter_RegisterResponse_descriptor;
      }

      public zaprouter.Connection.RegisterResponse getDefaultInstanceForType() {
        return zaprouter.Connection.RegisterResponse.getDefaultInstance();
      }

      public zaprouter.Connection.RegisterResponse build() {
        zaprouter.Connection.RegisterResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public zaprouter.Connection.RegisterResponse buildPartial() {
        zaprouter.Connection.RegisterResponse result = new zaprouter.Connection.RegisterResponse(this);
        result.clientId_ = clientId_;
        result.success_ = success_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof zaprouter.Connection.RegisterResponse) {
          return mergeFrom((zaprouter.Connection.RegisterResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(zaprouter.Connection.RegisterResponse other) {
        if (other == zaprouter.Connection.RegisterResponse.getDefaultInstance()) return this;
        if (!other.getClientId().isEmpty()) {
          clientId_ = other.clientId_;
          onChanged();
        }
        if (other.getSuccess() != false) {
          setSuccess(other.getSuccess());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        zaprouter.Connection.RegisterResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (zaprouter.Connection.RegisterResponse) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object clientId_ = "";
      /**
       * <code>optional string clientId = 1;</code>
       */
      public java.lang.String getClientId() {
        java.lang.Object ref = clientId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          clientId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string clientId = 1;</code>
       */
      public com.google.protobuf.ByteString
          getClientIdBytes() {
        java.lang.Object ref = clientId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          clientId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string clientId = 1;</code>
       */
      public Builder setClientId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        clientId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string clientId = 1;</code>
       */
      public Builder clearClientId() {
        
        clientId_ = getDefaultInstance().getClientId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string clientId = 1;</code>
       */
      public Builder setClientIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        clientId_ = value;
        onChanged();
        return this;
      }

      private boolean success_ ;
      /**
       * <code>optional bool success = 2;</code>
       */
      public boolean getSuccess() {
        return success_;
      }
      /**
       * <code>optional bool success = 2;</code>
       */
      public Builder setSuccess(boolean value) {
        
        success_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool success = 2;</code>
       */
      public Builder clearSuccess() {
        
        success_ = false;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:zaprouter.RegisterResponse)
    }

    // @@protoc_insertion_point(class_scope:zaprouter.RegisterResponse)
    private static final zaprouter.Connection.RegisterResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new zaprouter.Connection.RegisterResponse();
    }

    public static zaprouter.Connection.RegisterResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RegisterResponse>
        PARSER = new com.google.protobuf.AbstractParser<RegisterResponse>() {
      public RegisterResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        try {
          return new RegisterResponse(input, extensionRegistry);
        } catch (RuntimeException e) {
          if (e.getCause() instanceof
              com.google.protobuf.InvalidProtocolBufferException) {
            throw (com.google.protobuf.InvalidProtocolBufferException)
                e.getCause();
          }
          throw e;
        }
      }
    };

    public static com.google.protobuf.Parser<RegisterResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RegisterResponse> getParserForType() {
      return PARSER;
    }

    public zaprouter.Connection.RegisterResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_zaprouter_RegisterRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_zaprouter_RegisterRequest_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_zaprouter_RegisterResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_zaprouter_RegisterResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020connection.proto\022\tzaprouter\"#\n\017Registe" +
      "rRequest\022\020\n\010clientId\030\001 \001(\t\"5\n\020RegisterRe" +
      "sponse\022\020\n\010clientId\030\001 \001(\t\022\017\n\007success\030\002 \001(" +
      "\010b\006proto3"
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
    internal_static_zaprouter_RegisterRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_zaprouter_RegisterRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_zaprouter_RegisterRequest_descriptor,
        new java.lang.String[] { "ClientId", });
    internal_static_zaprouter_RegisterResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_zaprouter_RegisterResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_zaprouter_RegisterResponse_descriptor,
        new java.lang.String[] { "ClientId", "Success", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
