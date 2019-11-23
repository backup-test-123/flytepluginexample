// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: exampleplugin.proto

package flyte.plugins.exampleplugin;

public final class Exampleplugin {
  private Exampleplugin() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ExamplePluginTaskOrBuilder extends
      // @@protoc_insertion_point(interface_extends:flyte.plugins.exampleplugin.ExamplePluginTask)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   * Optional Custom Proto for Sagemaker Plugin.
   * </pre>
   *
   * Protobuf type {@code flyte.plugins.exampleplugin.ExamplePluginTask}
   */
  public  static final class ExamplePluginTask extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:flyte.plugins.exampleplugin.ExamplePluginTask)
      ExamplePluginTaskOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ExamplePluginTask.newBuilder() to construct.
    private ExamplePluginTask(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ExamplePluginTask() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ExamplePluginTask(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return flyte.plugins.exampleplugin.Exampleplugin.internal_static_flyte_plugins_exampleplugin_ExamplePluginTask_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return flyte.plugins.exampleplugin.Exampleplugin.internal_static_flyte_plugins_exampleplugin_ExamplePluginTask_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask.class, flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask.Builder.class);
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
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask)) {
        return super.equals(obj);
      }
      flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask other = (flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask) obj;

      boolean result = true;
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Optional Custom Proto for Sagemaker Plugin.
     * </pre>
     *
     * Protobuf type {@code flyte.plugins.exampleplugin.ExamplePluginTask}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:flyte.plugins.exampleplugin.ExamplePluginTask)
        flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTaskOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return flyte.plugins.exampleplugin.Exampleplugin.internal_static_flyte_plugins_exampleplugin_ExamplePluginTask_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return flyte.plugins.exampleplugin.Exampleplugin.internal_static_flyte_plugins_exampleplugin_ExamplePluginTask_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask.class, flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask.Builder.class);
      }

      // Construct using flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return flyte.plugins.exampleplugin.Exampleplugin.internal_static_flyte_plugins_exampleplugin_ExamplePluginTask_descriptor;
      }

      public flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask getDefaultInstanceForType() {
        return flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask.getDefaultInstance();
      }

      public flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask build() {
        flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask buildPartial() {
        flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask result = new flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask(this);
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask) {
          return mergeFrom((flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask other) {
        if (other == flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.unknownFields);
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
        flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:flyte.plugins.exampleplugin.ExamplePluginTask)
    }

    // @@protoc_insertion_point(class_scope:flyte.plugins.exampleplugin.ExamplePluginTask)
    private static final flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask();
    }

    public static flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ExamplePluginTask>
        PARSER = new com.google.protobuf.AbstractParser<ExamplePluginTask>() {
      public ExamplePluginTask parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ExamplePluginTask(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ExamplePluginTask> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ExamplePluginTask> getParserForType() {
      return PARSER;
    }

    public flyte.plugins.exampleplugin.Exampleplugin.ExamplePluginTask getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_flyte_plugins_exampleplugin_ExamplePluginTask_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_flyte_plugins_exampleplugin_ExamplePluginTask_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023exampleplugin.proto\022\033flyte.plugins.exa" +
      "mpleplugin\"\023\n\021ExamplePluginTaskB5Z3githu" +
      "b.com/flyteorg/flytepluginexample/common" +
      "/protob\006proto3"
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
    internal_static_flyte_plugins_exampleplugin_ExamplePluginTask_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_flyte_plugins_exampleplugin_ExamplePluginTask_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_flyte_plugins_exampleplugin_ExamplePluginTask_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}