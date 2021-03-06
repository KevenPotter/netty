// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Student.proto

package cn.goldenet.proto;

/**
 * Protobuf type {@code cn.goldenet.proto.StudentResponseList}
 */
public final class StudentResponseList extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:cn.goldenet.proto.StudentResponseList)
        StudentResponseListOrBuilder {
    public static final int STUDENTRESPONSE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0L;
    // @@protoc_insertion_point(class_scope:cn.goldenet.proto.StudentResponseList)
    private static final cn.goldenet.proto.StudentResponseList DEFAULT_INSTANCE;
    private static final com.google.protobuf.Parser<StudentResponseList>
            PARSER = new com.google.protobuf.AbstractParser<StudentResponseList>() {
        public StudentResponseList parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new StudentResponseList(input, extensionRegistry);
        }
    };

    static {
        DEFAULT_INSTANCE = new cn.goldenet.proto.StudentResponseList();
    }

    private java.util.List<cn.goldenet.proto.StudentResponse> studentResponse_;
    private byte memoizedIsInitialized = -1;

    // Use StudentResponseList.newBuilder() to construct.
    private StudentResponseList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private StudentResponseList() {
        studentResponse_ = java.util.Collections.emptyList();
    }

    private StudentResponseList(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new java.lang.NullPointerException();
        }
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
                        if (!parseUnknownFieldProto3(
                                input, unknownFields, extensionRegistry, tag)) {
                            done = true;
                        }
                        break;
                    }
                    case 10: {
                        if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                            studentResponse_ = new java.util.ArrayList<cn.goldenet.proto.StudentResponse>();
                            mutable_bitField0_ |= 0x00000001;
                        }
                        studentResponse_.add(
                                input.readMessage(cn.goldenet.proto.StudentResponse.parser(), extensionRegistry));
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
            if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                studentResponse_ = java.util.Collections.unmodifiableList(studentResponse_);
            }
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return cn.goldenet.proto.StudentProto.internal_static_cn_goldenet_proto_StudentResponseList_descriptor;
    }

    public static cn.goldenet.proto.StudentResponseList parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.goldenet.proto.StudentResponseList parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.goldenet.proto.StudentResponseList parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.goldenet.proto.StudentResponseList parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.goldenet.proto.StudentResponseList parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static cn.goldenet.proto.StudentResponseList parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static cn.goldenet.proto.StudentResponseList parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static cn.goldenet.proto.StudentResponseList parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static cn.goldenet.proto.StudentResponseList parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static cn.goldenet.proto.StudentResponseList parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static cn.goldenet.proto.StudentResponseList parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static cn.goldenet.proto.StudentResponseList parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(cn.goldenet.proto.StudentResponseList prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public static cn.goldenet.proto.StudentResponseList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<StudentResponseList> parser() {
        return PARSER;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return cn.goldenet.proto.StudentProto.internal_static_cn_goldenet_proto_StudentResponseList_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        cn.goldenet.proto.StudentResponseList.class, cn.goldenet.proto.StudentResponseList.Builder.class);
    }

    /**
     * <code>repeated .cn.goldenet.proto.StudentResponse studentResponse = 1;</code>
     */
    public java.util.List<cn.goldenet.proto.StudentResponse> getStudentResponseList() {
        return studentResponse_;
    }

    /**
     * <code>repeated .cn.goldenet.proto.StudentResponse studentResponse = 1;</code>
     */
    public java.util.List<? extends cn.goldenet.proto.StudentResponseOrBuilder>
    getStudentResponseOrBuilderList() {
        return studentResponse_;
    }

    /**
     * <code>repeated .cn.goldenet.proto.StudentResponse studentResponse = 1;</code>
     */
    public int getStudentResponseCount() {
        return studentResponse_.size();
    }

    /**
     * <code>repeated .cn.goldenet.proto.StudentResponse studentResponse = 1;</code>
     */
    public cn.goldenet.proto.StudentResponse getStudentResponse(int index) {
        return studentResponse_.get(index);
    }

    /**
     * <code>repeated .cn.goldenet.proto.StudentResponse studentResponse = 1;</code>
     */
    public cn.goldenet.proto.StudentResponseOrBuilder getStudentResponseOrBuilder(
            int index) {
        return studentResponse_.get(index);
    }

    public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
            throws java.io.IOException {
        for (int i = 0; i < studentResponse_.size(); i++) {
            output.writeMessage(1, studentResponse_.get(i));
        }
        unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        for (int i = 0; i < studentResponse_.size(); i++) {
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(1, studentResponse_.get(i));
        }
        size += unknownFields.getSerializedSize();
        memoizedSize = size;
        return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cn.goldenet.proto.StudentResponseList)) {
            return super.equals(obj);
        }
        cn.goldenet.proto.StudentResponseList other = (cn.goldenet.proto.StudentResponseList) obj;

        boolean result = true;
        result = result && getStudentResponseList()
                .equals(other.getStudentResponseList());
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
        if (getStudentResponseCount() > 0) {
            hash = (37 * hash) + STUDENTRESPONSE_FIELD_NUMBER;
            hash = (53 * hash) + getStudentResponseList().hashCode();
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public Builder newBuilderForType() {
        return newBuilder();
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

    @java.lang.Override
    public com.google.protobuf.Parser<StudentResponseList> getParserForType() {
        return PARSER;
    }

    public cn.goldenet.proto.StudentResponseList getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    /**
     * Protobuf type {@code cn.goldenet.proto.StudentResponseList}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:cn.goldenet.proto.StudentResponseList)
            cn.goldenet.proto.StudentResponseListOrBuilder {
        private int bitField0_;
        private java.util.List<cn.goldenet.proto.StudentResponse> studentResponse_ =
                java.util.Collections.emptyList();
        private com.google.protobuf.RepeatedFieldBuilderV3<
                cn.goldenet.proto.StudentResponse, cn.goldenet.proto.StudentResponse.Builder, cn.goldenet.proto.StudentResponseOrBuilder> studentResponseBuilder_;

        // Construct using cn.goldenet.proto.StudentResponseList.newBuilder()
        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            maybeForceBuilderInitialization();
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return cn.goldenet.proto.StudentProto.internal_static_cn_goldenet_proto_StudentResponseList_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return cn.goldenet.proto.StudentProto.internal_static_cn_goldenet_proto_StudentResponseList_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            cn.goldenet.proto.StudentResponseList.class, cn.goldenet.proto.StudentResponseList.Builder.class);
        }

        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessageV3
                    .alwaysUseFieldBuilders) {
                getStudentResponseFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            if (studentResponseBuilder_ == null) {
                studentResponse_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000001);
            } else {
                studentResponseBuilder_.clear();
            }
            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return cn.goldenet.proto.StudentProto.internal_static_cn_goldenet_proto_StudentResponseList_descriptor;
        }

        public cn.goldenet.proto.StudentResponseList getDefaultInstanceForType() {
            return cn.goldenet.proto.StudentResponseList.getDefaultInstance();
        }

        public cn.goldenet.proto.StudentResponseList build() {
            cn.goldenet.proto.StudentResponseList result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public cn.goldenet.proto.StudentResponseList buildPartial() {
            cn.goldenet.proto.StudentResponseList result = new cn.goldenet.proto.StudentResponseList(this);
            int from_bitField0_ = bitField0_;
            if (studentResponseBuilder_ == null) {
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    studentResponse_ = java.util.Collections.unmodifiableList(studentResponse_);
                    bitField0_ = (bitField0_ & ~0x00000001);
                }
                result.studentResponse_ = studentResponse_;
            } else {
                result.studentResponse_ = studentResponseBuilder_.build();
            }
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
            if (other instanceof cn.goldenet.proto.StudentResponseList) {
                return mergeFrom((cn.goldenet.proto.StudentResponseList) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(cn.goldenet.proto.StudentResponseList other) {
            if (other == cn.goldenet.proto.StudentResponseList.getDefaultInstance()) return this;
            if (studentResponseBuilder_ == null) {
                if (!other.studentResponse_.isEmpty()) {
                    if (studentResponse_.isEmpty()) {
                        studentResponse_ = other.studentResponse_;
                        bitField0_ = (bitField0_ & ~0x00000001);
                    } else {
                        ensureStudentResponseIsMutable();
                        studentResponse_.addAll(other.studentResponse_);
                    }
                    onChanged();
                }
            } else {
                if (!other.studentResponse_.isEmpty()) {
                    if (studentResponseBuilder_.isEmpty()) {
                        studentResponseBuilder_.dispose();
                        studentResponseBuilder_ = null;
                        studentResponse_ = other.studentResponse_;
                        bitField0_ = (bitField0_ & ~0x00000001);
                        studentResponseBuilder_ =
                                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                        getStudentResponseFieldBuilder() : null;
                    } else {
                        studentResponseBuilder_.addAllMessages(other.studentResponse_);
                    }
                }
            }
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
            cn.goldenet.proto.StudentResponseList parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (cn.goldenet.proto.StudentResponseList) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private void ensureStudentResponseIsMutable() {
            if (!((bitField0_ & 0x00000001) == 0x00000001)) {
                studentResponse_ = new java.util.ArrayList<cn.goldenet.proto.StudentResponse>(studentResponse_);
                bitField0_ |= 0x00000001;
            }
        }

        /**
         * <code>repeated .cn.goldenet.proto.StudentResponse studentResponse = 1;</code>
         */
        public java.util.List<cn.goldenet.proto.StudentResponse> getStudentResponseList() {
            if (studentResponseBuilder_ == null) {
                return java.util.Collections.unmodifiableList(studentResponse_);
            } else {
                return studentResponseBuilder_.getMessageList();
            }
        }

        /**
         * <code>repeated .cn.goldenet.proto.StudentResponse studentResponse = 1;</code>
         */
        public int getStudentResponseCount() {
            if (studentResponseBuilder_ == null) {
                return studentResponse_.size();
            } else {
                return studentResponseBuilder_.getCount();
            }
        }

        /**
         * <code>repeated .cn.goldenet.proto.StudentResponse studentResponse = 1;</code>
         */
        public cn.goldenet.proto.StudentResponse getStudentResponse(int index) {
            if (studentResponseBuilder_ == null) {
                return studentResponse_.get(index);
            } else {
                return studentResponseBuilder_.getMessage(index);
            }
        }

        /**
         * <code>repeated .cn.goldenet.proto.StudentResponse studentResponse = 1;</code>
         */
        public Builder setStudentResponse(
                int index, cn.goldenet.proto.StudentResponse value) {
            if (studentResponseBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureStudentResponseIsMutable();
                studentResponse_.set(index, value);
                onChanged();
            } else {
                studentResponseBuilder_.setMessage(index, value);
            }
            return this;
        }

        /**
         * <code>repeated .cn.goldenet.proto.StudentResponse studentResponse = 1;</code>
         */
        public Builder setStudentResponse(
                int index, cn.goldenet.proto.StudentResponse.Builder builderForValue) {
            if (studentResponseBuilder_ == null) {
                ensureStudentResponseIsMutable();
                studentResponse_.set(index, builderForValue.build());
                onChanged();
            } else {
                studentResponseBuilder_.setMessage(index, builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .cn.goldenet.proto.StudentResponse studentResponse = 1;</code>
         */
        public Builder addStudentResponse(cn.goldenet.proto.StudentResponse value) {
            if (studentResponseBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureStudentResponseIsMutable();
                studentResponse_.add(value);
                onChanged();
            } else {
                studentResponseBuilder_.addMessage(value);
            }
            return this;
        }

        /**
         * <code>repeated .cn.goldenet.proto.StudentResponse studentResponse = 1;</code>
         */
        public Builder addStudentResponse(
                int index, cn.goldenet.proto.StudentResponse value) {
            if (studentResponseBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureStudentResponseIsMutable();
                studentResponse_.add(index, value);
                onChanged();
            } else {
                studentResponseBuilder_.addMessage(index, value);
            }
            return this;
        }

        /**
         * <code>repeated .cn.goldenet.proto.StudentResponse studentResponse = 1;</code>
         */
        public Builder addStudentResponse(
                cn.goldenet.proto.StudentResponse.Builder builderForValue) {
            if (studentResponseBuilder_ == null) {
                ensureStudentResponseIsMutable();
                studentResponse_.add(builderForValue.build());
                onChanged();
            } else {
                studentResponseBuilder_.addMessage(builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .cn.goldenet.proto.StudentResponse studentResponse = 1;</code>
         */
        public Builder addStudentResponse(
                int index, cn.goldenet.proto.StudentResponse.Builder builderForValue) {
            if (studentResponseBuilder_ == null) {
                ensureStudentResponseIsMutable();
                studentResponse_.add(index, builderForValue.build());
                onChanged();
            } else {
                studentResponseBuilder_.addMessage(index, builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .cn.goldenet.proto.StudentResponse studentResponse = 1;</code>
         */
        public Builder addAllStudentResponse(
                java.lang.Iterable<? extends cn.goldenet.proto.StudentResponse> values) {
            if (studentResponseBuilder_ == null) {
                ensureStudentResponseIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(
                        values, studentResponse_);
                onChanged();
            } else {
                studentResponseBuilder_.addAllMessages(values);
            }
            return this;
        }

        /**
         * <code>repeated .cn.goldenet.proto.StudentResponse studentResponse = 1;</code>
         */
        public Builder clearStudentResponse() {
            if (studentResponseBuilder_ == null) {
                studentResponse_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000001);
                onChanged();
            } else {
                studentResponseBuilder_.clear();
            }
            return this;
        }

        /**
         * <code>repeated .cn.goldenet.proto.StudentResponse studentResponse = 1;</code>
         */
        public Builder removeStudentResponse(int index) {
            if (studentResponseBuilder_ == null) {
                ensureStudentResponseIsMutable();
                studentResponse_.remove(index);
                onChanged();
            } else {
                studentResponseBuilder_.remove(index);
            }
            return this;
        }

        /**
         * <code>repeated .cn.goldenet.proto.StudentResponse studentResponse = 1;</code>
         */
        public cn.goldenet.proto.StudentResponse.Builder getStudentResponseBuilder(
                int index) {
            return getStudentResponseFieldBuilder().getBuilder(index);
        }

        /**
         * <code>repeated .cn.goldenet.proto.StudentResponse studentResponse = 1;</code>
         */
        public cn.goldenet.proto.StudentResponseOrBuilder getStudentResponseOrBuilder(
                int index) {
            if (studentResponseBuilder_ == null) {
                return studentResponse_.get(index);
            } else {
                return studentResponseBuilder_.getMessageOrBuilder(index);
            }
        }

        /**
         * <code>repeated .cn.goldenet.proto.StudentResponse studentResponse = 1;</code>
         */
        public java.util.List<? extends cn.goldenet.proto.StudentResponseOrBuilder>
        getStudentResponseOrBuilderList() {
            if (studentResponseBuilder_ != null) {
                return studentResponseBuilder_.getMessageOrBuilderList();
            } else {
                return java.util.Collections.unmodifiableList(studentResponse_);
            }
        }

        /**
         * <code>repeated .cn.goldenet.proto.StudentResponse studentResponse = 1;</code>
         */
        public cn.goldenet.proto.StudentResponse.Builder addStudentResponseBuilder() {
            return getStudentResponseFieldBuilder().addBuilder(
                    cn.goldenet.proto.StudentResponse.getDefaultInstance());
        }

        /**
         * <code>repeated .cn.goldenet.proto.StudentResponse studentResponse = 1;</code>
         */
        public cn.goldenet.proto.StudentResponse.Builder addStudentResponseBuilder(
                int index) {
            return getStudentResponseFieldBuilder().addBuilder(
                    index, cn.goldenet.proto.StudentResponse.getDefaultInstance());
        }

        /**
         * <code>repeated .cn.goldenet.proto.StudentResponse studentResponse = 1;</code>
         */
        public java.util.List<cn.goldenet.proto.StudentResponse.Builder>
        getStudentResponseBuilderList() {
            return getStudentResponseFieldBuilder().getBuilderList();
        }

        private com.google.protobuf.RepeatedFieldBuilderV3<
                cn.goldenet.proto.StudentResponse, cn.goldenet.proto.StudentResponse.Builder, cn.goldenet.proto.StudentResponseOrBuilder>
        getStudentResponseFieldBuilder() {
            if (studentResponseBuilder_ == null) {
                studentResponseBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                        cn.goldenet.proto.StudentResponse, cn.goldenet.proto.StudentResponse.Builder, cn.goldenet.proto.StudentResponseOrBuilder>(
                        studentResponse_,
                        ((bitField0_ & 0x00000001) == 0x00000001),
                        getParentForChildren(),
                        isClean());
                studentResponse_ = null;
            }
            return studentResponseBuilder_;
        }

        public final Builder setUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.setUnknownFieldsProto3(unknownFields);
        }

        public final Builder mergeUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:cn.goldenet.proto.StudentResponseList)
  }

}

