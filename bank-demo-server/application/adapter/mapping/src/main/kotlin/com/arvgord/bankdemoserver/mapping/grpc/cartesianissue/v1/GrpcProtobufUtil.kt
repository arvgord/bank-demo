package com.arvgord.bankdemoserver.mapping.grpc.cartesianissue.v1

import com.google.protobuf.Int32Value
import com.google.protobuf.Int64Value
import com.google.protobuf.StringValue
import com.google.type.Decimal
import org.springframework.stereotype.Component
import java.math.BigDecimal

@Component
class GrpcProtobufUtil {

    fun map(value: String): StringValue {
        return StringValue.of(value)
    }

    fun map(value: BigDecimal): Decimal {
        return Decimal.newBuilder().setValue(value.toPlainString()).build()
    }

    fun map(value: Int): Int32Value {
        return Int32Value.of(value)
    }

    fun map(value: Int32Value): Int {
        return value.value
    }

    fun map(value: Long): Int64Value {
        return Int64Value.of(value)
    }

    fun map(value: Int64Value): Long {
        return value.value
    }
}