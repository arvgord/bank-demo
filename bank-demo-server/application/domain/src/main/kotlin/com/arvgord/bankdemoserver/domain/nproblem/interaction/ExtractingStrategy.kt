package com.arvgord.bankdemoserver.domain.nproblem.interaction

enum class ExtractingStrategy {
    // Lazy extraction
    LAZY,
    // Eager extraction
    EAGER,
    // Extract by batch
    BATCH,
    // Extract with the help of criteria api
    CRITERIA,
    // Lazy extraction with entity graph
    ENTITY_GRAPH,
    // Lazy extraction with entity graph pageable
    ENTITY_GRAPH_PAGEABLE,
    // Lazy extraction with entity graph pageable except some fields
    ENTITY_GRAPH_PAGEABLE_SKIP_FIELDS
}